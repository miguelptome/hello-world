package pt.courses.graph.dsl.nestedfunction;

import pt.courses.graph.Vertex;

//Populates the Vertex model.
public class NestedVertexBuilder {
    
    public static Vertex from(String lbl){
	return new Vertex(lbl);
    }
    
    public static Vertex to(String lbl){
	return new Vertex(lbl);
    }   
}