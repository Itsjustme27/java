import java.util.Scanner;

public class IdentityM {
	public static boolean checkIdentity(int[][] arr) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j && arr[i][j] != 1) {
					return false;
				} else if(i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of matrix: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Your matrix: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.printf("\n");
		}
		
		if(checkIdentity(arr)) {
			System.out.println("The matrix is identity matrix");
		} else {
			System.out.println("The matrix is not identity matrix");
		}
	}
		
}
