package expressions;

public class IDExpression extends AbstractExpression {
    private String id;
    private String value;

    public String eval() {
        return value;
    }

    public String toString() {
        return this.id;
    }
}
