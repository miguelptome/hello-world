package pt.courses.html.dsl;

import java.util.List;

import pt.courses.html.Attribute;
import pt.courses.html.Element;
import pt.courses.html.Tag;
import pt.courses.html.Text;

public class ElementBuilder {
    
    public static final String A = "a";
    public static final String BODY = "body";
    public static final String BR = "br";
    public static final String DIV = "div";
    public static final String DL = "dl";
    public static final String DT = "dt";
    public static final String FORM = "form";
    public static final String H1 = "h1";
    public static final String H2 = "h2";
    public static final String H3 = "h3";
    public static final String HEAD = "head";
    public static final String HR = "hr";
    public static final String HTML = "html";
    public static final String IMG = "img";
    public static final String INPUT = "input";
    public static final String OL = "ol";
    public static final String P = "p";
    public static final String SELECT = "select";
    public static final String SPAN = "span";
    public static final String TABLE = "table";
    public static final String TD = "td";
    public static final String TEXTAREA = "textarea";
    public static final String TH = "th";
    public static final String TITLE = "title";
    public static final String TR = "tr";
    public static final String UL = "ul";
    
    // TAG A
    
    public static Element a(String text) {
	return buildTag(A, text);
    }
    
    public static Element a(List<Attribute> attributes, String text) {
	return buildTag(A, text, attributes);
    }
    
    public static Element a(Element... elements) {
	return buildTag(A, elements);
    }
    
    public static Element a(List<Attribute> attributes, Element... elements) {
	return buildTag(A, attributes, elements);
    }
    
    // TAG BODY
    
    public static Element body(String text) {
	return buildTag(BODY, text);
    }
    
    public static Element body(List<Attribute> attributes, String text) {
	return buildTag(BODY, text, attributes);
    }
    
    public static Element body(Element... elements) {
	return buildTag(BODY, elements);
    }
    
    public static Element body(List<Attribute> attributes, Element... elements) {
	return buildTag(BODY, attributes, elements);
    }
    
    // TAG BR
    
    public static Element br(String text) {
	return buildTag(BR, text);
    }
    
    public static Element br(List<Attribute> attributes, String text) {
	return buildTag(BR, text, attributes);
    }
    
    public static Element br(Element... elements) {
	return buildTag(BR, elements);
    }
    
    public static Element br(List<Attribute> attributes, Element... elements) {
	return buildTag(BR, attributes, elements);
    }
    
    // TAG DIV
    
    public static Element div(String text) {
	return buildTag(DIV, text);
    }
    
    public static Element div(List<Attribute> attributes, String text) {
	return buildTag(DIV, text, attributes);
    }
    
    public static Element div(Element... elements) {
	return buildTag(DIV, elements);
    }
    
    public static Element div(List<Attribute> attributes, Element... elements) {
	return buildTag(DIV, attributes, elements);
    }
    
    // TAG DL
    
    public static Element dl(String text) {
	return buildTag(DL, text);
    }
    
    public static Element dl(List<Attribute> attributes, String text) {
	return buildTag(DL, text, attributes);
    }
    
    public static Element dl(Element... elements) {
	return buildTag(DL, elements);
    }
    
    public static Element dl(List<Attribute> attributes, Element... elements) {
	return buildTag(DL, attributes, elements);
    }
    
    // TAG DT
    
    public static Element dt(String text) {
	return buildTag(DT, text);
    }
    
    public static Element dt(List<Attribute> attributes, String text) {
	return buildTag(DT, text, attributes);
    }
    
    public static Element dt(Element... elements) {
	return buildTag(DT, elements);
    }
    
    public static Element dt(List<Attribute> attributes, Element... elements) {
	return buildTag(DT, attributes, elements);
    }
    
    // TAG FORM
    
    public static Element form(String text) {
	return buildTag(FORM, text);
    }
    
    public static Element form(List<Attribute> attributes, String text) {
	return buildTag(FORM, text, attributes);
    }
    
    public static Element form(Element... elements) {
	return buildTag(FORM, elements);
    }
    
    public static Element form(List<Attribute> attributes, Element... elements) {
	return buildTag(FORM, attributes, elements);
    }
    
    // TAG H1
    
    public static Element h1(String text) {
	return buildTag(H1, text);
    }
    
