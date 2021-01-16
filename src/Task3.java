import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		int n = 10;
		int m = 8;
		int [][] arr = new int [n][m];
		
		init(arr);
		System.out.println("Исходная матрица:");
		print(arr);
		
		System.out.println("Нумерация строк и столбцов начинается с 1 ? ");

		
		System.out.println("Новая матрица:");
        for(int i=0; i < arr.length; i++) {
        	if(i % 2 == 0) {
        		printReverse(arr[i]);
        	}
        	else {
        		print(arr[i]);
        	}
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
    
 public static void printReverse(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[mas.length-i-1] + " ");
    	}
    	System.out.println();
    }
    
public static void print(int[][] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		print(mas[i]);
    	}
    }
}
