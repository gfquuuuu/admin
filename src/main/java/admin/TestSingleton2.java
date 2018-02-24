package admin;
/**
 * 懒汉式单例模式
 * @author Administrator
 *
 */
public class TestSingleton2 {
	private static TestSingleton2 testSingleton2 = null;
	
	private TestSingleton2(){}
	
	public static TestSingleton2 getInstance(){
		if(testSingleton2 == null){
			testSingleton2 = new TestSingleton2();
		}
		
		return testSingleton2;
	}
	
	public void printStr(String str){
		System.out.println(str);
	}
}
