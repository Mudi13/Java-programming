import java.util.Scanner;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();

	int arr[] = new int[N];
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}

	int target_num=sc.nextInt();

	boolean ans = false;
	for(int val : arr)
	{
		if(target_num==val){
			ans=true;
			break;
		}
	}
	System.out.println(ans);
  }
}