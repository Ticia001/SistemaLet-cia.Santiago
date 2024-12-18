package bean;

import javax.persistence.*;

@Entity
@Table(name = "lps_marca", catalog = "aulas")
public class LpsMarca implements java.io.Serializable {

    private int idLpsMarca;
    private String lpsNome;
    private String lpsFilial;

    public LpsMarca() {}

    public LpsMarca(int idLpsMarca, String lpsNome, String lpsFilial) {
        this.idLpsMarca = idLpsMarca;
        this.lpsNome = lpsNome;
        this.lpsFilial = lpsFilial;
    }

    @Id
    @Column(name = "idlps_marca", unique = true, nullable = false)
    public int getIdLpsMarca() {
        return idLpsMarca;
    }

    public void setIdLpsMarca(int idLpsMarca) {
        this.idLpsMarca = idLpsMarca;
    }

    @Column(name = "lps_nome", nullable = false, length = 100)
    public String getLpsNome() {
        return lpsNome;
    }

    public void setLpsNome(String lpsNome) {
        this.lpsNome = lpsNome;
    }

    @Column(name = "lps_filial", length = 50)
    public String getLpsFilial() {
        return lpsFilial;
    }

    public void setLpsFilial(String lpsFilial) {
        this.lpsFilial = lpsFilial;
    }
}
