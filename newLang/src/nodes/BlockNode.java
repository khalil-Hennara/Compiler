package nodes;


public class BlockNode extends Node {

	
	public BlockNode() {
		this.name =new String("Block");
	}

	@Override
	public Object execute(context con) {
		for(Node c: children) {
			c.execute(con);
		}
		return null;
	}

	@Override
	public Object compile(context con) {
		// TODO Auto-generated method stub
		return null;
	}

}
