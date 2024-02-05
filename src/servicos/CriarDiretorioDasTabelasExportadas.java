package servicos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Rafael Nunes
 */
public class CriarDiretorioDasTabelasExportadas {
    
    public static void criarDiretorioParaTabelas() throws IOException {
        String caminhoPasta = "C:\\1-TABELAS";

        Path path = Paths.get(caminhoPasta);

        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Pasta criada com sucesso: " + caminhoPasta);
        } else {
            System.out.println("Pasta existente ou não criada.");
        }
    }
}
