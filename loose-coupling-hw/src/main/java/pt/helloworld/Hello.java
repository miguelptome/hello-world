package pt.helloworld;

public class Hello {
    
    public static void main(String args[]) {
	
	Person person = new Policeman();	
	ComplexWorldService service = new ComplexWorldService(person);
	String occupation = service.getPersonOcupation();
	System.out.println(occupation);
	
	person = new Teacher();
	service = new ComplexWorldService(person);
	occupation = service.getPersonOcupation();
	System.out.println(occupation);
    }
}