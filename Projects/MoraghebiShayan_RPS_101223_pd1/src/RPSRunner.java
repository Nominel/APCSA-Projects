import java.util.Scanner;
public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response='y';
        while(response=='y') {
//add in a loop if you know; not required
//run code several times to check that it's working
            String player = "";
//edit to reflect your own prompt for selection of [R, P, S]
            System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
            player = keyboard.next();
//read and print in the player value (see the sample output on the instruction doc)
            RockPaperScissors game = new RockPaperScissors(player);
            System.out.println(game);
            System.out.print("Do you want to play again? ");
            response= keyboard.next().charAt(0);
        }
    }
}