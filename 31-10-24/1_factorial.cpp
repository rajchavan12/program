#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int a;
    cout<<"Enter a: ";
    cin>>a;
	if (a==0)
	{
		cout<<"a is zero";
	}
	else
	{
		cout<<a *(a-1)<<endl;
	}
	return 0;
}
