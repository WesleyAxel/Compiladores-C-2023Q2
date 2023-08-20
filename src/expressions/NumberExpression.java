package expressions;

public class NumberExpression extends AbstractExpression {

    private String numberValue;

    public NumberExpression(Object object) {
        super();
        this.numberValue = object.toString();
    }

    public String getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(String numberValue) {
        this.numberValue = numberValue;
    }

    public NumberExpression() {
        super();
    }

    @Override
    public String eval() {
        // TODO Auto-generated method stub
        return numberValue;
    }

    public String toString() {
        return numberValue;
    }
}
