#include<iostream>
using namespace std;
int main()
{
   
    
    
    cout<<"Enter the Alphabate: ";
    cin>>ch;
    if (ch>=65 && ch<=90)
    {
        cout<<"charachter is upper case";
        /* code */
    }
    else if (ch>=97 && ch<=125)
    {
        cout<<"charchter is lower case";
        /* code */
    }
    else
    {
        cout<<"wrong input";
    }
return 0;    
}