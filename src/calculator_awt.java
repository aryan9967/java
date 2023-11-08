import java.awt.*;
import java.awt.event.*;

public class calculator_awt implements ActionListener {

    Frame f=new Frame("Calculator");
    Label l1=new Label("Enter first number:");
    Label l2=new Label("Enter second number:");
    Label l3=new Label("result:");

    Button add=new Button("Add");
    Button subtract=new Button("Subtract");
    Button multiply=new Button("multiply");
    Button divide=new Button("divide");
    Button cancel=new Button("cancel");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    calculator_awt(){
        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100, 30);
        l3.setBounds(50, 150, 100, 30);
        t1.setBounds(200, 50, 100, 30);
        t2.setBounds(200, 100, 100, 30);
        t3.setBounds(200, 150, 100, 30);

        add.setBounds(50, 200, 50, 30);
        subtract.setBounds(150, 200, 50, 30);
        multiply.setBounds(250, 200, 50, 30);
        divide.setBounds(350, 200,50,30);
        cancel.setBounds(250, 300,50,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(add);
        f.add(subtract);
        f.add(multiply);
        f.add(divide);
        f.add(cancel);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        cancel.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(800,800);
    }
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==add)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==subtract)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1-n2));
        }
        if(e.getSource()==multiply)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1*n2));
        }
        if(e.getSource()==divide)
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1/n2));
        }
        if(e.getSource()==cancel)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        calculator_awt calculatorAwt = new calculator_awt();
    }
}

