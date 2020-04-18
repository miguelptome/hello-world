package pt.courses.html.dsl;

import java.util.ArrayList;
import java.util.List;

import pt.courses.html.Attribute;

public class AttributeBuilder {
    
    public static final String COLOR = new String("color");
    public static final String BGCOLOR = new String("bgcolor");
    public static final String WIDTH = new String("width");
    public static final String HEIGHT = new String("height");
    public static final String ALIGN = new String("align");
    public static final String HREF = new String("href");
    public static final String ID = new String("id");
    public static final String SRC = new String("src");
    public static final String TYPE = new String("type");
    public static final String STYLE = new String("style");
    public static final String BORDER = new String("border");
    public static final String ROWS = new String("rows");
    public static final String COLS = new String("cols");
    
    public static List<Attribute> attributes(Attribute... attributes) {
	List<Attribute> atts = new ArrayList<>();
	for (Attribute att: attributes) {
	    atts.add(att);
	}
	return atts;
    }
    
    public static Attribute color(String value) {
	return new Attribute(COLOR, value);
    }
    
    public static Attribute bgcolor(String value) {
	return new Attribute(BGCOLOR, value);
    }
    
    public static Attribute width(String value) {
	return new Attribute(WIDTH, value);
    }
    
    public static Attribute height(String value) {
	return new Attribute(HEIGHT, value);
    }
    
    public static Attribute align(String value) {
	return new Attribute(ALIGN, value);
    }
    
    public static Attribute href(String value) {
	return new Attribute(HREF, value);
    }
    
    public static Attribute id(String value) {
	return new Attribute(ID, value);
    }
    
    public static Attribute src(String value) {
	return new Attribute(SRC, value);
    }
    
    public static Attribute type(String value) {
	return new Attribute(TYPE, value);
    }
    
    public static Attribute style(String value) {
	return new Attribute(STYLE, value);
    }
    
    public static Attribute border(String value) {
	return new Attribute(BORDER, value);
    }
    
    public static Attribute rows(String value) {
	return new Attribute(ROWS, value);
    }
    
    public static Attribute cols(String value) {
	return new Attribute(COLS, value);
    }
}
