#include<stdio.h>
int main(){
	int a[15][15],r,c,i,j;
	scanf("%d %d",&r,&c);
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			scanf("%d",&a[i][j]);
		}
	}

	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	printf("\n");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			if(i>=j)
				printf("%d ",a[i][j]);
		}
		printf("\n");
	}
}