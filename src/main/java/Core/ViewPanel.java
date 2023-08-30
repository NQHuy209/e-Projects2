/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import javax.swing.JPanel;

/**
 *
 * @author Quang Huy
 */
public class ViewPanel {
    public String page;

    public JPanel panelPage;

    public ViewPanel() {
    }

    public ViewPanel(String page, JPanel panelPage) {
        this.page = page;
        this.panelPage = panelPage;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public JPanel getPanelPage() {
        return panelPage;
    }

    public void setPanelPage(JPanel panelPage) {
        this.panelPage = panelPage;
    }
}