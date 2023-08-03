import java.util.ArrayList;
import java.util.List;

public class Story extends Ticket {
    private List<Ticket> tickets = new ArrayList<>();
    private double startPoints;
    private double usedPoints;
    private final String name;

    public Story(String storyName) {
        this.name = storyName;
    }

    public String getName() {
        return name;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    @Override
    public double getStartPoints() {
        return tickets.stream().mapToDouble(Ticket::getStartPoints).sum();
    }

    @Override
    public double getUsedPoints() {
        return tickets.stream().mapToDouble(Ticket::getUsedPoints).sum();
    }

    public String status() {
        if (startPoints > getUsedPoints()) {
            return "🔻";
        } else if (startPoints == getUsedPoints()) {
            return "🔹";
        } else {
            return "🔺";
        }
    }
}
