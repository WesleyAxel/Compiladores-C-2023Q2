package expressions;

public class BinaryExpression extends AbstractExpression{

	private String operator;
	private AbstractExpression leftSide;
	private AbstractExpression rightSide;
	
	public int eval() {
		switch(operator) {
		case "+":
			return leftSide.eval() + rightSide.eval();
		case "-":
			return leftSide.eval() - rightSide.eval();
		case "*":
			return leftSide.eval() * rightSide.eval();
		case "/":
			return leftSide.eval() / rightSide.eval();
		default:
			return 0;
		}
	}

	public BinaryExpression(String operator, AbstractExpression leftSide, AbstractExpression rightSide) {
		super();
		this.operator = operator;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}

	public BinaryExpression(String operator) {
		super();
		this.operator = operator;
	}

	public BinaryExpression() {
		super();
	}
	
	public String toString() {
		return leftSide.toString() + operator + rightSide.toString();
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public AbstractExpression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(AbstractExpression leftSide) {
		this.leftSide = leftSide;
	}

	public AbstractExpression getRightSide() {
		return rightSide;
	}

	public void setRightSide(AbstractExpression rightSide) {
		this.rightSide = rightSide;
	}
	
	
}
