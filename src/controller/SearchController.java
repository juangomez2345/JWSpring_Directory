package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import service.SearchService;
import bean.Search;

@SuppressWarnings("deprecation")
public class SearchController extends SimpleFormController {

	private SearchService searchService;

	public SearchController()	{
		setCommandClass(Search.class);
		setCommandName("search");
	}
	
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Search search = (Search) command;
		searchService.searchDirectory(search);
		return new ModelAndView("Jsp_Search","search",search);
	}
}
