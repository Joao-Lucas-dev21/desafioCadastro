package Resolvendo.src.Verificar;

import Resolvendo.src.MenuInicial.Print;

import java.util.Scanner;

public class Validacao {
    Scanner input;
    Print exibir;

    public Validacao() {
        this.input = new Scanner(System.in);
        this.exibir = new Print();
    }

    public int validarMenu() {
        while(true) {
            this.exibir.mostrarMenu();
            if (this.input.hasNextInt()) {
                int num = this.input.nextInt();
                if (num > 0 && num <= 6) {
                    return num;
                }

                System.out.println("Digite uma das opções!");
            } else {
                System.out.println("Digite uma das opções!");
                this.input.next();
            }
        }
    }
}
