#ifndef PERSON_H
#define PERSON_H

#include <string>
#include<iostream>
using namespace std;


class Person{
    protected:
    string fname;
    string lname;
    int age;

  public:
    Person(string fname,string lname,int age):fname(fname),lname(lname),age(age){}
    Person():fname(""),lname(""),age(0){}

    virtual void print() {
        cout << "First Name: " << fname << endl;
        cout << "Last Name: " << lname << endl;
        cout << "Age: " << age << endl;
    }
};

#endif