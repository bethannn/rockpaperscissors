import java.util.Objects;

public class App {
    public static void main(String[] args) {
        App game = new App(); //outside of do while need new game
        boolean isTie;
        do {

            User newUser = new User(); //instances of user and computer to play each other
            Computer newComputer = new Computer();

            String userMove = newUser.setMoveFromInput(); //gets moves
            String computerMove = newComputer.computerMove();

            System.out.println("user move: " + userMove); //so i know the moves are being gievn back rigt
            System.out.println("computer move: " + computerMove);

            isTie = game.playGame(userMove, computerMove);//// does play game with moves
        } while (isTie); //if its a tie itll go again
    }

    public boolean playGame(String userMove, String computerMove) { //horrible game logic, could probably do this better (switch statement?? come back)
        if (Objects.equals(userMove, computerMove)) {
            System.out.println("It's a tie!");
            return true; //play again if tie
        } else if ("SCISSORS".equals(userMove) && "PAPER".equals(computerMove)) {
            System.out.println("User wins!");
            return false;
        } else if ("PAPER".equals(userMove) && "SCISSORS".equals(computerMove)) {
            System.out.println("Computer wins!");
            return false;
        } else if ("ROCK".equals(userMove) && "PAPER".equals(computerMove)) {
            System.out.println("Computer wins!");
            return false;
        } else if ("PAPER".equals(userMove) && "ROCK".equals(computerMove)) {
            System.out.println("User wins!");
            return false;
        } else if ("SCISSORS".equals(userMove) && "ROCK".equals(computerMove)) {
            System.out.println("Computer wins!");
            return false;
        } else if ("ROCK".equals(userMove) && "SCISSORS".equals(computerMove)) {
            System.out.println("User wins!");
            return false;
        } else {
            System.out.println("Invalid input.");
            return true; //might as well have this here so it plays again on an invalid input!!!
        }
    }
}
