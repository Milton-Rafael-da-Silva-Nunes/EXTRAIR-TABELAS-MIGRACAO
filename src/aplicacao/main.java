package aplicacao;

import java.io.IOException;
import javax.swing.JOptionPane;
import servicos.CriarDiretorioDasTabelasExportadas;
import servicos.LerArquivoDeLoginBancoDeDados;
import telas.TelaInicialPrograma;

/**
 *
 * @author Rafael Nunes
 */
public class main {

    public static void main(String[] args) {
        try {
            new LerArquivoDeLoginBancoDeDados().setarLoginBanco();
            new CriarDiretorioDasTabelasExportadas().criarDiretorioParaTabelas();
            new TelaInicialPrograma().setVisible(true);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Logon!", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
