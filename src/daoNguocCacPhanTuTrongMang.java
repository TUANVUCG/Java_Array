import java.util.Scanner;

public class daoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử trong mảng ( <= 20 )");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Đã bảo nhập <= 20 rồi >'< ");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }System.out.println("");
        for(int j = 0;j<array.length/2;j++){
            int temp = array[j];
            array[j]=array[size -1-j];
            array[size-1-j]=temp;
        }
        System.out.printf("Mảng sau đảo ngược: ");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
