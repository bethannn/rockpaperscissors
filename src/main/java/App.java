import java.util.Objects;

public class App {
    public static void main(String[] args) {
        User newUser = new User(); //instances of user and computer to play each other
        Computer newComputer = new Computer();

        String userMove = newUser.setMoveFromInput(); //gets moves
        String computerMove = newComputer.computerMove();

        System.out.println("user move: " + userMove); //so i know the moves are being gievn back rigt
        System.out.println("computer move: " + computerMove);

        App game = new App();
        game.playGame(userMove, computerMove); //does play game with moves
    }

    public void playGame(String userMove, String computerMove) { //horrible game logic, could probably do this better
        if (Objects.equals(userMove, computerMove)) {
            System.out.println("It's a tie!");
        } else if ("scissors".equals(userMove) && "paper".equals(computerMove)) {
            System.out.println("User wins!");
        } else if ("paper".equals(userMove) && "scissors".equals(computerMove)) {
            System.out.println("Computer wins!");
        } else if ("rock".equals(userMove) && "paper".equals(computerMove)) {
            System.out.println("Computer wins!");
        } else if ("paper".equals(userMove) && "rock".equals(computerMove)) {
            System.out.println("User wins!");
        } else if ("scissors".equals(userMove) && "rock".equals(computerMove)) {
            System.out.println("Computer wins!");
        } else if ("rock".equals(userMove) && "scissors".equals(computerMove)) {
            System.out.println("User wins!");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
