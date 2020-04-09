package pt.courses.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class Graph {
 
    private static final Logger logger = LoggerFactory.getLogger(Graph.class); 
    
    private List<Edge> edges;
    private Set<Vertex> vertices;
 
    public Graph() {
        edges = new ArrayList<>();
        vertices = new TreeSet<>();
      }
    
    public void addEdge(Edge edge){
	getEdges().add(edge);
    }
   
    public void addVertice(Vertex v){
	getVertices().add(v);
    }
 
    public List<Edge> getEdges() {
	return edges;
    }
 
    public Set<Vertex> getVertices() {
	return vertices;
    }
   
    public static void printGraph(Graph g){
	logger.info("Vertices...");
	for (Vertex v : g.getVertices()) {
	    logger.info(v.getLabel());
	}
	logger.info("");
	logger.info("Edges...");
	for (Edge e : g.getEdges()) {
	    logger.info(e.toString());
	}
    }
}