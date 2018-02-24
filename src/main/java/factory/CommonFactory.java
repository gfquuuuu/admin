package factory;

import java.util.ArrayList;
import java.util.List;

public class CommonFactory {
	
	public static <E> E commonFactory(Class<E> type, String...strings){
		List<Class<String>> listClass = new ArrayList<Class<String>>();
		for (int i = 0; i < strings.length; i++) {
			listClass.add(String.class);
		}
		try {
			return (E) type.getConstructor((Class<String>[]) listClass.toArray()).newInstance(strings);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}