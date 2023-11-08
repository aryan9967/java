import java.awt.event.*;
import javax.swing.*;
public class student_from_swing extends JFrame implements ActionListener {
    JFrame st= new JFrame("Student form");
    JLabel l1=new JLabel("Student name");
    JTextField t1=new JTextField();
    JLabel l2= new JLabel("Contact No:");
    JTextField t2=new JTextField();

    JLabel l3= new JLabel("Gender:");
    JLabel l4= new JLabel("Age:");
    JLabel l5= new JLabel("Hobbies:");

    JRadioButton rb1 =new JRadioButton("Male");
    JRadioButton rb2=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    JCheckBox c1=new JCheckBox("Reading");
    JCheckBox c2=new JCheckBox("singing");
    JButton b1=new JButton("Submit");
    JTextArea txt=new JTextArea();

    String age[]={"17", "18", "19", "20"};
    JComboBox co=new JComboBox(age);
    student_from_swing(){
        bg.add(rb1);
        bg.add(rb2);

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(200, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(200, 100, 100, 30);
        st.add(l1);
        st.add(t1);
        st.add(l2);
        st.add(t2);

        l3.setBounds(50, 150, 100, 30);
        rb1.setBounds(200, 150, 100, 30);
        rb2.setBounds(300, 150, 100, 30);
        st.add(l3);
        st.add(rb1);
        st.add(rb2);

        l4.setBounds(50, 200, 100, 30);
        co.setBounds(200, 200, 100,30);
        st.add(l4);
        st.add(co);

        l5.setBounds(50, 250, 100, 30);
        c1.setBounds(150, 250, 100, 30);
        c2.setBounds(250, 250, 100, 30);
        st.add(l5);
        st.add(c1);
        st.add(c2);

        b1.setBounds(100, 300, 80, 30);
        st.add(b1);
        b1.addActionListener(this);

        txt.setBounds(50, 350, 400, 500);
        st.add(txt);

        st.setLayout(null);
        st.setVisible(true);
        st.setSize(800,800);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String name=t1.getText();
        String contact=t2.getText();
        String Gender=rb1.isSelected()? "Male": rb2.isSelected()? "Female":"-";
        String Age=co.getItemAt(co.getSelectedIndex()).toString();
        String hobbies="";
        if(c1.isSelected()){
            hobbies+="Reading";
        }
        if(c2.isSelected()){
            hobbies+="Singing";
        }
        txt.setText("Name: "+name+"\nContact: "+contact+"\nGender: "+Gender+"\nAge: "+Age+"\nHobbies: "+hobbies);
    }

    public static void main(String[] args) {
        new student_from_swing();
    }
}
