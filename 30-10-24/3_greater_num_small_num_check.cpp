#include<iostream>
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter three numbers: ";
    cin>>a;cin>>b;cin>>c;
    if (a>b && a>c)
    {
        cout<<"this value is greater "<<a;
    }
    else if(b>c)
    {
       cout<<"this value is greater "<<b; 
    }
    else
    {
        cout<<"this value is greater "<<c;
    }
    return 0;
}