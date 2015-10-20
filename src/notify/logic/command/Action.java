package notify.logic.command;

/**
 * The Action enumeration is used a list of command that is 
 * recognized by the system.
 */
public enum Action {
	
	ADD			(true, true),
	BACK 		(false, false),
	DELETE 		(true, true),
	EDIT 		(true, true),
	SEARCH 		(false, false),
	MARK 		(true, true), 	
	DISPLAY 	(false, false),	
	UNDO 		(false, true), 
	SET 		(true, true),
	EXIT		(false, false),
	INVALID 	(false, false);
	
	private boolean isReversible;
	private boolean isPersistent;
	
	private Action(boolean isReversible, boolean isPersistent) {
		this.isReversible = isReversible;
		this.isPersistent = isPersistent;
	}
	
	/**
	 * Returns true if the selected command action can be reversed.
	 * 
	 * @return	true if the selected command action can be reversed
	 */
	public boolean isReversible() {
		return this.isReversible;
	}
	
	/**
	 * Returns true if the selected command requires data to be stored.
	 * 
	 * @return	true if the selected command requires data to be stored
	 */
	public boolean isPersistent() {
		return this.isPersistent;
	}
}
