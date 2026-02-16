public class Admin {
    private Map<String, Boolean> venueStatus;

    public Admin() {
        venueStatus = new HashMap<>(); // Store venue names and their free/busy status
    }

    // Method to mark a venue as free
    public void markVenueAsFree(String venueName) {
        venueStatus.put(venueName, true);
        System.out.println(venueName + " is marked as free.");
    }

    // Method to mark a venue as busy
    public void markVenueAsBusy(String venueName) {
        venueStatus.put(venueName, false);
        System.out.println(venueName + " is marked as busy.");
    }

    // Method to get the status of a venue
    public boolean isVenueFree(String venueName) {
        return venueStatus.getOrDefault(venueName, false);
    }

    // Additional method to manage venue status directly
    public void setVenueStatus(String venueName, boolean isFree) {
        venueStatus.put(venueName, isFree);
        System.out.println("Status of " + venueName + " set to " + (isFree ? "free" : "busy") + ".");
    }
}