import java.util.Random;
//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
public class Task2 {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = new int [n];
		
		init(arr);
		System.out.println("Èñõîäíûé ìàññèâ:");
		print(arr);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.print("Íåò íóëåâûõ ýëåìåíòîâ!");
			return;
		}
		
		int [] zeros = new int [count];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] == 0) {
				zeros[j] = i;
				j++;
			}
		}

		System.out.println("Ìàññèâ èç íîìåðîâ íóëåâûõ ýëåìåíòîâ:");
		print(zeros);
		return;
	}
    public static void init(int[] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		mas[i] = rand.nextInt(4) - 2;
    	}
    }
    
    public static void print(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
}
