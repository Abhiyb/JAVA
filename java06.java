/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface test{
    public void square(int n);
}
class Arithmatic implements test{
    public void square(int n)
    {
        System.out.println(n*n);
    }
}

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    // toTest obj=new toTest();
    Arithmatic obj=new Arithmatic();
    obj.square(10);
	}
}
