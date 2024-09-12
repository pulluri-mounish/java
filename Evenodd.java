import java.io.*;
import java.util.*;
class Evenodd{
	public static void main(String agrs[]){
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a positive integer to check wheather it is even or odd: ");
		num = sc.nextInt();
		if(num%2==0){
			System.out.println(num+ "is an even number");
		}else{
			System.out.println(num+ "is an odd number");
		}
	}
}
