package org.zeroturnaround.demoapps.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.apache.log4j.Logger;

public class DemoApp extends JFrame {

  private static final long serialVersionUID = 1L;

  private static Logger log = Logger.getLogger(DemoApp.class);
  
  public DemoApp() {

    super("JRebel SDK Demo-app");

    log.debug("hey-ho.. message from log4j!");
    
    setBounds(100, 200, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container con = this.getContentPane();
    
    LayoutManager mg = new SpringLayout();
    con.setLayout(mg);
    
    JButton button = new JButton("[[TEST]]");
    button.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        //System.out.println("aaa");
        log.debug("sssgsagg");
      }
      
    });
    button.setSize(new Dimension(100, 20));
    con.add(button);
  }
  
}
