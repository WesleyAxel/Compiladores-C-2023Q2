package ast;

import symbols.Identifier;
import java.util.ArrayList;
import java.util.List;

public class CmdDeclare extends AbstractCommand{
	
	private List<String> text;
	
	public CmdDeclare() {
		super();
	}
	
	public CmdDeclare(List<String> text) {
		super();
		this.text = text;
	}
	
	@Override
	public String generateCode() {
		if (text.size() > 1) {
	        List<String> subList = text.subList(1, text.size());
	        String variables = String.join(",", subList);
	        return "int " + text.get(0) + "," + variables + ";\n";
	    } else {
	        return "int " + text.get(0) + ";\n";
	    }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
