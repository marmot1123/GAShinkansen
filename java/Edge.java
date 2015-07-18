import java.lang.Math;

/**
 * The edge of two
 *
 * @param Node st1, st2 : The instance of Node class
 * @param double d : The distance between two Nodes
 * @param int val : The sum of the number of two Nodes
 */
class Edge {
	private Node st1;
	private Node st2;
	private double d;
	private int val;

	// Constructor
	Edge(Node st1, Node st2) {
		this.st1 = st1;
		this.st2 = st2;
		this.d = hypot(st2.x - st1.x, st2.y - st1.y);
		this.val = st1.pas + st2.pas;
	}
}
