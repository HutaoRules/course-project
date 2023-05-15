import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length of the Arrays");
        int size = keyboard.nextInt();
        int[] array = new int[size];
        for (int i = 0;i<size ; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            array[i]= keyboard.nextInt();
        }
        for (int i = 0; i< size-1; i++){
            for (int j =0; j< size - i-1;j++){
                if (array[j]> array[j+1]){
                    int ter = array[j];
                    array[j] = array[j+1];
                    array[j+1] = ter;
                }
            }
        }
        System.out.println("Sorted array: ");
        int sumofarray = 0;
        for(int i = 0;i< size;i++ ){
            System.out.print(array[i]+ " ");
            sumofarray += array[i];
        }
        double average = (double) sumofarray/size;
        System.out.println();
        System.out.println("Sum of the array is: " + sumofarray);
        System.out.println("Average of the array is: "+ average);

    }
}
