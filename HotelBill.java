import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class HotelBill extends Applet implements ItemListener{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Checkbox cb1,cb2,cb3,cb4;
	int res=0;
	Panel p1,p2;
	public void init()
	{
		t1=new TextField(30);
		t2=new TextField(10);
		t3=new TextField(10);
		t3.setEditable(false);
		l1=new Label("Name");
		l2=new Label("Table no.");
		l3=new Label("Total Bill");
		p1=new Panel();
		p1.setLayout(new GridLayout(2,2,5,5));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		add(p1,"North");
		cb1=new Checkbox("Dosa.........30");
		cb2=new Checkbox("Uthappa......35");
		cb3=new Checkbox("Idli.........25");
		cb4=new Checkbox("Wadapav......15");
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		p2=new Panel();
		p2.setLayout(new GridLayout(3,2,5,5));
		t3.setText("0");
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.add(cb4);
		p2.add(l3);
		p2.add(t3);
		add(p2,"Center");
		setSize(500,200);
	}
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//Checkbox cb=(Checkbox)e.getItem();
		try
		{
			res=Integer.parseInt(t3.getText());
		}
		catch(Exception e1){}
		if(e.getSource()==cb1&&e.getStateChange()==1)
		{
			t3.setText(""+(res+30));
		}
		if(e.getSource()==cb1&&e.getStateChange()==2)
		{
			t3.setText(""+(res-30));
		}
		if(e.getSource()==cb2&&e.getStateChange()==1)
		{
			t3.setText(""+(res+35));
		}
		if(e.getSource()==cb2&&e.getStateChange()==2)
		{
			t3.setText(""+(res-35));
		}
		if(e.getSource()==cb3&&e.getStateChange()==1)
		{
			t3.setText(""+(res+25));
		}
		if(e.getSource()==cb3&&e.getStateChange()==2)
		{
			t3.setText(""+(res-25));
		}
		if(e.getSource()==cb4&&e.getStateChange()==1)
		{
			t3.setText(""+(res+15));
		}
		if(e.getSource()==cb4&&e.getStateChange()==2)
		{
			t3.setText(""+(res-15));
		}
	}
	public void paint(Graphics g){}
}
