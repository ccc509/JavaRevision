package Algorithm;

public class bubbleSort {
	
	public static void main(String[] args){
	
		int[] array = {6,3,9,3,4,2,6,7,4,6,1,9,3};
		
		System.out.println("Before sorting");
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		
		System.out.println(" ");
		
		for(int i=0;i<array.length;i++){
			for(int j=1;j<(array.length);j++){
				if(array[j-1]>array[j]){
					int temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting");
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		
		System.out.println(" ");
	}
}
