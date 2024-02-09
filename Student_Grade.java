import java.io.*;
import java.util.*;
class Calculator
{                                           
int mark=0,n_Subject,total,total_marks_obtained=0,i=1;   //We are considering the marks obtained in an integer 
double percentage;
Scanner s=new Scanner(System.in);//Create object of Scanner class
void t_Sub()
{
System.out.println("ENTER TOTAL NUMBER OF SUBJECT:");
n_Subject=s.nextInt();
total=n_Subject*100;
}
void t_Marks()
{
while(i<=n_Subject)
{
System.out.println("ENTER MARKS OF SUBECT"+i+"=");
mark=s.nextInt();                              
if(mark<=100 && mark >=0)
{
total_marks_obtained=total_marks_obtained+mark;
i++;
}
else
{
System.out.println("Sorry!!!! Invalid marks enter marks between or equal 0 to 100");
}
}
System.out.println("TOTAL MARKS OBTAINED IS="+ total_marks_obtained +"OUT OF"+ total);
}
void Percentage()
{
//TO CALCULATE PERCENTAGE OF MARK OBTAINED
percentage=Math.ceil((total_marks_obtained*100)/total);

System.out.println("THE PERCENTAGE OBTAINED BY STUDENTS IS:"+percentage+"%");
}
void Grade()
{
//FOR GRADING ACCORDING TO PERCENTAGE OF ALL THE SUBJECT
System.out.println("THE GRADE OF STUDENT MARK OBTAINED IS:");
if(percentage>=90.0)
{
System.out.println("O  (i.e.OUTSTANDING)");
}
else if(percentage>=80.0 && percentage<90.0 )
{
System.out.println("A+  (i.e.EXCELLENT)");
}
else if(percentage>=70.0 && percentage<80.0 )
{
System.out.println("A (i.e.VERY GOOD)");
}
else if(percentage>=60.0 && percentage<70.0 )
{
System.out.println("B+ (i.e.GOOD)");
}
else if(percentage>=50.0 && percentage<60.0 )
{
System.out.println("B (i.e.AVERAGE)");
}
else if(percentage>=40.0 && percentage<50.0 )
{
System.out.println("C(i.e. PASS)");
}
else
{
System.out.println("F(i.e. FAIL)");
}
}
public static void main(String ag[])
{
System.out.println("********************STUDENT GRADE CALCULATOR********************");
Calculator c=new Calculator();
c.t_Sub();
c.t_Marks();
c.Percentage();
c.Grade();
}
}