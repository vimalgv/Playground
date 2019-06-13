#include <stdio.h>
int main() {
  int n,firstnum;
    scanf("%d",&n);
  firstnum=n;
  while(n>=100)
  {
    n=n/10;
  }
  firstnum=n;
  firstnum=firstnum%10;
  printf("%d",firstnum);
	return 0;
}