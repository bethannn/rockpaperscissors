import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computer {

    List<String> possibleMoves = Arrays.asList("ROCK","PAPER","SCISSORS");


    public String computerMove(){
        Random r = new Random();
        int randomIndex = r.nextInt(possibleMoves.size()); //random index from list
        String randomMove = possibleMoves.get(randomIndex); //gets the string from the index
        System.out.println(randomMove);
        return randomMove;
    }
}
