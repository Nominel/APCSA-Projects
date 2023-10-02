public class Discount
{
    private double amount;
    public Discount( double a )
    {
        amount=a;
    }
    public boolean check()
    {
        return amount > 2000;
    }
    public double getTheBill()
    {
        if(check())
            return amount*.85;
        else
            return amount;
    }
}