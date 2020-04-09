package pt.courses.graph.dsl.lambdaexpression;

import pt.courses.graph.Edge;
import pt.courses.graph.Vertex;

//Populates the Edge model.
public class EdgeBuilder {
    
    private Edge e;

    public EdgeBuilder() {
	e = new Edge();
    }
    
    public Edge edge() {
	return e;
    }
    
    public void from(String lbl) {
	e.setFromVertex(new Vertex(lbl));
    }

    public void to(String lbl) {
	e.setToVertex(new Vertex(lbl));
    }

    public void weight(Double w) {
	e.setWeight(w);
    }
}
