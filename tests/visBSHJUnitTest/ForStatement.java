import bsh.Interpreter;

public class ForStatement extends Interpreter{
	public int simpleForLoop(){
		Interpreter bsh = new Interpreter();
		try{
			bsh.set("ans", 0)	;
		bsh.eval("for(int i = 0; i <	5; i = i + 1)\n ans += i;\n return ans");
		} catch (bsh.evalError e){
			System.out.print("Threw " + e);
		}
		
	}
}