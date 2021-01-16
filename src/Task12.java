import java.util.Random;

public class Task12 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		int m = rand.nextInt(10) + 1;
		int [][] arr = new int [m][n];
		
		init(arr);
		System.out.println("Исходная матрица:");
		print(arr);
		
		
		return;
	}
    public static void init(int[][] mas) {
    	int temp,ind;
    	Random rand = new Random();
    	for( int i=0; i < mas[0].length; i++) {
    		temp = i;
    		while(temp > 0) {
    			ind = rand.nextInt(mas.length);
    			if(mas[ind][i] == 0) {
    				mas[ind][i] = 1;
    				temp --;
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
