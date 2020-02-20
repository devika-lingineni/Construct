public class SimpleInterest
{
    double principle;
    double rate;
    double time;
    SimpleInterest(double p,double r,double t)
    {
        principle=p;
        rate=r;
        time=t;
    }

    double interest_cal()
    {
        return (principle*rate*time)/100;
    }

 }
 class CompoundInterest extends SimpleInterest
{
    CompoundInterest(double p1,double r1,double t1) {
        super(p1,r1,t1);
    }
    double interest_comcal()
    {
      double x= (rate)/100;
      return (principle*Math.pow((1+x),10));
    }
}
