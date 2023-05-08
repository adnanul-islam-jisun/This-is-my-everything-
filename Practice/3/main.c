#include<stdio.h>
int main(){
    float n,sum=0,j=1;
    int i;
    for ( i=1; ;i++)
    {
       scanf("%f",&n);
       if (n>0)
       {
            sum+=n;
            printf ("Average %f \n",sum/j);

            if (j==4)
            {
                break;
            }
            j++;


       }
       else
       {
           printf("_ \n");
           continue;
       }
    }
    return 0;
}


