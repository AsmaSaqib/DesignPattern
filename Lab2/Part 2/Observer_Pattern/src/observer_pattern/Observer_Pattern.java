/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

/**
 *
 * @author sp20-bse-072
 */
public class Observer_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Text : ");
        EventSource eventSource = new EventSource();
        
        eventSource.addObserver(event -> System.out.println("Received response: " + event));

        eventSource.scanSystemIn();
    }
    
}
