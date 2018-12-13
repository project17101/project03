package com.demo.service.interfaces;

import java.util.List;

import com.demo.model.Edu_emailsend_history;

public interface MailManagerService {
	
	public List<Edu_emailsend_history> findEMHAll(Edu_emailsend_history emh);
	
	public void delMailById(Integer id);
	
	public Edu_emailsend_history findEmailById(Integer id);
	
	public void addEmail(Edu_emailsend_history eeh);

}
