
package pizza.cashier.interference;

import SQLinfo.Information;
import information.CustomerAccount;
import information.Reward;
import information.accountsAndOrders;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;


/**
 *
 * @author m_che
 */
public class ordersTab extends javax.swing.JFrame {
    
    private static boolean currentlyOrdering = false;
    
    static ResultSet rs;
    static ResultSetMetaData rsmd;
    static CustomerAccount selectedAccount;
    /**
     * Creates new form ordersTab
     */
    public ordersTab() {
        if(accountsAndOrders.getRewards().size() <= 0) connectDB(Information.getUrlSQL(), Information.getUsernameSQL(), Information.getPasswordSQL());
        staffMain.setMode(true);
        listModel = new DefaultListModel<>();
        initComponents();
        
        if(selectedAccount != null) {
            txtName.setText(selectedAccount.getUsername());
            txtEmail.setText(selectedAccount.getEmail());
            txtRegularOrder.setText(selectedAccount.getRegularOrder());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public static void connectDB(String url, String username, String password) {
        try ( Connection conn = DriverManager.getConnection(url, username, password)) {

            Statement stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * FROM rewards");
            rsmd = rs.getMetaData();
            
            accountsAndOrders.getRewards().clear();
            
            while(rs.next()) {
                accountsAndOrders.getRewards().add(new Reward(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
            }

        } catch (Exception ex) {
            System.out.println("Connection failed..");
            System.out.println(ex);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane = new javax.swing.JLayeredPane();
        jPanel = new javax.swing.JPanel();
        orderItemsTxt = new javax.swing.JTextField();
        lblSelectCustomer = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        listOrder = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPrices = new javax.swing.JList<>();
        btnRegularItems = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        codeTxt = new javax.swing.JTextField();
        btnAddCode = new javax.swing.JButton();
        errorCode = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        lblSubTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        lblDiscounts = new javax.swing.JLabel();
        txtDiscounts = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        $ = new javax.swing.JLabel();
        $$ = new javax.swing.JLabel();
        $$$ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCustomers = new JList<>(listModel);
        btnPlaceOrder = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRegularOrder = new javax.swing.JTextArea();
        lblRegular = new javax.swing.JLabel();
        errorPlaceOrder = new javax.swing.JTextField();
        Menu = new javax.swing.JMenuBar();
        Home = new javax.swing.JMenu();
        File = new javax.swing.JMenu();
        menuLogOut = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane.setPreferredSize(new java.awt.Dimension(832, 500));
        jLayeredPane.setLayout(new java.awt.CardLayout());

        jPanel.setBackground(new java.awt.Color(204, 204, 255));
        jPanel.setPreferredSize(new java.awt.Dimension(832, 500));

        orderItemsTxt.setEditable(false);
        orderItemsTxt.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        orderItemsTxt.setText("Order Items");
        orderItemsTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        orderItemsTxt.setSelectionColor(new java.awt.Color(204, 102, 0));

        lblSelectCustomer.setText("Select Customer...");

        searchTxt.setText("Search...");
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        listOrder.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        listOrder.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return accountsAndOrders.getCurrentOrder().size(); }
            public String getElementAt(int i) { return accountsAndOrders.getCurrentOrder().get(i) + " . . . . . ."; }
        });
        jScrollPane.setViewportView(listOrder);

        listPrices.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        listPrices.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return accountsAndOrders.getCurrentPrices().size(); }
            public String getElementAt(int i) { return "" + accountsAndOrders.getCurrentPrices().get(i); }
        });
        jScrollPane1.setViewportView(listPrices);

        btnRegularItems.setText(" Items");
        btnRegularItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegularItemsActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        codeTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codeTxt.setText("Code...");

