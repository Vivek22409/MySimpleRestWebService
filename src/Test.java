import java.util.Arrays;

public class Test 
{  
    public static void main(String[] args) 
    { 
        int x = 10;       
        int c= x++ + ++x + ++x + x;
        start(2,3);
        System.out.println(c);
    } 
    
    public static void start(int a,int b){
    	System.out.println(a+" "+b);    	
    }
}
