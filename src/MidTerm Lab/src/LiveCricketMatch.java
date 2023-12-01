import java.util.ArrayList;
import java.util.List;

class LiveCricketMatch extends CricketMatch {
    private List<MatchViewer> viewers;
    private String matchStatus;

    public LiveCricketMatch() {
        viewers = new ArrayList<>();
    }

    @Override
    public void addViewer(MatchViewer viewer) {
        viewers.add(viewer);
    }

    @Override
    public void removeViewer(MatchViewer viewer) {
        viewers.remove(viewer);
    }

    @Override
    public void notifyViewers() {
        for (MatchViewer viewer : viewers) {
            viewer.update(matchStatus);
        }
    }

    @Override
    public void updateMatchStatus(String status) {
        this.matchStatus = status;
        notifyViewers();
    }

    // Simulating live match updates
    public void simulateMatch() {
        // Simulated ball-by-ball status
        String[] statuses = {"Score: 10/0", "Score: 20/0", "Score: 35/1", "Score: 50/1", "Score: 65/2"};

        for (String status : statuses) {
            updateMatchStatus(status);
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}