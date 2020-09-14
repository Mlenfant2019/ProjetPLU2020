/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;
import java.util.Random;

/**
 * J'ai essaye de representer les Maps comme des Arrays de Parcelle, cela n'a pas l'air de fonctionner.
 * Il doit y avoir des erreurs sur la syntaxe ou bien sur le principe.
 * @author maxim
 */
public class Map {
    private Parcelle[] Map;
    
    /**
     * Cree une Map de 4 parcelles aleatoires
     */    
    public Map creeMapAlea(){
        Parcelle[] map = new Parcelle[4];
        Random generateurAleatoire = new Random();
        for(int i=0; i<this.length; i++){
            map[i].setNumero(generateurAleatoire.nextInt(100));
            map[i].setProprietaire(;//a completer par la generation de String rand)
            map[i].setSurface(generateurAleatoire.nextInt(10000) / 100); //on peut faire varier les variables selon la precision souhaitee, ici on aura une valeur entre 0 et 100 au centimetre pres)
            map[i].setpConstructible(generateurAleatoire.nextInt(100));
        }
    }
    
    /**
     * Renvoie la surfaceTotale
     * @return float
     */    
    public float surfaceTotale(){
        float S = 0;
        for(int i=0; i<this.length; i++) {
            S = S + this[i].getSurface();
        }
        return S;
    }
    
    /**
     * Renvoie la surfaceTotaleConstructible
     * @return float
     */    
    public float surfaceTotaleConstructible(){
        float S = 0;
        for(int i=0; i<this.length; i++) {
            S = S + this[i].surfaceConstructible();
        }
        return S;
    }
    
    /**
     * Affiche les caracteristiques des Parcelles composant la Map
     */
    public void affiche(){
        for(int i=0; i<this.length; i++) {
            this[i].affiche;
        }
        return S;
    }
}
