import java.util.Random;
//8. ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ��� ������� �i > i.
public class Task8 {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = new int [n];
		
		init(arr);
		System.out.println("�������� ������:");
		print(arr);
		
		System.out.println("����� ������: ");
		printTask(arr);
		
		return;
	}
    public static void init(int[] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		mas[i] = rand.nextInt(10);
    	}
    }
    
    public static void print(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
    
 public static void printTask(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		if(mas[i] > i) {
    			System.out.print(mas[i] + " ");
    		}
    	}
    	System.out.println();
    }
}
