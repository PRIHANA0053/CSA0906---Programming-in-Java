import java.io.*;
import java.util.*;
class Area
{
public static void main(String args[])
{
int r,s;
Scanner p=new Scanner(System.in);
System.out.println("enter r ans s values");
r=p.nextInt();
s=p.nextInt();
double A=3.14*r*r;
int S=s*s;
System.out.println("Area of circle is:"+A);
System.out.println("Area of square is:"+S);
}
}