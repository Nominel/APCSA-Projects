package checker;

public class CheckerBoardRunner {
        public static void main(String[] args){
                CheckerBoard board1 = new CheckerBoard(5,4);
                System.out.println("5x4");
                System.out.println(board1+"\n\n");
                CheckerBoard board2 = new CheckerBoard(2,5);
                System.out.println("2x5");
                System.out.println(board2+"\n\n");
                CheckerBoard board3 = new CheckerBoard(5,10);
                System.out.println("5x10");
                System.out.println(board3+"\n\n");
        }
}
