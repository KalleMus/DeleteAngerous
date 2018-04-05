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
        StarTemp Atok = new StarTemp();
        StarTemp Kriy = new StarTemp();
        StarTemp Giol = new StarTemp();
        StarTemp Tramois = new StarTemp();
        StarTemp Lah = new StarTemp();
        StarTemp Kuel = new StarTemp();
        StarTemp Ruan = new StarTemp();
        StarTemp Veprio = new StarTemp();
        StarTemp Evrae = new StarTemp();
        StarTemp Azon = new StarTemp();
        StarTemp Strope = new StarTemp();
        StarTemp Striptuar = new StarTemp();
        StarTemp Adeotre = new StarTemp();
        StarTemp Keleth = new StarTemp();
        StarTemp Bota = new StarTemp();
        StarTemp Thiol = new StarTemp();
        StarTemp Saren = new StarTemp();
        StarTemp Kadi = new StarTemp();
        StarTemp Kro = new StarTemp();
        StarTemp Koh = new StarTemp();
        StarTemp Xos = new StarTemp();
        StarTemp Eura = new StarTemp();
        StarTemp Fleok = new StarTemp();
        StarTemp Pheur = new StarTemp();
        StarTemp Avlian = new StarTemp();
        StarTemp Ikum = new StarTemp();
        StarTemp Peode = new StarTemp();
        StarTemp Oxuatri = new StarTemp();
        StarTemp Xaar = new StarTemp();

        //Once the stars are generated are details are added later
        Sol.setStarDetails(0, "Sol", "white", "Maxima", "Ales", null, null, Maxima, Ales, null, null);
        Maxima.setStarDetails(1, "Maxima", "red", "Sol", "Ales", "Atok", null, Sol, Ales, Atok, null);
        Ales.setStarDetails(2, "Ales", "blue", "Sol", "Maxima", "Kriy", null, Sol, Maxima, Kriy, null);
        Atok.setStarDetails(3, "Atok", "blue", "Maxima", "Kriy", "Giol", "Tramois", Maxima, Kriy, Giol, Tramois);
        Kriy.setStarDetails(4, "Kriy", "blue", "Ales", "Atok", "Giol", null, Ales, Atok, Giol, null);

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
                                                                        + "Your current location: " + myShip.currentStarName()  + "\n"
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
