/*
 * Worst case O(n2)
 */
public class BubbleSort {
	public int[] array;
	public boolean sorted = false;
	public BubbleSort(){
		array = new int[]{29,-1,278,2,3,87,32};
	}
	
	public void sortAndPrint(){
		
		System.out.println("unsorted: ");
		for(int i=0;i<array.length-1;i++){
			System.out.println(array[i]);
		}
		
		sort();
		
		System.out.println("sorted: ");
		for(int i=0;i<array.length-1;i++){
			System.out.println(array[i]);
		}		
	}
	
	public void sort(){
		if(sorted == true) return;		
		sorted = true;
		for(int i=0;i<array.length;i++){
			if(i==array.length-1) break;
			if(array[i] > array[i+1]){
				sorted = false;
				int temp = array[i+1];
				array[i + 1] = array[i];
				array[i] = temp;
			}			
		}
		
		sort();
	}
	
	
}
