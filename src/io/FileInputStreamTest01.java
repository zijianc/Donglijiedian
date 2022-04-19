package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
	// inputstream outputstream 字节流（万能流）
	// reader writer 字符流(只能读文本)
	//

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/io/temp.text");
			int num = fis.read();
			System.out.println(num);
			// 如果读完最后一个字节，返回-1

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
