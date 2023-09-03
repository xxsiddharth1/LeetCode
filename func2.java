
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code = eh.class width=200 height=200> </applet> */

public class eh extends Applet implements ActionListener
{
    TextField t1;
    Button b1,b2;
    public void init()
    {
        t1 = new TextField(20);
        b1 = new Button("Click Here");
        b2 = new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(t1);
        add(b2);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==b1)
        { 	t1.setText("Welcome ");   }
        if (ae.getSource()==b2)
        {	t1.setText("Good Luck");	}
    }
}