#include<stdio.h>
struct item{
	int price;
	int quant;
}*a;

void summ(struct item *a);
int sum=0;
int main(){
int i,n,p,q;
scanf("%d",&n);
for(i=0;i<n;i++){
	scanf("%d %d",&q,&p);
	a->price=p;
	a->quant=q;
	summ(&a);
}
printf("total cost is %d",sum);
}

void summ(struct item *a){
	sum=sum+((a->price)*(a->quant));

}