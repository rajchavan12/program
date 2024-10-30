#include<iostream>
using namespace std;
int main()
{
    int year;
    cout<<"Enter Year ";
    cin>>year;
    if (year%400==0)
    {
       cout<<year<<" is leap year";
    }
    else if (year%100==0)
    {
       cout<<year<<" is no leap year"; /* code */
    }
    else if (year%4==0)
    {
       cout<<year<<" is leap year"; /* code */
    }
    else
    {
         cout<<year<<" is no leap year";
    }
   return 0;
}