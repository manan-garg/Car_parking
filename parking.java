import java.util.Scanner;
class parking
{
 public static void main(String []arg)
 {
	String car_name[]=new String[20];
	String car_num[]=new String[20];
	int i=1,slot,count=0,c;
	int flag[]=new int[20];
	for(i=1;i<=16;++i)
	{
	 flag[i]=0;
	}
	do
	{
 	  System.out.println("\n\t\tMENU");
	  System.out.println("1.Park a Car");
	  System.out.println("2.Remove from Parking");
	  System.out.println("3.List the Parking slots");
	  System.out.println("0.Exit");
	  Scanner s=new Scanner(System.in);
	  System.out.print("\nEnter your choice=");
	  c=s.nextInt();
	  switch(c)
		{
		 case 1:count=0;
			for(i=1;i<=16;++i)
			{
			if(flag[i]==0)
			break;
			else
			++count;
			}
			if(count>=0&&count<16)
			{
			System.out.print("\nEnter the Car name=");
			car_name[i]=s.next();
			flag[i]=1;
			System.out.print("\nEnter Car Number=");
			car_num[i]=s.next();
			}
			else
			System.out.print("\nPARKING FULL");
			break;
		 case 2:
			System.out.print("\nEnter Parking slot No:=");
			slot=s.nextInt();
			if(slot>0&&slot<=16)
			{
			 if(flag[slot]==1)
			{
			System.out.print("\nCar name "+car_name[slot]);
			System.out.print(" and Car number "+car_num[slot]);
			System.out.print(" removed from Parking");
			flag[slot]=0;
			}
			else
			System.out.print("\nPlace already vacant");
			}
			else
			System.out.print("\nWrong Entry");
			break;
		 case 3:for(i=1;i<=16;++i)
			{
			if(flag[i]==1)
			{System.out.print("\nSlot "+i);
			System.out.print(": "+car_name[i]);
			System.out.print(" "+car_num[i]);}
			else
			{System.out.print("\nSlot "+i);
			System.out.print(": No Car");}
			}
			break;
		 case 0:
			break;
		 default:System.out.print("\nWrong Input");
		}
	}while(c!=0);
			
 }
}