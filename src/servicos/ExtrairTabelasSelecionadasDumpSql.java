package servicos;

import java.io.IOException;
import javax.swing.JOptionPane;
import static servicos.LerArquivoDeLoginBancoDeDados.dataBase;
import static servicos.LerArquivoDeLoginBancoDeDados.ip;
import static servicos.LerArquivoDeLoginBancoDeDados.senha;
import static servicos.LerArquivoDeLoginBancoDeDados.usuario;
import static telas.TelaInicialPrograma.jRProdutos;
import static telas.TelaInicialPrograma.jRUnidades;
import static telas.TelaInicialPrograma.jRCategorias;
import static telas.TelaInicialPrograma.jRSubcategorias;
import static telas.TelaInicialPrograma.jRFabricante;
import static telas.TelaInicialPrograma.jRFornecedores;
import static telas.TelaInicialPrograma.jRClientes;
import static telas.TelaInicialPrograma.jREstoque;
import static telas.TelaInicialPrograma.jRLote;
import static telas.TelaInicialPrograma.jRNcm;
import static telas.TelaInicialPrograma.jRCest;
import static telas.TelaInicialPrograma.jRGrupoDeTributacao;
import static telas.TelaInicialPrograma.jRReceber;
import static telas.TelaInicialPrograma.jRPagar;
import static telas.TelaInicialPrograma.jRPagamento;
import static telas.TelaInicialPrograma.jRCst;
import static telas.TelaInicialPrograma.jRConvenio;
import static telas.TelaInicialPrograma.jREmpresa;
import static telas.TelaInicialPrograma.jRUsuario;

/**
 *
 * @author Rafael Nunes
 */
public class ExtrairTabelasSelecionadasDumpSql {

    public void extrairTabelasSql() throws IOException {
        tabelasSelecionadas();
    }

    private void tabelasSelecionadas() throws IOException {

        StringBuilder comando = new StringBuilder("cmd.exe /c mysqldump --host=" + ip + " --user=" + usuario + " --password=" + senha + " " + dataBase);

        if (jRProdutos.isSelected()) {
            comando.append(" produto");
        }
        if (jRUnidades.isSelected()) {
            comando.append(" unidade");
        }
        if (jRCategorias.isSelected()) {
            comando.append(" categoria");
        }
        if (jRSubcategorias.isSelected()) {
            comando.append(" subcategoria");
        }
        if (jRFabricante.isSelected()) {
            comando.append(" fabricante");
        }
        if (jRFornecedores.isSelected()) {
            comando.append(" fornecedor");
        }
        if (jRClientes.isSelected()) {
            comando.append(" cliente");
        }
        if (jRCst.isSelected()) {
            comando.append(" cst");
        }
        if (jRNcm.isSelected()) {
            comando.append(" ncm");
        }
        if (jRCest.isSelected()) {
            comando.append(" cest");
        }
        if (jRGrupoDeTributacao.isSelected()) {
            comando.append(" grupotributacao");
        }
        if (jREstoque.isSelected()) {
            comando.append(" ajusteestoque");
            comando.append(" estoquesaldo");
            comando.append(" estoque");
        }
        if (jRLote.isSelected()) {
            comando.append(" lote");
            comando.append(" lotedet");
        }
        if (jRReceber.isSelected()) {
            comando.append(" receber");
        }
        if (jRPagar.isSelected()) {
            comando.append(" pagar");
        }
        if (jRPagamento.isSelected()) {
            comando.append(" pagamento");
        }
        if (jRConvenio.isSelected()) {
            comando.append(" convenio");
            comando.append(" conveniocliente");
        }
        if (jREmpresa.isSelected()) {
            comando.append(" empresa");
        }
        if (jRUsuario.isSelected()) {
            comando.append(" usuario");
        }

        comando.append(" > C:\\1-TABELAS\\TabelasParaImportação.sql");

        Runtime.getRuntime().exec(comando.toString());

        JOptionPane.showMessageDialog(null, "<html>Tabelas extraídas com sucesso!<br><br>Caminho: <i>C:/1-TABELAS</i></html>",
                "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
}
