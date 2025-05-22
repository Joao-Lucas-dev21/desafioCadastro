package Resolvendo.src.CriacaoArquivo;

import java.io.*;

public class Arquivo {
    public Arquivo() {
    }

    public void criarArquivo() {
        File file = new File("C:\\Users\\joaol\\OneDrive\\Documentos\\JAVA\\desafioCadastro\\Resolvendo\\src\\CriacaoArquivo\\formulario.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void escreverNoArquivo() {
        File file = new File("C:\\Users\\joaol\\OneDrive\\Documentos\\JAVA\\desafioCadastro\\Resolvendo\\src\\CriacaoArquivo\\formulario.txt");

        try {
            try (
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
            ) {
                bw.write("1 - Qual o nome e sobrenome do pet?\n2 - Qual o tipo do pet (Cachorro/Gato)?\n3 - Qual o sexo do animal?\n4 - Qual endereço e bairro que ele foi encontrado?\n5 - Qual a idade aproximada do pet?\n6 - Qual o peso aproximado do pet?\n7 - Qual a raça do pet?");
                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lerArquivo() {
        File file = new File("C:\\Users\\joaol\\OneDrive\\Documentos\\JAVA\\desafioCadastro\\Resolvendo\\src\\CriacaoArquivo\\formulario.txt");

        try {
            String linha;
            try (
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
            ) {
                while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

