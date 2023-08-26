

import java.util.Random;

class  numbergenerated extends Thread{
    private final Random random;
    private int generatedNum;

    public  numbergenerated(Random random)
      {
          this.random=random;
      }
      public void run()
      {
          generatedNum=random.nextInt(100);
          System.out.println("Generated num is "+generatedNum);
      }
      public int getgeneratedNum()
      {
          return generatedNum;
      }
}



class SqueareThread extends Thread{
    public final numbergenerated generatedThread;
    public SqueareThread(numbergenerated generatedThread)
    {
        this.generatedThread=generatedThread;
    }
    public void run()
    {
        try{
            generatedThread.join();
            
        }catch(InterruptedException e)
        {
            
        }
        int num=generatedThread.getgeneratedNum();
        if(num%2==0)
        {
        System.out.println("the square of "+num+" is "+num*num);
        }
        
    }
}


class CubeThread extends Thread{
    public final numbergenerated generatedThread;
    public CubeThread(numbergenerated generatedThread)
    {
        this.generatedThread=generatedThread;
    }
    public void run()
    {
        try{
            generatedThread.join();
            
        }catch(InterruptedException e)
        {
            
        }
        int num=generatedThread.getgeneratedNum();
        if(num%2!=0)
        {
        System.out.println("the cube of "+num+" is "+num*num*num);
        }
        
    }
}

public class Main
{
	public static void main(String[] args) {
     Random random=new Random();
      //-------------------1st part-----------------
      numbergenerated NGT=new numbergenerated(random);
      NGT.start();
    //------------------------------
      SqueareThread ST=new SqueareThread(NGT);
      ST.start();
    //------------------------------  
      CubeThread CT=new CubeThread(NGT);
      CT.start();
	}
}














