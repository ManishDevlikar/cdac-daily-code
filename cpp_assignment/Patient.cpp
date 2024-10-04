#include <iostream>
#include <string>

enum class BedType {
    ECONOMY = 200,
    PRIVATE = 350,
    VIP = 500
};

using namespace std;

class Patient {
private:
    static int patientIdCounter;
    int patientId; 
    string patientName;
    BedType bedType;
    int noOfDays;

public:
    // Constructor
    Patient(const string& name, BedType bed, int noOfDays) 
        : patientName(name), bedType(bed), noOfDays(noOfDays) {
        patientId = ++patientIdCounter; 
    }

    int getPatientId() const {
        return patientId; 
    }

  virtual double getBillAmount() const {
        double price;
        switch (bedType) {
            case BedType::VIP:
                price = 500;
                break;
            case BedType::PRIVATE:
                price = 350;
                break;
            case BedType::ECONOMY:
                price = 200;
                break;
            default:
                price = 0;
        }
        return noOfDays * price; 
    }
};


int Patient::patientIdCounter = 0;

class InHousePatient : public Patient {
private:
    double discount;

public:
    // Constructor
    InHousePatient(const string& name, BedType bed, int noOfDays, double discount)
        : Patient(name, bed, noOfDays), discount(discount) {}

    double getDiscount() const {
        return discount;
    }

    void setDiscount(double discount) {
        this->discount = discount;
    }

    double getBillAmount() const {
        double totalAmount = Patient::getBillAmount();

        
        if (totalAmount > 5000) {
           totalAmount *= (1 - (discount / 100.0));
        }
        return totalAmount;
    }
};


void printAllDetails( Patient* a[],int size){
      for(int i=0;i<size;i++){
		InHousePatient* inHouse = dynamic_cast<InHousePatient*>(a[i]);
	if(inHouse != nullptr){
          	cout << "InHousePatient ID: " << inHouse->getPatientId() << ", Bill Amount with Discount: $" << inHouse->getBillAmount() << endl;
	}else{
	  cout << "Patient ID: " << a[i]->getPatientId() << ", Bill Amount: $" << a[i]->getBillAmount() << endl;
	}
      }
}

int main() {

	Patient* arr[3];

	arr[0]= new Patient("Ana", BedType::VIP, 15);
	arr[1]= new Patient("Bob", BedType::VIP, 13);
   	arr[2]= new InHousePatient("John", BedType::VIP, 15,5);

	for(int i=0;i<3;i++){
	// cout << "Patient ID: " << arr[i]->getPatientId() << ", Bill Amount: $" << arr[i]->getBillAmount() << endl;		
	}

	printAllDetails(arr,3);
    //cout << "Patient ID: " << p.getPatientId() << ", Bill Amount: $" << p.getBillAmount() << endl;

    //InHousePatient ihp("John", BedType::VIP, 15, 10);
    //cout << "Patient ID: " << ihp.getPatientId() << ", Bill Amount after discount: $" << ihp.getBillAmount() << endl;

    return 0;
}

