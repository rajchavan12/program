#include<iostream>
using namespace std;
int main()
{
    int a,b,add,sub,mult;
    float div;
    a=20,b=10;
    add=a+b;
    sub=b-a;
    mult=a*b;
    div=a/b;
    int n;
    cout<<"1.Addition\n2.substraction\n3.multi\n4.div";
    cout<<"\nEnter choice: ";
    cin>>n;
    switch (n)
    {
    case 1:
         cout<<"Addition= "<<add<<endl;
        break;
    case 2:
         cout<<"substraction= "<<sub<<endl;
        break;
    case 3:
         cout<<"MUltiplication= "<<mult<<endl;
        break;
    case 4:
         cout<<"division= "<<div<<endl;
        break;
    
    default:
    cout<<"invalid choice";
        break;
    }
    // cout<<"Addition= "<<add<<endl;
    // cout<<"substraction= "<<sub<<endl;
    // cout<<"multiplication= "<<mult<<endl;
    // cout<<"divison= "<<div<<endl;
    return 0;
}