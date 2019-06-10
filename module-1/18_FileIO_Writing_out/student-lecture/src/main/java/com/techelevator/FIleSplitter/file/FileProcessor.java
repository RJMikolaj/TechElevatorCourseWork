package com.techelevator.FIleSplitter.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

	public void split(File inputFile, int lineCount) throws FileNotFoundException {
		
		SegmentWriter segmentWriter = new TextSegmentWriter();

		try (Scanner fileScanner = new Scanner(inputFile)) {

			List<String> lines = new ArrayList<String>();
			int segment = 0;
			while (fileScanner.hasNextLine()) {

				int count = lineCount;
				while (count > 0 && fileScanner.hasNextLine()) {
					lines.add(fileScanner.nextLine());
					count--;

				}
				segment++;
				
				// Write the partial file
				segmentWriter.write(lines, inputFile.getName(), segment);
				lines = new ArrayList<String>();

				// Add lines to a list until lineCount
				// Then Print it
				// Then do it again
				// free shmurda
			}

		}

	}

}
