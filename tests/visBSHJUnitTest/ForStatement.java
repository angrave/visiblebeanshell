import bsh.Interpreter;

public class ForStatement extends Interpreter{
	public static void main(String[] args){
		Interpreter bsh = new Interpreter();
		try{
			bsh.set("ans", 0);
			bsh.eval("for\n(int i = 0; i < 3; i = i + 1)\n ans += i;\n return ans;");
		} catch (bsh.EvalError e){
			System.out.print("Threw " + e);
		}
		
	}
}