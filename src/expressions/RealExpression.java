package expressions;

public class RealExpression extends AbstractExpression {

    private String realValue;

    public RealExpression(Object object) {
        super();
        this.realValue = object.toString();
    }

    public String getRealValue() {
        return realValue;
    }

    public void setRealValue(String realValue) {
        this.realValue = realValue;
    }

    public RealExpression() {
        super();
    }

    @Override
    public String eval() {
        return realValue;
    }

    public String toString() {
        return realValue;
    }
}