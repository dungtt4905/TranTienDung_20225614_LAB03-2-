public class DigitalVideoDisc {
    private String id;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    // Constructors
    public DigitalVideoDisc(String id, String title, String category, String director, int length, double cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    // toString to display DVD information
    @Override
    public String toString() {
        return "DigitalVideoDisc [ID=" + id + ", Title=" + title + ", Category=" + category +
               ", Director=" + director + ", Length=" + length + " min, Cost=$" + cost + "]";
    }
}
