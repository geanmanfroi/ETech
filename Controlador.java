/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etech.aplicativo;

import etech.dao.NaveDAO;
import etech.dao.PlanetaDAO;
import etech.dao.TripulanteDAO;
import etech.modelo.Nave;
import etech.modelo.Planeta;
import etech.modelo.Tripulante;
import etech.modelo.Viagem;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class Controlador {
    private static List<Tripulante> tripulacao;
    private static Planeta planetaOrigem;
    private static Nave naveCorrente;
    private static Planeta planetaDestino;
    private static Viagem viagemCorrente;
    
    public static List<Planeta> listarPlanetas(){
        return PlanetaDAO.listarPlanetas();
    }
    
    public static void selecionarOrigem(String nomePlaneta){
        planetaOrigem = PlanetaDAO.selecionarPlaneta(nomePlaneta);
    }
        
    public static void selecionarDestino(String nomePlaneta){
        planetaDestino = PlanetaDAO.selecionarPlaneta(nomePlaneta);
    }
    
    public static List<Nave> listarNaves(){
        return NaveDAO.listarNaves();
    }
    
    public static void selecionarNave(String nomeNave){
        naveCorrente = NaveDAO.selecionarNave(nomeNave);
    }
    
    public static List<Tripulante> listarTripulantes(int classificacao) {
        return TripulanteDAO.listarTripulantes(classificacao);
    }
    
    public static void selecionarTripulante(String nomeTripulante){
        if(tripulacao == null)
            tripulacao = new LinkedList<>();
        
        tripulacao.add(TripulanteDAO.selecionarTripulante(nomeTripulante));
    }
    
    public static void registrarViagem(Date dataSaida){
        naveCorrente.registrarNaveViagem(dataSaida);
    }
}
