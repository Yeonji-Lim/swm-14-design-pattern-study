import java.util.ArrayList;
import java.util.List;

public class Sprint extends Story{
    private String sprintName;
    private double startPoints;
    private double usedPoints;
    private List<Story> stories = new ArrayList<>();

    public Sprint(String sprintName) {
        super(sprintName);
        this.sprintName = sprintName;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void addStory(Story story) {
        stories.add(story);
    }

    public void removeStory(Story story) {
        stories.remove(story);
    }

    @Override
    public double getStartPoints() {
        return stories.stream().mapToDouble(Story::getStartPoints).sum();
    }

    @Override
    public double getUsedPoints() {
        return stories.stream().mapToDouble(Story::getUsedPoints).sum();
    }

    public String status() {
        if (getStartPoints() > getUsedPoints()) {
            return "🔻";
        } else if (getStartPoints() == getUsedPoints()) {
            return "🔹";
        } else {
            return "🔺";
        }
    }

    public void printStories() {
        for (Story story : stories) {
            System.out.println("스토리 : " + story.getName() + " " + story.getUsedPoints() + "/" + story.getStartPoints() + " " + story.status());
            System.out.println("--> 이슈 목록");
            for (Ticket ticket : story.getTickets()) {
                System.out.println("    이슈 : " + ticket.getName());
            }
        }
    }

    public void printSprint() {
        System.out.println("스프린트 이름: [" + getSprintName() + "]");
        System.out.println("=======================");
        printStories();
        System.out.println("=======================");
        System.out.println("(소모 포인트/최초 추정치) = "
                + getUsedPoints() + "/" + getStartPoints() + " " + status());
    }

}
