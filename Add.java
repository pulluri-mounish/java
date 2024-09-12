import java.io.*;
import java.util.Scanner;
public class Add{
    int x,y,z;
    int add(int x, int y){
        z = x+y;
        return z;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Add a = new Add();
        System.out.println("Enter two integers for addition:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = a.add(x,y);
        System.out.println("Sum of" +x+ "and" +y+ "is" +z);
    }
}
