interface Interface{
	
public void running();
public void walking();

}


public class Interfaces implements Interface{

	
	public void run() {
		
		
		System.out.println("people are running");
		
		
	}

	
	public void walk() {
		
		System.out.println("people are walking");
	}
	
	
	
public static void main(String args[]){
	
	Interfaces i = new Interfaces();
	
	i.run();
	i.walk();
	
	
	
}
}
