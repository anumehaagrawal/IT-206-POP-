#include <stdio.h>

#include <string.h>
int main()

{

    char a, word[50];
    int i, freq = 0, flag = 0;

    gets(word);
    scanf("%c", &a);
    for (i = 0; i < strlen(word); i++)

    {
        if (word[i] == a)
        {
            flag = 1;

            printf("%d  ", i + 1);

            freq++;
        }
    }
    if (flag)

    {
        printf("Character '%c' occured for %d times.\n", a, freq);

    }
}