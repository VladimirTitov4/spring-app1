package ru.titov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private MusicType type;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
        type = MusicType.ROCK;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic(type);
    }
}
