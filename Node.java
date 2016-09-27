package assignment3;

public class Node{
	private Node parent;
	private String word;

	public Node(Node p, String w){
		parent = p;
		word = w;
	}
	
	public Node(String w){
		parent = null;
		word = w;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public String getWord(){
		return word;
	}
}
