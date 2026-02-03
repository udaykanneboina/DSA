
import java.util.Scanner;
import java.util.Arrays;

public class Thirdlargestnumber {

	
	public static void main ( String[] args) {
		
		System.out.print("Enter the length of the array: ");

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		fillArray(arr, n);

		System.out.println(thirdLargest(arr,n));


	}

	public static void fillArray (int[] arr,int n) {

		for( int i=0; i<n; i++) {
		
			System.out.print("Enter the "+(i+1)+" element:");

			Scanner s = new Scanner(System.in);

			arr[i] = s.nextInt();
			
		
		}

	}

	public static int thirdLargest(int[] arr,int n) {

		int l=-1 , sl=-1, tl=-1;

		for( int i=0; i<n; i++) {
		
			if(arr[i] > l) {

				tl=sl; 

				sl=l;

				l=arr[i];

			}

			else if ( arr[i]<l && arr[i]>sl) {

				sl=arr[i];
				
			}

			else if(arr[i]<sl && arr[i]>tl) {

				tl=arr[i];

			}


		}

		return tl;


	}

	

}