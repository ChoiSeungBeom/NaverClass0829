package bit701.day0906;

public class Ex5_ArrayMax {

	public static void main(String[] args) {
		int []data;
		data = new int[] {5,-100,67,89,45,-9,123,58,110,200};
		int MaxNum= data[0];
		int MinNum = data[0];
		int tmp=0;
		for(int i = 0; i<data.length;i++) {

			if(MaxNum < data[i]) {
				MaxNum = data[i];
			}
			if(MinNum > data[i]) {
				MinNum = data[i];
			}
		}
		System.out.println("최댓값은 : " + MaxNum);
		System.out.println("최솟값은 : " + MinNum);
	}
}
