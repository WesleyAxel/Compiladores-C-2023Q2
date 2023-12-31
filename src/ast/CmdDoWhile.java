package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdDoWhile extends AbstractCommand {

    private String expr;
    private List<AbstractCommand> comandos;

    public CmdDoWhile() {
        super();
    }

    public CmdDoWhile(String expr, List<AbstractCommand> comandos) {
        super();
        this.expr = expr;
        this.comandos = comandos;
    }
    
    public CmdDoWhile(List<AbstractCommand> comandos) {
        super();
        this.comandos = comandos;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
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
        code.append("do {\n");
        for (AbstractCommand cmd : comandos) {
            code.append(cmd.generateCode());
        }
        code.append("} while (" + expr + "); \n");
        return code.toString();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
    }
}