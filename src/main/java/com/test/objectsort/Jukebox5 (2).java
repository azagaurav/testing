package com.test.objectsort;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
import java.util.*;
import java.io.*;
public class Jukebox5 {
ArrayList songList = new ArrayList();
public static void main(String[] args) {
new Jukebox5().go();
}
class ArtistCompare implements Comparator {
	public int compare(Object on, Object tw) {
		// TODO Auto-generated method stub
		Song one=(Song)on;
		Song two=(Song)tw;
		return one.getArtist().compareTo(two.getArtist());
	}

}
public void go() {
getSongs();
System.out.println("go"+songList);
Collections.sort(songList);
System.out.println("fri"+songList);
ArtistCompare artistCompare = new ArtistCompare();
Collections.sort(songList, artistCompare);
System.out.println(songList);
}
void getSongs() {
	try {
		File file = new File("SongList.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line= reader.readLine()) != null) {
			System.out.println("line "+line);
		addSong(line);
		}
		} catch(Exception ex) {
		ex.printStackTrace();
		}
}
void addSong(String lineToParse) {
	String[] tokens = lineToParse.split("/");
	Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
	songList.add(nextSong);
}
}