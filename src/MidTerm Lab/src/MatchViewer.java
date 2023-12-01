abstract class MatchViewer {
    public abstract void update(String matchStatus);
}

// Concrete observers
class MainScreen extends MatchViewer {
    @Override
    public void update(String matchStatus) {
        System.out.println("Main Screen: Updated match status - " + matchStatus);
    }
}

class MatchScreen extends MatchViewer {
    @Override
    public void update(String matchStatus) {
        System.out.println("Match Screen: Updated match status - " + matchStatus);
    }
}