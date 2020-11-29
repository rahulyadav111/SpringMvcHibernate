package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;


@Entity
@Table(name="student9")
public class Student
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll",length=20)
	private int roll;
	@Column(name="sname",length=20)
	private String name;
	@Column(name="course",length=20)
	private String course;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

}
