package Fabric;

import Interface.iCalcItem;
import Product.CalculatorInt;
import View.ViewCalculatorInt;

public class CalcIntGenerator extends CalcGenerator{
    @Override
    public iCalcItem createCalc(){
        return new ViewCalculatorInt(new CalculatorInt(0));
    }
}

    