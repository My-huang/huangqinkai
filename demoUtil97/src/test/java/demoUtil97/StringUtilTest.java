package demoUtil97;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		String changeText = StringUtil.changeText("9月5日一大早，又有了新情况。\r\n 上午9点多，传出中美经贸高级别磋商牵头人通话的消息。\r\n9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。\r\n");
		System.out.println(changeText);
	}

	
	@Test
	public void test2() {
		String isphone = StringUtil.isphone(152366732);
		System.out.println(isphone);
		
	}
	
	@Test
	public void test3() {
		String isphone = StringUtil.isEmail("2725926259.com");
		System.out.println(isphone);
		
	}
	
	
}
