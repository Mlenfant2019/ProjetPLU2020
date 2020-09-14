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
public class Point2D {
    private int x;
    private int y;
    
    /**
     * Créer un Point2D à partir de deux paramètres
     * @param x int
     * @param y int
     */
    public Point2D(int x,int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Créer un Point2D sans paramètre
     */
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Créer un Point2D à partir d’un autre Point2D : un constructeur de recopie
     * @param p Point2D
     */
    public Point2D(Point2D p){
        this.x = p.getX();
        this.y = p.getY();
    }

    /**
     * Renvoie l'abscisse d'un Point2D
     * @return int
     */
    public int getX(){
        return this.x;
    }

    /**
     * Renvoie l'ordonnee d'un Point2D
     * @return int
     */
    public int getY(){
        return this.y;
    }

    /**
     * Modifier l'abscisse d'un Point2D
     * @param x int
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Modifier l'ordonnee d'un Point2D
     * @param y int
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * Modifier les deux coordonnées d’un Point2D à la fois (changer X et Y en une seule méthode)
     * @param x int
     * @param y int
     */
    public void setPosition(int x,int y){
        this.x = x;
        this.y = y;
    }

    /**
     * « Translater » un Point2D : ajouter un incrément (positif ou négatif) à ses coordonnées
     * @param a int
     * @param b int
     */
    public void translate(int a,int b){
        this.x = this.getX() + a;
        this.y = this.getY() + b;
    }

    /**
     * Renvoyer un Point2D en mode textuel de la manière suivante : « [coordX ; coordY] » où coordX et coordY doivent correspondre aux attributs de l’objet
     * @return String
     */
    @Override
    public String toString(){
        return "[" + this.getX() + ";" + this.getY() + "]";
    }

    /**
     * Afficher cette chaine de caractères à l’écran
     */
    public void affiche(){
        System.out.println(this.toString());
    }
}