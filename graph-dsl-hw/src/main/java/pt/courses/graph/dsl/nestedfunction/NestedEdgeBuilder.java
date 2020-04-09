package pt.courses.graph.dsl.nestedfunction;

import pt.courses.graph.Edge;
import pt.courses.graph.Vertex;

//Populates the Edge model.
public class NestedEdgeBuilder {
    
    public static Edge edge(Vertex from, Vertex to, Double weight){
	return new Edge(from, to, weight);
    }

    public static Double weight(Double value){
	return value;
    }
}
