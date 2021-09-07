package nodes;

public class Write extends Node{
	
	public Write() {
		this.name = new String("Write");
	}

	@Override
	public Object execute(context con) {
		System.out.println(children.get(0).execute(con));
		return null;
	}

	@Override
	public Object compile(context con) {
		// TODO Auto-generated method stub
		return null;
	}

}
