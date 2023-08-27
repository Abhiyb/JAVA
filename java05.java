class Shape{
    void draw(){
    System.out.println("Shape is Drawn");

 }
   void erase(){
   System.out.println("Shape is Erased");
 }
}

class Circle extends Shape{

  void draw(){
    System.out.println("Circle is Drawn");

 }
   void erase(){
   System.out.println("Circle is Erased");
 }

}
class Triangle extends Shape{
void draw(){
    System.out.println("Triangle is Drawn");

 }
   void erase(){
   System.out.println("Triangle is Erased");
 }
}

class Square extends Shape{

void draw(){
    System.out.println("Square is Drawn");

 }
   void erase(){
   System.out.println("Square is Erased");
 }
}

class poly{
    public static void main(String []args){
   Circle c=new Circle();
   Square s=new Square();
   Triangle t=new Triangle();
   c.draw();
   s.draw();
   t.draw();
   c.erase();
   s.erase();
   t.erase();
 }

}
