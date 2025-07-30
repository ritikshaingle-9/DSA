import java.util.Scanner;

public class MoveZerostoEnd {

    public static void Move(int[] arr,int n){
        
        int j=1;
        for(int i=0; i<n; i++){

          if(j<n){  
          if(arr[i]==0 && arr[j]==0){
            j++;
            while(arr[i] == arr[j]){
                j++;
            }
          } 

          if(arr[i]==0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
          }
        }
    }
       for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        Move(arr,n);

    }
}
