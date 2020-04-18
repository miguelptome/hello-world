package pt.courses.html;

public class Text implements Element {
    
    private String value;
    
    public Text(String value) {
	this.value = value;
    }
        
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
	return print(0);
    }
    
    public String print(Integer tabs) {
	StringBuilder sb = new StringBuilder();
	for (Integer t = 0; t<tabs; t++) {
	    sb.append("\t");
	}
	sb.append(value);
	sb.append("\n");
	return sb.toString();
    }
}
