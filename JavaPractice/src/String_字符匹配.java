import java.util.regex.Pattern;

public class String_字符匹配 {
	private static final String REGEX = "\\d+";
	private static final String INPUT = "sagjal56aang45asg4dgbdf6dsf6";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(REGEX);
		String[] letter = p.split(INPUT);
		for (String s : letter) {
			System.out.println(s);
		}
	}

}
