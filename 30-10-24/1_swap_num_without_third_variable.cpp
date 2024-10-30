#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"Enter value for a ";
    cin>>a;
    cout<<"\nEnter value for b ";
    cin>>b;
    cout<<"\nFirst a="<<a;    
    cout<<"\nFirst b="<<b;    
    a=a+b;
    b=a-b;
    a=a-b;
    cout<<"\nAfter interchane value for a "<<a;
    cout<<"\nAfter interchane value for b "<<b;
    return 0;

}