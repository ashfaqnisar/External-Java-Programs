import java.awt.*;
import java.awt.event.*;


public class FrameBuilder {
    Frame f1;
    Label l1,l2;
    Button b1,b2;
    TextField tf1,tf2;
    Label result;

    public void prepareGUI(){
        init();
        addToFrame();

        f1.setVisible(true);
        f1.setSize(1000,1000);
        f1.setBackground(Color.cyan);
        f1.setLayout(null);
        f1.setLayout(new GridLayout(5,2));

        setAllTheBounds();

        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = tf1.getText();
                result.setText("Hi there" + user+"How are you");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = tf2.getText();
                result.setText("Your Password is" + pass);
            }
        });
    }


    public void init(){
         f1 = new Frame();

         l1 = new Label("UserName");
         l2 = new Label("Password");

         b1 = new Button("Login");
         b2 = new Button("Sign Up");

         tf1 = new TextField(20);
         tf2 = new TextField(20);

         result = new Label("Hi there");
    }


    public void addToFrame() {
        f1.add(l1);
        f1.add(l2);

        f1.add(b1);
        f1.add(b2);

        f1.add(tf1);
        f1.add(tf2);

        f1.add(result);
    }

    public void setAllTheBounds() {
        l1.setBounds(50,50,60,40);
        l2.setBounds(50,70,60,40);

        b1.setBounds(50,100,60,40);
        b2.setBounds(100,100,60,40);

        tf1.setBounds(80,50,60,40);
        tf2.setBounds(80,70,60,40);

        result.setBounds(90,120,60,40);
    }
}
