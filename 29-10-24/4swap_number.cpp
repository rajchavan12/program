#include<iostream>
using namespace std;
int main()
{
    int a,b,temp;
    cout<<"Enter value of a: ";
    cin>>a;
    cout<<"Enter value of b: ";
    cin>>b;
    temp=a;
    a=b;
    b=temp;
    cout<<"Enter change value of a and b are "<<a<<" and "<<b;
    return 0;
}