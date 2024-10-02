
package application;

import entities.BaseCalculator;
import entities.Product;
import entities.Service;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("****CALCULAR PREÇO FINAL****");
        System.out.print("Digite o nome do produto: ");
        String productName = sc.nextLine();
        System.out.print("Digite o valor inicial do produto: ");
        double productPrice = sc.nextDouble();
        System.out.println("Escolha o destino do produto:");
        System.out.println("1 - Rio de Janeiro");
        System.out.println("2 - Distrito Federal");
        System.out.print("Digite o número correspondente ao destino: ");
        int destino = sc.nextInt();
        System.out.print("Digite P para produto ou S para serviço: ");
        char type = sc.next().charAt(0);

        if(type == 'P' || type == 'p'){
            System.out.println("Digite o valor do frete: ");
            double frete = sc.nextDouble();
            BaseCalculator product1 = new Product(productName, productPrice, destino,frete);
            product1.calculateFinalPrice();
            System.out.println(product1);
        } else if (type == 'S' || type == 's') {
            BaseCalculator product2 = new Service(productName, productPrice, destino);
            product2.calculateFinalPrice();
            System.out.println(product2);
        }

    }
}
