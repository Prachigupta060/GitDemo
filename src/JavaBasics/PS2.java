package JavaBasics;

public class PS2 extends PS3{

	int a;  //class variable
	
	//default constructor
	
	public PS2(int a) {   // int a is the instance variable
		super(a); // parent class constructor is invoked
		this.a = a; //this keyword
	}


	public int increment()
	{
		a = a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}
}
