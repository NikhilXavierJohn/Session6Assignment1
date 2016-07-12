interface Interface{
	
public void running();
public void walking();

}


public class Interfaces implements Interface{

	
	public void running() {
		
		
		System.out.println("people are running");
		
		
	}

	
	public void walking() {
		
		System.out.println("people are walking");
	}
	
	
	
public static void main(String args[]){
	
	Interfaces i = new Interfaces();
	
	i.running();
	i.walking();
	
	
	
}
}
