
public class HelloUser {
	
	String name;
	
	HelloUser(String userName){
		name = userName;
	}
	
	public void greetUser(){
		System.out.println("Hello "+name);
	}
}
