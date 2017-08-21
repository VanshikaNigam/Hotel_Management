import javax.swing.*;
import java.awt.event.*;
public class HomePage implements ActionListener
{
	JMenu About,Gall,Enq,Book,Ext,E1,E2;
	
	JMenuItem d1,d2,g1,g2,a1,a2,a3,r1,r2,r3,ra1,ra2,ra3,pclose,clas,del,pre;
	JFrame jf;
	
	HomePage()
	{
		jf =new JFrame("The Grand Mystic Falls Hotel");
		jf.setSize(jf.getMaximumSize());
		
		About=new JMenu("About Us");
		Gall=new JMenu("Gallery");
		
		Enq=new JMenu("Enquiry");
		E1=new JMenu("Services");
		E2=new JMenu("Rates");
		
		Book=new JMenu("Rooms");
		Ext=new JMenu("Exit");
		
		
		clas=new JMenuItem(" In Classic");
		del=new JMenuItem(" In Deluxe");
		pre=new JMenuItem(" In Premium");
		ra1=new JMenuItem(" of Classic");
		ra2=new JMenuItem(" of Deluxe");
		ra3=new JMenuItem(" of Premium");
		g1=new JMenuItem("Photos of Rooms");
		g2=new JMenuItem("Photos of Hotel");
		a3=new JMenuItem("Overview");
		a1=new JMenuItem("Contact Number");
		a2=new JMenuItem("Postal Address");
		r1=new JMenuItem("CheckIn");
		r2=new JMenuItem("CheckOut");
		r3=new JMenuItem("Record");
		pclose=new JMenuItem("Close Program");
		
				
		g1.addActionListener(this);
		g2.addActionListener(this);
		a3.addActionListener(this);
		a1.addActionListener(this);
		a2.addActionListener(this);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		a2.addActionListener(this);
		clas.addActionListener(this);
		del.addActionListener(this);
		pre.addActionListener(this);
		ra1.addActionListener(this);
		ra2.addActionListener(this);
		ra3.addActionListener(this);
		
		
		pclose.addActionListener(this);
		
		E1.add(clas);
		E1.add(del);
		E1.add(pre);
		E2.add(ra1);
		E2.add(ra2);
		E2.add(ra3);
		Enq.add(E1);
		Enq.add(E2);
		
		Gall.add(g1);
		Gall.add(g2);
		
		About.add(a3);
		About.add(a1);
		About.add(a2);
		
		Book.add(r1);
		Book.add(r2);
		Book.add(r3);
		Ext.add(pclose);
		
		JMenuBar jmb=new JMenuBar();
		jmb.add(About);
		jmb.add(Gall);
		jmb.add(Enq);
		jmb.add(Book);
		jmb.add(Ext);
		
		jf.setJMenuBar(jmb);
		ImageIcon i=new ImageIcon("hh.png");
		JLabel img=new JLabel(i);
		jf.add(img);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	Object ob=ae.getSource();
	if(ob==a3)
	{
		new Overview();
	}
	if(ob==a1)
	{
		new Ads();
	}
	if(ob==a2)
	{
		new Address();
	}
	if(ob==clas)
	{
		new Service3();
	}
	if(ob==del)
	{
		new Service1();
	}
	if(ob==pre)
	{
		new Service2();
	}
	if(ob==ra1)
	{
		new Rate3();
	}
	if(ob==ra2)
	{
		new Rate1();
	}
	if(ob==ra3)
	{
		new Rate2();
	}
	if(ob==g1)
	{
		new Gallery();
	}
	if(ob==g2)
	{
		new Gallery1();
	}
	if(ob==r1)
	{
		new Available();
	}
	if(ob==r2)
	{
	 new Reciept();
	}
	if(ob==r3)
	{
		new Record();
	}
	if(ob==pclose)
	{
		System.exit(0);
	}
	}
	public static void main(String args[])
	{
	
	new HomePage();
	}
}
	