package com.verzinen.jpa.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "student")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT e FROM Student e"),
    @NamedQuery(name = "Student.findById", query="SELECT c FROM Student c WHERE c.student_id =:student_id"),
    @NamedQuery(name = "Student.findByLastName", query="SELECT c FROM Student c WHERE c.lastName =:lastName "),
    @NamedQuery(name = "Student.findByFirstName", query="SELECT c FROM Student c WHERE c.firstName =:firstName "),
    @NamedQuery(name = "Student.findByMajor", query="SELECT c FROM Student c WHERE c.major =:major ")
})



public class Student implements Serializable {
	static final long serialVersionUID = 12345678989l;
/* 
 MariaDB [trainingDB]> desc student;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| student_id | int(11)     | YES  |     | NULL    |       |
| lastName   | varchar(20) | YES  |     | NULL    |       |
| firstName  | varchar(15) | YES  |     | NULL    |       |
| major      | varchar(20) | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+

*/
	@Id
	@GeneratedValue
	int student_id;
	String lastName;
	String firstName;
	String major;
	
	
	public Student() {
	
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public int getStudent_id() {
		return student_id;
	};
	
	
	
	
}
