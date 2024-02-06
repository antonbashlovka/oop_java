package Fabric;

import Interface.iCalcItem;
import Product.CalculatorCompl;
import View.ViewCalculatorCompl;


public class CalcComplGenerator extends CalcGenerator{
    @Override
    public iCalcItem createCalc(){
        return new ViewCalculatorCompl(new CalculatorCompl(0, 0));
    }
}