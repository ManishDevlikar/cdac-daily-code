#include <iostream>
#include <string>
#include <vector>
#include <set>

using namespace std;

int main(void)
{
	//std::vector is a sequential-container i.e the position
	//of an item within the container is determined by the
	//time of its addition
	vector<int> a;
	a.push_back(731);
	a.push_back(452);
	a.push_back(983);
	a.push_back(574);
	a.push_back(165);
	a.push_back(816);
	a.push_back(397);
	a.push_back(208);
	cout << "Square of int values in vector" << endl;
	//a container returns standard iterator type objects from its
	//begin and end methods, this iterator type minimally overloads
	//!=, ++ and * operators
	for(vector<int>::iterator i = a.begin(); i != a.end(); ++i)
	{
		int val = *i;
		cout << val * val << endl;
	}

	//std::set is an associative container i.e the position of an item
	//within the container is determined by properties of that item
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
}

