import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSaving {
	private String _fileName;
	private Path _writer;
	private Reader _reader;
	
	public FileSaving() {
		this("cycle.csv");
	}
	
	public FileSaving(String filename) {
		_writer = Paths.get(filename);
	}
	
	public void save(String contents) {
		try {
			Files.writeString(_writer, contents, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	public String load() {
		String output = "";
		try {
			_reader = new FileReader(_fileName);
			int data = _reader.read();
			
			while (data != -1) {
				output = output + (char) data;
				data = _reader.read();
			}
			_reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output;
	}
}
