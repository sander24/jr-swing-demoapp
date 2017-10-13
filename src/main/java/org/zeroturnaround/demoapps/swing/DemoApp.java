package org.zeroturnaround.demoapps.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoApp extends JFrame {

  private static final long serialVersionUID = 1L;

  private static StringService stringService = StringService.getInstance();

  public DemoApp() {

    super("JRebel SDK Demo-app");
    setBounds(100, 200, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container con = this.getContentPane();
    
    LayoutManager mg = new SpringLayout();
    con.setLayout(mg);
    
    JButton button = new JButton("Print");
    button.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        System.out.println(stringService.duplicateString("koer"));
      }
      
    });
    button.setSize(new Dimension(100, 20));
    con.add(button);
  }
  
}
