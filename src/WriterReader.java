import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterReader {
	
	public static void main(String arg[]) throws IOException, ClassNotFoundException{
		
		Person p = new Person(100,"Vivek");
		
		try {
			
			FileOutputStream f = new FileOutputStream(new File("C:/Users/vivek_kumar54/Desktop/Xtra/abc.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(p);
			
			o.close();
			f.close();
			
			FileInputStream fi = new FileInputStream(new File("C:/Users/vivek_kumar54/Desktop/Xtra/abc.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Person po = (Person) oi.readObject();
			
			System.out.println(po.toString());
			
			fi.close();
			oi.close();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
