package kr.ac.sunmoon.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class delete_borrower extends VerticalPanel{
	public delete_borrower(){
		this.setWidth("256px");
		
		HorizontalPanel hp = new HorizontalPanel();
		this.add(hp);
		
		HorizontalPanel hp2 = new HorizontalPanel();
		this.add(hp2);
		final TextBox txt = new TextBox();
		txt.getElement().setPropertyString("placeholder", "enter your name");
		hp.add(txt);
		
		final Button bt = new Button("탈퇴하기");
		hp.add(bt);
		
		final TextBox retry = new TextBox();
		hp2.add(retry);
		
		final Button bt2 = new Button("완료");
		hp2.add(bt2);
		
		retry.setVisible(false);
		bt2.setVisible(false);
		
		bt.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window.alert("이용자의 성함이 " +txt.getText() + " 맞습니까?"+ "\n" + "맞으면: yes 틀리면 :no");
				
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
