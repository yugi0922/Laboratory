package chapter12;

import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		Object[][] contents = {{"send", "送信"},
				{"cancel", "取り消し"}};		
		return contents;
	}

}
