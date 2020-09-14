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
public class main {
    public static void main(String[] args) {
        
        Point2D point = new Point2D();
        point.affiche();
        point.translate(1, -2);
        point.affiche();
        
        Parcelle parcelle = new Parcelle();
        parcelle.affiche();
        parcelle.setSurface(100);
        parcelle.setpConstructible(30);
        parcelle.affiche();
        System.out.println(parcelle.surfaceConstructible());
    }
}