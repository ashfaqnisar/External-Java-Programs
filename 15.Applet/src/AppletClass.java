import java.applet.*;
import java.awt.*;

public class AppletClass extends Applet {
    public void init(){
        setBackground(Color.cyan);
        System.out.println("In the Init Method....");
    }

    public void stop(){
        System.out.println("In the Stop Method");
    }

    public void paint(Graphics G){
        G.drawString("Ashfaq Nisar",80,80);
        G.drawLine(80,80,160,160);
        G.drawOval(80,200,300,300);
        G.drawRect(80,250,160,160);

    }
}
