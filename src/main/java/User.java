import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class User {

    private String move;
    Scanner user_input = new Scanner(System.in);

    public String setMoveFromInput() {
        System.out.println("what move will you do? (rock/paper/scissors)");
        this.move = user_input.next().toUpperCase(); //makes sure its uppercase so can be compared to comp move
        return move;
    }

}
