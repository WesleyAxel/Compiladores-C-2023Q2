package ast;

public class CmdInicio extends AbstractCommand{

	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		return ("#include <stdio.h>\n\nint main()\n{\n");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
