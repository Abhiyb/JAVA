
public class Main
{
    public static void threelettercomb(String word)
    {
        int n=word.length();
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    System.out.println(word.charAt(i)+word.charAt(j)+word.charAt(k));
                }
            }
        }
    }
	public static void main(String[] args) {
    String a="apple";
    if(a.length()==5)
    {
        threelettercomb(a);
    }
    else{
        System.out.println("Please enter a five-letter word.");
    }
	}
}
