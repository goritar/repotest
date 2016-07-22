import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Игорь on 22.07.2016.
 */
public class tesGitHub {
    public static void main(String[] args) {
        System.out.print(" Введите длинну массива:");
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("введите "+ (i+1) + "й элемент массива:");
            arr[i] = sc.nextInt();
          //  ffjybkjkm;mlkgkjbkj
        }
        Arrays.sort (Arrays.copyOf(arr,(int)(arr.length*1.5)));
        System.out.println(Arrays.toString(arr));

    }
}

