package com.hype.stockz.daoimpl;


import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hype.stockz.dao.UserDAO;
import com.hype.stockz.model.User;

@Repository(value = "userDAO")
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private SessionFactory SessionFactory;

	@Override
	public boolean saveUser(User user) {
		SessionFactory.getCurrentSession().save(user);
		return true;
	}
}