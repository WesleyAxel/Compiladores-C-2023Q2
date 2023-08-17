package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdWhile extends AbstractCommand {

    private AbstractExpression expr;
    private List<AbstractCommand> comandos;

    public CmdWhile() {
        super();
    }

    public CmdWhile(AbstractExpression expr, List<AbstractCommand> comandos) {
        super();
        this.expr = expr;
        this.comandos = comandos;
    }

    public AbstractExpression getExpr() {
        return expr;
    }

    public void setExpr(AbstractExpression expr) {
        this.expr = expr;
    }

    public List<AbstractCommand> getComandos() {
        return comandos;
    }

    public void setComandos(List<AbstractCommand> comandos) {
        this.comandos = comandos;
    }

    @Override
    public String generateCode() {
        StringBuilder code = new StringBuilder();
        code.append("while (").append(expr.toString()).append(") {\n");
        for (AbstractCommand cmd : comandos) {
            code.append(cmd.generateCode());
        }
        code.append("}\n");
        return code.toString();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
    }
}