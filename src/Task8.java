import java.util.Random;

public class Task8 {
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
    		for(int j=0; j< mas[i].length-i; j++) {
    			mas[i][j] = j+i+1;
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
