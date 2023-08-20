package ast;

import java.util.List;

public class CmdWhile extends AbstractCommand {

    private String expr;
    private List<AbstractCommand> comandos;

    public CmdWhile() {
        super();
    }

    public CmdWhile(String expr, List<AbstractCommand> comandos) {
        super();
        this.expr = expr;
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
        code.append("while (" + expr + ") {\n");
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