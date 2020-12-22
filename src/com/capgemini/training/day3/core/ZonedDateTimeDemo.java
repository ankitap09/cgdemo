package com.capgemini.training.day3.core;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India:"+ currentTime);
		System.out.println("Paris:"+ currentTimeInParis);
		System.out.println("New York:"+ currentTimeInNewYork);
		
		/*public class ZonedDateTimeDemo {

 

    public static void main(String[] args) {
        
        ZonedDateTime currentTime = ZonedDateTime.now();
        ZonedDateTime currentTimeInParis = 
                ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime currentTimeInNewYork = 
                currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("India:"+ currentTime);
        System.out.println("Paris:"+ currentTimeInParis);
        System.out.println("New York:"+ currentTimeInNewYork);
        ZonedDateTime currentTimeInNY = 
                ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York:"+ currentTimeInNY);
        
        
    }*/
		
		
	}
}