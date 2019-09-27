package chapter18;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("");
		InputStreamReader is = new InputStreamReader(fis);
		BufferedReader brr = new BufferedReader(is);
		
		
		FileOutputStream fos = new FileOutputStream("");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		FileReader fr = new FileReader("");
		BufferedReader br = new BufferedReader(fr);
		
		
		
		
	}
}
