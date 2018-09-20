package com.javatech.jthibernate.controller;

import java.util.List;
import java.util.Set;

import org.apache.log4j.pattern.IntegerPatternConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javatech.jthibernate.dao.CompanyDao;
import com.javatech.jthibernate.dao.EmployeeDAO;
import com.javatech.jthibernate.entity.Company;
import com.javatech.jthibernate.entity.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empDao;
	
	@Autowired
	CompanyDao companyDao;

//	@RequestMapping(value="admin/deleteEmp", method=RequestMethod.GET)
//	public ModelAndView deleteEmployee(String id)
//	{
//		int idEmp=Integer.parseInt(id);
//		empDao.delete(idEmp);
//		return new ModelAndView("redirect:/admin/listEmp");
//	}
	
//	@RequestMapping(value="admin/deleteCom", method=RequestMethod.GET)
//	public ModelAndView deleteCompany(String id)
//	{
//		int comid=Integer.parseInt(id);
//		Company com=companyDao.getById(comid);
//		if(com!=null)
//		{
//			Set<Employee> ls=com.getLsEmp(); 
//			empDao.delete();
//			companyDao.delete(com);
//		}
//		return new ModelAndView("redirect:/admin/listEmp");
//	}
	
	@RequestMapping(value="admin/listEmp", method=RequestMethod.GET)
	
	public ModelAndView getAllEmployeeAdmin(ModelMap model)
	{
		List<Employee> ls=empDao.list();
		List<Company> lsCompany=companyDao.list();
		ModelAndView modelView=new ModelAndView("admin/emplist");
		modelView.addObject("list",ls);
		modelView.addObject("listCom",lsCompany);
		return modelView;
	}
	
//	@RequestMapping(value="admin/addEmp", method=RequestMethod.POST)
//	public ModelAndView addEmployee(String name, String email, String companyid)
//	{
//		int comid=Integer.parseInt(companyid);
//		Company com=companyDao.getById(comid);
//		if(com!=null)
//		{
//			Employee emp=new Employee();
//			emp.setName(name);
//			emp.setEmail(email);
//			emp.setCompany(com);
//			empDao.add(emp);
//		}
//		
//		ModelAndView modelView=new ModelAndView("redirect:/admin/listEmp");
//
//		return modelView;
//	}
//	
//	
	
}
