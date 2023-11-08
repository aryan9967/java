import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menubar extends JFrame implements ActionListener {

    JFrame f=new JFrame("notepad");
    JMenuBar mb=new JMenuBar();
    JMenu fi=new JMenu("File");
    JMenu ed=new JMenu("Edit");
    JMenu v=new JMenu("View");

    JMenuItem copy=new JMenuItem("Copy");
    JMenuItem cut=new JMenuItem("Cut");
    JMenuItem paste=new JMenuItem("paste");
    JTextArea txt=new JTextArea();
    menubar(){
        f.setJMenuBar(mb);
        mb.add(fi);
        mb.add(ed);
        mb.add(v);

        ed.add(copy);
        ed.add(cut);
        ed.add(paste);

        txt.setBounds(0,0,400,400);
        f.add(txt);

        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==copy){
            txt.copy();
        }
        if(e.getSource()==cut)
        {
            txt.cut();
        }
        if(e.getSource()==paste){
            txt.paste();
        }
    }

    public static void main(String[] args) {
        new menubar();
    }
}
