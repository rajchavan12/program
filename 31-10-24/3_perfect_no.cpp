#include<iostream>
using namespace std;
int main()
{
    int n,i,sum=0;
    cout<<"enter no: ";
    cin>>n;
    for (int i = 1; i < n; i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }/* code */
    }
   if(sum==n)
        cout<<"\nperfect number";
    else
        cout<<"\nnot perfect number";
    return 0;
}