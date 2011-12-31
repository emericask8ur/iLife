/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ilife.sounds;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author beast
 */
public enum Sound {
    BURP("Burp.wav"),
    DOOR("Door.wav");
    
    private final String path;
    private AudioInputStream stream;
    private Sound(final String path) {
            this.path = path;
    }
    public AudioInputStream getStream() {
        if (this.stream == null) {
            try {
                this.stream = AudioSystem.getAudioInputStream(getClass().getResource("/ilife/sounds/" + this.path));
            } catch (UnsupportedAudioFileException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return this.stream;
    }
    
    public void play() {
        try {
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(this.getStream());
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
