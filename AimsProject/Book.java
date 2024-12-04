package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();

    // Constructor
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost); // Sử dụng constructor của lớp cha Media
    }

    // Getter for authors
    public ArrayList<String> getAuthors() {
        return authors;
    }

    // Methods for managing authors
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }

    // Optional: Override toString() for better display
    @Override
    public String toString() {
        return "Book [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + 
               ", cost=" + getCost() + ", authors=" + authors + "]";
    }
}
