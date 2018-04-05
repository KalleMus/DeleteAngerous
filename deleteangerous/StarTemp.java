/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package deleteangerous;

import javax.swing.JOptionPane;

/**
 *
 * @author Kalle
 */
public class StarTemp {

    //Star's details
    private int id;
    private String name;
    private String color;

    //Star's neighbours names in string
    private String n1;
    private String n2;
    private String n3;
    private String n4;

    //Star's neighbours as objects
    private StarTemp star1;
    private StarTemp star2;
    private StarTemp star3;
    private StarTemp star4;

    //Star's neighbours getter
    public String starNeighbours() {

        String starNeighbours =   "Current location: " + this.name + "\n"
                                + "Neighbouring stars:\n"
                                + "1)" + this.n1 + "\n"
                                + "2)" + this.n2 + "\n"
                                + "3)" + this.n3 + "\n"
                                + "4)" + this.n4;

        return starNeighbours;
    }

    //Star's default constructor
    StarTemp() {

    }

    //Star's detail setter
    public void setStarDetails(int id, String name, String color, String n1, String n2, String n3, String n4, StarTemp star1, StarTemp star2, StarTemp star3, StarTemp star4) {

        this.id = id;
        this.name = name;
        this.color = color;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.star1 = star1;
        this.star2 = star2;
        this.star3 = star3;
        this.star4 = star4;
    }

    public String getN1() {
        return n1;
    }

    public String getN2() {
        return n2;
    }

    public String getN3() {
        return n3;
    }

    public String getN4() {
        return n4;
    }

    public StarTemp getStar1() {
        return star1;
    }

    public StarTemp getStar2() {
        return star2;
    }

    public StarTemp getStar3() {
        return star3;
    }

    public StarTemp getStar4() {
        return star4;
    }

}
