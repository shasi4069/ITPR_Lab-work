import java.util.*;
public class Array3{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }  
        int positive = 0;
        int negative = 0;
        for(int i = 0 ; i < 10 ; i++){
            if(arr[i] > 0){
                positive++;
            }else if (arr[i] < 0){
                negative++;
            }
        }
         System.out.println("Total positive numbers: " + positive);
        System.out.println("Total negative numbers: " + negative);
}
}