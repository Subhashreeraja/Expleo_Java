package Arrays;

public class two_dimensional {

	/*This program represents the Multidimensional Array */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]x=new int[][] {{1,2},{3,4},{5,6}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(" "+x[i][j]);
				
			}
			System.out.println();
		}

	}

}
