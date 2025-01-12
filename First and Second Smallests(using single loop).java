import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; ++i){
            arr[i]=sc.nextInt();
        }
        int min_element = Integer.MAX_VALUE; 
        int sec_min = Integer.MAX_VALUE;
        for(int i=0; i<N; ++i){
            if(arr[i]<min_element){
                sec_min=min_element;
                min_element=arr[i];
            }
            else if(arr[i]!=min_element && arr[i]<sec_min){
                sec_min=arr[i];
            }
        }

        if(sec_min==Integer.MAX_VALUE);
        {
            min_element = -1;
            sec_min = -1;
        }
        System.out.print(min_element+" "+sec_min);
	}    
} 
