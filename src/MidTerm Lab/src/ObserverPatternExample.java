public class ObserverPatternExample {
    public static void main(String[] args) {
        LiveCricketMatch liveMatch = new LiveCricketMatch();

        MainScreen mainScreen = new MainScreen();
        MatchScreen matchScreen = new MatchScreen();

        liveMatch.addViewer(mainScreen);
        liveMatch.addViewer(matchScreen);
        // Starting match simulation after registering observers
        liveMatch.simulateMatch();
    }
}