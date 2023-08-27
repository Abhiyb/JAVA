class circle{
    private double radius;
    private String color;
    circle()
    {
        radius=1.0;color="red";
    }
    circle(double r)
    {
        radius=r;
    }
    public void setradius(double radius)
    {
        this.radius=radius;
    }
    public void setcolor(String color)
    {
        this.color=color;
    }
    public double getradius()
    {
        return radius;
    }
    public double getarea()
    {
        return (22/7.0)*radius*radius;
    }
    circle(double r,String s)
    {
        radius=r;color=s;
    }
}
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
     circle obj=new circle(10);
    //  obj.radius=10;
    
     System.out.println(obj.getarea());
	}
}
