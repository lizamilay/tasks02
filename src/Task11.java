import java.util.Random;

public class Task11 {
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int [][] arr = new int [n][m];
		
		init(arr);
		System.out.println("Исходная матрица:");
		print(arr);
		
		int count;
		
		System.out.println("Номера строк, в которых число 5 встречается >= 3 раз:");
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j=0; j < arr[i].length; j++) {
				if(arr[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print((i+1) + "  ");
			}
	
		}
		return;
	}
    public static void init(int[][] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		for(int j=0; j< mas[i].length; j++) {
    		    mas[i][j] = rand.nextInt(15);
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
