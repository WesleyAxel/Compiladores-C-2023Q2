package ast;

import javax.swing.JOptionPane;

import symbols.DataType;
import symbols.Identifier;

public class CmdWrite extends AbstractCommand{
	
	private Identifier id;
	private String text;
	private DataType dataType;

	
	public CmdWrite() {
		super();
	}
	
	public CmdWrite(Identifier id,DataType dataType) {
		super();
		this.id = id;
		this.dataType = dataType;
	}
	

	public CmdWrite(String text) {
		super();
		this.text = text;
	}

	@Override
	public String generateCode() {
		if (id != null) {
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
			return "printf(\"" + tipoFormato + "\", " + id.getText() + ");\n";
		} else {
			return "printf(" + text + ");\n";
		}
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, (id!=null? id.getValue():text));
	}

}
