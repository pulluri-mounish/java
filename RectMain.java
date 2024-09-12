import java.io.*;
import java.util.Scanner;
class RectArea{
    double l,b;
    double area(){
        return l*b;
    }
}
class RectMain{
    public static void main(String[] args){
        RectArea ra = new RectArea();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of l and b: ");
        ra.l = sc.nextInt();
        ra.b = sc.nextInt();
        System.out.println("Area of the rectangle is" +ra.area());
    }
}
