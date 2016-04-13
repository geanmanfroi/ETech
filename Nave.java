/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo
 */
public class Nave {
    public String nomeNave;
    public float velMedia;
    public int numPass;
    public int numTrip;

    public Nave(String nomeNave, float velMedia, int numPass, int numTrip, float autoViagem) {
        this.nomeNave = nomeNave;
        this.velMedia = velMedia;
        this.numPass = numPass;
        this.numTrip = numTrip;
        this.autoViagem = autoViagem;
    }

    public String getNomeNave() {
        return nomeNave;
    }

    public float getVelMedia() {
        return velMedia;
    }

    public int getNumPass() {
        return numPass;
    }

    public int getNumTrip() {
        return numTrip;
    }

    public float getAutoViagem() {
        return autoViagem;
    }

    public void setNomeNave(String nomeNave) {
        this.nomeNave = nomeNave;
    }

    public void setVelMedia(float velMedia) {
        this.velMedia = velMedia;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public void setNumTrip(int numTrip) {
        this.numTrip = numTrip;
    }

    public void setAutoViagem(float autoViagem) {
        this.autoViagem = autoViagem;
    }
    public float autoViagem;
}
