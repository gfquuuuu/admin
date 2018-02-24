package admin;
/**
 * 恶汉式单例模式
 * @author Administrator
 *
 */
public class TestSingleton {
	private static TestSingleton testSingleton = new TestSingleton();
	
	private TestSingleton(){}
	
	public static TestSingleton getInstance(){
		return testSingleton;
	}
	
	public void printStr(String str){
		System.out.println(str);
	}
}
