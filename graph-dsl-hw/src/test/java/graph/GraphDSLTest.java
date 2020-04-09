package graph;

import static pt.courses.graph.dsl.GraphBuilder.*;
import static pt.courses.graph.dsl.nestedfunction.NestedGraphBuilder.*;
import static pt.courses.graph.dsl.nestedfunction.NestedEdgeBuilder.*;
import static pt.courses.graph.dsl.nestedfunction.NestedVertexBuilder.*;
import static pt.courses.graph.dsl.lambdaexpression.GraphBuilder.*;
import static pt.courses.graph.dsl.lambdaexpression.EdgeBuilder.*;

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
    void testInnerDSLByMethodChaining() {
	LOG.info("Testing Inner DSL by Method Chaining");
	
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
    
    @Test
    void testInnerDSLByNestedFunctions() {
	LOG.info("Testing Inner DSL by Nested Functions");
	
	Graph g = Graph(
	    edge(from("a"), to("b"), 40.0),
	    edge(from("b"), to("c"), 20.0),
	    edge(from("d"), to("e"), 50.5)
	);
	
	Graph.printGraph(g);
    }
    
    @Test
    void testInnerDSLUsingLambdaExpression() {
	LOG.info("Testing Inner DSL using Lambda Expression");
	
	Graph g1 = Graph( g -> {
	    g.edge( e -> {
		e.from("a");
		e.to("b");
		e.weight(40.0);
	    });
	    g.edge( e -> {
		e.from("b");
		e.to("c");
		e.weight(20.0);
	    });
	    g.edge( e -> {
		e.from("d");
		e.to("e");
		e.weight(50.5);
	    });
	});
	
	Graph.printGraph(g1);
    }
}
