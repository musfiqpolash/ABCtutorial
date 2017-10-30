public class abcMain 
{   
	
	public static void main(String [] args)
	{
		Gamesound sw=new Gamesound();
		ABC a=new ABC();
		a.setTitle("ABC tutorial");
		MyListener lis=new MyListener(a,sw);
		a.setVisible(true);
		sw.Sound("start.wav");
		for(int i=0;i<a.btn.length;i++)
		{
			a.btn[i].addActionListener(lis);
		}
	}
}