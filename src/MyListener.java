import java.awt.event.*;

public class MyListener implements ActionListener
{
	ABC a;
	Gamesound ss;
	String[] rr={"a.wav","b.wav","c.wav","d.wav",
				 "e.wav","f.wav","g.wav","h.wav",
				 "i.wav","j.wav","k.wav","l.wav",
				 "m.wav","n.wav","o.wav","p.wav",
				 "q.wav","r.wav","s.wav","t.wav",
				 "u.wav","v.wav","w.wav","x.wav",
				 "y.wav","z.wav"};
	public MyListener(ABC a, Gamesound ss) 
	{
		this.a=a;
		this.ss=ss;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for(int i=0;i<a.btn.length;i++)
		{
			if(e.getSource()==a.btn[i])
			{
				a.imagePanel.removeAll();
				a.imagePanel.add(a.lable[i]);
                ss.Sound(rr[i]);
				a.imagePanel.updateUI();
				
			}
		}
	}
}