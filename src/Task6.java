import java.util.Random;

public class Task6 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(5) + 1;
		n = n*2;
		int [][] arr = new int [n][n];
		
		init(arr);
		System.out.println("Исходная матрица:");
		print(arr);
		
		return;
	}
    public static void init(int[][] mas) {
    	for( int i=0; i < mas.length; i++) {
    		for(int j=0; j< mas[i].length; j++) {
    			if( i == 0 || j == 0 || i == mas.length - 1 || j == mas.length -1) {
    		       mas[i][j] = 1;
    			}
    		}
    	}
    }
    
    public static void print(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
    
public static void print(int[][] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		print(mas[i]);
    	}
    }
}
