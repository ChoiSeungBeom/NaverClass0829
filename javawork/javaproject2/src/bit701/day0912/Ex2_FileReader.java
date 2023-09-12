package bit701.day0912;
import java.io.*;
public class Ex2_FileReader {
	static final String FILENAME="D:/naver0829/memo1.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr = new FileReader(FILENAME); //줄단위로 읽는 멤버메서드가 없다.그래서 2차 생성을 하겠다
			br = new BufferedReader(fr);
			
			//br.readLine() 한줄씩 읽음 --> 더 이상 읽을 내용 없을 경우 null 값 반환
			//대부분 파일에 몇줄이 저장되어있는지 모르므로 while문으로 readline 사용
			while(true) {
				//파일의 내용을 한줄씩 읽는다
				String line=br.readLine();
				//더 이상 읽을 내용이 없을경우 종료한다 while문을 종료한다.
				if(line==null) {
					break;
			
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			//해당 파일이 없을경우 예외가 발생하며 catch영역이 실행된다.
			System.out.println(e.getMessage()); //지정된 파일을 찾을 수 없습니다(message)
//			e.printStackTrace();
		}
		//열려있는 자원들을 닫는다(열려진 역순으로 닫는다)
		br.close();
		fr.close();
	}
	
}
