package bit701.day0913;
interface InterJobA{
	public void insertDb();
	public void deleteDb();
}

//interface간의 상속은 extends를 이용
interface InterJobB extends InterA{
	public void selectJob();
	public void updateJob();
}

class JobTwo implements InterJobB{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("JobTwo에서 학생 추가 DB작업");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("JobTwo에서 학생 제거 DB작업");
	}

	@Override
	public void selectJob() {
		// TODO Auto-generated method stub
		System.out.println("학생 정보 조회 DB작업 수행");
	}

	@Override
	public void updateJob() {
		// TODO Auto-generated method stub
		System.out.println("학생 정보 수정 하는 DB작업 수행");
	}
	
}
class JobOne implements InterJobA{

	@Override
	public void insertDb() {
		// TODO Auto-generated method stub
		System.out.println("학생 추가 DB작업을 수행함!");
	}

	@Override
	public void deleteDb() {
		// TODO Auto-generated method stub
		System.out.println("학생 제거 DB작업을 수행함!");
	}
	
}
public class Ex6_Interface {

	public static void main(String[] args) {
	InterJobA a=new JobOne();
	a.insertDb();
	a.deleteDb();
	System.out.println("--------------");
	
	InterJobB b=new JobTwo();
	b.selectJob();
	b.updateJob();
	}

}

