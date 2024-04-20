package Fabric;

import Interface.iCalcItem;


/**
 * Абстрактный класс описывает создание калькулятора, не важно какого - простые числа или комплексные 
 */
public abstract class CalcGenerator {
    
    /**
     * метод создает калькулятор, не важно какого - простые числа или комплексные 
     */
    public void openCalc(){
        iCalcItem calcItem = createCalc();
        calcItem.open();
    }

    
    public abstract iCalcItem createCalc();
    

}