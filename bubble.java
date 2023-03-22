//          Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл


import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class bubble {       
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int n = sc.nextInt();
        sc.close();

        // создаем массив и заполняем рандомными числами
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] +" ");          
        }

        System.out.println();
        FileWriter logFile = new FileWriter("My_file.txt");

        // сортируем Пузырьком
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            // записываем в файл
            logFile.write("После итерации " + (i + 1) + ": ");
            for (int k = 0; k < arr.length; k++) {
                logFile.write(arr[k] + " ");
            }
            logFile.write("\n");
        }
        logFile.close();
    }
}
