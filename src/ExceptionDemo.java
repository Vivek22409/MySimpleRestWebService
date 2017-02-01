


class Bottle{
	static Bottle bottle = null;
	private Bottle(){		
	}
	static Bottle getObject(){
		if(bottle == null){
			return new Bottle();
		}
		return bottle;		
	}
	
	
}



public class ExceptionDemo {
	
	public static void main(String arg[]){
		int c = 0,r = 3,d=5;
		for(int i = 5; i>=1;i--){
			for(int j = i;j>=1;j--){
				System.out.print("*");
			}
			for(int t=1;t<=(c+c)-1;t++){
				System.out.print(" ");
			}
			for(int j = i;j>=1;j--){
				if(i==5 && j==1 )				
					System.out.print("");
				else 
					System.out.print("*");
			}
			System.out.println();
			c++;
			d--;
		}
		for(int i = 2; i<=5;i++){
			for(int j = 1;j<=i;j++){
				System.out.print("*");
			}
			for(int t=(r+r)-1;t>=1;t--){
				System.out.print(" ");
			}
			for(int j = i;j>=1;j--){
				if(i==5 && j==1 )				
					System.out.print("");
				else 
					System.out.print("*");				 
			}
			System.out.println();
			r--;
		}
	}
		
		
		
		
		
		//char ch[] = s.toCharArray();
		/*for(char c:ch){			
			int i = c;
			System.out.println(i);
		}
		*/
		/*int c = 0;
		for(int i=1;i<=5;i++){
			c = 1;
			for(int j=1;j<=i;j++){
				System.out.print(c);
				c++;
			}
			System.out.println();
		}		
		for(int i=4;i>=1;i--){
			c = 1;
			for(int j=i;j>=1;j--){
				System.out.print(c);
				c++;
			}			
			System.out.println();
			
		}*/		
		/*int arr[] = {2,4,3,5,6,7,1};
		int t = 0;*/
		/*for(int i =0; i< arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}*/
		/*for(int i =0; i< arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}*/
		/*int c = 1,k=2,f=5;  
		for(int i = 1; i<=5;i++){
			for(int j = 1; j<=5 ;j++){
				if(i%2!=0)
					f=5;
				else
					f=1;
				if(i==c && j == f)
				System.out.print(k);
				else 
					System.out.print(i);
			}
			System.out.println();
			c++;
			k++;
		}*/
		/*System.out.print(Arrays.toString(arr));*/
		
		/*int arr[] = {2,4,3,5,6,7,1};
		int arr1[] = new int[arr.length/2+1];
		Arrays.sort(arr);
		for(int i = 0,j=0; i<= arr.length ;i++){
			if(i%2 == 0){
				arr1[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));*/
		
		/*System.out.print("[");
		for(int i = arr.length-1;i>=0;i--){
			if(i!=0){
			System.out.print(arr[i]+" ");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.print("]");*/
		
		/*for(int i = 1; i <=5 ; i++){
			for(int j = 5; j >= i; j--){
				System.out.print(" ");
			}
			for(int k = 1; k<=i+i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		int c = 5;
		for(int i= 1; i <= 3;i++){
			for(int j = 0 ; j <= i; j++){
				System.out.print(" ");
			}
			for(int k =c+c-1;k>=3;k--){
				System.out.print("*");
			}
			System.out.println();
			c--;
		}*/
		/*String s = "Vivek";
		int i = 0;
		char arr[] = s.toCharArray();
		for(char c: arr){
			i = c;
			System.out.println(i);
		}

		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		System.out.print("Enter number:");
		System.out.println(name);
		 */
		/*int arr[] = {1,2,3,4,5}, arr1[] = new int[arr.length/2+1];

		for(int i=0, j=0;i < arr.length;i++){
			if(i%2==0){
				arr1[j++] = arr[i];
			}
		}

		for(int i:arr1)
			System.out.print(i);*/


		/*int num = 12334, sum = 0,temp = 0;

		while(num>0){
			temp = num % 10;
			sum = sum + temp;
			num = num / 10;
		}
		System.out.println(sum);


		while(true){
			System.out.println("Hello...");
		}*/

		/*int arr1[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int arr2[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int arr3[][] = new int[3][3];

		for(int i = 0; i< 3 ; i++){
			for(int j = 0; j< 3 ; j++){
				arr3[i][j] = arr1[i][j] + arr2[i][j]; 		
			}			
		}

		for(int i = 0; i< 3 ; i++){
			for(int j = 0; j< 3 ; j++){
				System.out.print(arr3[i][j]+"\t");		
			}
			System.out.println();
		}*/


	

	
	/*for(int i = 0; i< arr1.length ; i++){
			for(int j = 0; j< arr2.length ; j++){
				System.out.println(arr3[i][j]+"\t");		
			}
			System.out.println();
		}*/
	/*System.out.println("hello");
		for(int i = 1; i <= 4 ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print(j);
			}
			for(int k = 1 ; k <= i ; k++){
				System.out.print(k);
			}

			System.out.println();
		}*/




	/*public static void recursiveFxn(int i){
		if(i <= 10){
			System.out.println(i);
			recursiveFxn(++i);
		}		
	}
	 */
	/*static void fibonacciSeries(){
		int a = 1, b = 1,c = 0,temp = 0, limit = 1;

		System.out.print(a+", ");
		System.out.print(b+", ");

		while(limit<=8-2){
			temp = a+b;
			a = b;
			b = temp;
			System.out.print(b+", ");
			limit++;
		}
	}*/
	/*public static void demo(){
		try {
			int i = 1/1;
			System.out.println("Inside main of ExceptionDemo...");
			//throw new Exception("Error");
			System.exit(0);
		} catch(Exception e){
			e.printStackTrace();			
		} finally {
			System.out.println("Inside finally method....");
		}		
	}*/
}
