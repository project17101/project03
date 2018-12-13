package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.MailManagerMapper;
import com.demo.model.Edu_emailsend_history;
import com.demo.service.interfaces.MailManagerService;

/**
 * @author ZHAIYIBAO
 *	邮件发送记录
 */
@Service
public class MailManagerServiceImpl implements MailManagerService {
	
	@Autowired
	MailManagerMapper mmm;

	/* (non-Javadoc)
	 * @see com.demo.service.interfaces.MailManagerService#findEMHAll(com.demo.model.Edu_emailsend_history)
	 * 邮件发送记录(带模糊查询)
	 */
	@Override
	public List<Edu_emailsend_history> findEMHAll(Edu_emailsend_history emh) {
		// TODO Auto-generated method stub
		return mmm.findEMHAll(emh);
	}

	@Override
	public void delMailById(Integer id) {
		// TODO Auto-generated method stub
		mmm.delMailById(id);
	}

	@Override
	public Edu_emailsend_history findEmailById(Integer id) {
		// TODO Auto-generated method stub
		return mmm.findEmailById(id);
	}

	@Override
	public void addEmail(Edu_emailsend_history eeh) {
		// TODO Auto-generated method stub
		mmm.addEmail(eeh);
	}

}
