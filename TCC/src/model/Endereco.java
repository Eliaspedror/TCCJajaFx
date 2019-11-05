
package model;

/**
 *
 * @author Elias Pedro
 */
public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String unidade;
    private int ibge;
    private int gia;

    
    //Construtor
    public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String unidade, int ibge, int gia){
        this.setCep(cep);
        this.setLogradouro(logradouro);
        this.setComplemento(complemento);
        this.setBairro(bairro);
        this.setLocalidade(localidade);
        this.setUf(uf);
        this.setUnidade(unidade);
        this.setIbge(ibge);
        this.setGia(gia);
    }
    
    //Métodos Getters e Setters
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public int getIbge() {
        return ibge;
    }
    public void setIbge(int ibge) {
        this.ibge = ibge;
    }
    public int getGia() {
        return gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
    
}
