package ast;

import java.util.List;

public class CmdIf extends AbstractCommand{

	private String expr;
	private List<AbstractCommand> listaTrue;
	private List<AbstractCommand> listaFalse;
	
	public CmdIf() {
		super();
	}

	public CmdIf(String expr) {
		super();
		this.expr = expr;
	}

	public String getExpr() {
		return expr;
	}

	public void setExpr(String expr) {
		this.expr = expr;
	}

	public List<AbstractCommand> getListaTrue() {
		return listaTrue;
	}

	public void setListaTrue(List<AbstractCommand> listaTrue) {
		this.listaTrue = listaTrue;
	}

	public List<AbstractCommand> getListaFalse() {
		return listaFalse;
	}

	public void setListaFalse(List<AbstractCommand> listaFalse) {
		this.listaFalse = listaFalse;
	}

	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		StringBuilder str2 = new StringBuilder();

		for (AbstractCommand cmd: listaTrue) {
			str.append(cmd.generateCode());
		}

		if (listaFalse != null) {
			str2.append("else {\n");
			for (AbstractCommand cmd: listaFalse) {
				str2.append(cmd.generateCode());
			}
			str2.append("}\n");
		}

		return "if (" + expr + ") {\n "+ str + "}\n" + str2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
