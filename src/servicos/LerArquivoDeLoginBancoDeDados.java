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

    public static String dataBase = "";
    public static String senha = "";
    public static String usuario = "";
    public static String ip = "";
    public static String porta = "";

    public void setarLoginBanco() throws FileNotFoundException, IOException {
        File file = new File(System.getProperty("user.dir") + "\\rede.txt");

        if (!file.exists()) {
            System.out.println("Arquivo rede.txt inexistente.");
        } else if (file.length() == 0) {
            System.out.println("Arquivo rede.txt vazio.");
        } else {

            String linha;
            try (FileReader fileReader = new FileReader(file);
                    BufferedReader reader = new BufferedReader(fileReader)) {

                while ((linha = reader.readLine()) != null) {

                    String[] split = linha.split(":");

                    if (split[0].equalsIgnoreCase("IP")) {
                        ip = (linha.split(":")[1]);
                    }
                    if (split[0].equalsIgnoreCase("DB")) {
                        dataBase = (linha.split(":")[1]);
                    }
                    if (split[0].equalsIgnoreCase("USER")) {
                        usuario = (linha.split(":")[1]);
                    }
                    if (split[0].equalsIgnoreCase("KEY")) {
                        senha = (linha.split(":")[1]);
                    }
                    if (split[0].equalsIgnoreCase("PORT")) {
                        porta = (linha.split(":")[1]);
                    }
                }
            }
        }
    }    
}
