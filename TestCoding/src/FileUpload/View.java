package FileUpload;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class View {
	private UUID viewId;
	private String viewName;
	private String description;
	private List<Folder> folders;

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public UUID getViewId() {
		return viewId;
	}

	public void setViewId() {
		this.viewId = UUID.randomUUID();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

}

class Folder {
	private UUID folderId;
	private String folderName;
	private List<File> files;
	private List<Folder> subFolders;

	public UUID getFolderId() {
		return folderId;
	}

	public void setFolderId() {
		this.folderId = UUID.randomUUID();
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public List<Folder> getSubFolders() {
		return subFolders;
	}

	public void setSubFolders(List<Folder> subFolders) {
		this.subFolders = subFolders;
	}

}

class File {
	private String fileId;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	private String fileName;

}

class ViewService {

	private List<View> viewList = new ArrayList<>();

	public void saveView(View view) {
		for (Folder folder : view.getFolders()) {// parentFolder -> folder1
			setFolderRelation(folder);
		}

		viewList.add(view);
	}

	// folder1 -> folder2 -> folder 3 -> file1, file2, file 3
	// parentFolder -> folder1
	FileRepository fileRepos = new FileRepository();
	FileDirectoryMapping fileDirRepos = new FileDirectoryMapping();

	private void setFolderRelation(UUID folderId) {//folder3	
		Folder folder = fileDirRepos.getFolderById(folderId)
		for (File file : folder.getFiles()) { 
			//
			UUID fileId = fileRepos.save(fileDTO);
		}
	
		for (Folder subFolder : folder.getSubFolders()) {
			
			UUID folderId = fileDirRepos.save(subFolder)
			
			setFolderRelation(folderId);
		}
	}

	public List<View> getAllViews() {
		return viewList;
	}

	public View findViewById(long viewId) {
		for (View view : viewList) {
			if (view.getViewId().equals(view.getViewId())) {
				return view;
			}
		}
		return null;
	}
}