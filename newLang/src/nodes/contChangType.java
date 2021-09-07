package nodes;

public class contChangType extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String var;
	public contChangType(String va) {
		this.var=va;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return  super.getMessage()+" Error con't Change The Type of prediffined varible '"+var+"' ";
	}
		
}
