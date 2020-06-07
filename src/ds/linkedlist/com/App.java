package ds.linkedlist.com;

public class App {

	public static void main(String[] args) {
			Node nodeA = new Node();
			nodeA.data = 4;
			
			Node nodeb = new Node();
			nodeb.data = 5;
			
			Node nodec = new Node();
			nodec.data = 6;
			Node noded = new Node();
			noded.data = 7;
			
			nodeA.next = nodeb;
			nodeb.next = nodec;
			nodec.next = noded;
			
			System.out.println(linkedLength(nodeA));
			System.out.println(linkedLength(nodeb));
			System.out.println(linkedLength(nodec));
			System.out.println(linkedLength(noded));
			
			
	}
			public static int linkedLength(Node aNode) {
				int length =0;
				Node currentNode = aNode;
				
				while(currentNode != null) {
					length++;
					currentNode = currentNode.next;
				}
				return length;
			}
			
}
