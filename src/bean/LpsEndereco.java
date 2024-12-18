package bean;

import javax.persistence.*;
import javax.swing.text.html.parser.Entity;

@Entity
@Table(name = "lps_endereco", catalog = "aulas")
public class LpsEndereco implements java.io.Serializable {

    private int idLpsEndereco;
    private String lpsRua;
    private String lpsImovel;
    private String lpsBairro;
    private String lpsCep;
    private String lpsEstado;
    private String lpsComplemento;
    private String lpsNumero;

    public LpsEndereco() {}

    public LpsEndereco(int idLpsEndereco, String lpsRua, String lpsImovel, String lpsBairro, String lpsCep, String lpsEstado, String lpsComplemento, String lpsNumero) {
        this.idLpsEndereco = idLpsEndereco;
        this.lpsRua = lpsRua;
        this.lpsImovel = lpsImovel;
        this.lpsBairro = lpsBairro;
        this.lpsCep = lpsCep;
        this.lpsEstado = lpsEstado;
        this.lpsComplemento = lpsComplemento;
        this.lpsNumero = lpsNumero;
    }

    @Id
    @Column(name = "idlps_endereco", unique = true, nullable = false)
    public int getIdLpsEndereco() {
        return idLpsEndereco;
    }

    public void setIdLpsEndereco(int idLpsEndereco) {
        this.idLpsEndereco = idLpsEndereco;
    }

    @Column(name = "lps_rua", nullable = false, length = 100)
    public String getLpsRua() {
        return lpsRua;
    }

    public void setLpsRua(String lpsRua) {
        this.lpsRua = lpsRua;
    }

    @Column(name = "lps_imovel", length = 50)
    public String getLpsImovel() {
        return lpsImovel;
    }

    public void setLpsImovel(String lpsImovel) {
        this.lpsImovel = lpsImovel;
    }

    @Column(name = "lps_bairro", length = 50)
    public String getLpsBairro() {
        return lpsBairro;
    }

    public void setLpsBairro(String lpsBairro) {
        this.lpsBairro = lpsBairro;
    }

    @Column
        (name = "lps_cep", length = 10)
    public String getLpsCep() {
        return lpsCep;
    }

    public void setLpsCep(String lpsCep) {
        this.lpsCep = lpsCep;
    }

    @Column
        (name = "lps_estado", length = 2)
    public String getLpsEstado() {
        return lpsEstado;
    }

    public void setLpsEstado(String lpsEstado) {
        this.lpsEstado = lpsEstado;
    }

    @Column
        (name = "lps_complemento", length = 50)
    public String getLpsComplemento() {
        return lpsComplemento;
    }

    public void setLpsComplemento(String lpsComplemento) {
        this.lpsComplemento = lpsComplemento;
    }

    @Column
        (name = "lps_numero", length = 10)
    public String getLpsNumero() {
        return lpsNumero;
    }

    public void setLpsNumero(String lpsNumero) {
        this.lpsNumero = lpsNumero;
    }
}
