package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
				
			/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		if (!map.containsKey(genre)) {
			map.put(genre, new HashSet<String>()); //makes key for this genre
		}
		map.get(genre).add(songTitle);
		
	}
	public String getGenreOfSong(String songTitle) {
		
		for (Map.Entry<String,Set<String>> x: map.entrySet()) {
			if (x.getValue().contains(songTitle)) {
				return x.getKey(); //returns the gnere 
			}
			
		}
		return null; 
		
		
		
		
		
}



}
