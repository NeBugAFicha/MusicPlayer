package ru.aleksanov.springcourse;


import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private String[] songs = {"Vi Ka", "Ryganiye", "Duhast"};
    public String getSong() {
    	return "Genre : Rock \nPlaying: " + songs[randomSong.nextInt(3)];
    }
}
