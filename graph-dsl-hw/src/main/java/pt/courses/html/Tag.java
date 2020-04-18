package pt.courses.html;

import java.util.ArrayList;
import java.util.List;

public class Tag implements Element {
    
    private String name;
    private List<Attribute> attributes;
    private List<Element> childs;
    
    public Tag(String name) {
	this.name = name;
	attributes = new ArrayList<>();
	this.childs = new ArrayList<>();
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAttribute(Attribute attribute) {
	attributes.add(attribute);
    }
    
    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public void addChild(Element e) {
	childs.add(e);
    }
    
    public List<Element> getChilds() {
        return childs;
    }

    public void setChilds(List<Element> childs) {
        this.childs = childs;
    }
    
    @Override
    public String toString() {
	return print(0);
    }
    
    public String print(Integer tabs) {
	StringBuilder sb = new StringBuilder();
	
	for (Integer t = 0; t<tabs; t++) { // tabs open tag
	    sb.append("\t");
	}
	
	// Attributes
	if (attributes.isEmpty()) {
	    sb.append("<" + name + ">");
	}
	else {
	    sb.append("<" + name);
	    for (Attribute att: attributes) {
		sb.append(att.toString());
	    }
	    sb.append(">");
	}
	sb.append("\n");
	
	// Child's
	for (Element e: childs) { 
	    sb.append(e.print(tabs+1));
	}
	
	for (Integer t = 0; t<tabs; t++) { // tabs close tag
	    sb.append("\t");
	}
	sb.append("</" + name + ">");
	sb.append("\n");
	
	return sb.toString();
    }
}
