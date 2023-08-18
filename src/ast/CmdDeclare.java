package ast;

import symbols.DataType;
import symbols.Identifier;
import java.util.ArrayList;
import java.util.List;

public class CmdDeclare extends AbstractCommand{
	
	private List<String> text;
	private DataType dataType;
	
	public CmdDeclare() {
		super();
	}
	
	public CmdDeclare(List<String> text,DataType dataType) {
		super();
		this.text = text;
		this.dataType = dataType;
	}
	
	@Override
	public String generateCode() {
		String type;
		switch (dataType) {
			case INTEGER:
				type = "int";
				break;
			case REAL:
				type = "float";
				break;
			case STRING:
				type = "String";
				break;
			default:
				type = "unknown";
		}
		
		if (text.size() > 1) {
	        List<String> subList = text.subList(1, text.size());
	        String variables = String.join(",", subList);
	        return type + " " + text.get(0) + "," + variables + ";\n";
	    } else {
	        return type + " " + text.get(0) + ";\n";
	    }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
