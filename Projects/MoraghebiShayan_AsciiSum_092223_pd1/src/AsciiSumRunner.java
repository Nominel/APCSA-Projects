public class AsciiSumRunner {
    public static void main(String[] args) {
        AsciiSum sum = new AsciiSum("Dallas", 'a');
        sum.locateAndAdd();
        System.out.println(sum);
        sum.setInfo("Houston", 'o');
        sum.locateAndAdd();
        System.out.println(sum);
        sum.setInfo("Statue", 't');
        sum.locateAndAdd();
        System.out.println(sum);
        sum.setInfo("copper", 'p');
        sum.locateAndAdd();
        System.out.println(sum);
        sum.setInfo("happypeople", 'p');
        sum.locateAndAdd();
        System.out.println(sum);
    }
}