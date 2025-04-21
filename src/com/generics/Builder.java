package com.generics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Builder {
public static void main(String[] args) {
	try {	BufferedWriter bw = new BufferedWriter(new FileWriter("index.html")) {
		bw.write("This is the first html file");
		bw.close();
		BufferedReader br = new BufferedReader("index.html");
		String line = br.readLine();
		line = br.readeLine();
		while (line != null) {
			System.out.println(li);
			line = br.readLine();
		}
		
	}catch(IOException){
		
	}

}
