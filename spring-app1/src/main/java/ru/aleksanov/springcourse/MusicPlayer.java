package ru.aleksanov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
    private Music music1;
    private Music music2;
    private Music music3;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic")Music music1,@Qualifier("rapMusic") Music music2,@Qualifier("classicalMusic") Music music3) {
    	this.music1 = music1;
    	this.music2 = music2;
    	this.music3 = music3;
    }
    public String playMusic(Genre genre) {
    	String genreName = genre.toString().charAt(0)+genre.toString().substring(1).toLowerCase();
    	if(music1.getClass().getSimpleName().startsWith(genreName)) return music1.getSong();
    	if(music2.getClass().getSimpleName().startsWith(genreName)) return music2.getSong();
    	if(music3.getClass().getSimpleName().startsWith(genreName)) return music3.getSong();
    	return null;
    }
    public String getName() {
    	return this.name;
    }
    public int getVolume() {
    	return this.volume;
    }
}
