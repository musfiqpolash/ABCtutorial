import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ABC extends JFrame
{
	Container ct;
	JButton[] btn=new JButton[26];
	String btns[]={"A","B","c","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	JLabel[] lable=new JLabel[26];
	ImageIcon[] icon=new ImageIcon[26];
	String[] image={"alphabet_A.png","alphabet_B.png","alphabet_C.png","alphabet_D.png",
					"alphabet_E.png","alphabet_F.png","alphabet_G.png","alphabet_H.png",
					"alphabet_I.png","alphabet_J.png","alphabet_K.png","alphabet_L.png",
					"alphabet_M.png","alphabet_N.png","alphabet_O.png","alphabet_P.png",
					"alphabet_Q.png","alphabet_R.png","alphabet_S.png","alphabet_T.png",
					"alphabet_U.png","alphabet_V.png","alphabet_W.png","alphabet_X.png",
					"alphabet_Y.png","alphabet_Z.png"};
	JPanel buttonPanel, imagePanel;
	
	public ABC() 
	{
		setSize(971, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(10, 20);
		setResizable(false);
		init();
		setComponents();
	}
	
	public void init()
	{
		ct=getContentPane();
		ct.setLayout(null);
		
		buttonPanel=new JPanel();
		buttonPanel.setBounds(0, 0, 500, 520);
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(new GridLayout(5, 5));
		
		imagePanel=new JPanel();
		imagePanel.setBounds(500, 0, 471, 520);
		imagePanel.setBackground(Color.WHITE);
		
		
		for(int i=0;i<26;i++)
		{
			btn[i]=new JButton(btns[i]);
			btn[i].setBackground(Color.WHITE);
			
			icon[i]=new ImageIcon(image[i]);
			
			lable[i]=new JLabel();
			lable[i].setIcon(icon[i]);
		}
	}
	
	public void setComponents()
	{
		for(int i=0;i<btn.length;i++)
		{
			buttonPanel.add(btn[i]);
		}
		
		ct.add(buttonPanel);
		ct.add(imagePanel);
	}
}