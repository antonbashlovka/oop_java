

import Fabric.CalcComplGenerator;
import Fabric.CalcGenerator;
import Fabric.CalcIntGenerator;
import Interface.iCalcItem;


public class App {
    public static void main(String[] args) throws Exception {

        //CalcGenerator calcIntegers = new CalcIntGenerator();
        //iCalcItem view = calcIntegers.createCalc();


       CalcGenerator calcCompl = new CalcComplGenerator();
        iCalcItem view = calcCompl.createCalc();

        view.open();





    }
}
