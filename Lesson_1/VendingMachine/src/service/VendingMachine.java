package service;

import java.util.List;

import domain.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispencer coinDispencer;
    private Display display;
    private List<Product> assort;
    
    public VendingMachine(Holder holder, CoinDispencer coinDispencer, Display display, List<Product> assort) {
        this.holder = holder;
        this.coinDispencer = coinDispencer;
        this.display = display;
        this.assort = assort;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public CoinDispencer getCoinDispencer() {
        return coinDispencer;
    }

    public void setCoinDispencer(CoinDispencer coinDispencer) {
        this.coinDispencer = coinDispencer;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Product> getProducts() {
        return assort;
    }

    public void setProducts(List<Product> assort) {
        this.assort = assort;
    }
    

}
