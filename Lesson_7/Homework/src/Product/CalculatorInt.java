package Product;


import Interface.iCalculable;

public final class CalculatorInt implements iCalculable{
    private int primaryArg;

    public CalculatorInt(int primaryArg){
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public iCalculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public iCalculable divide (int arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public int getResult() {
        return this.primaryArg;
    }


}
