import java.util.Scanner;
public class DateTest
{
  
public static void main(String args[])
{
  
Date date=new Date(0,0,0);
  
Scanner input=new Scanner(System.in);
  
  
System.out.println("Enter Month");
int m=input.nextInt();
date.setMonth(m);
  
System.out.println("Enter Day ");
int d=input.nextInt();
date.setDay(d);
  
System.out.println("Enter Year");
int y=input.nextInt();
date.setYear(y);

date.displayDate();

  
}

}