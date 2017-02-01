import java.util.ArrayList;

class ABC extends Thread {	
	public void run(){
		for(int i = 0 ; i < 20;i++ ){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside ABC run thread...");
		}
		
	}	
}


public class Sample extends Thread {
	
	public static void main(String arg[]) throws InterruptedException{
		 
		ABC a = new ABC();
		a.start();
		Sample s = new Sample();
		s.start();
		for(int i = 0 ; i < 20;i++ ){
			Thread.sleep(500);
			System.out.println("Inside Sample main thread...");
		}
	}
	public void run(){
		for(int i = 0 ; i < 20;i++ ){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside Sample run thread...");
		}
		
	}	
	
}
