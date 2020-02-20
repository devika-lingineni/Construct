import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.format("Enter the principle amount:");
        double principle=sc.nextDouble();
        System.out.format("Enter the rate of interest:") ;
        double rate=sc.nextDouble();
        System.out.format("Enter the time:");
        double time=sc.nextDouble();
        SimpleInterest s=new SimpleInterest(principle,rate,time);
        System.out.format("The simple interest is:"+s.interest_cal());
        System.out.format("\n *************************************** \n");
        CompoundInterest c=new CompoundInterest(principle,rate,time);
        System.out.format("the Compound interest is:"+c.interest_comcal());
        System.out.format("\n **************************************** \n");
        HouseConstruction hc=new HouseConstruction();
        double res=hc.cost_estimate();
        System.out.format("The overall material cost is:\n"+res);
    }
}
