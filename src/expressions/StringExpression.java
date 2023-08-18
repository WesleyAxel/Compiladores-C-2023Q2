package expressions;

public class StringExpression extends AbstractExpression {
	
	private String stringValue;
	
	public StringExpression(Object object) {
		super();
		this.stringValue = (String) object;
	}
	
	public String getStringValue() {
		return stringValue;
	}
	
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	public StringExpression() {
		super();
	}
	
	@Override
	public int eval() {
		throw new UnsupportedOperationException("Evaluation not supported for StringExpression");
	}
	
	public String toString() {
		return stringValue;
	}
}