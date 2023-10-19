package aplicacao;

import java.util.Scanner;

public class TP {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Retangulo retan = new Retangulo();

        System.out.println("Digite a altura e largura do retângulo: ");
        retan.altura = sc.nextDouble();
        retan.largura = sc.nextDouble();

        System.out.printf("Área = %.2f%n", retan.area());
        System.out.printf("Perímetro = %.2f%n", retan.perimetro());
        System.out.printf("Diagonal = %.2f%n", retan.diagonal());
        sc.close();
    }
}
