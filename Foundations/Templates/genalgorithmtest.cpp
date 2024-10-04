#include <iostream>
#include <string>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

bool IsOdd(int num)
{
	return num & 1;
}

int main(void)
{
	vector<int> a;
	a.push_back(731);
	a.push_back(452);
	a.push_back(983);
	a.push_back(574);
	a.push_back(165);
	a.push_back(816);
	a.push_back(397);
	a.push_back(208);
	sort(a.begin(), a.end());
	cout << "All int values in vector" << endl;
	for(vector<int>::iterator i = a.begin(); i != a.end(); ++i)
	{
		int val = *i;
		cout << val << endl;
	}
	cout << "Number of odd values = "
		 << count_if(a.begin(), a.end(), IsOdd)
		 << endl;
	set<string> b;
	b.insert("Monday");
	b.insert("Tuesday");
	b.insert("Wednesday");
	b.insert("Thursday");
	b.insert("Friday");
	b.insert("Monday");
	cout << "---------------------" << endl;
	cout << "All string values in set" << endl;
	for(auto i = b.begin(); i != b.end(); ++i)
		cout << *i << endl;
	int min;
	cout << "Minimum Size: ";
	cin >> min;
	//using lambda-expression (anonymous function)
	cout << "Number of big strings = "
		 << count_if(b.begin(), b.end(), [min](string s){ return s.size() >= min; })
		 << endl;
}

