package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountWordsFromFile {

	public static void main(String[] args) throws IOException {
		System.out.print(countWords());

	}

	// Write a program that returns the count of each word in the file.
	public static String countWords() throws IOException {

		Path fileName = Paths.get("config/test.txt");

		String contents = new String(Files.readAllBytes(fileName));

		System.out.println("File Contents : " + contents);

		String[] words = contents.split("\\W+");
		int count = 0;
		for (String word : words) {
			count++;

		}

		return "Number of words in file: " + count;
	}

}
