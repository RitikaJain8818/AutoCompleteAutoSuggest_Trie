package com.codecool.javatries;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Path worldListPath = new File("assets/wordlist.txt").toPath();
        List<String> wordList = Files.readAllLines(worldListPath);

        AutoComplete ac = new AutoComplete();
        ac.addWord("test");
        for (String word : wordList) {
            ac.addWord(word);
        }
        List<String> results = ac.autoComplete("heaven");
        for(String str:results) {
        	System.out.println(str);
        }
        System.out.println("Results Done");
    }
}
