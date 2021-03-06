package com.revature.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDriver {

	public static void main(String[] args) {
		
		String path = "src/com/revature/io/write_data.txt";
		
		
		// because FileWriter and BufferedWriter implement Autocloseable we can include them try-with-resources
		// which is nice because closing them throw an exception itself
		try (FileWriter fw = new FileWriter(path, true);
				BufferedWriter bw = new BufferedWriter(fw)) {

			bw.append("\nHello World again");
			System.out.println("Our file has been written to");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
