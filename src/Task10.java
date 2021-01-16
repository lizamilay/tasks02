import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		int [][] arr = new int [n][n];
		
		init(arr);
		System.out.println("Исходная матрица:");
		print(arr);
		
		System.out.println("Положительные элементы главной диагонали:");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][i] > 0) {
			    System.out.print(arr[i][i] + "  ");
			}
		}
		return;
	}
    public static void init(int[][] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		for(int j=0; j< mas[i].length; j++) {
    		    mas[i][j] = rand.nextInt(100) - 50;
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
