package kr.ac.sunmoon.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import kr.ac.sunmoon.client.MainPage;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Library_System_Application implements EntryPoint {
	
	public void onModuleLoad() {
		RootPanel.get("main").add(new MainPage());
	}
}
