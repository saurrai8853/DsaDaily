import java.util.Arrays;

public class BinarySearch2 {

    public static void main(String[] args) {
        int arr[]={12,13,14,15,16,18,19,20,21,22};
        int target=22;
        int res= Arrays.binarySearch(arr,target);
        if(res>=0){
            System.out.println(target+" is found at index of "+res);
        }
        else{
            System.out.println(target+" is not found in the array");
        }
        target=40;
        res=Arrays.binarySearch(arr,target);
        if(res>=0){
            System.out.println(target+" is found at index of "+res);
        }
        else{
            System.out.println(target+" is not found in the array");
        }


    }
}
