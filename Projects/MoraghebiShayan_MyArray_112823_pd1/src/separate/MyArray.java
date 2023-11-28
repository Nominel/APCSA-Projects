package separate;

public class MyArray {
    public static int[] separate(int[] arr){
        int numEven = 0;
        for(int val:arr){
            if(val%2==0)
                numEven++;
        }
        int numOdd = 0;
        for(int val:arr){
            if(val%2!=0)
                numOdd++;
        }
        int[] evenArr = new int[numEven];
        int[] oddArr = new int[numOdd];
        int evenCount=0;
        int oddCount=0;
        for(int val:arr){
            if(val%2==0) {
                evenArr[evenCount]=val;
                evenCount++;
            }
            if(val%2!=0) {
                oddArr[oddCount]=val;
                oddCount++;
            }
        }
        int[] finalArr = new int[evenCount+oddCount];
        for(int i = 0;i<evenCount;i++){
            finalArr[i]=evenArr[i];
        }
        for(int i = 0; i<oddCount;i++){
            finalArr[i+evenCount]=oddArr[i];
        }
        return finalArr;
    }
    public static double average(double[] arr){
        int zeroCount = 0;
        for(double val:arr){
            if(val<=0)
                zeroCount++;
        }
        double sum = 0;
        for(double val:arr) {
            if(val>0)
                sum += val;
        }
        sum /= (arr.length-zeroCount);
        sum*=10000;
        sum = (int)sum;
        sum /=10000;
        return sum;
    }
}
