package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.PrintWriter;

import javax.sound.midi.VoiceStatus;

import org.junit.internal.Throwables;
import org.mockito.internal.stubbing.answers.ThrowsException;

public class SimpleWriterExample {

	public static void main(String[] args) throws FileNotFoundException {

		File ourFile = new File("numbers.txt");

		try (PrintWriter writer = new PrintWriter(ourFile)) {
			
			for (int i = 0 ; i <= 100 ; i++) {
				
				writer.println("Line " + i);
			}

		}

	}
}
