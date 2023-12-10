/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.state.mediaplayerr;

import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */

public class TrackIterator {
    private List<String> playlist;
    private int currentTrack;

    public TrackIterator(List<String> playlist) {
        this.playlist = playlist;
        this.currentTrack = 0;
    }

    public String getCurrentTrack() {
        return playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return getCurrentTrack();
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return getCurrentTrack();
    }

    public void reset() {
        currentTrack = 0;
    }
}


