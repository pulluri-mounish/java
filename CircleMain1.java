import java.io.*;
import java.util.*;
public class CircleArea{
    double r;
    CircleArea(){
        r=0;
    }
    CircleArea(double r){
        this.r = r;
    }
    CircleArea(CircleArea c){
        this.r = c.r;
    }
    double area(){
        return (22/7.0)*r*r;
    }
    double area(double x){
        return (22/7.0)*x*x;
    }
    void setCircle(double r){
        this.r = r;
    }
}

public class CircleMain1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        CircleArea c1 = new CircleArea();
        System.out.println("Initially the area of 1st circle:" +c1.area());
        CircleArea c2 = new CircleArea();
        System.out.println("Area of the circle with radius 7.0 is"+c2.area());
        System.out.println("Area of the circle with radius 5.5 is"+c2.area(5.5));
        CircleArea c3 = new CircleArea(c2);
        System.out.println("After copy constructor area of 3rd circle is:"+c3.area());
        c1.setCircle(8.8);
        System.out.println("After set circle area of 1st circle is" +c1.area());

    }
}
