package etech;

import java.util.ArrayList;
import java.util.List;

public class Planeta {

    private String nomePlaneta;
    private String tipo;
    private int[] coordenadas;
    private List<Viagem> listaOrigem = new ArrayList<>();
    private List<Viagem> listaDestino = new ArrayList<>();
    
    public Planeta() {
    }
    
    public Planeta(String nomePlaneta, String tipo, int[] coordenadas) {
        this.nomePlaneta = nomePlaneta;
        this.tipo = tipo;
        this.coordenadas = new int[3];
        System.arraycopy(coordenadas, 0, this.coordenadas, 0, coordenadas.length);
    }

    public String getNomePlaneta() {
        return nomePlaneta;
    }

    public void setNomePlaneta(String nomePlaneta) {
        this.nomePlaneta = nomePlaneta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[] coordenadas) {
        this.coordenadas = new int[3];
        System.arraycopy(coordenadas, 0, this.coordenadas, 0, coordenadas.length);
    }

    @Override
    public String toString() {
        return "Planeta{" + "nomePlaneta=" + nomePlaneta + ", tipo=" + tipo + ", coordenadas=" + coordenadas + '}';
    }
    public void vincularOrigem(Viagem a){
        listaOrigem.add(a);
    }
    public void vincularDestino(Viagem b){
        listaDestino.add(b);
    }
    
}
