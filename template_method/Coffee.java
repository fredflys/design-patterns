package template_method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coffee extends CaffineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    // use the hook by providing a custom method
    @Override
    boolean condimentsRequested() {
        return askCustomer();
    }

    private boolean askCustomer() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } 

        return false;
    }
}
