import javax.swing.*;
public class Ads extends JDialog
{
	Ads()
	{
		setTitle("The Grand Mystic Falls Hotel");
		setSize(350,350);
		setModal(true);
		
		JLabel j=new JLabel("Contact Us at:");
		JLabel jj=new JLabel("The Grand Mystic Falls Hotel");
		JLabel jjj=new JLabel("9876543210");
		j.setBounds(20,30,100,30);
		jj.setBounds(20,90,200,30);
		jjj.setBounds(20,110,220,30);
		add(j);
		add(jj);
		add(jjj);
		ImageIcon i=new ImageIcon("flower2.jpg");
		JLabel img=new JLabel(i);
		add(img);
		setVisible(true);
	}
}