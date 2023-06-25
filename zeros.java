package Arrays;

import java.util.Arrays;

public class zeros {
    
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12};
        int arr1 [] = {0};
        zero(arr1);
        zero(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static void zero(int arr[]){
        int n = arr.length;
        int non = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                arr[non] = arr[i];
                non++;
            }
        }
         while (non < n) {
            arr[non] = 0;
            non++;
    }
}
}
