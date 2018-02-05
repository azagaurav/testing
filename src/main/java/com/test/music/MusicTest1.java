/*
 * Created on 9 Apr, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.music;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
import javax.sound.midi.*;

public class MusicTest1 {
	public void play() throws MidiUnavailableException {
		Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("We got a sequencer");
	} // close play

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		try{
		mt.play();
		}catch (MidiUnavailableException e) {
			// TODO: handle exception
		}
	} // close main
} // close class
