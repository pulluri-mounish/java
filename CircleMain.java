import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class CircleArea{
    double x, y, r;
    double area(){
        return (22/7.0)*r*r;
    }
}
class CircleMain{
    public static void main(String args[]){
        CircleArea ca = new CircleArea();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter center a,y value: ");
        ca.x = sc.nextInt();
        ca.y = sc.nextInt();
        ca.r = (sqrt((ca.x*ca.x)+(ca.y*ca.y)));
        System.out.println("Area of the circle is" +ca.area());
    }
}
