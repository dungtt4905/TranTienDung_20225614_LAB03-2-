
import java.util.ArrayList;

public class Store {
    // List to store DVDs available in the store
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" was not found in the store.");
        }
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("*********************STORE*********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                DigitalVideoDisc dvd = itemsInStore.get(i);
                System.out.println((i + 1) + ". " + dvd);
            }
        }
        System.out.println("************************************************");
    }
}
