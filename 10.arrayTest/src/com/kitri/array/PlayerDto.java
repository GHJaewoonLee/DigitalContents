package com.kitri.array;

// DTO : Data Transfer Object
// VO : Value Object
// Bean

// 일반적으로 DTO는 생성자가 없음
public class PlayerDto {

	private int number;		// 등번호
	private String name;	// 이름
	private int position;	// 1 ~ 9
	
	private double grade;	// 성적

	private String[] positionStr = {"지명타자", "투수", "포수", "1루수", "2루수", "3루수", "유격수", "좌익수", "중견수", "우익수"};
	private String[] gradeStr = {"타율", "방어율"};
	
	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "PlayerDto [등번호=" + number + ", \t선수명=" + name + ", \t포지션=" + positionStr[position] + ", \t" + ((position != 1) ? gradeStr[0] : gradeStr[1]) + "=" + grade + "]";
	}
}