package w_2_7;

public class CloneArray {

	static int[][] deepCopy(int[][] arr){
	    int[][] result = new int[arr.length][arr[0].length];
	    for (int i=0; i<arr.length; i++) {
	      result[i] = arr[i].clone();
	    }
	    return result;
	  }
	
	public static void main(String[] args) {
		int[] a = {8,5,2,4,6,3,7,9};
		int[] b = a.clone();
		
		int[][] c = {{-1,5,6,7},{6,7,8,9}};
		int[][] d= deepCopy(c);
		
		System.out.println("a배열");
		for(int i=0;i<a.length;i++) {
			System.out.print("["+a[i]+"] ");
		}
		System.out.println();
		System.out.println("\na배열 복사본");
		for(int i=0;i<b.length;i++) {
			System.out.print("["+b[i]+"] ");
		}
		System.out.println();
		
		System.out.println("\nc배열");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print("["+c[i][j]+"] ");
			}
			System.out.println();
		}
		System.out.println("\nc배열 복사본");
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print("["+d[i][j]+"] ");
			}
			System.out.println();
		}
	}

}
