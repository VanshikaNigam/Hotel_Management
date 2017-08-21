import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Available extends JDialog implements ActionListener
{
	String rm,nm,srm,sg,sp,sc,sa,schk,sra,sid,snm,snom,sad;
	int i,j,k,l;
	JTextField rr,ra,num,room,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13;
	JButton ch,rg;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13;
	Available()
	{
		setTitle("Availability check");
		setLayout(null);
		setSize(700,700);
		
		jl1= new JLabel("Room Required");
		jl2= new JLabel("Type of Room");
		jl3= new JLabel("Room Available");
		jl4= new JLabel("Name");
		jl5= new JLabel("Age");
		jl6= new JLabel("Gender");
		jl7= new JLabel("Profession");
		jl8= new JLabel("Contact No.");
		jl9= new JLabel("Address");
		jl10= new JLabel("Num. of Members");
		jl11=new JLabel("ID NUMBER");
		jl12= new JLabel("Check In Date");
		jl13= new JLabel("Room No Alloted");
		
		
		
		
		num= new JTextField();
		room= new JTextField();
		ra=new JTextField();
		j4=new JTextField();
		j5=new JTextField();
		j6=new JTextField();
		j7=new JTextField();
		j8=new JTextField();
		j9=new JTextField();
		j10=new JTextField();
		j11=new JTextField();
		j12=new JTextField();
		j13=new JTextField();
		ch=new JButton("Check");
		rg=new JButton("Book");
		
		ch.setMnemonic(KeyEvent.VK_C);
		rg.setMnemonic(KeyEvent.VK_B);
		
		ch.addActionListener(this);
		rg.addActionListener(this);
		
		jl1.setBounds(25,30,120,25);
		jl2.setBounds(25,80,90,25);
		jl3.setBounds(25,130,120,25);
		num.setBounds(120,30,250,25);
		room.setBounds(120,80,250,25);
		ra.setBounds(120,130,250,25);
		ch.setBounds(55,180,120,25);
		jl4.setBounds(20,210,120,25);										
		jl5.setBounds(20,240,120,25);
		jl6.setBounds(20,270,120,25);
		jl7.setBounds(20,300,120,25);
		jl8.setBounds(20,330,120,25);
		jl9.setBounds(20,360,120,25);
		jl10.setBounds(20,390,120,25);
		jl11.setBounds(20,420,120,25);
		jl12.setBounds(20,450,120,25);
		jl13.setBounds(20,480,120,25);
		
		
		j4.setBounds(120,210,250,25);
		j5.setBounds(120,240,250,25);
		j6.setBounds(120,270,250,25);
		j7.setBounds(120,300,250,25);
		j8.setBounds(120,330,250,25);
		j9.setBounds(120,360,250,25);
		j10.setBounds(120,390,250,25);
		j11.setBounds(120,420,250,25);
		j12.setBounds(120,450,250,25);
		j13.setBounds(120,480,250,25);
		rg.setBounds(55,510,120,25);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
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
		 add(jl12);
		 add(jl13);
		 add(j4);
		 add(j5);
		 add(j6);
		 add(j7);
		 add(j8);
		 add(j9);
		 add(j10);
		 add(j11);
		 add(j12);
		 add(j13);
		 add(ra);
		 add(room);
		 add(num);
		 add(ch);
		 add(rg);
		 ImageIcon i=new ImageIcon("bk.jpg");
		 JLabel img=new JLabel(i);
		 add(img);
		 setVisible(true);
	}
		public void actionPerformed(ActionEvent ae)
	{
		
		
		
		rm=room.getText();
		nm=num.getText();
		
		snm=j4.getText();
		sa=j5.getText();
		sg=j6.getText();
		sp=j7.getText();
		sc=j8.getText();
		sad=j9.getText();
		snom=j10.getText();
		sid=j11	.getText();
		
		sra=j13.getText();
		
		
		
		Object ob= ae.getSource();
		if((ob==rg)&&((sra.equals("")||snm.equals("")||sa.equals("")||sg.equals("")||
		sp.equals("")||sc.equals("")||sad.equals("")||sid.equals(""))))		
		{
			JOptionPane.showMessageDialog(null,"Please fill the form completly ","Project",1);
		}
		
		
		else if((ob==rg&&(rm.equalsIgnoreCase("Deluxe")))||(ob==rg&&(rm.equalsIgnoreCase("Premium")))||(ob==rg&&(rm.equalsIgnoreCase("Classic"))))
		{	try
			{	
				schk=sid.substring(0,8);
				int av=1;
				Connection con = MyConnection.getConnection();
				String st= "insert into record (roomno,name,age,gender,prof,contact,address,chkin,idnum,nmom,type) values (?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps= con.prepareStatement(st);
				ps.setString(1,sra);
				ps.setString(2,snm);
				ps.setString(3,sa);
				ps.setString(4,sg);
				ps.setString(5,sp);
				ps.setString(6,sc);
				ps.setString(7,sad);
				ps.setString(8,schk);
				ps.setString(9,sid);
				ps.setString(10,snom);
				ps.setString(11,rm);
				
				String tb= rm.toLowerCase();
				int y =ps.executeUpdate();
				int i= Integer.parseInt(sra);
				String query= "update "+tb+" set avail="+av+" where roomno="+i;
				PreparedStatement ps1= con.prepareStatement(query);
				ps1.executeUpdate();
				 con.close();
				 if(y>0)
				 {
					JOptionPane.showMessageDialog(null,"Room booked","Project",1);
					new Available();
					dispose();
					
				}
			}
			catch(SQLException se)
				{
					se.printStackTrace();
				}
		}
		
		else if((ob==ch)&&(rm.equals("")))		
		{
			JOptionPane.showMessageDialog(null,"Please enter the type of room","Project",1);
		}
		else if((ob==ch&&(rm.equalsIgnoreCase("Deluxe")))||(ob==ch&&(rm.equalsIgnoreCase("Premium")))||(ob==ch&&(rm.equalsIgnoreCase("Classic"))))
		{
			try
			{		
					String tb=rm.toLowerCase();
					String s=new String(" ");
					Connection con = MyConnection.getConnection();
					String query="select * from "+tb+" where avail=0";
					Statement st= con.createStatement();
					ResultSet rs=st.executeQuery(query);
					ra.setEditable(false);
					while(rs.next())
					{
					 s=s+rs.getString(1)+",";
					}
					ra.setText(s);
					
			}
		
			
			
				catch(SQLException se)
				{
					se.printStackTrace();
				}
		}
	
	
	}
	/*public static void main(String args[])
	{
	new Available();
	
	}*/
	
}