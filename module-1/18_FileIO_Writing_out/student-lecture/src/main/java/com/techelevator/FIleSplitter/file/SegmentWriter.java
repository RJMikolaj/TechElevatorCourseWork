package com.techelevator.FIleSplitter.file;

import java.util.List;

public interface SegmentWriter {
	
	void write(List<String> lines, String filename, int segment);

}
