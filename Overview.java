import javax.swing.*;
import java.awt.event.*;
public class Overview extends JDialog implements ActionListener
{
	JMenu About,Gall,Enq,Book,E1,E2;
	
	JMenuItem g1,g2,a1,a2,a3,r1,clas,del,pre;
	JFrame jf;
	
	Overview()
	{
		jf =new JFrame("The Grand Mystic Falls Hotel-Overview");
		jf.setSize(jf.getMaximumSize());
		
		About=new JMenu("About Us");
		Gall=new JMenu("Gallery");
		
		Enq=new JMenu("Enquiry");
		E1=new JMenu("Services");
		E2=new JMenu("Rates");
		
		Book=new JMenu("Book Now");
		
		clas=new JMenuItem(" In Classic");
		del=new JMenuItem(" In Deluxe");
		pre=new JMenuItem(" In Premium");
		g1=new JMenuItem("Photos of rooms");
		g2=new JMenuItem("Photos of Hotel");
		a3=new JMenuItem("Overview");
		a1=new JMenuItem("Contact Number");
		a2=new JMenuItem("Postal Address");
		r1=new JMenuItem("Rooms");
		
		
				
		
		g1.addActionListener(this);
		g2.addActionListener(this);
		a3.addActionListener(this);
		a1.addActionListener(this);
		a2.addActionListener(this);
		r1.addActionListener(this);
		
		
		E1.add(clas);
		E1.add(del);
		E1.add(pre);
		Enq.add(E1);
		Enq.add(E2);
		Gall.add(g1);
		Gall.add(g2);
		About.add(a3);
		About.add(a1);
		About.add(a2);
		Book.add(r1);
		
		JMenuBar jmb=new JMenuBar();
		jmb.add(About);
		jmb.add(Gall);
		jmb.add(Enq);
		jmb.add(Book);
		
		jf.setJMenuBar(jmb);
		ImageIcon i=new ImageIcon("aa.png");
		JLabel img=new JLabel(i);
		img.setBounds(0,0,350,300);
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
	if(ob==a2)
	{
		new Address();
	}
	if(ob==a1)
	{
	new Ads();
	}
	
}
}