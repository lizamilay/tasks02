import java.util.Random;

public class Task9 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(5) + 1;
		double [][] matr = new double [n][n];
		
		double [] arr = new double [n];
		
		init(arr);
		System.out.println("Исходный массив:");
		print(arr);
		
		for( int i=0; i < matr.length; i++) {
    		for(int j=0; j< matr[i].length; j++) {
    			matr[i][j] = Math.pow(arr[j],i+1);
    		}
    	}
		System.out.println("Исходная матрица:");
		print(matr);
		
		return;
	}
	
	 public static void init(double[] mas) {
	    	Random rand = new Random();
	    	for( int i=0; i < mas.length; i++) {
	    		mas[i] = rand.nextDouble()*100;
	    	}
	    }
	     
    public static void print(double[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
    
public static void print(double[][] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		print(mas[i]);
    	}
    }
}
