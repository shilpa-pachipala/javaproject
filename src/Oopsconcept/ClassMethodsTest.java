package Oopsconcept;

public class ClassMethodsTest {
	
	int eid;
	String ename;
	char egrade;
	double esal;
	int edept;
	
	void display()
	{
		System.out.println("employee id:"  +eid);
		
		
	}
	
	
	public static void main(String[] args)

	{
		ClassMethodsTest emp=new ClassMethodsTest();
		emp.eid=100;
		emp.ename="Shilpa";
		emp.egrade='a';
		emp.esal=100000;
		emp.edept=75;
		emp.display();
		
		
		
		
	}
}
