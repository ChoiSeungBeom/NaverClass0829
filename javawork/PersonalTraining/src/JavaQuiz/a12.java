package JavaQuiz;

//3 6 9 게임(2)

import java.util.*;
public class a12{
	
	public static void main(String []args) {
		int []Fnum = new int[5];
		int []Lnum = new int[5];
		int count = 0;

		Scanner sc = new Scanner(System.in);
			
			while(true) {
				First:
				for(int i=0;i<Fnum.length;i++) {
						

						System.out.println((i+1) + "번째");
						System.out.print("첫번째 자리를 입력하세요 (0~9): ");
						Fnum[i] = sc.nextInt();

						System.out.print("두번째 자리를 입력하세요 (0~9): ");
						Lnum[i] = sc.nextInt();
						System.out.println("\n\n**************************");
						
						//입력한 첫번째 숫자, 두번째 숫자가 0~9가 아닐 시 다시 입력
						 if((Fnum[i]<0 || Fnum[i]>9) && (Lnum[i]<0 || Lnum[i]>9)) {
								System.err.println("\n0~9가 아닙니다. 다시 입력합시다");
								i--;
								break First;
							 }
						
						 
						 // 첫번째 숫자와 두번째 숫자가 둘 다 369일때 Count +2
						if((Fnum[i] == 3 || Fnum[i] == 6 || Fnum[i] == 9) && (Lnum[i] == 3 || Lnum[i] == 6 || Lnum[i] == 9)) {
							count = count + 2; 
						}
						
						// 첫번째 숫자와 두번째 숫자중 하나가 369일때 Count +1
						else if((Fnum[i] == 3 || Fnum[i] == 6 || Fnum[i] == 9) && (Lnum[i] != 3 || Lnum[i] != 6 || Lnum[i] != 9)) {
							count++;
						}
						
						// 첫번째 숫자와 두번째 숫자중 하나가 369일때 Count +1
						else if((Fnum[i] != 3 || Fnum[i] != 6 || Fnum[i] != 9) && (Lnum[i] == 3 || Lnum[i] == 6 || Lnum[i] == 9)) {
							count++;
						}
						
						// 첫번째 숫자와 두번째 숫자가 둘다 369가 아닐 때 Count +0
						else {
							System.out.println("count가 추가되지 않습니다!");
						}

						
						System.out.println("총 발생한 3,6,9는" + count + "번");
						System.out.println("\n");
						
						
						if(i==Fnum.length-1) {
							System.out.println("종료합니다. 수고하셨습니다!");
							continue;		
						}

					}
				
				break;
			}

	}



}