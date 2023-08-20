package ast;

import symbols.DataType;
import symbols.Identifier;
import java.util.ArrayList;
import java.util.List;

public class CmdDeclare extends AbstractCommand{
	
	private List<String> text;
	private DataType dataType;
	private int size; // Tamanho do array de caracteres
	
	public CmdDeclare() {
		super();
	}
	
	public CmdDeclare(List<String> text, DataType dataType, int size) {
		super();
		this.text = text;
		this.dataType = dataType;
		this.size = size;
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
	            type = "char";
	            break;
	        default:
	            type = "unknown";
	    }
	    if (type.equals("char")) {
	        if (text.size() > 1) {
	            List<String> variables = new ArrayList<>();
	            for (int i = 0; i < text.size(); i++) {
	                if (i == 0) {
	                    variables.add(text.get(i) + "[" + size + "]");
	                } else {
	                    variables.add(text.get(i) + "[" + size + "]");
	                }
	            }
	            return type + " " + String.join(",", variables) + ";\n";
	        } else {
	            return type + " " + text.get(0) + "[" + size + "]" + ";\n";
	        }
	    } else {
	        if (text.size() > 1) {
	            List<String> subList = text.subList(1, text.size());
	            String variables = String.join(",", subList);
	            return type + " " + text.get(0) + "," + variables + ";\n";
	        } else {
	            return type + " " + text.get(0) + ";\n";
	        }
	    }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}