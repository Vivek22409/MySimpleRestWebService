import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestingClass {
	
	public static void main(String arg[]) {
		
		TestingClass t = new TestingClass();
		float f = 1;
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Vivek");
		map.put(2, "Rahul");
		map.put(3, "Vinod");
		
		System.out.println(map.get(3));
		
		Set s = map.entrySet();
		
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		for (Object key : map.keySet()) {
			System.out.println("Key : " + key.toString() + " Value : " + map.get(key));
		}
		
		System.out.println(t.add(1f, 1));
		
	}
	
	public int add(int i, int x){
		return 4;
	}
	
	public int add(float f, int i){
		return 5;
	}

}
