package oop_projects;

public interface Borrowable {
    void borrowItem(String memberName);
    void returnItem();
    default void printDueDate(int daysFromNow){
        System.out.println("Item is due in " + daysFromNow + " days from checkout.");
    }
}
