package Fabric;

import Interface.iCalcItem;
import Product.CalculatorCompl;
import View.ViewCalculatorCompl;

/*
 * Паттерн "Фабрика" Класс описывает генератор комплексных чисел
 * имеет метод createCalc для создания экземпляра калькулятора комплексных чисел
 */


public class CalcComplGenerator extends CalcGenerator{
    
    @Override
    public iCalcItem createCalc(){
        return new ViewCalculatorCompl(new CalculatorCompl(0, 0));
    }
}