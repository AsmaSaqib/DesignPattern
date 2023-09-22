/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author sp20-bse-072
 */
public class EventSource {
    List<Observer> observers = new ArrayList<>();
  
   public void notifyObservers(String event) {
        observers.forEach(observer -> observer.Update(event));
    }
  
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
  
    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            notifyObservers(line);
        }
    }
}
