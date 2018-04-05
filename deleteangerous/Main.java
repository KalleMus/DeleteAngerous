/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package deleteangerous; //Kommentoin tämän pois jotta tänän ohjelman voisi avata komentoriviltä. -Kalle

import javax.swing.JOptionPane;

/**
 *
 * @author Kalle
 */
public class Main {

    public static void main(String[] args) {

        //Star generation
        StarTemp Sol = new StarTemp();
        StarTemp Maxima = new StarTemp();
        StarTemp Ales = new StarTemp();

        //Once the stars are generated are details are added later
        Sol.setStarDetails(0, "Sol", "white", "Maxima", "Ales", null, null, Maxima, Ales, null, null);
        Maxima.setStarDetails(1, "Maxima", "red", "Sol", "Ales", null, null, Sol, Ales, null, null);
        Ales.setStarDetails(2, "Ales", "blue", "Sol", "Maxima", null, null, Sol, Maxima, null, null);

        //Ship generation
        Ship myShip = new Ship("Sol",Sol);

        //Main loop
        while (true) {

            int input = 0;

            //Try/catch input style prevents crash when used invalid input.
            try {
                //Main page of ship controls
                input = Integer.parseInt(JOptionPane.showInputDialog("SHIP CONTROL " + myShip.getNAME() +  "\n"
                                                                        + "Fuel level: " + myShip.getFuel() + "\n"
                                                                        + "Your current location: " + myShip.getLocation() + "\n"
                                                                        + "1) Jump to a new star.\n"
                                                                        + "0) To quit"));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error! Invalid input.");
                continue;
            }

            switch (input) {
                //Goes to the "choose where to jump" page.
                case 1: myShip.shipLocation();
                        break;

                case 0: System.exit(0);
            }
        }
    }
}
