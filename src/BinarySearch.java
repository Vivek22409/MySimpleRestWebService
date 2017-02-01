import java.util.Arrays;

class Binary {
	int number = 0;
	
	public void show(){
		
	}
}

public class BinarySearch extends Binary{
	
	public void show(){
		return ;
	}
	
	/*public static void main(String arg[]){
		//System.out.println(Double.MIN_VALUE);
		//double i = 1/0;
		
		System.out.println(Double.isNaN(null));
	}*/
	
	/*public static void main(String[] args) throws Exception {
		char[] chars = new char[] {'\u0097'};
		String str = new String(chars); 
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes)); 
		}*/
	public static void main(String arg[]){
		
		for(String str:arg)
			System.out.println(str);
	}
	
	public void display(){
		
	}
	public int display(int i){
		return 1;
	}
	
	
	/*public static void main(String arg[]){
		int arr[] = {3,5,7,8,9,21};
		
		int mid=0,start=0,last= arr.length,key = 7;
		
		while(start<=last){
			
			mid = last/2;
			if(key == arr[mid]){
				System.out.println(arr[mid]);
				break;
			}
			else if(key < arr[mid]){
				last = mid-1;
				
			} else if(key > arr[mid]){
				start = mid+1;
			} 
		}
		System.out.println("hello");
	}*/
	
	/*public static void main(String arg[]){
		
		int intArr[] = {3,2,6,4,5,8};
		int temp =0;
		for(int i=0;i< intArr.length;i++){
		for(int j=0; j < intArr.length-i-1;j++){	
			
			if(intArr[j]> intArr[j+1]){
				temp = intArr[j];
				intArr[j] = intArr[j+1];
				intArr[j+1] = temp;
			}				
			}		
		}
		
		
		
	}*/	

}


