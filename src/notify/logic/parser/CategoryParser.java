package notify.logic.parser;

public class CategoryParser {
	
	private static int HASHTAG_START_INDEX = 0;
	private static int HASHTAG_END_INDEX = 1;
	
	public static String KEYWORD_HASHTAG = "#";
	
	public static String parse(String input) {
		return parse(input.split(CommandParser.COMMAND_SEPERATOR));
	}
	public static String parse(String[] input) {
		
		String result = null;
		
		for(int i = 0; i < input.length; i++) {
			String hashtag = input[i].substring(HASHTAG_START_INDEX, HASHTAG_END_INDEX);
			if(hashtag.equalsIgnoreCase(KEYWORD_HASHTAG) == true) {
				result = input[i];
			}
		}
		
		return result;
	}
}