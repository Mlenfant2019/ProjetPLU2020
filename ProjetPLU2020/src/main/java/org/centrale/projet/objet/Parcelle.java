/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author maxim
 */
public class Parcelle {
    private int numero;
    private String proprietaire;
    private float surface;
    private int pConstructible;
    
    /**
     * Creer une Parcelle sans parametres
     */
    public Parcelle(){
        this.numero = 0;
        this.proprietaire = "";
        this.surface = 0;
        this.pConstructible = 0;
    }
    
    /**
     * Creer une Parcelle a partir de ses 4 parametres
     * @param numero int
     * @param proprietaire String
     * @param surface float
     * @param pConstructible int
     */
    public Parcelle(int numero, String proprietaire, float surface, int pConstructible){
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.surface = surface;
        this.pConstructible = pConstructible;
    }
    
    /**
     * Creer une Parcelle a partir d'une autre parcelle (copie)
     * @param p Parcelle
     */
    public Parcelle(Parcelle p){
        this.numero = p.getNumero();
        this.proprietaire = p.getProprietaire();
        this.surface = p.getSurface();
        this.pConstructible = p.getpConstructible();
    }
    
    /**
     * Renvoie le numero de la Parcelle
     * @return int
     */
    public int getNumero(){
        return this.numero;
    }
    
    /**
     * Renvoie le proprietaire de la Parcelle
     * @return String
     */
    public String getProprietaire(){
        return this.proprietaire;
    }
    
    /**
     * Renvoie la surface de la Parcelle
     * @return float
     */
    public float getSurface(){
        return this.surface;
    }
    
    /**
     * Renvoie le pourcentage constructible de la Parcelle
     * @return int
     */
    public int getpConstructible(){
        return this.pConstructible;
    }
    
    /**
     * Modifier le numero de la Parcelle
     * @param numero int
     */
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    /**
     * Modifier le proprietaire de la Parcelle
     * @param proprietaire String
     */
    public void setProprietaire(String proprietaire){
        this.proprietaire = proprietaire;
    }
    
    /**
     * Modifier la surface de la Parcelle
     * @param surface float
     */
    public void setSurface(float surface){
        this.surface = surface;
    }
    
    /**
     * Modifier le pourcentage constructible de la Parcelle
     * @param pConstructible int
     */
    public void getpConstructible(int pConstructible){
        this.pConstructible = pConstructible;
    }
    
    /**
     * Renvoie la surface constructible de la Parcelle
     * @return float
     */
    public float surfaceConstructible(){
        return this.surface * pConstructible / 100;
    }
    
    /**
     * Renvoyer les caracteristiques de la Parcelle sous forme textuelle
     * @return String
     */
    @Override
    public String toString(){
        return "numero " + this.numero + ", proprietaire " + this.proprietaire + ", surface " + this.surface + ", pConstructible " + this.pConstructible;
    }
    
    /**
     * Affiche les caracteristiques de la Parcelle
     */    
    public void Affiche(){
        System.out.println(this.toString());
    }
}
