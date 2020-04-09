package pt.courses.graph.dsl.nestedfunction;

import pt.courses.graph.Edge;
import pt.courses.graph.Graph;

//Populates the Graph model.
public class NestedGraphBuilder {

    public static Graph Graph(Edge... edges) {
	Graph g = new Graph();
	for(Edge e : edges) {
	    g.addEdge(e);
	    g.addVertice(e.getFromVertex());
	    g.addVertice(e.getToVertex());
	}
	return g;
    }
}
