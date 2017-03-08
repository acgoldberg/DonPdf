package ak.ac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class TestPdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//	缓冲流读取
			URL  url = new URL("http://www.madore.org/~david/math/padics.pdf");
			URLConnection con = url.openConnection();
				
			InputStream is = con.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
					
			FileOutputStream fos = new FileOutputStream("12.pdf");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] a =  new byte[20];
			while(bis.read(a)!=-1){
				bos.write(a);
			}
			bos.close();
			bis.close();
			fos.close();
			is.close();
			
			
			/*URL  url = new URL("http://www.madore.org/~david/math/padics.pdf");
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();
			
			FileOutputStream fos = new FileOutputStream("a1.pdf");
			//OutputStream os = new OutputStream();
			byte[] input = new byte[50];
			while(is.read(input)!=-1){
				fos.write(input);
			}
			fos.close();
			is.close();*/
			//FileInputStream fis = new FileInputStream("http://www.madore.org/~david/math/padics.pdf");
			//InputStreamReader is = new InputStreamReader(fis); 字符与字节的brige
			//BufferedReader br = new BufferedReader(is);
			
			
			/*
			FileOutputStream fos = new FileOutputStream("aa.pdf");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			String line;
			while((line=br.readLine())!=null){
				bw.write(line);
			}*/

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
