package bean;

import javax.persistence.*;
import javax.swing.text.html.parser.Entity;


@Entity
@Table(name = "lps_produto", catalog = "aulas")
public class LpsProduto implements java.io.Serializable {

    private int idLpsProduto;
    private String lpsNome;
    private String lpsAdimissao;
    private int lpsQuanEstoque;
    private double lpsSaidaPro;
    private String lpsCategoria;

    public LpsProduto() {}

    public LpsProduto(int idLpsProduto, String lpsNome, String lpsAdimissao, int lpsQuanEstoque, double lpsSaidaPro, String lpsCategoria) {
        this.idLpsProduto = idLpsProduto;
        this.lpsNome = lpsNome;
        this.lpsAdimissao = lpsAdimissao;
        this.lpsQuanEstoque = lpsQuanEstoque;
        this.lpsSaidaPro = lpsSaidaPro;
        this.lpsCategoria = lpsCategoria;
    }

    @Id
    @Column(name = "idlps_codigo", unique = true, nullable = false)
    public int getIdLpsProduto() {
        return idLpsProduto;
    }

    public void setIdLpsProduto(int idLpsProduto) {
        this.idLpsProduto = idLpsProduto;
    }

    @Column(name = "lps_nome", nullable = false, length = 100)
    public String getLpsNome() {
        return lpsNome;
    }

    public void setLpsNome(String lpsNome) {
        this.lpsNome = lpsNome;
    }

    @Column(name = "lps_adimissao", length = 20)
    public String getLpsAdimissao() {
        return lpsAdimissao;
    }

    public void setLpsAdimissao(String lpsAdimissao) {
        this.lpsAdimissao = lpsAdimissao;
    }

    @Column(name = "lps_quanEstoque")
    public int getLpsQuanEstoque() {
        return lpsQuanEstoque;
    }

    public void setLpsQuanEstoque(int lpsQuanEstoque) {
        this.lpsQuanEstoque = lpsQuanEstoque;
    }

    @Column(name = "lps_SaidaPro")
    public double getLpsSaidaPro() {
        return lpsSaidaPro;
    }

    public void setLpsSaidaPro(double lpsSaidaPro) {
        this.lpsSaidaPro = lpsSaidaPro;
    }

    @Column(name = "lps_Categoria", length = 50)
    public String getLpsCategoria() {
        return lpsCategoria;
    }

    public void setLpsCategoria(String lpsCategoria) {
        this.lpsCategoria = lpsCategoria;
    }
}

