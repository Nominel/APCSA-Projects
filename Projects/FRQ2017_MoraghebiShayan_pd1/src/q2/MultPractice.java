package q2;

import java.util.List;
import java.util.ArrayList;

//create the MultPractice class

public class MultPractice implements StudyPractice {

        private static int firstInt;
        private int secondInt;

        public MultPractice(int int1, int int2){
                firstInt=int1;
                secondInt=int2;
        }

        public String getProblem() {
                return firstInt+" TIMES "+secondInt;
        }

        public void nextProblem() {
                secondInt++;
        }
}