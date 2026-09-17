package oop_projects;

import javax.swing.*;

public class EBook extends Book{
    private double fileSizeMb;

    public EBook(String isbn, String title, String author, double fileSizeMb){
        super(isbn, title, author);
        this.fileSizeMb = fileSizeMb;
    }
    public double getFileSizeMb() {
        return fileSizeMb;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + " [Format: EBook, Size: " + fileSizeMb + "MB]";
    }
}
