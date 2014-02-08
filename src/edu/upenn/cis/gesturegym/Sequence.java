package edu.upenn.cis.gesturegym;

public class Sequence {
	// TODO: won't be only taps
	private TapCue[] cues;
	
	// start times of each cue (probably in ms)
	private double[] startTimes;
	
	// end times of each cue (probably in ms)
	private double[] endTimes;
	
	// TODO: add more parameters
	public Sequence(TapCue[] cues, double duration, double timeBetweenCues) {
		this.cues = new TapCue[cues.length];
		startTimes = new double[cues.length];
		endTimes = new double[cues.length];
		
		for (int i = 0; i < cues.length; i++) {
			this.cues[i] = cues[i];
			
			if (i == 0)	startTimes[i] = 0;
			else        startTimes[i] = startTimes[i - 1] + timeBetweenCues;
			
			endTimes[i] = startTimes[i] + duration;
		}
	}
}
