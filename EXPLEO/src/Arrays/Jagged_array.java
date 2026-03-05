package Arrays;

public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bookNo[][]=new int[3][];
		bookNo[0]=new int[] {1,2,3};
		bookNo[1]=new int[] {4,5};
		bookNo[2]=new int[] {6,7,8};
		System.out.println("Two Dimensional Array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<bookNo[i].length;j++) {
				System.out.print(" "+bookNo[i][j]);
			}
			System.out.println();
		}

	}

}
