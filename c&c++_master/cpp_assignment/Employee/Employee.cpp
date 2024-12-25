#include<iostream>
#include<string>
#include "Address.h"
#include "Designation.h"
#include "Person.h"

using namespace std;

class Employee : public Person{
    int id;
    Designation designation;
    Address address;

   public:
   Employee(int id, string fname,string lname,int age, Designation designation,Address address):Person(fname,lname,age){
    this->id = id;
    this->designation=designation;
    this->address=address;
   }

    void print() override {
    cout<<"ID: "<<id<<endl;
    Person::print();
    cout<<"Designation: "<<getDesignation(designation)<<endl;
    address.printAddress();
   }

   Employee():Person(){
    id=0;
    designation=Designation::SoftwareDeveloper;
   }

};


int main(){
    int n=5;
    Employee* emp =new Employee[n]; 

    emp[0]=Employee (1,"manish","devlikar",45, Designation::SoftwareDeveloper, Address("thane","maharastra","india"));
    emp[1]=Employee (2,"sunny","devlikar",35, Designation::DataScientist,Address("bandra","maharastra","india"));
    emp[2]=Employee (3, "raj","tangadi",40,Designation::DevOpsEngineer,Address("andheri","maharastra","india"));
    emp[3]=Employee (4, "kushank","tangadi",20, Designation::QualityAssuranceEngineer,Address("chennai","chennai","india"));
    emp[4]=Employee (5, "khush","tangadi",15, Designation::ProjectManager,Address("pune","maharastra","india"));

    for (int i=0 ;i<n;i++) {
        emp[i].print();
    }

    delete[] emp;
}