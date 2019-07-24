package service;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import utility.Session_Transactions;

import bean.Search;

public class SearchServiceImpl implements SearchService{

	@Override
	public void searchDirectory(Search search) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession session = attributes.getRequest().getSession(true);
		new Session_Transactions().searchDirectory(search, session);
	}
}
