import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[]args){
        Scanner y= new Scanner(System.in);
        int[] a=new int[5];
        int []as=new int[5];
        for (int i=0; i< a.length; i++){
            System.out.println( "Введите елемент масива " +i);
            a[i]=y.nextInt();
        }
        as = sortA(a);
        for (int j=0; j< as.length; j++) System.out.println(as[j]);
    }

    public static int[] sortA(int[] ar){
        Arrays.sort(ar);
        return ar;
    }
}
