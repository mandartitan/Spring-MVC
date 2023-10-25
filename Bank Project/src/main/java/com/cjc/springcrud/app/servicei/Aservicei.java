package com.cjc.springcrud.app.servicei;

import java.util.List;

import com.cjc.springcrud.app.model.CreateAccount;

public interface Aservicei {

	public CreateAccount savedd(CreateAccount c);

	public CreateAccount singda(int accountno);

	public void deleteacc(int accountno);

	public CreateAccount withdrawal(int accountno, double ammount);

	public CreateAccount depositee(int accountno, double ammount);

//	public void updatedata(int accountno);

	public CreateAccount displaydata(int accountno);

	public CreateAccount editdata(int accountno);

	public CreateAccount updatedata(CreateAccount c);
	


	

	

}
