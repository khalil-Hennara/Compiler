package nodes;

public class prediffiendVarible extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 String var;
	 public prediffiendVarible(String var) {
		 this.var=var;
	 }
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage()+"  variable '"+var+"' is alreday excet";
	}
	

}
