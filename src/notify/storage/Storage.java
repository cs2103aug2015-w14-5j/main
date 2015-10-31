package notify.storage;

import java.util.ArrayList;
import java.util.HashMap;

import notify.Task;
import notify.logic.command.Action;

public class Storage {
	//private static final String[] commandFiles = {"ADD.txt", "DELETE.txt", "EDIT.txt", "SEARCH.txt", "MARK.txt", "DISPLAY.txt", "UNDO.txt", "SET.txt", "EXIT.txt"};
	private static final String FILEPATH = "data/tasks.txt";
	
	private SaveTasks save;
	private LoadTasks load;
	private LoadCommands loadCommand;
	
	public Storage() {
		save = new SaveTasks(FILEPATH);
		load = new LoadTasks(FILEPATH);
		loadCommand = new LoadCommands();
	}
	
	public ArrayList<Task> loadTasks(){
		return load.execute(null);		
	}

	public void saveTasks(ArrayList<Task> taskList_) {
		save.execute(taskList_);
	}
	
	public HashMap<String, Action> loadCommands() {
		return loadCommand.execute(null);
	}
}
