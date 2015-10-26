package me.laip.algorithms.nowcoders;

/**
 * Created by Arthur on 2015/3/11.
 */
public class OddInOddEvenInEven {

    public void oddInOddEvenInEven(int[] arr) {
        for (int i = 0, j = 1; i < arr.length && j < arr.length;) {
            for (; i < arr.length && arr[i] % 2 == 0; i += 2) ;
            for (; j < arr.length && arr[j] % 2 == 1; j += 2) ;
            if (i < arr.length && j < arr.length) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;
            }
        }
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {7,7,9,5,1,6,7,9,3,2,6};
        OddInOddEvenInEven oddInOddEvenInEven = new OddInOddEvenInEven();
        oddInOddEvenInEven.oddInOddEvenInEven(arr);
    }

}
