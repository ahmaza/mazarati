package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongTest {

	@DisplayName("Test cases for songs")
	@Test
	public void songTest() {
			
		SongDatabase db1 = new SongDatabase();
		db1.addSong("rap", "rapstar");
		db1.addSong("pop", "keys");
		db1.addSong("soul", "america");
				
		System.out.println("Genre of rapstar: " + db1.getGenreOfSong("rapstar"));
		System.out.println("Genre of keys: " + db1.getGenreOfSong("keys"));
		System.out.println("Genre of america: " + db1.getGenreOfSong("america"));
		
		
		
	}	
		
}


