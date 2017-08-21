import javax.swing.*;
public class Service3 extends JDialog
{
	Service3()
	{
		setTitle("The Grand Mystic Falls Hotel-Services");
		setSize(400,300);
		setModal(true);
		JLabel j=new JLabel("Services in our CLASSIC rooms are:");
		JLabel ja=new JLabel("1.Morning Tea");
		JLabel jb=new JLabel("2.Breafast");
		JLabel jd=new JLabel("3.Lunch");
		JLabel jf=new JLabel("4.Evening Snacks");
		JLabel jg=new JLabel("5.Dinner");
		j.setBounds(40,40,280,40);
		ja.setBounds(20,90,140,30);
		jb.setBounds(20,110,160,30);
		jd.setBounds(20,130,180,30);
		jf.setBounds(20,150,200,30);
		jg.setBounds(20,170,220,30);
		
		add(j);
		add(ja);
		add(jb);
		add(jd);
		add(jf);
		add(jg);
		ImageIcon i=new ImageIcon("bk.jpg");
		JLabel img=new JLabel(i);
		add(img);
		setVisible(true);
	}
}