        btnAddCode.setText("Add Code");
        btnAddCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCodeActionPerformed(evt);
            }
        });

        errorCode.setEditable(false);
        errorCode.setBackground(new java.awt.Color(204, 204, 255));
        errorCode.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        errorCode.setForeground(new java.awt.Color(204, 0, 0));
        errorCode.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        errorCode.setText(" ");
        errorCode.setBorder(null);

        panel.setBackground(new java.awt.Color(204, 204, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTotal.setText("Sub Total:");

        txtSubTotal.setEditable(false);
        revalidateSubTotal();

        lblDiscounts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiscounts.setText("Discounts:");

        txtDiscounts.setEditable(false);

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total:");

        txtTotal.setEditable(false);
        double totalPrice = 0.0;
        if(!txtSubTotal.getText().equals("")) {
            if(!txtDiscounts.getText().equals("")) {
                totalPrice = (Double.parseDouble(txtSubTotal.getText()) - Double.parseDouble(txtDiscounts.getText())) * 1.06;
            } else {
                totalPrice = Double.parseDouble(txtSubTotal.getText()) * 1.06;
            }
            txtTotal.setText("" + Math.round(totalPrice * 100.0) / 100.0);
        } else {
            txtTotal.setText("");
        }

        $.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        $.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        $.setText("$");

        $$.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        $$.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        $$.setText("$");

        $$$.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        $$$.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        $$$.setText("$");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent($)
                            .addComponent($$)
                            .addComponent($$$))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSubTotal)
                            .addComponent(txtDiscounts)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblDiscounts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent($))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiscounts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiscounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent($$))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent($$$))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        listCustomers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCustomersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCustomers);

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtRegularOrder.setEditable(false);
        txtRegularOrder.setColumns(20);
        txtRegularOrder.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtRegularOrder.setLineWrap(true);
        txtRegularOrder.setRows(5);
        txtRegularOrder.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtRegularOrder);

        lblRegular.setText("Regular:");

        errorPlaceOrder.setEditable(false);
        errorPlaceOrder.setBackground(new java.awt.Color(204, 204, 255));
        errorPlaceOrder.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        errorPlaceOrder.setForeground(new java.awt.Color(204, 0, 0));
        errorPlaceOrder.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        errorPlaceOrder.setText(" ");
        errorPlaceOrder.setBorder(null);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderItemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTxt)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addComponent(lblRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtEmail)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnAddCode))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDelete)
                                .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnRegularItems))
                    .addComponent(errorPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblSelectCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderItemsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelectCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane)
                            .addComponent(jScrollPane1))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnRegularItems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(81, 81, 81)
                        .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlaceOrder)
                        .addGap(79, 79, 79))))
        );

        jLayeredPane.add(jPanel, "card2");

        Menu.setPreferredSize(new java.awt.Dimension(123, 35));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/cashier/interference/images/Pizza Cashier Interface (HACKATHON).png"))); // NOI18N
        Home.setMaximumSize(new java.awt.Dimension(40, 33));
        Home.setMinimumSize(new java.awt.Dimension(20, 33));
        Home.setPreferredSize(new java.awt.Dimension(40, 33));

        Home.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                accountsAndOrders.getCurrentOrder().clear();
                accountsAndOrders.getCurrentPrices().clear();
                currentlyOrdering = false;
                selectedAccount = null;
                staffMain sMain = new staffMain();
                sMain.setVisible(true);
                dispose();
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        Menu.add(Home);

        File.setText("File");

        menuLogOut.setText("Log Out");
        menuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogOutActionPerformed(evt);
            }
        });
        File.add(menuLogOut);

        Menu.add(File);

        Help.setText("Help");
        Menu.add(Help);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(854, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogOutActionPerformed
        staffMain.setMode(false);
        managerLoginPage managerMode = new managerLoginPage();
        managerMode.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuLogOutActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        if(txtName.getText().equals("") || accountsAndOrders.getCurrentOrder().size() <= 0) {
            errorPlaceOrder.setText("Order is not finished!");
        } else {
            int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit this order?", "order", JOptionPane.YES_NO_OPTION);
            if(input == 0) { //yes
                
                Date dNow = new Date();
                SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");
                
                try (Connection conn = DriverManager.getConnection(Information.getUrlSQL(), Information.getUsernameSQL(), Information.getPasswordSQL())) {
                    Statement stat = conn.createStatement();
                    System.out.println(ft.format(dNow));
                    stat.executeUpdate("INSERT INTO `foods`.`sales` (`date`, `sold`) VALUES ('" + ft.format(dNow) + "', '" + Double.parseDouble(txtTotal.getText()) + "');");
                } catch(Exception ex) {System.out.println(ex);}
                
                errorPlaceOrder.setText("");
                errorCode.setText("");
                selectedAccount = null;
                accountsAndOrders.getCurrentOrder().clear();
                accountsAndOrders.getCurrentPrices().clear(); 
                JOptionPane.showMessageDialog(null, "Successfully placed order.", "success", JOptionPane.INFORMATION_MESSAGE);
                
                ordersTab oTab = new ordersTab();
                oTab.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        try (Connection conn = DriverManager.getConnection(Information.getUrlSQL(), Information.getUsernameSQL(), Information.getPasswordSQL())) {
            listModel.removeAllElements();
            String val = searchTxt.getText().trim();
            if(!val.equals("")) {
                Statement s = conn.createStatement();
                rs = s.executeQuery("SELECT * FROM foods.customeracc WHERE email like '%" + val + "%' or name like '%" + val + "%' LIMIT 5");

                while(rs.next()) {
                    listModel.addElement(new CustomerAccount(rs.getString(2), rs.getString(3)).getEmail());
                }
            }
        } catch(Exception ex) {System.out.println(ex);}
    }//GEN-LAST:event_searchTxtKeyReleased

    private void listCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCustomersMouseClicked
        if(listCustomers.getSelectedValue() != null) {
            selectedAccount = accountsAndOrders.findCustomerAccount(listCustomers.getSelectedValue());
            txtName.setText(selectedAccount.getUsername());
            txtEmail.setText(selectedAccount.getEmail());
            txtRegularOrder.setText(selectedAccount.getRegularOrder());
        }
    }//GEN-LAST:event_listCustomersMouseClicked

    private void btnRegularItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegularItemsActionPerformed
        currentlyOrdering = true;
        managerMenuTab mMenu = new managerMenuTab();
        mMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegularItemsActionPerformed

    private void btnAddCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCodeActionPerformed
        
        boolean exists = false;
        Reward reward = accountsAndOrders.findRewards(codeTxt.getText());
        
        for(double multiplier : accountsAndOrders.getCurrentRewards()) {
            if(multiplier == reward.getMultiplier()) {
                exists = true;
            }
        }
        if(reward != null && !exists) {
            errorCode.setText("");
            accountsAndOrders.addOrderReward(reward.getMultiplier());
            txtDiscounts.revalidate();
            txtDiscounts.repaint();
            revalidateDiscounts();
        } else {
            errorCode.setText("Reward code must be valid.");
            errorCode.revalidate();
            errorCode.repaint();
        }
    }//GEN-LAST:event_btnAddCodeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(listOrder.getSelectedValue() != null) {
            int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "delete", JOptionPane.YES_NO_OPTION);
            if(input == 0) { //yes
                accountsAndOrders.getCurrentOrder().remove(listOrder.getSelectedIndex());
                accountsAndOrders.getCurrentPrices().remove(listOrder.getSelectedIndex());
                revalidateSubTotal();
                listOrder.revalidate(); listOrder.repaint();
                listPrices.revalidate(); listPrices.repaint();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed
    
    private void revalidateSubTotal() {
        double total = 0.0;
        if (!accountsAndOrders.getCurrentPrices().isEmpty()) {
            for (int i = 0; i < accountsAndOrders.getCurrentPrices().size(); i++) {
                total += accountsAndOrders.getCurrentPrices().get(i);
            }
            txtSubTotal.setText("" + Math.round(total * 100.0) / 100.0);
            revalidateDiscounts();
        } else {
            txtSubTotal.setText("");
        }
    }
    
    private void revalidateDiscounts() {
        double totalOff = 0.0;
        if(!txtSubTotal.getText().trim().equals("")) {
            System.out.println(accountsAndOrders.getCurrentRewards().size());
            for(double disc : accountsAndOrders.getCurrentRewards()) {
                totalOff += (Double.parseDouble(txtSubTotal.getText()) * disc);
            }
            System.out.println(Math.round(totalOff * 100.0) / 100.0);
            txtDiscounts.setText("" + Math.round(totalOff * 100.0) / 100.0);
        } else {
            txtDiscounts.setText("");
        }
        
        //fix total txt
        double totalPrice = 0.0;
        if (!txtSubTotal.getText().equals("")) {
            if (!txtDiscounts.getText().equals("")) {
                totalPrice = (Double.parseDouble(txtSubTotal.getText()) - Double.parseDouble(txtDiscounts.getText())) * 1.06;
            } else {
                totalPrice = Double.parseDouble(txtSubTotal.getText()) * 1.06;
            }
            txtTotal.setText("" + Math.round(totalPrice * 100.0) / 100.0);
        } else {
            txtTotal.setText("");
        }
    }
    
    
    public static boolean getCurrentOrderState() {
        return currentlyOrdering;
    }
    
    public static void setCurrentOrderState(boolean state) {
        currentlyOrdering = state;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel $;
    private javax.swing.JLabel $$;
    private javax.swing.JLabel $$$;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Home;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton btnAddCode;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnRegularItems;
    private javax.swing.JTextField codeTxt;
    private javax.swing.JTextField errorCode;
    private javax.swing.JTextField errorPlaceOrder;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel jPanel;
    private static javax.swing.JScrollPane jScrollPane;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDiscounts;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRegular;
    private javax.swing.JLabel lblSelectCustomer;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> listCustomers;
    private javax.swing.JList<String> listOrder;
    private javax.swing.JList<String> listPrices;
    private javax.swing.JMenuItem menuLogOut;
    private javax.swing.JTextField orderItemsTxt;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField txtDiscounts;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtRegularOrder;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel<String> listModel;
}