    public static Element h1(List<Attribute> attributes, String text) {
	return buildTag(H1, text, attributes);
    }
    
    public static Element h1(Element... elements) {
	return buildTag(H1, elements);
    }
    
    public static Element h1(List<Attribute> attributes, Element... elements) {
	return buildTag(H1, attributes, elements);
    }
    
    // TAG H2
    
    public static Element h2(String text) {
	return buildTag(H2, text);
    }
    
    public static Element h2(List<Attribute> attributes, String text) {
	return buildTag(H2, text, attributes);
    }
    
    public static Element h2(Element... elements) {
	return buildTag(H2, elements);
    }
    
    public static Element h2(List<Attribute> attributes, Element... elements) {
	return buildTag(H2, attributes, elements);
    }
    
    // TAG H3
    
    public static Element h3(String text) {
	return buildTag(H3, text);
    }
    
    public static Element h3(List<Attribute> attributes, String text) {
	return buildTag(H3, text, attributes);
    }
    
    public static Element h3(Element... elements) {
	return buildTag(H3, elements);
    }
    
    public static Element h3(List<Attribute> attributes, Element... elements) {
	return buildTag(H3, attributes, elements);
    }
    
    // TAG HEAD
    
    public static Element head(String text) {
	return buildTag(HEAD, text);
    }
    
    public static Element head(List<Attribute> attributes, String text) {
	return buildTag(HEAD, text, attributes);
    }
    
    public static Element head(Element... elements) {
	return buildTag(HEAD, elements);
    }
    
    public static Element head(List<Attribute> attributes, Element... elements) {
	return buildTag(HEAD, attributes, elements);
    }
    
    // TAG HR
    
    public static Element hr(String text) {
	return buildTag(HR, text);
    }
    
    public static Element hr(List<Attribute> attributes, String text) {
	return buildTag(HR, text, attributes);
    }
    
    public static Element hr(Element... elements) {
	return buildTag(HR, elements);
    }
    
    public static Element hr(List<Attribute> attributes, Element... elements) {
	return buildTag(HR, attributes, elements);
    }
    
    // TAG HTML
    
    public static Element html(String text) {
	return buildTag(HTML, text);
    }
    
    public static Element html(List<Attribute> attributes, String text) {
	return buildTag(HTML, text, attributes);
    }
    
    public static Element html(Element... elements) {
	return buildTag(HTML, elements);
    }
    
    public static Element html(List<Attribute> attributes, Element... elements) {
	return buildTag(HTML, attributes, elements);
    }
    
    // TAG IMG
    
    public static Element img(String text) {
	return buildTag(IMG, text);
    }
    
    public static Element img(List<Attribute> attributes, String text) {
	return buildTag(IMG, text, attributes);
    }
    
    public static Element img(Element... elements) {
	return buildTag(IMG, elements);
    }
    
    public static Element img(List<Attribute> attributes, Element... elements) {
	return buildTag(IMG, attributes, elements);
    }
    
    // TAG OL
    
    public static Element ol(String text) {
	return buildTag(OL, text);
    }
    
    public static Element ol(List<Attribute> attributes, String text) {
	return buildTag(OL, text, attributes);
    }
    
    public static Element ol(Element... elements) {
	return buildTag(OL, elements);
    }
    
    public static Element ol(List<Attribute> attributes, Element... elements) {
	return buildTag(OL, attributes, elements);
    }
    
    // TAG P
    
    public static Element p(String text) {
	return buildTag(P, text);
    }
    
    public static Element p(List<Attribute> attributes, String text) {
	return buildTag(P, text, attributes);
    }
    
    public static Element p(Element... elements) {
	return buildTag(P, elements);
    }
    
    public static Element p(List<Attribute> attributes, Element... elements) {
	return buildTag(P, attributes, elements);
    }
    
    // TAG SELECT
    
    public static Element select(String text) {
	return buildTag(SELECT, text);
    }
    
    public static Element select(List<Attribute> attributes, String text) {
	return buildTag(SELECT, text, attributes);
    }
    
    public static Element select(Element... elements) {
	return buildTag(SELECT, elements);
    }
    
    public static Element select(List<Attribute> attributes, Element... elements) {
	return buildTag(SELECT, attributes, elements);
    }
    
    // TAG SPAN
    
    public static Element span(String text) {
	return buildTag(SPAN, text);
    }
    
