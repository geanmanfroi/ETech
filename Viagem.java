/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etech.modelo;

import java.util.Date;

/**
 *
 * @author Diter Martim Wieser
 * @since 13/04/2016
 */
public class Viagem {
        
    private Date dataSaida;
    private Date dataChegada;
    private long tempoViagem;
    private Planeta planetaOrigem;
    private Planeta planetaDestino;
    private Nave naveCorrente;
    
    public void setAtributo(Date dataSaida){
        this.dataSaida = dataSaida;
        calcularTempoViagem();
        this.dataChegada = new Date(this.dataSaida.getTime() + tempoViagem);
    }
    
    private void calcularTempoViagem(){
        double tempo = 0;
        
        for(int i = 0; i < 3; i++)
            tempo += Math.pow((planetaOrigem.getCoordenadas()[i] * 3.26 - planetaDestino.getCoordenadas()[i] * 3.26), 2);
        
        tempoViagem = (long) (Math.sqrt(tempo) / naveCorrente.getVelocidade() * 3.1536e+10);
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Planeta getPlanetaOrigem() {
        return planetaOrigem;
    }

    public void setPlanetaOrigem(Planeta planetaOrigem) {
        this.planetaOrigem = planetaOrigem;
    }

    public Planeta getPlanetaDestino() {
        return planetaDestino;
    }

    public void setPlanetaDestino(Planeta planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

    public Nave getNaveCorrente() {
        return naveCorrente;
    }

    public void setNaveCorrente(Nave naveCorrente) {
        this.naveCorrente = naveCorrente;
    }

    public long getTempoViagem() {
        return tempoViagem;
    }
    
}
