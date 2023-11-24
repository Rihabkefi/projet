/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */

public class AppelMethod {

    public void method1() {
        try {
            this.method2();
        } catch (StackOverflowError e) {
            System.err.println("Erreur : Dépassement de la pile (Stack Overflow).");
        }
    }

    public void method2() {
        this.method1();
    }

    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();
        appel.method1();
    }
}
