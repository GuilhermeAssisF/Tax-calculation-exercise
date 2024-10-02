package entities;

public class Service extends BaseCalculator {

    public Service(String name, Double price, Integer destino) {
        super(name, price, destino);
    }

    public double issTax(){
        return (getPrice()*0.12);
    }

    @Override
    public Double calculateFinalPrice() {
        double taxPrice = getPrice() + icmsTax() + issTax();
        return taxPrice * 1.30;
    }

    @Override
    public String toString(){
        return "Produto: " + getName() + " | R$ " + calculateFinalPrice();
    }
}