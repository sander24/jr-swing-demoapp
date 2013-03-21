package org.zeroturnaround.demoapps.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DemoApp extends JFrame {

  private static final long serialVersionUID = 1L;

  public DemoApp() {

    super("JRebel SDK Demo-app");
    setBounds(100, 200, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container con = this.getContentPane();
    
    LayoutManager mg = new SpringLayout();
    con.setLayout(mg);
    
    JButton button = new JButton("[[TEST]]");
    button.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        System.out.println("aasfsussfera");
      }
      
    });
    button.setSize(new Dimension(100, 20));
    con.add(button);
  }
  
}
