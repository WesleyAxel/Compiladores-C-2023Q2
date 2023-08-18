package expressions;

public class RealExpression extends AbstractExpression {
	
	private double realValue;
	
	public RealExpression(Object object) {
		super();
		this.realValue = (double) object;
	}
	
	public double getRealValue() {
		return realValue;
	}
	
	public void setRealValue(double realValue) {
		this.realValue = realValue;
	}
	
	public RealExpression() {
		super();
	}
	
	@Override
	public int eval() {
		return (int) realValue;
	}
	
	public String toString() {
		return String.valueOf(realValue);
	}
}