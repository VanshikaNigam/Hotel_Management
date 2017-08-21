import javax.swing.*;
public class Service2 extends JDialog
{
	Service2()
	{
		setTitle("The Grand Mystic Falls Hotel-Services");
		setSize(400,400);
		setModal(true);
		JLabel j=new JLabel("Services in our PREMIUM rooms are:");
		JLabel ja=new JLabel("1.Morning Tea");
		JLabel jb=new JLabel("2.BreakFast");
		JLabel jc=new JLabel("3.Yoga session");
		JLabel jd=new JLabel("4.Lunch");
		JLabel jf=new JLabel("5.Evening Snacks");
		JLabel jg=new JLabel("6.Dinner");
		j.setBounds(40,40,280,40);
		ja.setBounds(20,90,140,30);
		jb.setBounds(20,110,160,30);
		jc.setBounds(20,130,180,30);
		jd.setBounds(20,150,200,30);
		jf.setBounds(20,170,220,30);
		jg.setBounds(20,190,240,30);
		
		add(j);
		add(ja);
		add(jb);
		add(jc);
		add(jd);
		add(jf);
		add(jg);
		ImageIcon i=new ImageIcon("bk.jpg");
		JLabel img=new JLabel(i);
		add(img);
		setVisible(true);
	}
}