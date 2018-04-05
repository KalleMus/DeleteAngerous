/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package deleteangerous;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author Kalle
 */
public class Ship {

    //Ship's info
    private final String NAME = "Python mkII";
    private String location;
    private StarTemp star;
    private int fuel = 100;
    private int oxygen = 100;
    private int hull = 100;

    //Ship's constructor
    Ship(String location, StarTemp star) {
        setLocation(location);
        setStar(star);
    }

    //Used when jumpingto a new star
    public void shipLocation() {
        StarTemp currentStar = getStar();
        String starChart = currentStar.starNeighbours();

        int starToJump = 0;

        try {
            starToJump = Integer.parseInt(JOptionPane.showInputDialog(starChart));
        } catch (Exception e) {

        }

        switch (starToJump) {

            //When a selection has made the ships fuel is first checked if the jump is possible and the player is informed about their fuel status.
            //If the jump is successfull the ships current location is set to the chosen star location.

            case 1: //First neighbour selected:

            if (currentStar.getN1() == null) { //Checking if the star exists.
                JOptionPane.showMessageDialog(null, "Error! Invalid selection.");
                break;
            }
            else {
                if (this.fuel >= 10) { //Checking if enough fuel for the jump.
                        StarTemp n1Star = currentStar.getStar1();
                        this.star = n1Star;
                        JOptionPane.showMessageDialog(null, "Jump succesfull");
                        this.fuel -= 10;
                        if (this.fuel == 0) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells depleted!");
                        }
                        else if (this.fuel <= 10) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells close to depletion!");
                        }
                        break;
                    }
                    else if (this.fuel < 10) {
                        JOptionPane.showMessageDialog(null, "Jump failed not enough fuel.");
                        break;
                    }
            }

            case 2: //Second neighbour selected:

            if (currentStar.getN2() == null) { //Checking if the star exists.
                JOptionPane.showMessageDialog(null, "Error! Invalid selection.");
                break;
            }
            else {
                if (this.fuel >= 10 && currentStar.getN2() != null) { //Checking if enough fuel for the jump.
                        StarTemp n2Star = currentStar.getStar2();
                        this.star = n2Star;
                        JOptionPane.showMessageDialog(null, "Jump succesfull");
                        this.fuel -= 10;
                        if (this.fuel == 0) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells depleted!");
                        }
                        else if (this.fuel <= 10) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells close to depletion!");
                        }
                        break;
                    }
                    else if (this.fuel < 10) {
                        JOptionPane.showMessageDialog(null, "Jump failed not enough fuel.");
                        break;
                    }
            }

            case 3: //Third neighbour selected:

            if (currentStar.getN3() == null) { //Checking if the star exists.
                JOptionPane.showMessageDialog(null, "Error! Invalid selection.");
                break;
            }
            else {
                if (this.fuel >= 10 && currentStar.getN3() != null) { //Checking if enough fuel for the jump.
                        StarTemp n3Star = currentStar.getStar3();
                        this.star = n3Star;
                        JOptionPane.showMessageDialog(null, "Jump succesfull");
                        this.fuel -= 10;
                        if (this.fuel == 0) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells depleted!");
                        }
                        else if (this.fuel <= 10) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells close to depletion!");
                        }
                        break;
                    }
                    else if (this.fuel < 10) {
                        JOptionPane.showMessageDialog(null, "Jump failed not enough fuel.");
                        break;
                    }
            }

            case 4: //Fourth neighbour selected:

            if (currentStar.getN4() == null) { //Checking if the star exists.
                JOptionPane.showMessageDialog(null, "Error! Invalid selection.");
                break;
            }
            else {
                if (this.fuel >= 10 && currentStar.getN4() != null) { //Checking if enough fuel for the jump.
                        StarTemp n4Star = currentStar.getStar4();
                        this.star = n4Star;
                        JOptionPane.showMessageDialog(null, "Jump succesfull");
                        this.fuel -= 10;
                        if (this.fuel == 0) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells depleted!");
                        }
                        else if (this.fuel <= 10) {
                            JOptionPane.showMessageDialog(null, "Warning fuel cells close to depletion!");
                        }
                        break;
                    }
                    else if (this.fuel < 10) {
                        JOptionPane.showMessageDialog(null, "Jump failed not enough fuel.");
                        break;
                    }
                }
            }
        }

    //Ship's variable setters and getters
    public String getNAME() {
        return NAME;
    }

    public void setStar(StarTemp star) {
        this.star = star;
    }

    public StarTemp getStar() {
        return star;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getOxygen() {
        return oxygen;
    }

    public void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }
}
