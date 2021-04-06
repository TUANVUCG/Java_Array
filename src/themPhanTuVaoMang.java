import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 12, 5, 4, 7, 8, 13, 9};
        int[] newArr = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số muốn thêm : ");
        int soMuonThem = sc.nextInt();
        System.out.print("Nhập vị trí muốn thêm : ");
        int viTri = sc.nextInt()-1;
        for (int i = 0; i < viTri; i++) {
            newArr[i] = arr[i];
        }
        newArr[viTri] = soMuonThem;
        for (int i = viTri + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        System.out.println("Mảng mới là : ");
        for(int i = 0; i < newArr.length;i++){
            System.out.print(newArr[i]+"  ");
        }
    }

}