    public static Element span(List<Attribute> attributes, String text) {
	return buildTag(SPAN, text, attributes);
    }
    
    public static Element span(Element... elements) {
	return buildTag(SPAN, elements);
    }
    
    public static Element span(List<Attribute> attributes, Element... elements) {
	return buildTag(SPAN, attributes, elements);
    }
    
    // TAG TABLE
    
    public static Element table(String text) {
	return buildTag(TABLE, text);
    }
    
    public static Element table(List<Attribute> attributes, String text) {
	return buildTag(TABLE, text, attributes);
    }
    
    public static Element table(Element... elements) {
	return buildTag(TABLE, elements);
    }
    
    public static Element table(List<Attribute> attributes, Element... elements) {
	return buildTag(TABLE, attributes, elements);
    }
    
    // TAG TD
    
    public static Element td(String text) {
	return buildTag(TD, text);
    }
    
    public static Element td(List<Attribute> attributes, String text) {
	return buildTag(TD, text, attributes);
    }
    
    public static Element td(Element... elements) {
	return buildTag(TD, elements);
    }
    
    public static Element td(List<Attribute> attributes, Element... elements) {
	return buildTag(TD, attributes, elements);
    }
    
    // TAG TEXTAREA
    
    public static Element textarea(String text) {
	return buildTag(TEXTAREA, text);
    }
    
    public static Element textarea(List<Attribute> attributes, String text) {
	return buildTag(TEXTAREA, text, attributes);
    }
    
    public static Element textarea(Element... elements) {
	return buildTag(TEXTAREA, elements);
    }
    
    public static Element textarea(List<Attribute> attributes, Element... elements) {
	return buildTag(TEXTAREA, attributes, elements);
    }
    
    // TAG TH
    
    public static Element th(String text) {
	return buildTag(TH, text);
    }
    
    public static Element th(List<Attribute> attributes, String text) {
	return buildTag(TH, text, attributes);
    }
    
    public static Element th(Element... elements) {
	return buildTag(TH, elements);
    }
    
    public static Element th(List<Attribute> attributes, Element... elements) {
	return buildTag(TH, attributes, elements);
    }
    
    // TAG TITLE
    
    public static Element title(String text) {
	return buildTag(TITLE, text);
    }
    
    public static Element title(List<Attribute> attributes, String text) {
	return buildTag(TITLE, text, attributes);
    }
    
    public static Element title(Element... elements) {
	return buildTag(TITLE, elements);
    }
    
    public static Element title(List<Attribute> attributes, Element... elements) {
	return buildTag(TITLE, attributes, elements);
    }
    
    // TAG TR
    
    public static Element tr(String text) {
	return buildTag(TR, text);
    }
    
    public static Element tr(List<Attribute> attributes, String text) {
	return buildTag(TR, text, attributes);
    }
    
    public static Element tr(Element... elements) {
	return buildTag(TR, elements);
    }
    
    public static Element tr(List<Attribute> attributes, Element... elements) {
	return buildTag(TR, attributes, elements);
    }
    
    // TAG UL
    
    public static Element ul(String text) {
	return buildTag(UL, text);
    }
    
    public static Element ul(List<Attribute> attributes, String text) {
	return buildTag(UL, text, attributes);
    }
    
    public static Element ul(Element... elements) {
	return buildTag(UL, elements);
    }
    
    public static Element ul(List<Attribute> attributes, Element... elements) {
	return buildTag(UL, attributes, elements);
    }
    
    // private build methods
    
    private static Element buildTag(String name, Element... childs) {
	Tag t = new Tag(name);
	for(Element e: childs) {
	    t.addChild(e);
	}
	return t;
    }
    
    private static Element buildTag(String name, List<Attribute> attributes,  Element... childs) {
	Tag t = (Tag)buildTag(name, childs);
	for(Attribute att: attributes) {
	    t.addAttribute(att);
	}
	return t;
    }
    
    private static Element buildTag(String name, String text) {
	Tag t = new Tag(name);
	t.addChild(new Text(text));
	return t;
    }
    
    private static Element buildTag(String name, String text, List<Attribute> attributes) {
	Tag t = (Tag)buildTag(name, text);
	for(Attribute att: attributes) {
	    t.addAttribute(att);
	}
	return t;
    }
}
