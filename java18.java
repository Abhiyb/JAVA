

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
String original="hello boys good morning and welcome to boys community";
 String replace1= original.replaceAll("boys","girls");
 System.out.println(replace1);
 
 String replace2=original.replaceFirst("boys","girls");
 System.out.println(replace2);
 
 //SPLIT STRING 
 String str="banana,apple,orange";
 String a[]=str.split(",");
 for(String it:a)
 {
     System.out.println(it);
 }
	}
}
