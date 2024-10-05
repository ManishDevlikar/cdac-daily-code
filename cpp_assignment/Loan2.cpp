#include<string>
#include<iostream>
using namespace std;

// Base class Loan
class Loan{
    /*
    Members:
    - principle (loan amount)
    - period (loan duration in years)

    Methods:
    + GetPrinciple : double
    + SetPrinciple(double):void
    + GetPeriod() : float
    + SetPeriod(float) : void
    + GetRate() : float (abstract function, pure virtual)
    + GetEMI() : float (calculates EMI)
    */

   private :
    double principle;   // Loan principle (amount)
    float period;       // Loan period in years

   public:
    // Constructor to initialize principle and period
    Loan(double p, float t){
        principle = p;
        period = t;
    }

    // Get method to return the principle
    double GetPrinciple(){
        return principle;
    }

    // Set method to update the principle
    void SetPrinciple(double p){
        principle = p;
    }

    // Get method to return the period
    float GetPeriod(){
        return period;
    }

    // Set method to update the period
    void SetPeriod(float t){
        period = t;
    }

    // Pure virtual function to be implemented by derived classes
    virtual float GetRate() = 0;

    // Method to calculate EMI based on principle, rate, and period
    float GetEMI(){
        return principle * (1 + GetRate() * period / 100) / (12 * period);
        // EMI formula: p * (1 + r * n / 100) / (12 * n)
    }

    // Destructor
    ~Loan(){}
};

/*
Add the following derived classes:
1) PersonalLoan
2) HomeLoan
Logic for GetRate varies based on loan type:
1) For PersonalLoan: upto 5 lakhs = 15%, above 5 lakhs = 16%
2) For HomeLoan: upto 20 lakhs = 10%, above 20 lakhs = 11%
*/

// Derived class PersonalLoan from Loan
class PersonalLoan : public Loan{
    public:
    // Constructor for PersonalLoan calling base class constructor
    PersonalLoan(double p, float t) : Loan(p, t){}

    // Implementation of abstract method GetRate
    // Different interest rates based on principle
    float GetRate(){
        if(Loan::GetPrinciple() <= 500000){
            return 0.15;  // 15% rate for loans <= 5 lakhs
        } else {
            return 0.16;  // 16% rate for loans > 5 lakhs
        }
    }
};

// Derived class HomeLoan from Loan
class HomeLoan : public Loan{
    public:
    // Constructor for HomeLoan calling base class constructor
    HomeLoan(double p, float t) : Loan(p, t){}

    // Implementation of abstract method GetRate
    // Different interest rates based on principle
    float GetRate(){
        if(Loan::GetPrinciple() <= 2000000){
            return 0.10;  // 10% rate for loans <= 20 lakhs
        } else {
            return 0.11;  // 11% rate for loans > 20 lakhs
        }
    }
};

int main(){
    // Creating PersonalLoan object with principle 15 lakhs and period 5 years
    PersonalLoan p1(1500000, 5);

    // Creating HomeLoan object with principle 25 lakhs and period 3 years
    HomeLoan hl(2500000, 3);

    // Creating pointers of type Loan to demonstrate dynamic polymorphism
    Loan* p2 = new PersonalLoan(1500000, 5);
    Loan* h2 = new HomeLoan(2500000, 3);

    // Calculating and printing EMI for PersonalLoan object p1
    cout << "EMI for Personal Loan : " << p1.GetEMI() << endl;
    // p1 will call the GetEMI() method from Loan class, which in turn
    // calls the GetRate() from the PersonalLoan class

    // Calculating and printing EMI for HomeLoan object hl
    cout << "EMI for Home Loan : " << hl.GetEMI() << endl;
    // hl will call the GetEMI() method from Loan class, which in turn
    // calls the GetRate() from the HomeLoan class

    // Using polymorphism to calculate EMI using the base class pointer p2
    cout << "EMI for Personal Loan : " << p2->GetEMI() << endl;
    // p2 points to a PersonalLoan object, so the GetEMI() will call
    // PersonalLoan's GetRate() function

    // Using polymorphism to calculate EMI using the base class pointer h2
    cout << "EMI for Home Loan : " << h2->GetEMI() << endl;
    // h2 points to a HomeLoan object, so the GetEMI() will call
    // HomeLoan's GetRate() function

    return 0;
}
