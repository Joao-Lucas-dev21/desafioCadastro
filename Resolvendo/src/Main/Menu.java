package Resolvendo.src.Main;

import Resolvendo.src.CriacaoArquivo.Arquivo;
import Resolvendo.src.Verificar.Validacao;

public class Menu {
    public Menu() {
    }

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
        arquivo.criarArquivo();
        arquivo.escreverNoArquivo();
        arquivo.lerArquivo();
        System.out.println("------------");
        Validacao scanner = new Validacao();
        int opcao = scanner.validarMenu();

        do {
            if (opcao == 1) {
                System.out.println(1);
            }

            if (opcao == 2) {
                System.out.println(2);
            }

            if (opcao == 3) {
                System.out.println(3);
            }

            if (opcao == 4) {
                System.out.println(4);
            }

            if (opcao == 5) {
                System.out.println(5);
            }

            if (opcao == 6) {
                break;
            }

            opcao = scanner.validarMenu();
        } while(opcao != 6);

    }
}