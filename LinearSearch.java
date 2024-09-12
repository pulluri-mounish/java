import java.io.*;
import java.util.*;
class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" +n+ "values into the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key element to search:");
        int key = sc.nextInt();
        int pos = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                pos = i+1;
                break;
            }
        }
        if(pos == -1){
            System.out.println(key+ "not found in the array");
        }
        else{
            System.out.println(key+ "found at" +pos+ "postion in the array");
        }
    }
}
