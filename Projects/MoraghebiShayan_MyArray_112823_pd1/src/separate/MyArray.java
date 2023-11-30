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

    public static int withE(String[] arr){
        int eCount = 0;
        for(String str:arr){
            for(int i = 0; i<str.length();i++){
                if(str.charAt(i)=='e'||str.charAt(i)=='E')
                    eCount++;
            }
        }
        return eCount;
    }
    public static double[] quadF(int[] arr){
        if(arr[1]*arr[1]-4*arr[0]*arr[2]<0) {
            double[] roots = new double[3];
            for(int i=0; i<3;i++)
                roots[i]=arr[i];
            return roots;
        }
        double[] roots = new double[2];
        roots[0]=(-((double)arr[1])-Math.pow(((double)(arr[1]*arr[1]))-(4*arr[0]*arr[1]),0.5))/2*arr[0];
        roots[1]=(-((double)arr[1])+Math.pow(((double)(arr[1]*arr[1]))-(4*arr[0]*arr[1]),0.5))/2*arr[0];
        roots[0]=(int)roots[0]*1000;
        roots[0]=roots[0]/1000;
        roots[1]=(int)roots[1]*1000;
        roots[1]=roots[1]/1000;
        return roots;
    }
}
