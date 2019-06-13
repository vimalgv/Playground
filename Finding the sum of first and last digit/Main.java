#include <stdio.h>
int main() {
	int n,lastnum,firstnum,sum=0;
    scanf("%d",&n);
  lastnum=n%10;
  firstnum=n;
  while(n>=10)
  {
    n=n/10;
  }
  firstnum=n;
  sum=firstnum+lastnum;
  printf("%d",sum);
	return 0;
}