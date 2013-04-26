package com.awwa.shiga.rally;

public class DijkstraApp
{
	@SuppressWarnings("unused")
	private static final String TAG = DijkstraApp.class.getSimpleName();
	private final DijkstraApp self = this;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Node dummy = new Node('X');
		Node s = new Node('S', dummy);
		Node a=  new Node('A');
		Node b=  new Node('B');
		Node c=  new Node('C');
		Node d=  new Node('D');
		Node g=  new Node('G');
		
		Route[] routes = {
				new Route(s, a, 5),
				new Route(s, b, 4),
				new Route(s, c, 2),
				new Route(a, b, 2),
				new Route(a, g, 6),
				new Route(b, c, 3),
				new Route(b, d, 2),
				new Route(d, g, 4),
		};
		
		Dijkstra di = new Dijkstra();
		di.calc(routes);
		
		System.out.println("distance: " + g.getTotalCost());
		Node node = g;
		while(node != dummy) {
			System.out.println("path: " + node.getLabel());
			node = node .getFrom();
		}
	}
}
