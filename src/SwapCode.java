import java.util.Arrays;

public class SwapCode {
    public static void main(String[] args) {
//      " swap(10,20);
//
//    }
//    static void swap(int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);
//    }
        int []array={0,1,2,3,5,6};
        change(array);
        System.out.println(Arrays.toString(array));


    }
    static void change(int []arr){
        arr[0]=99;

    }

}
