package checker;

public class CheckerBoard {
        private String board;

        public CheckerBoard(int rows, int columns){
                board = "";
                if(columns%2==0){
                        for(int i = 0; i<rows; i++){
                                if(i%2==0){
                                        for(int c = 0; c<columns; c++){
                                                if(c%2==0)
                                                        board+=" ";
                                                else
                                                        board+="#";
                                        }
                                        board+="\n";
                                }
                                else {
                                        for(int c = 0; c<columns; c++){
                                                if(c%2==0)
                                                        board+="#";
                                                else
                                                        board+=" ";
                                        }
                                        board+="\n";
                                }
                        }
                }
                else{
                        for(int i = 0; i<rows; i++){
                                if(i%2==0){
                                        for(int c = 0; c<columns; c++){
                                                if(c%2==0)
                                                        board+="#";
                                                else
                                                        board+=" ";
                                        }
                                        board+="\n";
                                }
                                else {
                                        for(int c = 0; c<columns; c++){
                                                if(c%2==0)
                                                        board+=" ";
                                                else
                                                        board+="#";
                                        }
                                        board+="\n";
                                }
                        }
                }
        }

        @Override
        public String toString() {
                return board;
        }
}
