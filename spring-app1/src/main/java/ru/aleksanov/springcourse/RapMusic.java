package ru.aleksanov.springcourse;



import org.springframework.stereotype.Component;
@Component
public class RapMusic implements Music{
    private String[] songs = {"Chingy - I Do", "Gorod pod podoshvoy", "A la conquete"};
    public String getSong() {
    	return "Genre : Rap \nPlaying: " + songs[randomSong.nextInt(3)];
    }
}
