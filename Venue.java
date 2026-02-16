public class Venue {
    // Properties
    private String name;
    private String location;
    private int capacity;
    private String type; // e.g., "Concert", "Conference", etc.

    // Constructor
    public Venue(String name, String location, int capacity, String type) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.type = type;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Additional methods
    public String venueInfo() {
        return String.format("Venue: %s, Location: %s, Capacity: %d, Type: %s", name, location, capacity, type);
    }
}