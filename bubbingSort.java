import java.util.Scanner;
public class bubbingSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr[] = {11,2,35,4,598,45,78,5};
		int temp = 0;
		for(int j = 0;j<arr.length-1;j++){
			for(int i = 0;i<arr.length-1-j;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i+1];
					arr[i+1]=arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
	}
}