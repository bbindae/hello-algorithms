
public class ReverseArray {
	public int[] array;
	
	public ReverseArray(){
		this.array = new int[] {1,2,3,4,5,6,7,8};
	}
	
	public int[] reverse(int[] arr){
		if(arr == null){
			return null;
		}
		
		int[] temp = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--){
			temp[arr.length -1 - i] = arr[i];
		}
		
		return temp;
	}
	
	public void print(int[] arr){
		if(arr == null) return;
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
