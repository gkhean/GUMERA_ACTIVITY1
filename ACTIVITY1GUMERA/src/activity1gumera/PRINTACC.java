/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity1gumera;

/**
 *
 * @author GUMERA_CPE113
 */

        public class PRINTACC {

    // Fields
    String studentName;
    int credits;

    // Constructor
    public PRINTACC(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    // Method to add credits
    public boolean addCredits(int amount) {
        if (amount > 0) {
            credits = credits + amount;
            return true;
        } else {
            return false;
        }
    }

    // Method to print pages
    public boolean printPages(int pages) {
        if (pages > 0 && credits >= pages) {
            credits = credits - pages;
            return true;
        } else {
            return false;
        }
    }

    // Method to get current credits
    public int getCredits() {
        return credits;
    }
}

