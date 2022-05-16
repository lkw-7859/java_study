package test01;

public class StringTest {

	public static void main(String[] args) {
		String[] name= {"aaa","bbb","ccc","ddd","eee"};
		int[] h= {98,70,45,60,83};
		int[] eng= {85,80,50,65,70};
		int[] mat= {80,73,80,80,50};
		
		int[] sum=new int[name.length]; 
 		double[] avg = new double[name.length];
		int[] rank = new int[name.length];
		char[] grade = new char[name.length];
		double max=0,min=999;
		
		
		for(int i=0;i<h.length;i++) {

			sum[i]=h[i]+eng[i]+mat[i];
			avg[i]=(double)sum[i]/3;
			
			if(avg[i]>max) max=avg[i];
			if(avg[i]<min) min=avg[i];
			
			grade[i]=gradeN((int)avg[i]/10);
		
		}
		
		for(int i=0;i<avg.length;i++) {
			for(double num:avg) 
				if(avg[i]<=num) rank[i]++;
		}
		
		
		System.out.println("번호   이름   국어   영어   수학   총점   평균   학점   등수");
		System.out.println("--------------------------------------------------");
		for(int i=0;i<h.length;i++) 
			System.out.println((i+1)+"    "+name[i]+"    "+h[i]+"    "+eng[i]+"    "+mat[i]+"    "
					+sum[i]+"  "+String.format("%.1f", avg[i])+"    "+grade[i]+"    "+rank[i]);
			
		System.out.println("--------------------------------------------------");
		System.out.println("최고 점수 : "+String.format("%.1f", max));
		System.out.println("최저 점수 : "+String.format("%.1f", min));
		
	}
	
	public static char gradeN(int s) {
		char g;
		switch(s) {
			case 10:
			case 9: g='A'; break;
			case 8:	g='B'; break;
			case 7: g='C'; break;
			case 6: g='D'; break;
			case 5: g='E'; break;
			default: g='F';break;
		}
		
		return g;
	}
	

}
