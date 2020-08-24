#include <iostream>
using namespace std;
int main()
{
    long long k, i, j;
    int t, d0, d1;
    cin>>t;
    for(i = 0; i<t; i++)
    {
        long long sum = 0; 
        long long result = 0;
        cin>>k>>d0>>d1;
        sum = d0+d1;
        long long cycle= ((2*sum)%10) + ((4*sum)%10) + ((8*sum)%10 )+ ((6*sum)%10);
        result = sum + sum%10 + cycle*((k-3)/4);
        int x = (k-3)%4;
        int num = 2;
        while(x>0)
        {
            result += (num*sum)%10;
            num = (num*2)%10;
            --x;
        }
        if(result%3==0)
            cout<<"YES";
        else
            cout<<"NO";
        cout<<endl;
    }
	return 0;
}