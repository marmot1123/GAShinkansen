/**
 * Node is the class that has data of Node.
 * Each instance has following parameter.
 * RouteMap class use this class's instance
 *
 * @param String Node : The name of the Node
 * @param int x, y : The coordinates of the Node
 * @param static int n : The serial number of the Node
 * @param int pas : The number of passenger of the Node
 */
class Node {
	private String name;
	private int x;
	private int y;
	private int pas;
	private static int n;

	// Constructor
	Node(String name, int x, int y, int pas) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.pas = pas;
	}

	// Functions to
	public getName(String name) {
		return this.name;
	}
	public getX() {
		return this.x;
	}
	public getY() {
		return this.y;
	}
	public getN() {
		return this.n;
	}
	public getPas() {
		return this.pas;
	}
}
