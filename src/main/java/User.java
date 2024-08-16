
import java.util.Scanner;

public class User {

    Scanner user_input = new Scanner(System.in);
    private String name;

    public String setMoveFromInput() {
        System.out.println("what move will you do? (rock/paper/scissors)");
        return user_input.next().toUpperCase(); //makes sure its comparable with game logic statement

    }

    public void setName() { //getter and setter
        System.out.println("whats your name?!:"); //so they can have a name in the game
        this.name = user_input.next();
    }

    public String getName() {
        return this.name;
    }

}
