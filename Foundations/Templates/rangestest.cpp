#include <iostream>
#include <vector>
#include <ranges>

using namespace std;

int main(void)
{
	vector<int> source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	auto selection = source 
		| views::filter([](int n){ return n % 2; })
		| views::transform([](int n){ return n * n; })
		| views::reverse;
	for(int item : selection)
		cout << item << endl;
}

//c++ -std=c++20 rangestest.cpp -o program

