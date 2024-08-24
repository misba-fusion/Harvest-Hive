package real;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Home extends JFrame{
    
    JPanel mainPanel;
    JMenuBar menuBar;
    JPanel currentPanel;
    
    public Home(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(currentPanel = new JPanel(), BorderLayout.CENTER);
        JMenuBar mainMenu = new javax.swing.JMenuBar();
        
        
        //Farmes Menu !!!!!!!!!!!!!!!!
        JMenu farmersMenu = new javax.swing.JMenu("Farmers");
        
        JMenuItem addFarmersMenuItem = new javax.swing.JMenuItem("Add Farmers");
        addFarmersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new AddFarmerPanel());
            }
        });
        JMenuItem viewFarmersMenuItem = new javax.swing.JMenuItem("View Farmers");
        viewFarmersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new ViewFarmerPanel());
            }
        });
        farmersMenu.add(addFarmersMenuItem);
        farmersMenu.add(viewFarmersMenuItem);
        
        //Paddy Menu !!!!!!!!!!!!!!!!
        JMenu paddyMenu = new javax.swing.JMenu("Paddy");
        
        JMenuItem addPaddyMenuItem = new javax.swing.JMenuItem("Add Paddy");
        addPaddyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new AddPaddyPanel());
            }
        });
        JMenuItem viewPaddyMenuItem = new javax.swing.JMenuItem("View Paddy");
        viewPaddyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new ViewPaddyPanel());
            }
        });
        paddyMenu.add(addPaddyMenuItem);
        paddyMenu.add(viewPaddyMenuItem);
        
        //Milling Menu !!!!!!!!!!!!!!!!
        JMenu millingMenu = new javax.swing.JMenu("Milling");
        
        JMenuItem addMillingMenuItem = new javax.swing.JMenuItem("Add Milling");
        addMillingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new AddMillingPanel());
            }
        });
        JMenuItem viewMillingMenuItem = new javax.swing.JMenuItem("View Milling");
        viewMillingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new ViewMillingPanel());
            }
        });
        millingMenu.add(addMillingMenuItem);
        millingMenu.add(viewMillingMenuItem);
        
        //Inventory Menu !!!!!!!!!!!!!!!!
        JMenu inventoryMenu = new javax.swing.JMenu("Inventory");
        
        JMenuItem addInventoryMenuItem = new javax.swing.JMenuItem("Add Inventory");
        addInventoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new AddInventoryPanel());
            }
        });
        JMenuItem viewInventoryMenuItem = new javax.swing.JMenuItem("View Inventory");
        viewInventoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new ViewInventoryPanel());
            }
        });
        inventoryMenu.add(addInventoryMenuItem);
        inventoryMenu.add(viewInventoryMenuItem);
        
        //Shop Menu !!!!!!!!!!!!!!!!
        JMenu shopMenu = new javax.swing.JMenu("Shop");
        
        JMenuItem addShopMenuItem = new javax.swing.JMenuItem("Add Shop");
        addShopMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new AddShopPanel());
            }
        });
        JMenuItem viewShopMenuItem = new javax.swing.JMenuItem("View Shop");
        viewShopMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new ViewShopPanel());
            }
        });
        shopMenu.add(addShopMenuItem);
        shopMenu.add(viewShopMenuItem);
        
        //Sales Menu !!!!!!!!!!!!!!!!
        JMenu salesMenu = new javax.swing.JMenu("Sales");
        
        JMenuItem addSalesMenuItem = new javax.swing.JMenuItem("Add Sales");
        addSalesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new AddSalesPanel());
            }
        });
        JMenuItem viewSalesMenuItem = new javax.swing.JMenuItem("View Sales");
        viewSalesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPanel(new ViewSalesPanel());
            }
        });
        salesMenu.add(addSalesMenuItem);
        salesMenu.add(viewSalesMenuItem);
        
        
        mainMenu.add(farmersMenu);
        mainMenu.add(paddyMenu);
        mainMenu.add(millingMenu);
        mainMenu.add(inventoryMenu);
        mainMenu.add(shopMenu);
        mainMenu.add(salesMenu);
        
        
        
        this.setJMenuBar(mainMenu);
        this.add(mainPanel);
        this.setSize(960, 800);
        this.setVisible(true);
    }
    
    
    void setPanel(JPanel newjp) {
        mainPanel.remove(currentPanel);
        currentPanel = newjp;
        mainPanel.add(newjp, BorderLayout.CENTER);
        mainPanel.validate();
    }
     public static void main(String[] args) {
        new Home();

    }
    
}
