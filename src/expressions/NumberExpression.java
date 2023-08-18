package expressions;

public class NumberExpression extends AbstractExpression{
	
	private int numberValue;
	
	public NumberExpression(Object object) {
		super();
		this.numberValue = (int) object;
	}
	

	public int getNumberValue() {
		return numberValue;
	}


	public void setNumberValue(int numberValue) {
		this.numberValue = numberValue;
	}


	public NumberExpression() {
		super();
	}


	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return numberValue;
	}
	
	public String toString(){
		return String.valueOf(numberValue);
	}
	
	

}
