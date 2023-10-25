package com.cjc.springcrud.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.springcrud.app.daoi.Adaoi;
import com.cjc.springcrud.app.model.CreateAccount;
import com.cjc.springcrud.app.servicei.Aservicei;

public class Aserviceimpl implements Aservicei {
	
	
	@Autowired
	Adaoi adi;

	@Override
	public CreateAccount savedd(CreateAccount c) {
		CreateAccount ac=adi.savedd(c);
		return ac;
		
	}

	@Override
	public CreateAccount singda(int accountno) {
		CreateAccount ca=adi.singda(accountno);
		return ca;
	}

	@Override
	public void deleteacc(int accountno) {
		adi.deleteacc(accountno);
		
	}

	@Override
	public CreateAccount withdrawal(int accountno, double ammount) {
		CreateAccount ca=adi.withdrawal(accountno,ammount);
		return ca;
	}

	@Override
	public CreateAccount depositee(int accountno, double ammount) {
		CreateAccount ca=adi.depositee(accountno,ammount);
		return ca;
	}

//	@Override
//	public void updatedata(int accountno) {
//		adi.updatedata(accountno);
//		
//	}

	@Override
	public CreateAccount displaydata(int accountno) {
		CreateAccount  ca = adi.displaydata(accountno);
		return ca;
	}

	@Override
	public CreateAccount editdata(int accountno) {
		CreateAccount ca=adi.editdata(accountno);
		return ca;
	}

	@Override
	public CreateAccount updatedata(CreateAccount c) {
		CreateAccount ca=	adi.updatedata(c);
		return ca;
	}

	

	



	

	
	

}
