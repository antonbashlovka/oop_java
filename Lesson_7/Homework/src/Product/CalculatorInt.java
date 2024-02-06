package Product;

import Interface.iCalculable;

public final class CalculatorInt implements iCalculable{
    private int primaryArg;

    public CalculatorInt(int primaryArg){
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable save(int... args) {
        primaryArg = args[0];
        return this;
    }

    @Override
    public iCalculable sum(int... args) {
        primaryArg += args[0];
        return this;
    }

    @Override
    public iCalculable multi(int... args) {
        primaryArg *= args[0];
        return this;
    }

    @Override
    public iCalculable divide (int... args) {
        primaryArg /= args[0];
        return this;
    }

    @Override
    public void printResult() {
        System.out.println(this.primaryArg);
    }


}
