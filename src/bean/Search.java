package bean;

import java.util.ArrayList;

public class Search {
	private String category="";
	private String msgOperation="";
	private ArrayList<Directory> directories = new ArrayList<Directory>();

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMsgOperation() {
		return msgOperation;
	}

	public void setMsgOperation(String msgOperation) {
		this.msgOperation = msgOperation;
	}

	public ArrayList<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(ArrayList<Directory> directories) {
		this.directories = directories;
	}


}
