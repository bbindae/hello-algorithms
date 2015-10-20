
public class SelectionSort {
	public int[] array;
	
	public SelectionSort(){
		array = new int[]{394,277,1,27,-123,308,877};
	}
	
	public void sortAndPrint(){
		
		System.out.println("SelectionSort - unsorted: ");
		for(int i=0;i<array.length-1;i++){
			System.out.println(array[i]);
		}
		
		int smallestNumber = 0;
		int smallestIndex = 0;
		
		for(int k=0;k<array.length-1;k++){
			smallestNumber = array[k];
			smallestIndex = k;
			for(int i=k;i<array.length-1;i++){
				if(array[i] < smallestNumber){
					smallestNumber = array[i];
					smallestIndex = i;
				}
			}
			
			int temp = array[k];
			array[k] = array[smallestIndex];
			array[smallestIndex] = temp;			
		}
		
		System.out.println("SelectionSort -sorted: ");
		for(int i=0;i<array.length-1;i++){
			System.out.println(array[i]);
		}
		
	}	

}
