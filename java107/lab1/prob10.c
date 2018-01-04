#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>
int main() {
   FILE *fp1;
   char ch1;
   char fname1[40];
   gets(fname1);
   fp1 = fopen(fname1, "r");
 
   if (fp1 == NULL) {
      printf("Cannot open %s for reading ", fname1);
      exit(1);

   } else {
      ch1 = getc(fp1);
   
      while ((ch1 != EOF)){
         ch1 = getc(fp1);
         ch1=toupper(ch1);
         printf("%c",ch1);
      }

      fclose(fp1);

   }
   
}