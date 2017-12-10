package InterfaceExamples;

public class comparableExample implements Comparable {

	private int age;
	private String name;
	
	public comparableExample(int _age, String _name){
		this.age=_age;
		this.name=_name;
	}
	
	public int compareTo(Object o) {
		
		int otherAge =((comparableExample) o).age;
		
		if(this.age>otherAge){
			return 1;
		}
		else if(this.age==otherAge){
			return 0;
		}
		else{
			return -1;
		}
		
	}

}
