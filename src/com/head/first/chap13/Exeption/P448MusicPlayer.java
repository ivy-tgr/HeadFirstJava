package com.head.first.chap13.Exeption;

import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;


public class P448MusicPlayer {
	public static void main(String[] args) {
		P448MusicPlayer mini = new P448MusicPlayer();
		mini.play1();
	}

	private void play1() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			Track track = seq.createTrack();
			
			ShortMessage msg1 = new ShortMessage();
			msg1.setMessage(144, 1, 44, 100);
			MidiEvent moteOn = new MidiEvent(msg1, 1);
			track.add(moteOn);
			
			ShortMessage msg2 = new ShortMessage();
			msg2.setMessage(NOTE_OFF, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(msg2, 16);
			track.add(noteOff);
			
			player.setSequence(seq);
			
			
			player.start();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
}
