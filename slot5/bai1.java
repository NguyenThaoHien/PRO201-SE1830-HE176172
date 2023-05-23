import java.util.Scanner;



public class Java_01 {
public static void main(String[] agrs){
  Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
                System.out.println(" ");
                System.out.println(arr[n-1]);
	}

}
