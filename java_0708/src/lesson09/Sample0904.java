package lesson09;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0904 {

	public static void main(String[] args) throws IOException{
		System.out.println("いくつを出力しますか？");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		int num = Integer.parseInt(str);
		
				for (int i=1; i <= num; i++) {
						System.out.print("* ");
						if(i%10 == 0) {
							System.out.println("\n");
						}
			 }
	     }
	}

