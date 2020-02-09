package by.it.zhilenkova.jd01.jd01_04;
import by.it.zhilenkova.jd01.jd01_04.Helper;
import by.it.zhilenkova.jd01.jd01_04.InOut;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
        buildOneDimArray(new Scanner(System.in).nextLine());
    }
    private static void printMulTable(){
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ", i, j, i * j);
            }
            System.out.println();
        }
    }

    private static void buildOneDimArray(String line){

        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        Helper.sort(array);
        InOut.printArray(array, "V", 4);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == first){
                System.out.printf("Index of first element=%d\n", i);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == last){
                System.out.printf("Index of last element=%d\n", i);
                break;
            }
        }
    }
}