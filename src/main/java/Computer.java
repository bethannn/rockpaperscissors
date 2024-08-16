import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computer {

    List<String> possibleMoves = Arrays.asList("ROCK","PAPER","SCISSORS"); //list of possible moves


    public String computerMove(){ //need this to pick a random thing from the list to be computer move
        Random r = new Random();
        int randomIndex = r.nextInt(possibleMoves.size()); //random index from list
        return possibleMoves.get(randomIndex); ////gets the string from the index and returns
    }
}
