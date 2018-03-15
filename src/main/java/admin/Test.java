package admin;

public class Test {

	public static void main(String[] args) {
		TestSingleton.getInstance().printStr("恶汉式单例模式测试类");
		TestSingleton2.getInstance().printStr("恶汉是单例模式测");
		StaticSingleton.getInstancee().printStr("内部类单例模式");
		String tt = "node22";

		String str = "node11";
	}

}
