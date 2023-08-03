import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n+1];

        System.out.println("Enter the elements of the array in ascending order:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to insert: ");
        int num = sc.nextInt();

        System.out.println("Original Array: " + Arrays.toString(array));

        int pos=0;
        for(int i=0;i<n;i++){
            if(array[i]<num){
                pos++;
            }else{
                break;
            }
        }
        System.out.println(num + " should be entered at position "+ pos );
        
        for(int i=n-1;i>=pos;i--) {
            array[i+1] = array[i];
        }
        
        array[pos] = num;
        System.out.println("Array after insertion: " + Arrays.toString(array));
        sc.close();
    }
}
