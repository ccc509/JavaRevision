package InterfaceExamples;

public class student {

	private String name;
	private int id;
	
	public student(String _name,int _id){
		this.name=_name;
		this.id=_id;
	}
	
	public void printOut(){
		System.out.println("The name of the student is: "+this.name+" and id is: "+this.id);
	}
}
