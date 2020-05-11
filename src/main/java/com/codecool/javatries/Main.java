package com.codecool.javatries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
        boolean flag=false;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String query=br.readLine();
        List<String> results = ac.autoComplete(query);
        if(results.size()!=0)
        	flag=true;
        for(String str:results) {
        	System.out.println(str);
        }
        if(flag==true) {
        	System.out.println("Results Done");
        }
        else {
        	char cc;
        	do {
            	System.out.print("Do you want to add this word to list(Y/N)?");
            	cc=br.readLine().charAt(0);
            	if(cc=='Y'||cc=='y') {
            		BufferedWriter out = new BufferedWriter( 
                            new FileWriter("assets/wordlist.txt",true));
            		  out.write("\r\n");
            		  out.write(query); 
            		  out.close();
            		  System.out.println("Word Added to WordList");
            		  return;
            	}else if(cc=='N'||cc=='n') {
            		return;
            	}else {
            		System.out.println("Incorrect Input");
            	}
        	}while(true);
        }	  
    }
}
