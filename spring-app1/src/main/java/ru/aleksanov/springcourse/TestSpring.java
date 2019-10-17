package ru.aleksanov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
    	Computer computer = context.getBean("computer",Computer.class);
    	System.out.println(computer);
    	System.out.println(musicPlayer.getName()+" "+musicPlayer.getVolume());
    	
    	context.close();
    }
}
