package graph;

import static pt.courses.html.dsl.ElementBuilder.*;
import static pt.courses.html.dsl.AttributeBuilder.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.courses.html.Attribute;
import pt.courses.html.Element;
import pt.courses.html.Tag;
import pt.courses.html.Text;

public class HtmlDSLTest {

    private static final Logger logger = LoggerFactory.getLogger(HtmlDSLTest.class);
    
    @Test
    void testHtml() {
	logger.info("Testing HTML");
	
	Tag html = new Tag("html");
	Tag head = new Tag("head");
	Tag title = new Tag("title");
	Attribute title_at = new Attribute("border", "1");
	Text title_t = new Text("The title");
	Tag body = new Tag("body");
	Tag h1 = new Tag("h1");
	Text h1_t = new Text("This is a section");
	Tag h2 = new Tag("h2");
	Attribute h2_at = new Attribute("border", "1");
	Attribute h2_at2 = new Attribute("color", "red");
	Text h2_t = new Text("This is a sub-section");
	html.addChild(head);
	head.addChild(title);
	title.addAttribute(title_at);
	title.addChild(title_t);
	html.addChild(body);
	body.addChild(h1);
	h1.addChild(h1_t);
	body.addChild(h2);
	h2.addChild(h2_t);
	h2.addAttribute(h2_at);
	h2.addAttribute(h2_at2);
	
	String result = html.toString();
	System.out.println(result);
    }
    
    @Test
    void testInnerDSLByNestedFunctions() {
	//logger.info("Testing Inner DSL by Nested Functions");
	
	Element table = table( attributes ( border("1") ),
	    tr(
		th("ID"),
		th("Name"),
		th("Description"),
		th("Capacity")
	    ),
	    tr(
		td("1"),
		td("Meeting Room"),
		td("Meeting Room on CCISEL"),
		td("16")
	    )
	);
	
	Element html = html( attributes( border("1") ),
	    head(
		title( attributes ( border("1") ),
		    "The title"
		),
		title(
		    "The title"
		)
	    )
	);

	System.out.println(table.toString());
    }
}
