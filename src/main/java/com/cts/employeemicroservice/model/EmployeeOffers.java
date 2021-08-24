package com.cts.employeemicroservice.model;

import java.time.LocalDate;
import java.util.HashSet;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeOffers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int offerId;
	private String offerName;
	private LocalDate postedDate;
	private LocalDate openedDate;
	private LocalDate closedDate;
	private LocalDate engagedDate;
	private int engagedEmpId;
	private int empId;
	private int likes;
	private HashSet<Integer> likedByEmployee = new HashSet<Integer>();
	private OfferCategory offerCategory;
}
