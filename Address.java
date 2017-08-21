import javax.swing.*;
public class Address extends JDialog
{
	Address()
	{
		setTitle("The Grand Mystic Falls Hotel");
		setSize(400,320);
		setModal(true);
		JLabel j=new JLabel("Postal Address is:");
		JLabel jj=new JLabel("The Grand Mystic Falls Hotel");
		JLabel jjj=new JLabel("4/11 Grand HighWayRoad,Mysterious Valley-Hogwards");
		j.setBounds(20,30,130,30);
		jj.setBounds(20,90,200,30);
		jjj.setBounds(20,110,310,30);
		add(j);
		add(jj);
		add(jjj);
		ImageIcon i=new ImageIcon("flower2.jpg");
		JLabel img=new JLabel(i);
		add(img);
		setVisible(true);
	}
}