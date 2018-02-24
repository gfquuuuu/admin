package admin;

public class StaticSingleton {
	private StaticSingleton(){}
	
	private static class SingletonHolder{
		private static StaticSingleton staticSingleton = new StaticSingleton();
	}
	
	public static StaticSingleton getInstancee(){
		return SingletonHolder.staticSingleton;
	}
	
	public void printStr(String str){
		System.out.println(str);
	}
}
