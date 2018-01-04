#include<stdio.h>
int main(){
	int n,i,j,k;
	n=5;
	for(i=1;i<=5;i++){
		for(j=n-i;j>=0;j--){
			printf(" ");
		}
		for(k=1;k<=(2*i)-1;k++){
			printf("%d",k);
		}
		for(j=n-i;j>=0;j--){
			printf(" ");
		}
		printf("\n");

	}
	for(i=4;i>=1;i--){
		for(j=n-i;j>=0;j--){
			printf(" ");
		}
		for(k=1;k<=(2*i)-1;k++){
			printf("%d",k);
		}
		for(j=n-i;j>=0;j--){
			printf(" ");
		}
		printf("\n");

	}
	}
