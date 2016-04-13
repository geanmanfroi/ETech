/**
 *
 * @author 233220
 */
public class Tripulante {
    
    String nomeTripulante, funcao, endereco;
    int classificacao, cpf, rg;
    
    public Tripulante(){
        
    }

    public Tripulante(String nomeTripulante, String funcao, String endereco, int classificacao, int cpf, int rg) {
        this.nomeTripulante = nomeTripulante;
        this.funcao = funcao;
        this.endereco = endereco;
        this.classificacao = classificacao;
        this.cpf = cpf;
        this.rg = rg;
    }

     public void  setAtributos(String nomeTripulante, String funcao, String endereco, int classificacao, int cpf, int rg) {
        this.nomeTripulante = nomeTripulante;
        this.funcao = funcao;
        this.endereco = endereco;
        this.classificacao = classificacao;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public String getNomeTripulante() {
        return nomeTripulante;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setNomeTripulante(String nomeTripulante) {
        this.nomeTripulante = nomeTripulante;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return nomeTripulante ;
    }
    
    
}
