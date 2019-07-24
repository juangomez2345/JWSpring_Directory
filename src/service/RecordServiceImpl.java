package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import utility.Session_Transactions;

import bean.Directory;

public class RecordServiceImpl implements RecordService{

	@Override
	public void addDirectory(Directory directory) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request =  attributes.getRequest(); 
		HttpSession session = attributes.getRequest().getSession(true); 
		new Session_Transactions().saveDirectory(directory, session);
		request.setAttribute("msgRecord", "guardado");
	}

}
