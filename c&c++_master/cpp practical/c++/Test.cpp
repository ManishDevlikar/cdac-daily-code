#include<iostream>
#include<string>

using namespace std;

void calculate ();


int main(){
    cout<<"Welcome to the Calculator\n";
    calculate();
    return 0;
}


void calculate(){
      cout<<"Enter Number one \n";
    double num1;
    cin>>num1;

    cout<<"Enter Number two \n";
    double num2;
    cin>>num2;
    
    cout<<"Choose an operation (+, -, *, / , 0 -> exit): ";
    char operation;
    cin>>operation;
    
    double result;


    
    switch(operation){
        case '+':
            result = num1 + num2;
            cout<< "Addition : "<<  result<<"\n";
            calculate();
            break;
        case '-':
            result = num1 - num2;
             cout<<"Subtraction : "<<result<<"\n";
             calculate();
            break;
        case '*':
            result = num1 * num2;
             cout<<"Multiplication : "<<result<<"\n";
              calculate();
            break;
        case '/':
            if(num2 == 0){
                cout<<"Error: Division by zero!\n";
                 calculate();
                break;
            }
            result = num1 / num2;\
            cout<<"Division : "<< result<<"\n";
             calculate();
            break;
        case '0':
        cout<<"Exiting the program\n";   
            break;
        default:
            cout<<"Error: Invalid operation!\n";
            calculate();
            
    }
}