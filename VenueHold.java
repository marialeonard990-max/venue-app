import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VenueHold {
    private String venue_id;
    private LocalDateTime expirationTimestamp;

    public VenueHold(String venue_id, int hours) {
        this.venue_id = venue_id;
        this.expirationTimestamp = LocalDateTime.now().plusHours(hours);
    }

    public String getVenueId() {
        return venue_id;
    }

    public LocalDateTime getExpirationTimestamp() {
        return expirationTimestamp;
    }

    public String getFormattedExpiration() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return expirationTimestamp.format(formatter);
    }

    @Override
    public String toString() {
        return "VenueHold{venue_id='" + venue_id + '\'' + ", expirationTimestamp=" + getFormattedExpiration() + '}';
    }
}