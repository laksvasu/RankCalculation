package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lakshmanrajvasudevan
 * This Class is used to calculate the rank of a student
 */
public class CalculateRank {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(67,"pooja",Arrays.asList(11,2,3,4)),
				new Student(87,"harish",Arrays.asList(111,12,3,34)),
				new Student(22,"raj",Arrays.asList(11,2,3,4))
				);
		Comparator<Student> comparatorObject = new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				return s2.getTotalMarks() - s1.getTotalMarks();
			}
		};
		Collections.sort(students, comparatorObject);
		Map<Integer, Integer> markRankMap= new HashMap<>();
		AtomicInteger rank = new AtomicInteger(1);
		for(Student student : students) {
			if(!markRankMap.containsKey(student.getTotalMarks())) {
				markRankMap.put(student.getTotalMarks(), rank.get());
				student.setRank(rank.get());
				rank.getAndIncrement();
			}else {
				student.setRank(markRankMap.get(student.getTotalMarks()));
			}
			System.out.println(student);
		}
	}

}
