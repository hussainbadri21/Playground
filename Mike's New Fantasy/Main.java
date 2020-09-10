#include<iostream>
using namespace std;
long int memo_fib(long int arr[], long int n)
{
      if(arr[n] != -1)
            return arr[n];
      if(n <= 1)
            return n;
      arr[n] = memo_fib(arr, n-2) + memo_fib(arr, n-1);
      return arr[n];
}
long int fib(int n)
{
    long int arr[n+1];
    for(long int i = 0; i <= n; i++)
    {
        arr[i] = -1;
    }
    return memo_fib(arr, n);
}
int main()
{
     long int n;
     cin >> n;
     cout << fib(n-1);
     return 0;
} 