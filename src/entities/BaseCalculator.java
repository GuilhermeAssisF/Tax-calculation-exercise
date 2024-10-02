package entities;

public abstract class BaseCalculator {
    private String name;
    private Double price;
    private Integer destino;

    public BaseCalculator() {
    }

    public BaseCalculator(String name, Double price, Integer destino) {
        this.name = name;
        this.price = price;
        this.destino = destino;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double calculateAliquota(double valor, int destino) {
        double aliquota;

        if (destino == 1) {
            aliquota = 0.12; // São Paulo para Rio de Janeiro
        } else if (destino == 2) {
            aliquota = 0.07; // São Paulo para Distrito Federal
        } else {
            throw new IllegalArgumentException("Destino inválido.");
        }

        return valor * aliquota;
    }

    public double icmsTax() {
        return calculateAliquota(price, destino);
    }

    public abstract Double calculateFinalPrice();
}