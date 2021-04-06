import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 6, 7, 8, 4, 3, 9};
        int[] newArr = new int[arr.length - 1];
        int index;
        System.out.println("Mảng của bạn là : {1, 2, 5, 6, 7, 8, 4, 3, 9}");
        System.out.println("Nhập phần tử bạn muốn xóa : ");
        int phanTuMuonXoa = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (phanTuMuonXoa == arr[i]) {
                System.out.println("Đã thấy hàng, đợi tí !!!");
                index = i;
                for (int j = 0; j < index; j++) {
                    newArr[j]=arr[j];
                }
                for(int j = index+1; j < newArr.length+1;j++){
                    newArr[j-1]=arr[j];
                }
            }
        }
        System.out.print("Mảng mới là : ");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }

    }
}
