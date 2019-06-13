#include<stdio.h>
int main()
{
  int x,y,z;
  scanf("%d",&x);
  y=x/100;
  z=x%10;
  printf("%d",y+z);
  return 0;
}