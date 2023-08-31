/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Quang Huy
 */
public class ViewController {
    public JPanel root;
    
    public String pageSelected = "";
    
    public List<ViewPanel> listPage = null;

    public ViewController(JPanel root) {
        this.root = root;
    }
    
    public void setView(JPanel jpnItem) {
        pageSelected = "Home";
        
        jpnItem.setBackground(new Color(0, 102, 102));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<ViewPanel> listPage) {
        this.listPage = listPage;
        
        for (ViewPanel s : listPage) {
            s.getPanelPage().addMouseListener(new LabelEvent(s.getPage(), s.getPanelPage()));
        }
    }
    
    class LabelEvent implements MouseListener {
        public JPanel node;
        
        public String page;
        
        public JPanel jpnPage;

        public LabelEvent(String page, JPanel jpnPage) {
            this.page = page;
            this.jpnPage = jpnPage;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(page);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            pageSelected = page;
            jpnPage.setBackground(new Color(0, 102, 102));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnPage.setBackground(new Color(0, 102, 102));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!pageSelected.equalsIgnoreCase(page)) {
                jpnPage.setBackground(new Color(0, 51, 102));
            }
        }
        
        public void setChangeBackground(String kind) {
            for (ViewPanel s : listPage) {
                if (s.getPage().equalsIgnoreCase(kind)) {
                    s.getPanelPage().setBackground(new Color(0, 102, 102));
                }
                else {
                    s.getPanelPage().setBackground(new Color(0, 51, 102));
                }
            }
        }
    }
}
