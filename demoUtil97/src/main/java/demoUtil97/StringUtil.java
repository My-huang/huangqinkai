package demoUtil97;

public class StringUtil {

	private StringUtil() {}
	
	public static String changeText(String str){
		
		String reg_text1 = "\\\\r\\\\n";
		String replaceAll = str.replaceAll(reg_text1, "<p></p>");
		String reg_text2 = "\\\\r";
		String replaceAll2 = replaceAll.replaceAll(reg_text2, "<br>");
		
		
		return replaceAll2;
		
	}
	
	
	
	public static String isphone(int ip){
		
		
		if(ip == 1523667329){
			return "通过是手机号";
			
		}else{
			return "不通过不是手机号";
			
		}
		
		
	}
	
	
	
	public static String isEmail(String im){
		String ima = "2725926259.com";
		if(im.equals(ima)){
			return "通过是邮箱";
		}else{
			return "不通过不是邮箱";
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
