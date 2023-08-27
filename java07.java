import java.util.Scanner;
class exception{

public static void main(String []args){
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
   try{
 int  ans=a/b;
 System.out.println(ans);
 }
   catch(ArithmeticException e ){
     System.out.println("Divide by zero error");
   }

 }
}
