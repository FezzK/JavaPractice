package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {
	public static void main(String[] args)
	{
	String imageUrl = "https://static.dimigo.in/img/logobeta.png";
	try {
		URL url=new URL(imageUrl);
		try(InputStream is=url.openStream();
				OutputStream os=new FileOutputStream("Files/dimilogo.jpg"))
				{
			int result;
			byte[] buf=new byte[100];
			while((result = is.read(buf))!=-1)
			{
				os.write(buf,0,result);
			}
			System.out.println("파일 생성 완료!");
				} catch(IOException e)
		{
					e.printStackTrace();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
