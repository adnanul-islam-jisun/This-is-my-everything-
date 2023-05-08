#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    char a[10];
    int b=0;
    printf("Input: ");
    scanf("%s",a);
    //gets(a);

   for (int i = 0; a[i]!= '\0'; i++)
    {
        if (isdigit(a[i]) == 0)
        {
            printf("This is not number");
            break;
        }
        else
            b++;

    }
    if(b!=0)
    {
        int x = atoi(a);

        if (x%2==0)
        {
            printf("Even");
        }
        else
        {
            printf("Odd");
        }
    }



    return 0;
}
