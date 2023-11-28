import java.io.*;
import java.util.*;
class Arthmetic
{
public static void main(String args[])
{
int x,y;
Scanner s=new Scanner(System.in);
System.out.println("enter two nums:");
x=s.nextInt();
y=s.nextInt();
int a=x+y;
int b=x-y;
int c=x*y;
int d=x/y;
int e=x%y;
System.out.println("addition"+a);
System.out.println("sub"+b);
System.out.println("mul"+c);
System.out.println("div"+d);
System.out.println("mod"+e);
}
}