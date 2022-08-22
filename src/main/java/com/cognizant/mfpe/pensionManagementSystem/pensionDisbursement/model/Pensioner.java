package com.cognizant.mfpe.pensionManagementSystem.pensionDisbursement.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@ApiModel(description = "Details about the pensioner")
public class Pensioner {
	// Pensioner name
	private String name;
	// Pensioner Date Of Birth
	private Date dateOfBirth;
	// Pensioner PAN Number
	private String panNumber;
	// Pensioner Salary
	private Double salary;
	// Pensioner Allowances
	private Double allowances;
	// Pensioner Pension Type
	private String typeOfPension;
	// Pensioner Aadhaar Number
	private Long aadhaarNumber;
	// Pensioner Bank Name
	private String bankName;
	// Pensioner Bank Account Number
	private Long accountNumber;
	// Pensioner Bank service Charge
	private Double bankServiceCharge;
	// Pensioner Pension Amount
	private Double pensionAmount;

}
