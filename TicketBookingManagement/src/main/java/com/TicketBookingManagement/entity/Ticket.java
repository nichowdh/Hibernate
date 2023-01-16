package com.TicketBookingManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ticket_management")
public class Ticket {

	@Id
	@Column(length = 15, nullable = false)
	private String fname;

	@Column(length = 15, nullable = false)
	private String lname;

	@Column(length = 15, nullable = false)
	private String state;

	@Column(length = 20, nullable = false)
	private String booking_date;

	@Column(length = 12, nullable = false)
	private long phone;

	@Column(length = 20, nullable = false)
	private String train;

	@Column(length = 20, nullable = false)
	private String s_point;

	@Column(length = 20, nullable = false)
	private String e_point;

}
