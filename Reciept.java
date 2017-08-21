import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class Reciept extends JDialog implements ActionListener 
{
	String a,id,room,type;
	//JCheckBox a,b,c,d;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11;
	JTextField j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11;
	JButton ch,rg;
	Reciept()
	{
			setTitle("Bill Reciept");
			setLayout(null);
			j1=new JTextField();
			j2=new JTextField();
			j3=new JTextField();
			j4=new JTextField();
			j5=new JTextField();
			j6=new JTextField();
			j7=new JTextField();
			j8=new JTextField();
			j9=new JTextField();
			j10=new JTextField();
			j11=new JTextField();
		/*	a=new JCheckBox("BREAKFAST");
			b=new JCheckBox("LUNCH");
			c=new JCheckBox("TEA");
			d=new JCheckBox("DINNER");*/
			
		
		
		
		/*a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);*/
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 
		 jl1=new JLabel("Cust-ID");
		 
		 ch=new JButton("Details"); 
		 jl2=new JLabel("Customer Name");
		 jl3=new JLabel("Room No:");
		 jl4=new JLabel("Type of room");
		 jl5=new JLabel("No of Members:");
		 jl6=new JLabel("Contact No:");
		 jl7=new JLabel("Check In date");
		 jl8=new JLabel("Check out date");
		 jl9=new JLabel("Number of days");
		 jl10=new JLabel("Service Taken");
		 jl11=new JLabel("Total Amount");
		 rg=new JButton("Reciept");
		
		ch.setMnemonic(KeyEvent.VK_C);
		rg.setMnemonic(KeyEvent.VK_R);
		
		rg.addActionListener(this);
		ch.addActionListener(this);
		
		 
		jl1.setBounds(20,50,200,30);
		ch.setBounds(50,100,200,30);
		jl2.setBounds(20,150,200,30);
		jl3.setBounds(20,200,200,30);
		jl4.setBounds(20,250,200,30);
		jl5.setBounds(20,300,200,30);
		jl6.setBounds(20,350,200,30);
		jl7.setBounds(20,400,200,30);
		jl8.setBounds(20,450,200,30);
		jl9.setBounds(20,500,200,30);
		jl10.setBounds(20,550,200,30);
		jl11.setBounds(20,600,200,30);
		rg.setBounds(50,650,150,30);
		
		j1.setBounds(150,50,200,30);
		j2.setBounds(150,150,200,30);
		j3.setBounds(150,200,200,30);
		j4.setBounds(150,250,200,30);
		j5.setBounds(150,300,200,30);
		j6.setBounds(150,350,200,30);
		j7.setBounds(150,400,200,30);
		j8.setBounds(150,450,200,30);
		j9.setBounds(150,500,200,30);
		j10.setBounds(150,550,200,30);
		j11.setBounds(150,600,200,30);
			
		setSize(500,1000);
		setLocationRelativeTo(null);	//center of screen
		 add(jl1);
		 add(jl2);
		 add(jl3);
		 add(jl4);
		 add(jl5);
		 add(jl6);
		 add(jl7);
		 add(jl8);
		 add(jl9);
		 add(jl10);
		 add(jl11);
		 add(j1);
		 add(j2);
		 add(j3);
		 add(j4);
		 add(j5);
		 add(j6);
		 add(j7);
		 add(j8);
		 add(j9);
		 add(j10);
		 add(j11);
		 add(ch);
		 add(rg);
		 
		/*ImageIcon i=new ImageIcon("Penguins.jpg");
		JLabel img=new JLabel(i);
		img.setBounds(0,0,200,100);
		add(img);*/
		setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		id=j1.getText();
		Object ob=ae.getSource();
		
		if(ob==ch)
		{
			try
			{
				Connection con= MyConnection.getConnection();
				String query="select * from record where idnum=?";
				PreparedStatement ps2= con.prepareStatement(query);
				ps2.setString(1,id); // <<
				ResultSet rs= ps2.executeQuery();
				while(rs.next())
				{
					room=rs.getString("roomno");
					type=rs.getString("type").toLowerCase();
					System.out.println(room+" "+type);
					j2.setText(rs.getString("name"));
					j3.setText(rs.getString("roomno"));
					j4.setText(rs.getString("type"));
					j5.setText(rs.getString("nmom"));
					j6.setText(rs.getString("contact"));
					j7.setText(rs.getString("chkin"));
					j1.setEditable(false);
					j2.setEditable(false);
					j3.setEditable(false);
					j4.setEditable(false);
					j5.setEditable(false);
					j6.setEditable(false);
					j7.setEditable(false);
				}
			}
			catch(SQLException se)
			{
			se.printStackTrace();
			}

			
		}	
		
		if(ob==rg)
		{	try
			{	
					String chkout=j8.getText();
				int nd=Integer.parseInt(j9.getText());
				int av=0;
				Connection con = MyConnection.getConnection();
				String qr="select amnt from amount where rmtype=?";
				PreparedStatement ps= con.prepareStatement(qr);
			    ps.setString(1,type);
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
				 a=rs.getString("amnt");
				
				}
				int amt=Integer.parseInt(a);
				
				amt=amt*nd;
			    
			
				
				
				String st= "update record set chkout='"+chkout+"',amtpd="+amt+" where idnum="+id;
				PreparedStatement ps3= con.prepareStatement(st);
				String tb= type.toLowerCase();
				int y =ps3.executeUpdate();
				int i= Integer.parseInt(room);
				a=amt+".00";
				String qry= "update "+tb+" set avail="+av+" where roomno="+i;
				PreparedStatement ps1= con.prepareStatement(qry);
				ps1.executeUpdate();
				 con.close();
				 if(y>0)
				 {	
					j11.setText(a);
					j8.setEditable(false);
					j9.setEditable(false);
					j10.setEditable(false);
					j11.setEditable(false);
					JOptionPane.showMessageDialog(null,"Thanks for your visit...","Project",1);
					
				}
			}
			catch(SQLException se)
				{
					se.printStackTrace();
				}
		
		
		
		
	
			
	}
}
	public static void main(String[] args)
	{
		new Reciept();
		
	}
	
}