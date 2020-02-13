package pt.helloworld;

public class ComplexWorldService {
    
    private Person person;
    
    public ComplexWorldService(Person person) {
	this.person = person;
    }
    
    public String getPersonOcupation() {
	return person.getOccupation();
    }
}
