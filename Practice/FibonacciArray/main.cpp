#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n];
    for (int i=1;i<=n;i++)
    {
        cin>> a[i];
    }



	for(int i=2;i<=n;i++){
	  a[i]=a[i-1]+a[i];

	}
    for (int i=1;i<=n;i++)
    {
        cout<< a[i]<< " ";
    }
    return 0;
}
