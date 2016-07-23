package com.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.model.regbean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class regaction extends ActionSupport implements ModelDriven<regbean> {
	private regbean bean;

	@Override
	public regbean getModel() {
		bean = new regbean();

		return bean;
	}

	public regbean getBean() {
		return bean;
	}

	public void setBean(regbean bean) {
		this.bean = bean;
	}

	@Override
	public String execute() throws Exception {

		SessionFactory sf = new AnnotationConfiguration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(bean);
		session.getTransaction().commit();
		session.close();
		return SUCCESS;
	}

}
