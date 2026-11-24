/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity1gumera;

/**
 *
 * @author GUMERA_CPE113
 */
public class ACTIVITY1GUMERA {

  
    public static void main(String[] args) {
        

        // Create student accounts
        PRINTACC mia = new PRINTACC("Mia", 10);
        PRINTACC luis = new PRINTACC("Luis", -4);

        // Display starting credits
        System.out.println("Mia: " + mia.getCredits());
        System.out.println("Luis: " + luis.getCredits());

        // Mia prints 4 pages
        System.out.println("\nMia prints 4 pages: "
                + mia.printPages(4));
        System.out.println("Mia: "
                + mia.getCredits());

        // Mia tries to print 7 pages
        System.out.println("\nMia prints 7 pages: "
                + mia.printPages(7));
        System.out.println("Mia: "
                + mia.getCredits());

        // Mia tries to add -3 credits
        System.out.println("\nMia adds -3 credits: "
                + mia.addCredits(-3));
        System.out.println("Mia: "
                + mia.getCredits());

        // Mia adds 4 credits
        System.out.println("\nMia adds 4 credits: "
                + mia.addCredits(4));
        System.out.println("Mia: "
                + mia.getCredits());
    }
}

/* comments
"Act as my tutor step by step explanation, just give me hint in how to code it"
i accept the challange chatgpt give,the ai ask me write my code and then check it when I'm done. 
I reject the complete code that the ai provide
*/