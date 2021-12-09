
 
/*import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
*/
import javax.swing.JOptionPane;//imports JOptionPane
import java.awt.Desktop;
import java.net.URI;
/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class Egg /*implements LineListener*/ {
	
	
	
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
    /**
     * this flag indicates whether the playback completes or not.
     */
	
	public void runfinal(){
		First F = new First();
		String t = in("Choose song\n" +
        		"a) Ten Thousand Stars   b) Lost one's weeping  c) Psychic Fire   d) Closer(ft. Chainsmokers)   e) Luka Luka Night Fever(Added by personal requests)\n" +
        		"(Internet connection is needed, audio will head to URL link on your browser\n" +
        		"This version 2 of the easter egg [FILL SIZE TOO BIG ON VERSION 1](If you want the version 1 of this easter egg, come see me)\n" +
        		"Have fun with this MP3 player Easter egg!");
		if(t.equals("a")){
    	if(Desktop.isDesktopSupported()){
    		try{
    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=6pfjwFAw3zk"));
    		}catch(Exception e){
    			msg("The link is not supported, or you do not have internet connection");
    			F.home1();
    		}
    	}
		}else if(t.equals("b")){
	    	if(Desktop.isDesktopSupported()){
	    		try{
	    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=nZHXSN6lEEw"));
	    		}catch(Exception e){
	    			msg("The link is not supported, or you do not have internet connection");
	    			F.home1();
	    		}
	    	}
			}else if(t.equals("c")){
				
				
		    	if(Desktop.isDesktopSupported()){
		    		try{
		    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=f9FZ__FdseI"));
		    		}catch(Exception e){
		    			msg("The link is not supported, or you do not have internet connection");
		    			F.home1();
		    		}
		    	}
				}else if(t.equals("d")){
					
					
			    	if(Desktop.isDesktopSupported()){
			    		try{
			    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=PT2_F-1esPk"));
			    		}catch(Exception e){
			    			msg("The link is not supported, or you do not have internet connection");
			    			F.home1();
			    		}
			    	}
					}else if(t.equals("e")){
						
						
				    	if(Desktop.isDesktopSupported()){
				    		try{
				    			Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=ScSW9C3DF18"));
				    		}catch(Exception e){
				    			msg("The link is not supported, or you do not have internet connection");
				    			F.home1();
				    		}
				    	}
						}else{
							msg("Nothing was chosen, heading back to the home menu");
							F.home1();
						}
        
        
    }
	/*
    boolean playCompleted;
    /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     *
    void play(String audioFilePath) {
    	int i = 0;
    	First F = new First();
        String t = in("Choose song\n" +
        		"a) Ten Thousand Stars   b) Lost one's weeping  c) Psychic Fire   d) Closer(ft. Chainsmokers)   e) Luka Luka Night Fever(Added by personal requests)\n" +
        		"(Do not play two songs at once - it is not recommended, but it is possible to play two songs at once)\n" +
        		"Have fun with this MP3 player Easter egg!");
        if(t.equals("a")){
        InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("TenThousandStars1.wav"));
        
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            
            audioClip.start();
            
            
            while (!playCompleted) {
                // wait for the playback completes
                try {
                    Thread.sleep(1000);
                    if(i == 0){
                    	i++;
                    String s = in("Do you want the music to stop? type [q] Do you want to go back to the Calculator? type [b]\n" +
                    		"This quit only appears once\n" +
                    		"If you want to keep playing until the end of the song press enter(You will exit the calculator)");
                    if(s.equals("q")){
                    	audioClip.stop();
                    	audioClip.close();
                    	F.home1();
                    	break;
                    }else if(s.equals("b")){
                    	F.home1();
                    }
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
            audioClip.close();
             
        } catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
         
        }else if(t.equals("b")){
                InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("LostOneWeeping.wav"));
                
                try {
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
         
                    AudioFormat format = audioStream.getFormat();
         
                    DataLine.Info info = new DataLine.Info(Clip.class, format);
         
                    Clip audioClip = AudioSystem.getClip();
         
                    audioClip.addLineListener(this);
         
                    audioClip.open(audioStream);
                    
                    
                    audioClip.start();
                    
                    
                    while (!playCompleted) {
                        // wait for the playback completes
                        try {
                            Thread.sleep(1000);
                            if(i == 0){
                            	i++;
                            String s = in("Do you want the music to stop? type [q] Do you want to go back to the Calculator? type [b]\n" +
                            		"This quit only appears once\n" +
                            		"If you want to keep playing until the end of the song press enter(You will exit the calculator)");
                            if(s.equals("q")){
                            	audioClip.stop();
                            	audioClip.close();
                            	F.home1();
                            	break;
                            }else if(s.equals("b")){
                            	F.home1();
                            }
                            }
                            	
                            
                            
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                     
                    audioClip.close();
                     
                } catch (UnsupportedAudioFileException ex) {
                	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
                    ex.printStackTrace();
                } catch (LineUnavailableException ex) {
                	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
                    ex.printStackTrace();
                } catch (IOException ex) {
                	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
                    ex.printStackTrace();
                }
        }else if(t.equals("c")){
            InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("PSYCHICFIRE.wav"));
            
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
     
                AudioFormat format = audioStream.getFormat();
     
                DataLine.Info info = new DataLine.Info(Clip.class, format);
     
                Clip audioClip = AudioSystem.getClip();
     
                audioClip.addLineListener(this);
     
                audioClip.open(audioStream);
                
                
                audioClip.start();
                
                
                while (!playCompleted) {
                    // wait for the playback completes
                    try {
                    	if(i == 0){
                        	i++;
                        String s = in("Do you want the music to stop? type [q] Do you want to go back to the Calculator? type [b]\n" +
                        		"This quit only appears once\n" +
                        		"If you want to keep playing until the end of the song press enter(You will exit the calculator)");
                        if(s.equals("q")){
                        	audioClip.stop();
                        	audioClip.close();
                        	F.home1();
                        	break;
                        }else if(s.equals("b")){
                        	F.home1();
                        }
                    	}
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                 
                audioClip.close();
                 
            } catch (UnsupportedAudioFileException ex) {
            	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
                ex.printStackTrace();
            } catch (LineUnavailableException ex) {
            	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
                ex.printStackTrace();
            } catch (IOException ex) {
            	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
                ex.printStackTrace();
            }
        }else if(t.equals("d")){
            InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("CloserChainsmokers.wav"));
            
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
     
                AudioFormat format = audioStream.getFormat();
     
                DataLine.Info info = new DataLine.Info(Clip.class, format);
     
                Clip audioClip = AudioSystem.getClip();
     
                audioClip.addLineListener(this);
     
                audioClip.open(audioStream);
                
                
                audioClip.start();
                
                while (!playCompleted) {
                    // wait for the playback completes
                    try {
                    	Thread.sleep(1000);
                    	if(i == 0){
                        	i++;
                        String s = in("Do you want the music to stop? type [q] Do you want to go back to the Calculator? type [b]\n" +
                        		"This quit only appears once\n" +
                        		"If you want to keep playing until the end of the song press enter(You will exit the calculator)");
                        if(s.equals("q")){
                        	audioClip.stop();
                        	audioClip.close();
                        	F.home1();
                        	break;
                        }else if(s.equals("b")){
                        	F.home1();
                        }
                    	}
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                 
                audioClip.close();
                
            }catch (UnsupportedAudioFileException ex) {
            	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
                ex.printStackTrace();
            } catch (LineUnavailableException ex) {
            	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
                ex.printStackTrace();
            } catch (IOException ex) {
            	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
                ex.printStackTrace();
            }
        }else if(t.equals("e")){
            InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("LukaLukaNightFever.wav"));
            
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
     
                AudioFormat format = audioStream.getFormat();
     
                DataLine.Info info = new DataLine.Info(Clip.class, format);
     
                Clip audioClip = AudioSystem.getClip();
     
                audioClip.addLineListener(this);
     
                audioClip.open(audioStream);
                
                
                audioClip.start();
                
                
                while (!playCompleted) {
                    // wait for the playback completes
                    try {
                        Thread.sleep(1000);
                        if(i == 0){
                        	i++;
                        String s = in("Do you want the music to stop? type [q] Do you want to go back to the Calculator? type [b]\n" +
                        		"This quit only appears once\n" +
                        		"If you want to keep playing until the end of the song press enter(You will exit the calculator)");
                        if(s.equals("q")){
                        	audioClip.stop();
                        	audioClip.close();
                        	F.home1();
                        	break;
                        }else if(s.equals("b")){
                        	F.home1();
                        }
                        }
                        	
                        
                        
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                 
                audioClip.close();
                 
            } catch (UnsupportedAudioFileException ex) {
            	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
                ex.printStackTrace();
            } catch (LineUnavailableException ex) {
            	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
                ex.printStackTrace();
            } catch (IOException ex) {
            	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
                ex.printStackTrace();
            }
    }
    }
    /**
     * Listens to the START and STOP events of the audio line.
     *
    //@Override
    
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        
        //if (type == LineEvent.Type.OPEN) {
        //    JOptionPane.showMessageDialog(null,"Playback started.");
             
        //} else if (type == LineEvent.Type.STOP) {
          //  playCompleted = true;
            //JOptionPane.showMessageDialog(null,"Playback completed.");
        //}
 
    }
 
    public void runfinal(){
    	JOptionPane.showMessageDialog(null, "Turn volume up,\n Song will play");
        String audioFilePath = "C:\\TenThousandStars1.wav";
        
        Egg player = new Egg();
        player.play(audioFilePath);
    }
    
 */
}