import java.util.ArrayList;
import java.util.HashMap;

public class App {
	 
	public static void main(String[] args) {
		 
		
		//------------------  1
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		showList(strings);
		
		ArrayList<Machine> machines = new ArrayList<Machine>();
		
		machines.add(new Machine());
		machines.add(new Machine());
		
		//showList2(machines);
		//showList3(machines);
		
		ArrayList<Camera> cameras = new ArrayList<Camera>();
		
		cameras.add(new Camera());
		cameras.add(new Camera());
		
		//showList2(cameras);
		//showList3(cameras);
		showList4(cameras);
		
		//------------------  2
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//------------------  3 (java 7 style)
		
		ArrayList<Animal> someList = new ArrayList<>();
		
		//---------------------------------------------------------------
		
		
	}
	
	public static void showList(ArrayList<String> list){
		
		for(String value: list){
			System.out.println(value);
		}
	}
	
	public static void showList2(ArrayList<?> list){
		
		for(Object value: list){
			System.out.println(value);
		}
	}
	
	public static void showList3(ArrayList<? extends Machine> list){
		
		for(Machine value: list){
			System.out.println(value);
			value.start();
			//value.snap();  nie mo¿na
		}
	}
	
	
	public static void showList4(ArrayList<? super Camera> list){
		
		for(Object value: list){
			System.out.println(value);
			//value.start();  nie mo¿na
			//value.snap();  nie mo¿na  
		}
	}
}

 