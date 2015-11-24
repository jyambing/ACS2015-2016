package Tri1Project;

	import java.io.File;

	import javax.sound.sampled.AudioFileFormat;
	import javax.sound.sampled.AudioFormat;
	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.sound.sampled.DataLine;

	public class Music {
		File file;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
	public String pop(){
		String p= " YES! Pop!";
		try{ 
			file = new File("data/wmyb.wav");
			
			stream= AudioSystem.getAudioInputStream(file);
			format= stream.getFormat();
			info= new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally{
			//System.out.println("goodbye");
		}
		return p;		
	}
	public String instrumental(){
		String p= "YES! Classical!";
		try{ 
			file = new File("data/gameThrones.wav");
			
			stream= AudioSystem.getAudioInputStream(file);
			format= stream.getFormat();
			info= new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally{
			//System.out.println("goodbye"0;
		}
		return p;		
	}
	public String rap(){
		String p= "YES! Rap!";
		try{ 
			file = new File("data/sya.wav");
			
			stream= AudioSystem.getAudioInputStream(file);
			format= stream.getFormat();
			info= new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally{
			//System.out.println("goodbye");
		}
		return p;		
	}
	public String country(){
		String p= "Yes! Country!";
		try{ 
			file = new File("data/dirt.wav");
			
			stream= AudioSystem.getAudioInputStream(file);
			format= stream.getFormat();
			info= new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally{
			//System.out.println("goodbye");
		}
		return p;		
	}
	public String rock(){
		String p= "Yes! Rock!";
		try{ 
			file = new File("data/acdc.wav");
			
			stream= AudioSystem.getAudioInputStream(file);
			format= stream.getFormat();
			info= new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally{
			//System.out.println("goodbye");
		}
		return p;		
	}

	public String oldies(){
		String p= "Yes! Oldies!";
		try{ 
			file = new File("data/dsb.wav");
	
			stream= AudioSystem.getAudioInputStream(file);
			format= stream.getFormat();
			info= new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally{
			//System.out.println("goodbye");
		}
		return p;		
	}
	public String stop(){
		String p= "stop";
		
		clip.stop();
			clip.close();
			return p;
		}			
	}
