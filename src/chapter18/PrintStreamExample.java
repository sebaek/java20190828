package chapter18;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("text.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("프린터가 출력하는 것처럼");
		ps.println("데이터 출력");
		
		ps.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다. 이름은 %2$s", new Date(), "홍길동");
		
		ps.println();
		ps.printf("숫자: %d", 123);
		ps.println();
		ps.printf("%6d", 123);
		
		System.out.printf("%-6d", 123);
		System.out.println();
		System.out.printf("%06d", 123);
		System.out.println();
		System.out.printf("%,d", 1232523523);

		ps.flush();
		ps.close();
		fos.close();
	}
}








