package com.cognizant.mfpe.pensionManagementSystem.pensionDisbursement.model;

 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
	// User Id
	private String uid;
	//Username
	private String name;
	//Is Token valid
	private boolean isValid;
}
