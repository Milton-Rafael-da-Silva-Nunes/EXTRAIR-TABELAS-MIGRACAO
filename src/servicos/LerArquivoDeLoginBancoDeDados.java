package servicos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rafael Nunes
 */
public class LerArquivoDeLoginBancoDeDados {

    public static String banco = "";
    public static String senha = "";
    public static String usuario = "";

    public static void dadosDeLoginBancoDeDados() throws FileNotFoundException {
        System.out.println("Login banco!");
        
        String linha;

        File file = new File(System.getProperty("user.dir") + "\\rede.txt");

        if (!file.exists()) {
            System.out.println("Caminho não existe");

        } else if (file.length() == 0) {
            System.out.println("rede.txt esta em branco");

        } else {

            try (FileReader fr = new FileReader(file);
                    BufferedReader bf = new BufferedReader(fr)) {

                while ((linha = bf.readLine()) != null) {

                    String[] split = linha.split(":");

                    if (split[0].equalsIgnoreCase("DB")) {
                        banco = (linha.split(":")[1]);
                    }
                    if (split[0].equalsIgnoreCase("USER")) {
                        usuario = (linha.split(":")[1]);
                    }
                    if (split[0].equalsIgnoreCase("KEY")) {
                        senha = (linha.split(":")[1]);
                    }
                }
            } catch (FileNotFoundException e) {
                throw new Exceptions("Arquivo rede.txt não encontrado!\n" + e.getMessage());
            } catch (IOException ex) {
                throw new Exceptions("Erro inesperado! \n" + ex.getMessage());
            }
        }
    }
}
