
import java.util.Scanner;

public class User {

    Scanner user_input = new Scanner(System.in);

    public String setMoveFromInput() {
        System.out.println("what move will you do? (rock/paper/scissors)");
        return user_input.next().toUpperCase();

    }

}
