/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class SuperHotel {
    static int x[];

    public void reserver() {
        try {
            x[0] = 1;
        } catch (NullPointerException e) {
            System.err.println("Erreur : Le tableau n'est pas initialisé.");
        }
    }

    public static void main(String args[]) {
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}
