package nodes;

import java.util.ArrayList;


public class FunctionNode  {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public ArrayList<String> getParams() {
		return params;
	}
	ArrayList<String> params = new ArrayList<String>();
	Node root;

	

}
