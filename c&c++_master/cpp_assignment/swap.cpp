#include<iostream>

using namespace std;

void swap(int &a , int &b);

int main(){
    int a;
    int b;

    cout<< "enter a value" <<endl;
    cin>>a;
    cout<<"enter b value" <<endl;
    cin>>b;
    cout<<"before swap " << a <<" "  <<b  <<endl; 
    swap(a,b);
    cout<<"after swap " <<a << " " << b <<endl;

    return 0;
}


void swap(int &a,int &b){
    int temp=a;
    a=b;
    b=temp;
}