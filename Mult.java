import java.util.Scanner;
public class Mult{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the calculator");
int a;
System.out.println("Enter first number");
a=sc.nextInt();
int b;
System.out.println("Enter Second number");
b=sc.nextInt();
int ch;
System.out.println("Enter your choice: 1. Addition /n 2.Substraction /n 3. Multiplication /n 4.Division");
ch=sc.nextInt();
int result=0;
switch(ch){
case 1:
result=a+b;
System.out.println("Additon="+result);
break;
case 2:
result=a-b;
System.out.println("Subtraction="+result);
case 3:
result=a*b;
System.out.println("Subtraction="+result);
break;

}



}
}