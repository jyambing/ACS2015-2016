package magPieLabs;

import java.io.File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Sound {
public String pop(){
	String p= " YES! Pop!";
	try{ 
		File file = new File("data/wmyb.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
		
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
public String classical(){
	String p= "YES! Classical!";
	try{ 
		File file = new File("data/gameThrones.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
		
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
		File file = new File("data/sya.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
		
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
public String country(){
	String p= "Yes! Country!";
	try{ 
		File file = new File("data/dirt.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
		
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
public String rock(){
	String p= "Yes! Rock!";
	try{ 
		File file = new File("data/acdc.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
		
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

public String oldies(){
	String p= "Yes! Oldies!";
	try{ 
		File file = new File("data/dsb.wav");
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		Clip clip;
		
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
}
