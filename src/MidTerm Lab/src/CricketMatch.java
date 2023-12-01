abstract class CricketMatch {
    public abstract void addViewer(MatchViewer viewer);
    public abstract void removeViewer(MatchViewer viewer);
    public abstract void notifyViewers();
    public abstract void updateMatchStatus(String status);
}