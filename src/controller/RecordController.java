package controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import bean.Directory;
import service.RecordService;

@SuppressWarnings("deprecation")
public class RecordController extends SimpleFormController {

	private RecordService recordService;

	public RecordController(){
		setCommandClass(Directory.class);
		setCommandName("directory");		
	}
	
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Directory directory = (Directory) command;
		recordService.addDirectory(directory);
		return new ModelAndView("Jsp_Record","directory",directory);
	}
	
		
}
