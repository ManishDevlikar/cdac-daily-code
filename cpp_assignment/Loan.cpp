#include<string>
#include<iostream>
using namespace std;
class Loan{
    /*
    - principle
- period
+ GetPrinciple : double
+ SetPrinciple(double):void
+ GetPeriod() : float
+ SetPeriod(float) : void
+ GetRate() : float (abstract fn)
+ GetEMI() : 
    */

   private :
    double principle;   
    float period;
   public:
    Loan(double p, float t){
        principle = p;
        period = t;
    }
    double GetPrinciple(){
        return principle;
    }
    void SetPrinciple(double p){
        principle = p;
    }
    float GetPeriod(){
        return period;
    }
    void SetPeriod(float t){
        period = t;
    }
    virtual float GetRate() = 0;
    float GetEMI(){
        return principle*(1+ GetRate() * period/100) / (12*period);
        //emi = p * (1 + r * n / 100) / (12 * n)
    }
    ~Loan(){}
    // pure virtual function
};

/*
Add the following classes to the Hierarchy
1) PersonalLoan
2) HomeLoan
Logic for GetRate varies based on the type loan
1) For PersonalLoan (upto 5 lakhs is 15% above 5 lakhs 16%)
2) For HomeLoan (upto 20 lakhs is 10% above 20 lakhs 11%)
Call its Installment method and print
the returned installment
emi = p * (1 + r * n / 100) / (12 * n)
*/

class PersonalLoan : public Loan{
    public:
    PersonalLoan(double p, float t) : Loan(p, t){}
    float GetRate(){
        if(Loan::GetPrinciple()<= 500000){
            return 0.15;
        }else {
            return 0.16;
        }
    }
};

class HomeLoan : public Loan{
    public:
    HomeLoan(double p, float t) : Loan(p, t){}
    float GetRate(){
        if(Loan::GetPrinciple() <= 2000000){
            return 0.10;
        } else {
            return 0.11;
        }
    }
};

int main(){
    PersonalLoan p1(1500000, 5);
    HomeLoan hl(2500000, 3);
    
    cout << "EMI for Personal Loan : " << p1.GetEMI() << endl;
    cout << "EMI for Home Loan : " << hl.GetEMI() << endl;
    return 0;
}
