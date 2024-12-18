package bean;

import java.time.temporal.Temporal;
import javax.persistence.*;
import java.util.Date;
import javax.swing.text.html.parser.Entity;

@Entity
@Table(name = "lps_empresa", catalog = "aulas")
public class LpsEmpresa implements java.io.Serializable {

    private int idLpsEmpresa;
    private String lpsNome;
    private Date lpsFundacao;
    private String lpsTelefone;
    private String lpsCnpj;

    public LpsEmpresa() {}

    public LpsEmpresa(int idLpsEmpresa, String lpsNome, Date lpsFundacao, String lpsTelefone, String lpsCnpj) {
        this.idLpsEmpresa = idLpsEmpresa;
        this.lpsNome = lpsNome;
        this.lpsFundacao = lpsFundacao;
        this.lpsTelefone = lpsTelefone;
        this.lpsCnpj = lpsCnpj;
    }

    @Id
    @Column(name = "idlps_empresa", unique = true, nullable = false)
    public int getIdLpsEmpresa() {
        return idLpsEmpresa;
    }

    public void setIdLpsEmpresa(int idLpsEmpresa) {
        this.idLpsEmpresa = idLpsEmpresa;
    }

    @Column(name = "lps_nome", nullable = false, length = 100)
    public String getLpsNome() {
        return lpsNome;
    }

    public void setLpsNome(String lpsNome) {
        this.lpsNome = lpsNome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "lps_fundacao", length = 10)
    public Date getLpsFundacao() {
        return lpsFundacao;
    }

    public void setLpsFundacao(Date lpsFundacao) {
        this.lpsFundacao = lpsFundacao;
    }

    @Column(name = "lps_telefone", length = 15)
    public String getLpsTelefone() {
        return lpsTelefone;
    }

    public void setLpsTelefone(String lpsTelefone) {
        this.lpsTelefone = lpsTelefone;
    }

    @Column(name = "lps_cnpj", length = 18)
    public String getLpsCnpj() {
        return lpsCnpj;
    }

    public void setLpsCnpj(String lpsCnpj) {
        this.lpsCnpj = lpsCnpj;
    }
}
