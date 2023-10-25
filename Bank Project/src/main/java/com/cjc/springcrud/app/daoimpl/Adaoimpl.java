package com.cjc.springcrud.app.daoimpl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.springcrud.app.daoi.Adaoi;
import com.cjc.springcrud.app.model.CreateAccount;

public class Adaoimpl implements Adaoi {

	
	@Autowired
	SessionFactory sf;
	
	
	
	


	@Override
	public CreateAccount savedd(CreateAccount c) {
		
		
		Session ses=sf.openSession();
		ses.save(c);
		
		ses.beginTransaction().commit();
		return c;
		
	}




	@Override
	public CreateAccount singda(int accountno) {
		Session ses=sf.openSession();
		CreateAccount ca=ses.get(CreateAccount.class, accountno);
		return ca;
	}




	@Override
	public void deleteacc(int accountno) {
		Session ses=sf.openSession();
		Transaction tx = ses.beginTransaction();
		Query<CreateAccount> ca =ses.createQuery("delete from CreateAccount where accountno=?");
		ca.setParameter(0, accountno);
		ca.executeUpdate();
		tx.commit();
		
	}




	@Override
	public CreateAccount withdrawal(int accountno, double ammount) {
		
		Session ses=sf.openSession();
		Transaction tx= ses.beginTransaction();
		CreateAccount ca =ses.get(CreateAccount.class, accountno);
		double oldbalance=ca.getAmmount();
		
		double newbalance =oldbalance - ammount;
		ca.setAmmount(newbalance);
		ses.save(ca);
		tx.commit();
		return ca;
	}




	@Override
	public CreateAccount depositee(int accountno, double ammount) {
		Session ses=sf.openSession();
		CreateAccount ca=ses.get(CreateAccount.class, accountno);
		double oldamm=ca.getAmmount();
		
		double newammount=oldamm+ammount;
		
		ca.setAmmount(newammount);
		
		ses.save(ca);
		ses.beginTransaction().commit();
		return ca;
	}




//	@Override
//	public void updatedata(int accountno) {
//		// TODO Auto-generated method stub
//		
//	}




	@Override
	public CreateAccount displaydata(int accountno) {
		Session ses=sf.openSession();
		CreateAccount ca=ses.get(CreateAccount.class, accountno);
		return ca;
		
	}




	@Override
	public CreateAccount editdata(int accountno) {
		Session ses=sf.openSession();
	CreateAccount ca=	ses.get(CreateAccount.class, accountno);
		return ca;
	}




	@Override
	public CreateAccount updatedata(CreateAccount c) {
		Session ses=sf.openSession();
		ses.update(c);
		ses.beginTransaction().commit();
		return c;
	}




	




	




	

	
	
	
	
	

	

}
