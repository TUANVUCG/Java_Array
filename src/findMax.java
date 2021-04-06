import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử ( <=20 ) ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số phần tử > 20");
            }
        }while (size > 20) ;
        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.printf("Nhập phần tử số %d : ", (i+1));
            array[i] = sc.nextInt();
            i++;
        }
        int max = array[0];
        int j;
        int index = 0;
        for(j = 0; j<array.length; j++){
            if(max<array[j]){
                max = array[j];
                index = j;
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max);
        System.out.println("Vị trí của max trong mảng là : "+ (index));
    }
}
