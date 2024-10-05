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

virtual double getTotal(Patient* p[],int size){
	double total=0;
	for(int i=0;i<size;++i){
		total+=p[i]->getBillAmount();
	}
	return total;
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

    double getTotal(Patient* p[],int size){
	double total=0;
	for(int i=0;i<size;++i){
	        InHousePatient* inHouse = dynamic_cast<InHousePatient*>(p[i]);
		if(inHouse!= nullptr){
			total+= inHouse->getBillAmount(); 
		}
	}
	return total;
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

void sumOfInHousePatientBill(Patient* p[],int size){
    double totalInHouseBill=0;
    double totalNonInHouseBill=0;
    for(int i=0;i<size;++i){
        InHousePatient* inHouse = dynamic_cast<InHousePatient*>(p[i]);
        if(inHouse != nullptr){
            totalInHouseBill += inHouse->getBillAmount();
        }else{
            totalNonInHouseBill+=p[i]->getBillAmount();
        }
    }
    cout<<"Total Bill Amount For Inhouse Patient :"<<totalInHouseBill<<endl;
    cout<<"Total Bill Amount For Patient :"<<totalNonInHouseBill<<endl;
    cout<<"Total Bill :"<<totalInHouseBill+totalNonInHouseBill<<endl;
}

int main() {

	Patient* arr[4];

	arr[0]= new Patient("Ana", BedType::VIP, 15);
	arr[1]= new Patient("Bob", BedType::VIP, 13);
   	arr[2]= new InHousePatient("John", BedType::VIP, 15,5);
    arr[3]= new InHousePatient("sydney",BedType::VIP,5,5);


	printAllDetails(arr,4);
    cout<<"---------------------------------"<<endl;
    sumOfInHousePatientBill(arr,4);

    return 0;
}

