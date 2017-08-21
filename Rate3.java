import javax.swing.*;
public class Rate3 extends JDialog
{
	Rate3()
	{
		setTitle("The Grand Mystic Falls Hotel");
		setSize(400,380);
		setModal(true);
		JLabel j=new JLabel("Rate of CLASSIC room is:");
		JLabel ja=new JLabel("Fooding : 1000 (1 day and 1 night)");
		JLabel jb=new JLabel("Lodging : 1000 (1 day and 1 night)");
		JLabel jd=new JLabel("TOTAL COST : Rs 2000 (1 day and 1 night)");
		j.setBounds(40,40,280,40);
		ja.setBounds(20,90,240,30);
		jb.setBounds(20,110,260,30);
		jd.setBounds(20,130,280,30);	
		
		add(j);
		add(ja);
		add(jb);
		add(jd);
		ImageIcon i=new ImageIcon("flower2.jpg");
		JLabel img=new JLabel(i);
		add(img);
		setVisible(true);
	}
}