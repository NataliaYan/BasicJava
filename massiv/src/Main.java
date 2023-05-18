import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayInitial[] = new int[10];
        boolean isUp;
       Random rand = new Random();
        System.out.println("array before sorting");
        for (int i = 0; i < arrayInitial.length; i++) {
            arrayInitial[i] = rand.nextInt(200);
            System.out.print(arrayInitial[i] + " ; ");
        }
        System.out.println();
        System.out.println("Sort the data in ascending order ? ( true/false ):");
        Scanner scanner =new Scanner(System.in);
        isUp = scanner.nextBoolean();
        sortingArray(arrayInitial,isUp);

        System.out.println("array after sorting");
        for (int i=0; i< arrayInitial.length; i++) {
               System.out.print(arrayInitial[i] + " ; ");
        }
    }

        public static void sortingArray(int[] arrayInitial, boolean isUp) {
            int j;
            System.out.println(isUp);
            if (isUp) {
                for (int i = 1; i < arrayInitial.length; i++) {
                    int index = arrayInitial[i];
                    for (j = i; j > 0 && index < arrayInitial[j - 1]; j--) {
                        arrayInitial[j] = arrayInitial[j - 1];
                    }
                    arrayInitial[j] = index;
                }
            } else {
                for (int i = 1; i < arrayInitial.length; i++) {
                    int index = arrayInitial[i];
                    for (j = i; j > 0 && index > arrayInitial[j - 1]; j--) {
                        arrayInitial[j] = arrayInitial[j - 1];
                    }
                    arrayInitial[j] = index;
                }
            }
        }
}

