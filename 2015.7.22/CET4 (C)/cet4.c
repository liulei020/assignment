#include<stdio.h>

main()
{   
	int i,grades,judge,cet4_scores[8];
	printf("Please input cet4'scores\n"); 
	for(i=0;i<8;i++)
	{
		scanf("%d",&grades);
		if(grades>=-1 && grades<=710)
		{
			if(grades==-1)
			{
				break;
			}
			else
			{
				cet4_scores[i]=grades;
			}
		}
		else
		{
			printf(" Input error ! ");

		}
	}
	for(i=0;i<8;i++)
	{
		if(cet4_scores[i]>=425)
		{
			judge=1;
			break;
		}
		else{
			judge=0;
		}
	}
	if(judge==1)
	{
		printf(" Pass cet4 ! "); 
	}
	else
	{
		printf(" Don't pass cet4 ! ");
	}

}
