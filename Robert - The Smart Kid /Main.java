#include<iostream>
using namespace std;
long int findingSum(long int n)
{
   if (n % 2 == 0)
      return (n/2) * (n+1);
   else
      return  ((n + 1) / 2) * n;
}
int main()
{
  long int n;
  cin >> n;
  cout << findingSum(n);
  return 0;
}