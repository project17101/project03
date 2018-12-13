package com.demo.mapper;

import java.util.List;

import com.demo.model.Edu_emailsend_history;

/**
 * @author ZHAIYIBAO
 *	邮件管理
 */
public interface MailManagerMapper {
	
	public List<Edu_emailsend_history> findEMHAll(Edu_emailsend_history emh);
	
	/**
	 * @param id
	 * 	根据id删除邮件（只有未发送的才能删除）
	 */
	public void delMailById(Integer id);
	
	/**
	 * @param id  邮件id
	 * @return
	 * 根据id查询邮件信息
	 */
	public Edu_emailsend_history findEmailById(Integer id);
	
	/**
	 * @param eeh
	 * 	添加邮件
	 */
	public void addEmail(Edu_emailsend_history eeh);

}
