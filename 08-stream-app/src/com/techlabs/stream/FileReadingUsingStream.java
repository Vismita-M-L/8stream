package com.techlabs.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadingUsingStream {

	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("C:\\Users\\vismi\\OneDrive\\Documents\\Monocept\\FileReadingusingstream.txt"))
		.forEach((line)->System.out.println(line));
	}

}
