package stuinfo;

import java.sql.Timestamp;

public class StuinfoDto {
	private int num;
	private String name;
	private String subject;
	private int score;
	private Timestamp testdate;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Timestamp getTestdate() {
		return testdate;
	}
	public void setTestdate(Timestamp testdate) {
		this.testdate = testdate;
	}
}
