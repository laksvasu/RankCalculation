package main.java;
import java.util.List;

/**
 * @author lakshmanrajvasudevan
 * This is a student pojo class
 */
public class Student {
	private int id;
	private String name;
	private List<Integer> marks;
	private int totalMarks;
	private int rank;
	public Student(int id, String name,List<Integer> marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public int getTotalMarks() {
		totalMarks = marks.stream().mapToInt(Integer :: intValue).sum();
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", totalMarks=" + totalMarks + ", rank="
				+ rank + "]";
	}
}
