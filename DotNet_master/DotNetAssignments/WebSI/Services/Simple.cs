namespace DemoApp.Services;

public class Simple : IInterest{
        public double  GetInterest(double Principle,double Rate,double Time){
            return (Principle * Rate * Time) / 100;
        }
}