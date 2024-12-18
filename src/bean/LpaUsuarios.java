package bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lps_usuarios", catalog = "aulas")
public class LpsUsuarios implements java.io.Serializable {

    private int idLpsUsuarios;
    private String lpsApelido;
    private String lpsNome;
    private String lpsCpf;
    private Date lpsDataNascimento;
    private String lpsSenha;
    private int lpsNivel;
    private String lpsAtivo;

    public LpsUsuarios() {}

    public LpsUsuarios(int idLpsUsuarios, String lpsApelido, String lpsNome, String lpsCpf, Date lpsDataNascimento, String lpsSenha, int lpsNivel, String lpsAtivo) {
        this.idLpsUsuarios = idLpsUsuarios;
        this.lpsApelido = lpsApelido;
        this.lpsNome = lpsNome;
        this.lpsCpf = lpsCpf;
        this.lpsDataNascimento = lpsDataNascimento;
        this.lpsSenha = lpsSenha;
        this.lpsNivel = lpsNivel;
        this.lpsAtivo = lpsAtivo;
    }

    @Id
    @Column(name = "idlps_usuarios", unique = true, nullable = false)
    public int getIdLpsUsuarios() {
        return idLpsUsuarios;
    }

    public void setIdLpsUsuarios(int idLpsUsuarios) {
        this.idLpsUsuarios = idLpsUsuarios;
    }

    @Column(name = "lps_apelido", nullable = false, length = 45)
    public String getLpsApelido() {
        return lpsApelido;
    }

    public void setLpsApelido(String lpsApelido) {
        this.lpsApelido = lpsApelido;
    }

    @Column(name = "lps_nome", nullable = false, length = 45)
    public String getLpsNome() {
        return lpsNome;
    }

    public void setLpsNome(String lpsNome) {
        this.lpsNome = lpsNome;
    }

    @Column(name = "lps_cpf", length = 15)
    public String getLpsCpf() {
        return lpsCpf;
    }

    public void setLpsCpf(String lpsCpf) {
        this.lpsCpf = lpsCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "lps_datanascimento", length = 10)
    public Date getLpsDataNascimento() {
        return lpsDataNascimento;
    }

    public void setLpsDataNascimento(Date lpsDataNascimento) {
        this.lpsDataNascimento = lpsDataNascimento;
    }

    @Column(name = "lps_senha", nullable = false, length = 15)
    public String getLpsSenha() {
        return lpsSenha;
    }

    public void setLpsSenha(String lpsSenha) {
        this.lpsSenha = lpsSenha;
    }

    @Column(name = "lps_nivel", nullable = false)
    public int getLpsNivel() {
        return lpsNivel;
    }

    public void setLpsNivel(int lpsNivel) {
        this.lpsNivel = lpsNivel;
    }

    @Column(name = "lps_ativo", nullable = false, length = 1)
    public String getLpsAtivo() {
        return lpsAtivo;
    }

    public void setLpsAtivo(String lpsAtivo) {
        this.lpsAtivo = lpsAtivo;
    }
}
