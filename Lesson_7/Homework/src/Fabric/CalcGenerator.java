package Fabric;

import Interface.iCalcItem;

public abstract class CalcGenerator {
    
    public void openCalc(){
        iCalcItem calcItem = createCalc();
        calcItem.open();
    }

    public abstract iCalcItem createCalc();
    

}