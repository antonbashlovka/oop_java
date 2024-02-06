package Product;


import Interface.iCalculable;

public final class CalculatorCompl implements iCalculable{
    private int realPart;
    private int imgPart;

    public CalculatorCompl(int realPart, int imgPart){
        this.realPart = realPart;
        this.imgPart = imgPart;
    }

    @Override
    public iCalculable save(int... parts) {
        
        this.realPart = parts[0];
        this.imgPart = parts[1];

        return this;
    }

    @Override
    public iCalculable sum(int... parts) {
        
        this.realPart += parts[0];
        this.imgPart += parts[1];

        return this;
    }

    @Override
    public iCalculable multi(int... parts) {

        realPart *= parts[0];
        imgPart *= parts[1];

        return this;
    }

    @Override
    public iCalculable divide (int... parts) {
        realPart /= parts[0];
        imgPart /= parts[1];
        
        return this;
    }

    @Override
    public void printResult() {
        System.out.println(this.realPart + " + " + "i" + this.imgPart);
        
    }


}
