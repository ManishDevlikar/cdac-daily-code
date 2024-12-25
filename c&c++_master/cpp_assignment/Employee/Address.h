#ifndef ADDRESS_H
#define ADDRESS_H
#include <string>
#include <iostream>

using namespace std;

struct Address{
    string city;
    string state;
    string county;

    public :
    Address(string city, string state, string county){
        this->city = city;
        this->state = state;
        this->county = county;
    }
    Address(){
        this->city = "";
        this->state = "";
        this->county = "";
    }
    void printAddress() const{
        cout << "City: " << city << endl;
        cout << "State: " << state << endl;
        cout << "County: " << county << endl;        
    }
};

#endif