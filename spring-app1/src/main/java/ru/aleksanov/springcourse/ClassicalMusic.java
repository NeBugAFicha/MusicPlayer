package ru.aleksanov.springcourse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;
@Component
public class ClassicalMusic implements Music{
	/*private ClassicalMusic() {}
	
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Doing my destruction");
	}*/
	private String[] songs = {"Hunagrian Rhapsody", "Shelkunchik", "Kakayata classica XD"};
    public String getSong() {
    	return "Genre : Classic \nPlaying: " + songs[randomSong.nextInt(3)];
    }
}
