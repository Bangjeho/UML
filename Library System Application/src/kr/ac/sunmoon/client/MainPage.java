package kr.ac.sunmoon.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;


public class MainPage extends VerticalPanel {
	public MainPage(){
		super();
		this.setWidth("1024px");
		
		VerticalPanel vp = new VerticalPanel();
		this.add(vp);
		
		Label name = new Label("Library System Application");
		name.getElement().getStyle().setColor("black");
		this.setCellHorizontalAlignment(vp, HorizontalPanel.ALIGN_CENTER);
		
		name.getElement().getStyle().setWidth(200, Unit.PX);
		vp.add(name);
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.getElement().getStyle().setMarginTop(30, Unit.PX);
		this.add(hp);
		this.setCellHorizontalAlignment(hp, HorizontalPanel.ALIGN_CENTER);
		
		VerticalPanel display = new VerticalPanel();
		this.add(display);
		
		this.setCellHorizontalAlignment(display, HorizontalPanel.ALIGN_CENTER);
		
		final Label lbl = new Label("");
		display.add(lbl);
		
		Button rg_borrower = new Button("이용자 등록");
		hp.add(rg_borrower);
		rg_borrower.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("main").remove(0);
				RootPanel.get("main").add((IsWidget) new registeration_borrower());
			}
		});
		
		Button rg_book = new Button("책 등록");
		hp.add(rg_book);
		rg_book.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("main").remove(0);
				RootPanel.get("main").add((IsWidget) new registeration_book());
			}
		});
		
		Button dis_forloan = new Button("대출 가능한 책 보기");
		hp.add(dis_forloan);
		dis_forloan.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				lbl.setText("\n" +
							"\n" +
							"\n");
			}
		});
		
		Button dis_onloan = new Button("대출 불가능한 책 보기");
		hp.add(dis_onloan);
		dis_onloan.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				lbl.setText("\n dd" +
							"\n" +
							"\n");
			}
		});
		
		Button borrow_b = new Button("대출하기");
		hp.add(borrow_b);
		borrow_b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("main").remove(0);
				RootPanel.get("main").add((IsWidget) new borrow_book());
			}
		});
		
		Button return_b = new Button("반납하기");
		hp.add(return_b);
		return_b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("main").remove(0);
				RootPanel.get("main").add((IsWidget) new return_book());
			}
		});
		
		Button delete_borrower = new Button("이용자 삭제");
		hp.add(delete_borrower);
		delete_borrower.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("main").remove(0);
				RootPanel.get("main").add((IsWidget) new delete_borrower());
			}
		});
	}

}
