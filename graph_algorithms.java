package ex0; /**
 * This interface represents the "regular" Graph Theory algorithms including:
 * 0. clone(); (copy)
 * 1. init(EX0.ex0.graph);
 * 2. isConnected();
 * 3. int shortestPathDist(int src, int dest);
 * 4. List<EX0.ex0.node_data> shortestPath(int src, int dest);
 *
 * @author boaz.benmoshe
 *
 */

import ex0.graph;

import java.util.List;

public interface graph_algorithms {
	/**
	 * Init the EX0.ex0.graph on which this set of algorithms operates on.
	 * @param g
	 */
	public void init(graph g);
	/** 
	 * Compute a deep copy of this EX0.ex0.graph.
	 * @return
	 */
	public graph copy();
/**
 * Returns true if and only if (iff) there is a valid path from EVREY node to each
 * other node. NOTE: assume ubdirectional EX0.ex0.graph.
 * @return
 */
	public boolean isConnected();
	/**
	 * returns the length of the shortest path between src to dest
	 * Note: if no such path --> returns -1
	 * @param src - start node
	 * @param dest - end (target) node
	 * @return
	 */
	public int shortestPathDist(int src, int dest);
	/**
	 * returns the the shortest path between src to dest - as an ordered List of nodes:
	 * src--> n1-->n2-->...dest
	 * see: https://en.wikipedia.org/wiki/Shortest_path_problem
	 * Note if no such path --> returns null;
	 * @param src - start node
	 * @param dest - end (target) node
	 * @return
	 */
	public List<node_data> shortestPath(int src, int dest);
}

