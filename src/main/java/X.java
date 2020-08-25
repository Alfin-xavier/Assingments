import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class X {

    public static void main(String[] args) throws ScriptException {
        //String calculation = "8 * 10 + 3";
    	Scanner sc=new Scanner(System.in);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        System.out.println("Enter the Expression");
        String calculation=sc.next();
        Object result = engine.eval(calculation);
        System.out.println(result);
    }

}