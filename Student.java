public class Student {
    private String name;
    private String email;
    private List<String> bookedVenues;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        this.bookedVenues = new ArrayList<>();
    }

    public void signUp() {
        // Implementation for signing up a student
        System.out.println(name + " has signed up with email: " + email);
    }

    public void bookVenue(String venue) {
        bookedVenues.add(venue);
        System.out.println(name + " has booked the venue: " + venue);
    }

    public void holdVenue(String venue, String timePeriod) {
        System.out.println(name + " is holding the venue: " + venue + " for the time period: " + timePeriod);
    }

    public List<String> getBookedVenues() {
        return bookedVenues;
    }
}