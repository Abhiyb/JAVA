import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("Capacity of sb1: " + sb1.capacity());
        System.out.println("Capacity of sb2: " + sb2.capacity());

        
        // System.out.print("Enter a string: ");
        // String a = sc.nextLine(); or
      
       String a="HKEHSIHBA";
       StringBuffer sb=new StringBuffer();
       sb.append(a);
       sb.reverse();
       String upper=sb.toString().toUpperCase();
       System.out.println(upper);
       
       //other string 
       String b=" benur";sb.append(b);System.out.println(sb);
    
    }
}
