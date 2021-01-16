import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		int n = 10;
		int [][] arr = new int [n][n];
		
		init(arr);
		System.out.println("»сходна€ матрица:");
		print(arr);
		
		System.out.println("Ёлементы главной диагонали:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + "  ");
		}
		return;
	}
    public static void init(int[][] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		for(int j=0; j< mas[i].length; j++) {
    		    mas[i][j] = rand.nextInt(100);
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
