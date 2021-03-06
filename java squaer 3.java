import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Rect extends Applet
{
private int count = 0;
private Color col = Color.black;
public void paint(Graphics g)
{
int min, x=getSize().width/2, y=getSize().height/2;
if (x &gt; y)min=y/2;
else min=x/2;
g.setColor(col);
switch(count%5)
{
case 1:
g.drawLine(x+min,y+min,x+min,y-min);
break;
case 2:
g.drawLine(x+min,y+min,x+min,y-min);
g.drawLine(x+min,y-min,x- min,y-min);
break;
case 3:
g.drawLine(x+min,y+min,x+min,y-min);
g.drawLine(x+min,y-min,x- min,y-min);
g.drawLine(x-min,y- min,x-min,y+min);
break;
case 4:
g.drawLine(x+min,y+min,x+min,y-min);
g.drawLine(x+min,y-min,x- min,y-min);
g.drawLine(x-min,y- min,x-min,y+min);
g.drawLine(x-min,y+min,x+min,y+min);
break;
}
}
public void init()
{
final Label l = new Label(String.valueOf(count));
Button b = new Button(&quot;I&#39;m drawing&quot;);
final Choice c = new Choice();
c.add(&quot;black&quot;);
c.add(&quot;red&quot;);

b.addActionListener(new ActionListener()
{

public void actionPerformed(ActionEvent ae)
{
l.setText(String.valueOf((++count)%5));
switch (c.getSelectedIndex())
{
case 0:
col=Color.black;
break;
case 1:
col=Color.red;
break;
}
repaint();
}
});
add(l);
add(c);
add(b);

}
}
