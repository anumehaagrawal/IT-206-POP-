#include<stdio.h>
int main(){
	int a[100],i,n,min,max,temp,flag,flag1;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);

	}
	min=9999;
	max=-9999;
	for(i=0;i<n;i++){
		if(a[i]>max){
			max=a[i];
			flag=i;
		}
		if(a[i]<min){
			min=a[i];
			flag1=i;
		}

	}
	a[flag]=min;
	a[flag1]=max;
	for(i=0;i<n;i++){
		printf("%d",a[i]);
	}
}