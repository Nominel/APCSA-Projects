import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;
public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;
    public RockPaperScissors(String player)
    {
        playChoice=player;
        int x = (int)(Math.random()*3-1+0.5);
        switch (x){
          case 0 -> compChoice="R";
          case 1 -> compChoice="P";
          case 2 -> compChoice="S";
        }
    }
    public String determineWinner()
    {
        String winner="";
        switch (playChoice){
            case "R" -> {
                switch (compChoice) {
                    case "R" -> winner = "!Draw Game!";
                    case "P" -> winner = "!Computer wins <<Paper Covers Rock>>!";
                    case "S" -> winner = "!Player wins <<Rock Breaks Scissors>>!";
                    default -> throw new IllegalStateException("Unexpected comp value: " + compChoice);
                }
            }
            case "P" -> {
                switch (compChoice) {
                    case "R" -> winner = "!Player wins <<Paper Covers Rock>>!";
                    case "P" -> winner = "!Draw Game!";
                    case "S" -> winner = "!Computer wins <<Scissors Cuts Paper>>!";
                    default -> throw new IllegalStateException("Unexpected comp value: " + compChoice);
                }
            }
            case "S" -> {
                switch (compChoice) {
                    case "R" -> winner = "!Computer wins <<Rock Breaks Scissors>>!";
                    case "P" -> winner = "!Player wins <<Scissors Cuts Paper>>!";
                    case "S" -> winner = "!Draw Game!";
                    default -> throw new IllegalStateException("Unexpected comp value: " + compChoice);
                }
            }
            default -> throw new IllegalStateException("Unexpected player value: " + playChoice);
        }
        return winner;
    }
    public String toString()
    {
        String output="player had "+playChoice+"\n" +
                "computer had " +compChoice+"\n"+
                determineWinner()+"\n"; //see the sample output
        return output;
    }
}