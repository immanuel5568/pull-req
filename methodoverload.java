import java.util.Scanner;
class methodoverload
{
double add(int a,double b)
{
return a+b;
}
double add (int a,double b,float c)
{
return a+b+c;
}
public static void main(String args[])
{
Scanner Scan = new Scanner(System.in);
methodoverload method = new methodoverload();
System.out.println("enter any number");
int x = Scan.nextInt();
double y = Scan.nextDouble();
float z = Scan.nextFloat();
System.out.println("sum:"+ method.add(x,y,z));
}
}