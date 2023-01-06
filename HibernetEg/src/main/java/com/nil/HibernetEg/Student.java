package com.nil.HibernetEg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@ Entity - This annotation specifies that class is an entity
// @Table - this annotation specifies the tble in the database 
//with which this entity is maped 
//@ID this annotation specify the primary key of the entity
@Getter
@Setter
@Entity // marking thisd class as entity
// specifies the table name where data ofthe entity is to persisted
@Table(name = "Student_info")

public class Student {
	@Id // marks identifier of class
	private int stu_id;
	private String stu_FirstName, stu_LastName, stu_Email, stu_Add;
	private double stu_fee;
	private long stu_phone;

}
