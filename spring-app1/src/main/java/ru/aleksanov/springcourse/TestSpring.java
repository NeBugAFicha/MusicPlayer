package ru.aleksanov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	/*Music music = context.getBean("rockMusic", Music.class);
    	
    	MusicPlayer musicPlayer = new MusicPlayer(music);
    	
    	musicPlayer.playMusic();
    	
        Music music1 = context.getBean("classicalMusic", Music.class);
    	
    	MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);
    	
    	classicalMusicPlayer.playMusic();
    	
        Music music2  = context.getBean("rapMusic", Music.class);
    	
    	MusicPlayer rapMusicPlayer = new MusicPlayer(music2);
    	
    	rapMusicPlayer.playMusic();*/
    	MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
    	//musicPlayer.playMusic();
    	Computer computer = context.getBean("computer",Computer.class);
    	System.out.println(computer);
    	System.out.println(musicPlayer.getName()+" "+musicPlayer.getVolume());
    	//ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
    	
    	context.close();
    }
}
