

import Fabric.CalcGenerator;
import Fabric.CalcIntGenerator;
import Interface.iCalcItem;


public class App {
    public static void main(String[] args) throws Exception {

        CalcGenerator calcIntegers = new CalcIntGenerator();
        iCalcItem view = calcIntegers.createCalc();

        view.open();



    }
}
