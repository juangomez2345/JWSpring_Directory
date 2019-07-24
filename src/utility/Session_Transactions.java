package utility;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import bean.Directory;
import bean.Search;


public class Session_Transactions {
				
	@SuppressWarnings("unchecked")
	public void saveDirectory(Directory directory, HttpSession session){
		ArrayList<Directory> directories = new ArrayList<Directory>();
		directory.setFecha_registro(new Date().toString());
		
		if(session.getAttribute("options")==null){
			directories.add(directory);			
		}
		else{
			directories = (ArrayList<Directory>)session.getAttribute("options");
			directories.add(directory);
		}		
		session.setAttribute("options",directories);
	}
	
	@SuppressWarnings("unchecked")
	public void searchDirectory(Search search, HttpSession session) {
		setDefaultOptions(session);
		if(session.getAttribute("options")!=null)
		{
			ArrayList<Directory> directories_session = (ArrayList<Directory>)session.getAttribute("options");
			ArrayList<Directory> directories_request = new ArrayList<Directory>();
			
			boolean isPresent=false; 			
			for(int index=0; index<directories_session.size(); index++)
			{
				Directory directory = (Directory)directories_session.get(index);
				if(directory.getCategoria().toLowerCase().indexOf(search.getCategory().toLowerCase()) > -1){					
					isPresent=true;
					directories_request.add(directory);
				}
			}
			if(!isPresent){ search.setMsgOperation("No existen opciones"); }
			search.setDirectories(directories_request);
		}
		else{
			search.setMsgOperation("No existen opciones");
		}
	}
	
	private void setDefaultOptions(HttpSession session){
		if(session.getAttribute("options")==null){
	    	saveDirectory(Transactions.directory01(), session);
	    	saveDirectory(Transactions.directory02(), session);
	    	saveDirectory(Transactions.directory03(), session);
	    	saveDirectory(Transactions.directory04(), session);
		}
	}
		
}

