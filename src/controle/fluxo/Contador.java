package controle.fluxo;

import java.util.Scanner;

import exception.ParametrosInvalidadosException;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidadosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            scanner.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidadosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidadosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o nº %d\n", i);
        }
    }
}
