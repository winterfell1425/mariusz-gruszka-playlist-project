package com.playlist;

import java.util.ArrayList;
import java.util.Collections;

public class SubPlaylist {

    public ArrayList multiplyNestedPlaylist(ArrayList<String> listToPlay) {
        for (int n = 0; n < 1; n++) {
            listToPlay.addAll(listToPlay);
        }
        return new ArrayList();
    }

    public ArrayList shufflePlaylist(ArrayList<String> listToPlay) {
        Collections.shuffle(listToPlay);
        return new ArrayList();
    }
}
