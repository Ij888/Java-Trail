class Asset{
	String name;
	String affiliation;
	int id;
	
	void sound(){
	System.out.println("ShoutOut");
	}
}

class Person{
	String name;
	int age;
}


public class Object01{
	public static void main(String[] args){
		Asset asset01 = new Asset();
		asset01.name = "Ermac";
		
		System.out.println(asset01.name);
		asset01.sound();
	}
}