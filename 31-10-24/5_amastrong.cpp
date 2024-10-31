#include<iostream>
using namespace std;
int main()
{
    int n,m,sum=0,r;
    cout<<"Enter number: ";
    cin>>n;
    m=n;
    while (n>0)
    {
       r=n%10;
       n=n/10;
       sum=sum+r*r*r; /* code */
    }
    if (sum==m)
        cout<<"no is amastrong";
    else
        cout<<"no is not amastrong";
    return 0;
}