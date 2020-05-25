package hashCode;


public class Folder 

{

	public String folderName;
	
	public String folderType;

	
	public Folder(String folderName, String folderType) 
	{
		this.folderName = folderName;
		this.folderType = ".txt";
	}



	public String getFolderName() {
		return folderName;
	}


	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}


	public String getFolderType() {
		return folderType;
	}


	public void setFolderType(String folderType) {
		this.folderType = folderType;
	}
	
	
	
}

