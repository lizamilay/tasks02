import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		int n = 3;
		double [] arr = new double [2*n];
		
		init(arr);
		System.out.println("�������� ������:");
		print(arr);
		
		double max = arr[0] + arr[2*n-1];
		double temp = 0;
		
		for(int i = 1; i < arr.length / 2; i++) {
			temp = arr[i] + arr[arr.length-i-1];
			if(max < temp) {
				max = temp;
			}
		}
		
		System.out.println("max = " + max);
	
		return;
	}
	 public static void init(double[] mas) {
	    	Random rand = new Random();
	    	for( int i=0; i < mas.length; i++) {
	    		mas[i] = rand.nextDouble() * 100;
	    	}
	    }
	    
	    public static void print(double[] mas) {
	    	
	    	for( int i=0; i < mas.length; i++) {
	    		System.out.print(mas[i] + " ");
	    	}
	    	System.out.println();
	    }
}
