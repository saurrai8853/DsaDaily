import java.util.Scanner;

public class BinarySearch3 {
    public static void main(String[] args) {
        int arr[]={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.print("Enter the value that you want to search in array:");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=binaryFound(arr,target);
        System.out.println(ans);
    }
    static int binaryFound(int arr[],int target){
      int start=0;
      int end=arr.length-1;
      while (start<=end){
          int mid=start+(end-start)/2;

          if(target<arr[mid]){
              end=mid-1;
          }
          else if(target>arr[mid]){
              start=mid+1;
          }
          else {
              System.out.println("value is found at index of:");
              return mid;

          }

      }


        return -1;
    }
}
