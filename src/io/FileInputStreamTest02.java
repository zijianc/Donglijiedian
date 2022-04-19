package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		// 循环方式
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\administered\\Desktop\\week1.txt");
//			int readData = 0;
//			while ((readData = fis.read()) != -1) {
//
//				System.out.println(readData);
//
//			}
			byte[] bytes=new byte[fis.available()];
			int readcount=fis.read(bytes);
			System.out.println(new String(bytes));



		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
