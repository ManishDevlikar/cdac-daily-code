#include<iostream>
#include<string>

using namespace std;

enum BedType {
    VIP = 500,
    GENERAL = 250,
    SEMI_PRIVATE = 350,
    PRIVATE = 450,
    ICU = 700,
    DELUXE = 600
};

class Patient {
private:
    static int patientId;
    int id;     
    string name;
    int age;
    BedType bedType;
    int noOfDays;

public:
    // Constructor
    Patient(string pname, int page, BedType pbedType, int pnoOfDays)
        : name(pname), age(page), noOfDays(pnoOfDays) {
            id=++patientId;  // Increment static patientId for each new patient
        bedType=pbedType;
    }

    // Method to calculate bill amount
  virtual double getBillAmount() {
        double price = 0;
        switch (bedType) {
        case VIP:
            price = 500;
            break;
        case GENERAL:
            price = 250;
            break;
        case SEMI_PRIVATE:
            price = 350;
            break;
        case PRIVATE:
            price = 450;
            break;
        case ICU:
            price = 700;
            break;
        case DELUXE:
            price = 600;
            break;
        default:
            price = 250;
            break;
        }
        return price * noOfDays;
    }

    // Method to display patient details and bill amount
    void display() {
        cout << "Patient ID: " << patientId << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Number of Days: " << noOfDays << endl;
        cout << "Total Bill Amount: " << getBillAmount() << endl;
    }
};

// Initialize static variable
int Patient::patientId = 100;


class inHouse : public Patient{
    double discount;
    public:
    inHouse(string name, int age, BedType bedType, int noOfDays, double discount)
    : Patient(name, age, bedType, noOfDays), discount(discount) {}
    double getBillAmount() override {
        return Patient::getBillAmount() - (Patient::getBillAmount() * discount / 100);
    }
};

int main() {
    // Create a Patient object
    Patient p1("Ana", 28, VIP, 3);
    // Create an in-house patient object
    inHouse p2("John", 35, GENERAL, 2, 10);

    // Display patient details and bill amount
    p1.display();
    p2.display();

    return 0;
}
