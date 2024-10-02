package entities;

public class Product extends BaseCalculator{
    private Double frete;

    public Product(String name, Double price, Integer destino,Double frete) {
        super(name, price, destino);
        this.frete = frete;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double security(){
        return getPrice()*0.05;
    }

    public double ipiTax(){
        return (getPrice() + frete + security())*0.15;
    }

    @Override
    public Double calculateFinalPrice() {
        double taxPrice = getPrice() + icmsTax() + ipiTax();
        return taxPrice * 1.30;
    }

    @Override
    public String toString(){
        return "Produto: " + getName() + " | R$ " + calculateFinalPrice();
    }
}