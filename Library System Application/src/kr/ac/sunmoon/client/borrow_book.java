package kr.ac.sunmoon.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class borrow_book extends VerticalPanel{
	public borrow_book(){
		super();
		this.setWidth("256px");
		
		HorizontalPanel hp = new HorizontalPanel();
		this.add(hp);
		
		HorizontalPanel hp2 = new HorizontalPanel();
		this.add(hp2);
		
		TextBox txt = new TextBox();
		txt.getElement().setPropertyString("placeholder", "enter to borrower name");
		hp.add(txt);
		
		
		TextBox txt2 = new TextBox();
		hp2.add(txt2);
		txt2.getElement().setPropertyString("placeholder", "enter to catalog Number of the book");
		
		Button bt = new Button("대출하기");
		hp2.add(bt);
		
		bt.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				
				Window.alert("success!!");
				RootPanel.get("main").remove(0);
				RootPanel.get("main").add(new MainPage());
			}
		});
		
		
	}
}
