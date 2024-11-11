import java.util.*;
class methodoverloading{
    public static class Rectangle{
        public static int area(int l,int w){
            return l*w;
        }
    }
    public static class Circle{
        public static double area(float r){
              return 3.15*r*r;
        }
    }
    public static class Triangle{
       public static double area(float b,float h){
            return 0.5*b*h;
        } 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l,w,b,h;
        float r;
        System.out.println("enter the dimensions for rectangle");
        w=sc.nextInt();
        l=sc.nextInt();
        System.out.println("enter the dimensions for circle");
        r=sc.nextFloat();
        System.out.println("enter the dimensions for triangle");
        b=sc.nextInt();
        h=sc.nextInt();
        System.out.println("the area of given shapes are  :");
        System.out.println("area of rectangle is" +Rectangle.area(l,w));
        System.out.println("the area of circle is" +Circle.area(r));
        System.out.println("the area of triangle is" +Triangle.area(b,h));
        
        sc.close();
        
    }
}
