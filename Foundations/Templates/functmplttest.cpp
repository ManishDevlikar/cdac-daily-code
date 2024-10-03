#include "interval.h"
#include <iostream>
#include <string>

using namespace std;

/*
double Select(int index, double first, double second)
{
	if(index % 2)
		return first;
	return second;
}

string Select(int index, string first, string second)
{
	if(index % 2)
		return first;
	return second;
}
*/

template<typename T>
T Select(int index, T first, T second) //Select is function-template with type-parameter T
{
	if(index % 2)
		return first;
	return second;
}

int main(void)
{
	int n;
	cout << "Count: ";
	cin >> n;

	double da = 23.4, db = 14.9;
	cout << "Selected double value = "
		 << Select<double>(n, da, db) //calling templated Select with T=double
		 << endl;

	string sa = "Tuesday", sb = "Thursday";
	cout << "Selected string value = "
		 << Select(n, sa, sb) //Select<string>(n, sa, sb)
		 << endl;
	
	Interval ia(3, 45), ib(3, 65);
	cout << "Selected Interval value = "
		 << Select(n, ia, ib).AsString()
		 << endl;
	//Select(n, sa, ia);
}

