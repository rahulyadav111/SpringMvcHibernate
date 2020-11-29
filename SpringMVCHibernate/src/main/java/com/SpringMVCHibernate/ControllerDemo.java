package com.SpringMVCHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.DispatcherServlet;

import model.Student;

@Controller 
public class ControllerDemo 
{
	//InternalResourceViewResolver obj=
	//DispatcherServlet obj=
	@RequestMapping("/register")
	public String view(Model m)
	{
		m.addAttribute("bean", new Student());
		return "register";
	}
	@RequestMapping(value="/stor",method=RequestMethod.POST)
	public String view2(@ModelAttribute("bean") Student s)
	{
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session  session =factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(s);
		t.commit();
		return "display";
	}
	@RequestMapping("/display1")
	public String display(Model m)
	{
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		List list=session.createQuery("from Student").list();
		m.addAttribute("data", list);
		return "display1";
	}
	@RequestMapping(value="/update", method=RequestMethod.POST )
	public String update(@ModelAttribute ("bean")Student s)
	{
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory  factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction(); 
		Student obj=session.get(Student.class, s.getRoll());
		obj.setName(s.getName());
		obj.setCourse(s.getCourse());
		session.update(obj);
		t.commit();
		return "update";
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST )
	public String delete(@ModelAttribute ("bean")Student s)
	{
		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory  factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction(); 
		Student obj=session.get(Student.class, s.getRoll());
		session.delete(obj);
		t.commit();
		return "delete";
	}
	

}
