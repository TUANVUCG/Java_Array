public class findMin {
    public static void main(String[] args) {
        int[]array = {2,4,55,6,2,6,1,};
        System.out.println("Min is : " +findMin(array));
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }return min;
    }
}
