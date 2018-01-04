int main()
{

        int i;
        int pfork(int);
        printf("Hello gud morning \n");

        printf(" i : %d ",i);
        i=pfork(3);

        if(i==0)
        {
                printf(")Parent \n");
                printf("i when 0 \n ");
                printf("Getpid : %d getppid : %d\n",getpid(),getppid());
                printf("\n");
        }

        elseif(i==1)
        {
                printf("Child \n");
                printf("i when 1 \n");
                printf("Getpid : %d getppid : %d\n",getpid(),getppid());
                printf("\n");

        }

        elseif(i==2)
        {
                printf("Child \n");
                printf("i when 2 \n");
                printf("Getpid : %d getppid : %d\n",getpid(),getppid());
                printf("\n");
        }

        else
        {
        }
}






int pfork(int x)
{
        int j;
        for(j=1;j<x;j++)
        {
                if(fork()==0)
                {
                        //sleep(3);return j;
                }
        }
        return 0;
}
