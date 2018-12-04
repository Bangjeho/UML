package kr.ac.sunmoon.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class registeration_book extends VerticalPanel {
	public registeration_book(){
		super();
		
		this.setWidth("256px");
		
		
		HorizontalPanel hp = new HorizontalPanel();
		this.add(hp);
		
		HorizontalPanel hp2 = new HorizontalPanel();
		this.add(hp2);
		
		HorizontalPanel hp3 = new HorizontalPanel();
		this.add(hp3);
		
		HorizontalPanel hp4 = new HorizontalPanel();
		this.add(hp4);

		
		final TextBox txt = new TextBox();
		txt.getElement().setPropertyString("placeholder", "enter Book Title");
		hp.add(txt);
		
		final TextBox txt2 = new TextBox();
		txt2.getElement().setPropertyString("placeholder", "enter Author");
		hp2.add(txt2);
		
		final TextBox txt3 = new TextBox();
		txt3.getElement().setPropertyString("placeholder", "enter CatalogNumber");
		hp3.add(txt3);
		
		final Button bt = new Button("등록하기");
		hp3.add(bt);
		
		final TextBox retry = new TextBox();
		hp4.add(retry);
		
		final Button bt2 = new Button("완료");
		hp4.add(bt2);
		
		retry.setVisible(false);
		bt2.setVisible(false);
		
		bt.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window.alert("책 제목: " +txt.getText() +"\n"+ "작가: "+ txt2.getText() +
						"\n"+ "책의 고유번호: " +txt3.getText() +"이 맞습니까?"+ 
						"\n" + "맞으면: yes 틀리면 :no");
				
				retry.setVisible(true);
				bt2.setVisible(true);
			}
		});
		bt2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				if(retry.getText() == "yes"){
					Window.alert("success!!");
					RootPanel.get("main").remove(0);
					RootPanel.get("main").add(new MainPage());
				}
				if(retry.getText() == "no")
					Window.alert("try again.");			
				if(retry.getText() != "yes" && retry.getText() != "no")
					Window.alert("please enter to text answer yes or no.");
			}
		});
		
	}
}
