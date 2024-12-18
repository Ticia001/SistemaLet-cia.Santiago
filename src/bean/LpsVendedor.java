package bean;

import java.time.temporal.Temporal;
import javax.persistence.*;
import java.util.Date;
import javax.swing.text.html.parser.Entity;

@Entity
@Table(name = "lps_vendedor", catalog = "aulas")
public class LpsVendedor implements java.io.Serializable {

    private int idLpsVendedor;
    private String lpsNome;
    private Date lpsAdmissao;
    private String lpsCargo;
    private int lpsCargaHoraria;
    private double lpsSalario;
    private String lpsCpf;
    private String lpsEstadoCivil;
    private String lpsNaturalidade;
    private String lpsEscolaridade;

    public LpsVendedor() {}

    public LpsVendedor(int idLpsVendedor, String lpsNome, Date lpsAdmissao, String lpsCargo, int lpsCargaHoraria,
                       double lpsSalario, String lpsCpf, String lpsEstadoCivil, String lpsNaturalidade, String lpsEscolaridade) {
        this.idLpsVendedor = idLpsVendedor;
        this.lpsNome = lpsNome;
        this.lpsAdmissao = lpsAdmissao;
        this.lpsCargo = lpsCargo;
        this.lpsCargaHoraria = lpsCargaHoraria;
        this.lpsSalario = lpsSalario;
        this.lpsCpf = lpsCpf;
        this.lpsEstadoCivil = lpsEstadoCivil;
        this.lpsNaturalidade = lpsNaturalidade;
        this.lpsEscolaridade = lpsEscolaridade;
    }

    @Id
    @Column(name = "idlps_cod_vendedor", unique = true, nullable = false)
    public int getIdLpsVendedor() {
        return idLpsVendedor;
    }

    public void setIdLpsVendedor(int idLpsVendedor) {
        this.idLpsVendedor = idLpsVendedor;
    }

    @Column(name = "lps_nome", nullable = false, length = 100)
    public String getLpsNome() {
        return lpsNome;
    }

    public void setLpsNome(String lpsNome) {
        this.lpsNome = lpsNome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "lps_admissao", length = 10)
    public Date getLpsAdmissao() {
        return lpsAdmissao;
    }

    public void setLpsAdmissao(Date lpsAdmissao) {
        this.lpsAdmissao = lpsAdmissao;
    }

    @Column(name = "lps_cargo", length = 50)
    public String getLpsCargo() {
        return lpsCargo;
    }

    public void setLpsCargo(String lpsCargo) {
        this.lpsCargo = lpsCargo;
    }

    @Column(name = "lps_cargahoraria")
    public int getLpsCargaHoraria() {
        return lpsCargaHoraria;
    }

    public void setLpsCargaHoraria(int lpsCargaHoraria) {
        this.lpsCargaHoraria = lpsCargaHoraria;
    }

    @Column(name = "lps_salario")
    public double getLpsSalario() {
        return lpsSalario;
    }

    public void setLpsSalario(double lpsSalario) {
        this.lpsSalario = lpsSalario;
    }

    @Column(name = "lps_cpf", length = 15)
    public String getLpsCpf() {
        return lpsCpf;
    }

    public void setLpsCpf(String lpsCpf) {
        this.lpsCpf = lpsCpf;
    }

    @Column(name = "lps_estadocivil", length = 20)
    public String getLpsEstadoCivil() {
        return lpsEstadoCivil;
    }

    public void setLpsEstadoCivil(String lpsEstadoCivil) {
        this.lpsEstadoCivil = lpsEstadoCivil;
    }

    @Column(name = "lps_naturalidade", length = 50)
    public String getLpsNaturalidade() {
        return lpsNaturalidade;
    }

    public void setLpsNaturalidade(String lpsNaturalidade) {
        this.lpsNaturalidade = lpsNaturalidade;
    }

    @Column(name = "lps_escolaridade", length = 50)
    public String getLpsEscolaridade() {
        return lpsEscolaridade;
    }

    public void setLpsEscolaridade(String lpsEscolaridade) {
        this.lpsEscolaridade = lpsEscolaridade;
    }
}

