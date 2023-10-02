public class Exchange2Runner {
    public static void main(String[] args) {
        Exchange2 exchange = new Exchange2();
        System.out.println(exchange.stitch("cars", "bike"));
        System.out.println(exchange.stitch("abcdef", "wxyz"));
        System.out.println(exchange.stitch("hello", "rhinos"));
        System.out.println(exchange.stitch("LO", "DOL"));
        System.out.println(exchange.stitch("the", "a"));

        System.out.println(exchange.zip("cars", "bike"));
        System.out.println(exchange.zip("abcd", "wxyz"));
        System.out.println(exchange.zip("CVHS", "HISD"));
    }
}