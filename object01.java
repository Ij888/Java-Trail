class Asset{
	String name;
	String affiliation;
	int id;
}

class Person{
	String name;
	int age;
}

void sound(){
	System.out.println("ShoutOut");
}


public class Object01{
	public static void main(String[] args){
		Asset asset01 = new Asset();
		asset01.name = "Ermac"
		
		System.out.println(asset01.name);
		asset01.sound();
	}
}