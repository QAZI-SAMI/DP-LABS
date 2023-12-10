/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.state.mediaplayerr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Player {
    private State state;
    private boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
    private TrackIterator trackIterator;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        this.trackIterator = new TrackIterator(playlist);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + trackIterator.getCurrentTrack();
//        return "Playing " + trackIterator.get(currentTrack);
    }

    public String nextTrack() {
        String track = trackIterator.nextTrack();
        checkForTrackDamage(track);
        return "Playing " + track;
//        currentTrack++;
//        if (currentTrack > playlist.size() - 1) {
//            currentTrack = 0;
//        }
//        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        String track = trackIterator.previousTrack();
        checkForTrackDamage(track);
        return "Playing " + track;
//        currentTrack--;
//        if (currentTrack < 0) {
//            currentTrack = playlist.size() - 1;
//        }
//        return "Playing " + playlist.get(currentTrack);
    }
    
    private void checkForTrackDamage(String track) {
        if (track.equals("Track 5") && playing) {
            // Simulating a delay of 3 seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stopPlayback();
            // Alert user to reset the player
            System.out.println("Player is damaged. Please reset.");
        }
    }
    
    public void stopPlayback() {
        setPlaying(false);
        trackIterator.reset();
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
