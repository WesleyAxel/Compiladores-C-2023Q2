package ast;

import javax.swing.JOptionPane;

import symbols.DataType;
import symbols.Identifier;

public class CmdRead extends AbstractCommand{
	
	private Identifier id;
	private DataType dataType;
	
	public CmdRead(Identifier id, DataType dataType) {
		super();
		this.id = id;
		this.dataType = dataType;
	}
	public CmdRead() {
		super();
	}


	@Override
	public String generateCode() {
		String tipoFormato;
		switch (dataType) {
			case INTEGER:
				tipoFormato = "%d";
				break;
			case REAL:
				tipoFormato = "%f";
				break;
			case STRING:
				tipoFormato = "%s";
				break;
			default:
				tipoFormato = "";
		}
		return "scanf(\"" + tipoFormato + "\", &" + id.getText() + ");\n";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//id.setValue(Integer.parseInt(JOptionPane.showInputDialog("Type Your Input")));
	}

}
