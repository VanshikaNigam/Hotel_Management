import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class Record extends JDialog implements ActionListener 
{
	JTable jt;
	JScrollPane jsp;
	String id;

	JLabel jl1;
	JTextField j1;
	JButton ch;
	Record()
	{
			setTitle("Record");
			setLayout(null);
			j1=new JTextField();
			
		
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 
		 jl1=new JLabel("Enter Date");
		 
		 ch=new JButton("Generate"); 
		
		ch.setMnemonic(KeyEvent.VK_C);
		
		
		
		ch.addActionListener(this);
		
		 
		jl1.setBounds(20,50,200,30);
		ch.setBounds(50,100,200,30);
		
		
		j1.setBounds(150,50,200,30);
		
			
		setSize(500,500);
		setLocationRelativeTo(null);	//center of screen
		 add(jl1);
		 
		 add(j1);
		 
		 add(ch);
		setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
			 if(ob==ch)
			 {
		 int c=0,r=0,cnt=0;
		id=j1.getText();
		String []columns = new String[]{"Id","Room NO","Type of Room","Name","Age","Gender","Profession","Contact","Address","No.Of Mem","Check In","Check out","Amnt pd"};
				try
				{
					Connection con= MyConnection.getConnection();
					String query="select * from record where chkin=?";
				PreparedStatement ps2= con.prepareStatement(query);
				ps2.setString(1,id); // <<
				ResultSet rs= ps2.executeQuery();
					while(rs.next())
					{
						++cnt; //counting number of tuples
					}
					String[][] data =new String[cnt][13];
					rs = ps2.executeQuery();
					while(rs.next())
					{
						data[r][c]= rs.getString(1);
						++c;
						data[r][c]= rs.getString(2);
						++c;
						data[r][c]=rs.getString(3);
						++c;
						data[r][c]= rs.getString(4);
						++c;
						data[r][c]= rs.getString(5);
						++c;
						data[r][c]= rs.getString(6);
						++c;
						data[r][c]= rs.getString(7);
						++c;
						data[r][c]= rs.getString(8);
						++c;
						data[r][c]= rs.getString(9);
						++c;
						data[r][c]= rs.getString(10);
						++c;
						data[r][c]= rs.getString(11);
						++c;
						data[r][c]= rs.getString(12);
						++c;
						data[r][c]= rs.getString(13);
						++c;
						c=0;
						++r;
					}	
					
					jt= new JTable(data,columns);
					jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					jt.setSize(500,250);
					jsp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					jsp.setBounds(100,300,200,100);
					setSize(500,500);
					add(jsp);
					setVisible(true);
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
			}
			
		}	
		
	

	public static void main(String[] args)
	{
		new Record();
		
	}
	
}