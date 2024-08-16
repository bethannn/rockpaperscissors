import java.util.Objects;

public class App {
    public static void main(String[] args) {
        App game = new App(); //outside do while need new game
        boolean isTie;
        do {
            System.out.println("welcome to beths awesome rock paper scissors!!!");

            User newUser = new User(); //instances of user and computer to play each other
            Computer newComputer = new Computer();

            String userMove = newUser.setMoveFromInput(); //gets moves
            String computerMove = newComputer.computerMove();

            System.out.println("user move: " + userMove); //so i know the moves are being gievn back rigt
            System.out.println("computer move: " + computerMove);

            isTie = game.playGame(userMove, computerMove);//// does play game with moves
        }
        while (isTie); //if its a tie itll go again
    }

    public boolean playGame(String userMove, String computerMove) { //horrible game logic, could probably do this better (switch statement?? come back) it now returns a boolean to make the tie thing work
        if (Objects.equals(userMove, computerMove)) {
            System.out.println("tie!!!!!! try again!");
            return true; //play again if tie
        } else if ("SCISSORS".equals(userMove) && "PAPER".equals(computerMove)) {
            System.out.println("user wins!");
            return false;
        } else if ("PAPER".equals(userMove) && "SCISSORS".equals(computerMove)) {
            System.out.println("computer wins!");
            return false;
        } else if ("ROCK".equals(userMove) && "PAPER".equals(computerMove)) {
            System.out.println("computer wins!");
            return false;
        } else if ("PAPER".equals(userMove) && "ROCK".equals(computerMove)) {
            System.out.println("user wins!");
            return false;
        } else if ("SCISSORS".equals(userMove) && "ROCK".equals(computerMove)) {
            System.out.println("computer wins!");
            return false;
        } else if ("ROCK".equals(userMove) && "SCISSORS".equals(computerMove)) {
            System.out.println("user wins!");
            return false;
        } else {
            System.out.println("bad input, try again using rock paper or scissors :(");
            return true; //might as well have this here so it plays again on an invalid input!!!
        }
    }
}
