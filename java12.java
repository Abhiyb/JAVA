import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      String str="good evening abhi and akash";
      int count=0;
      int check=0;
      System.out.println("length of name is "+str.length());
      boolean contain= str.contains(String.valueOf('a'));
      if(contain)
      {
      System.out.println("a is present");
      }//write count occurance ,index which is same as bellow  
    //   for(int i=0;i<str.length();i++)
    //   {
    //       if(str.charAt(i)=='a'){
    //           if(check==0)
    //           {
    //               System.out.println("a is present");check++;
    //           System.out.print("location of a is:");
    //           }
    //           count++;
    //           System.out.print(i+" ");
    //       }
    //   }
    // //   System.out.println();
    //   System.out.println("\nnumber of occurance of a is "+count);
    }
}






