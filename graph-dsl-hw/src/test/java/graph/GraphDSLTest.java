package graph;

import static pt.courses.graph.dsl.GraphBuilder.Graph;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.courses.graph.Edge;
import pt.courses.graph.Graph;
import pt.courses.graph.Vertex;

public class GraphDSLTest {

    private static final Logger LOG = LoggerFactory.getLogger(GraphDSLTest.class);
    
    @Test
    void testGraph() {
	LOG.info("Testing Graph");
	
	Graph graph = new Graph();
	Vertex a = new Vertex("a");
	Vertex b = new Vertex("b");
	Vertex c = new Vertex("c");
	Vertex d = new Vertex("d");
	Vertex e = new Vertex("e");
	graph.addVertice(a);
	graph.addVertice(b);
	graph.addVertice(c);
	graph.addVertice(d);
	graph.addVertice(e);
	
	Edge edge1 = new Edge(a, b, 40.0);
	Edge edge2 = new Edge(b, c, 20.0);
	Edge edge3 = new Edge(d, e, 50.5);
	graph.addEdge(edge1);
	graph.addEdge(edge2);
	graph.addEdge(edge3);
	
	Graph.printGraph(graph);
    }
    
    @Test
    void testGraphWithDSL() {
	LOG.info("Testing Graph with DSL");
	
	Graph()
	    .edge()
	    	.from("a")
	    	.to("b")
	    	.weight(40.0)
	    .edge()
	    	.from("b")
	    	.to("c")
	    	.weight(20.0)
	    .edge()
	    	.from("d")
	    	.to("e")
	    	.weight(50.5)
	    .printGraph();
    }
}
