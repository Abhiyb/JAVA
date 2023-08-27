import java.util.Scanner;
class Underage extends Exception{
    Underage(int  e){
        super("Underage"+e);
   }
}
class exceptionDemo{

 void test(int n){
  try{
    if(n<18){
        throw new Underage(n);
    }
    System.out.println("NICE AGE");
 }
 catch (Underage e){
         System.out.println(e);
 }
}
}
class Main{
public static void main(String []akhil){

exceptionDemo ob=new exceptionDemo();
System.out.println("Enter age");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
ob.test(n);
}


}
