package com.techelevator.FIleSplitter;

import java.io.File;
import java.io.IOException;

import com.techelevator.FIleSplitter.file.FileProcessor;
import com.techelevator.FIleSplitter.userinput.Menu;

public class FileSplitterCLI {
	
	private Menu menu = new Menu();
	
	public void run() {
		
		// Get a File name from the user
		File inputFile = getFile();
		
		// Get the number lines to split on
		int lineCount = getLineCount();
		
		// Use something to Split the file
		FileProcessor processor = new FileProcessor();
		processor.split(inputFile, lineCount);
		try {
			processor.split(inputFile, lineCount);
		} catch (IOException e) {
			menu.displayMessageToUser("An Unexpected error occured");
			throw new RunTimeException(e);
		}
		
		
		
	}
	// TODO: Finish getting line count from user
	private int getLineCount() {
		return 300;
	}
	
	private File getFile() {
		File file = null;
		while(file == null) {
			String fileName = menu.getFileNamefromUser();
			file = new File(fileName);
			if (!file.exists() || !file.isFile()) {
				//Tell the user something
				menu.displayMessageToUser(file.getAbsolutePath() + " does not exist. Please try again.");
				file = null;
			}
		}
		return file;
	}
	
	public static void main(String[] args) {
		FileSplitterCLI fs = new FileSplitterCLI();
		fs.run();
		
	}

}
