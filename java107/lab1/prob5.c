#include<stdio.h>
int main(){
	int i,m,n,j,k,temp,num;
	printf("Enter number of elements in first and thyen second array\n");
	scanf("%d",&n);
	scanf("%d",&m);
	int a[n],b[m],c[m+n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<m;i++){
		scanf("%d",&b[i]);
	}
	k=0;
	num=m+n;
	for(i=0;i<num;i++){
		if(i<n)
			c[i]=a[i];
		else{
			c[i]=b[k];
			k++;
		}

	}

	for(i=0;i<num;i++){
		for(j=0;j<num;j--){
			if(c[j]>c[j+1]){
				temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
			}
		}
	}
	for(i=0;i<num;i++){
		printf("%d ",c[i]);
	}


}
/*
void sortt(int a[] , int n,int m){
	int i,j,temp;

	for(i=0;i<(m+n);i++){
		for(j=0;j<(m+n)-i-1;j--){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<(m+n);i++){
		printf("%d ",a[i]);
	}

}
*/