import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={12,14,15,16,17,18,19,20,21,22,25,89};
        int target=166;
        BinarySearch(arr, target);
        int key=14;
        LinearSearch(arr,key);

    }
    static int BinarySearch(int Arr[],int target){
        int start=0;
        int end=Arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
           if(target<Arr[mid]){
                end=mid-1;
            } else if (target>Arr[mid]) {
                start=mid+1;

            }
            else{
               System.out.println("value is found on the index of:"+mid);
                return mid;
            }


        }
      return -1;

    }
   static int LinearSearch(int Array[],int key){

        if(Array.length==0){
            return -1;
        }
        for(int i=0;i<=Array.length-1;i++){
            if(Array[i]==key){
                System.out.println("Value is found at the index of:"+i);
            }
        }

       return -1;
   }
}