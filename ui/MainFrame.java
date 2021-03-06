package ui;

import constants.CurrentItemConstants;
import constants.MyColorConstants;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import jiconfont.IconCode;
import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jains
 */
public class MainFrame extends javax.swing.JFrame implements CurrentItemConstants, MyColorConstants {

    private final SubStockPanel ssp;
    private JPanel curPanel = null;
    private DashPanel dashPanel = null;
    private CustomerPanel customerPanel = null;
    private InvoicePanel ip = null;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {

        initComponents();
        IconFontSwing.register(FontAwesome.getIconFont());
        initIcons();
        setIconImage();
        ssp = new SubStockPanel(this);
        dashPanel = new DashPanel();
        customerPanel = new CustomerPanel();
        frontPanel.add(dashPanel, new AbsoluteConstraints(0, 0));
        curPanel = dashPanel;
        activeItem = NONE;
    }

    /**
     * setIconImage method is used for setting the Image icon for the
     * application
     */
    private void setIconImage() {
        setIconImage(new ImageIcon(getClass().getResource("/resources/invoice.png")).getImage());
    }

    /**
     * Initializes the icon used on the User Interface such as dollar, product,
     * etc. FontAwesome library is used for icons.
     */
    private void initIcons() {
        Icon icon = IconFontSwing.buildIcon(FontAwesome.CUBES, ICONSIZE, MYWHITE);
        jlblStockIcon.setIcon(icon);
        icon = IconFontSwing.buildIcon(FontAwesome.USER, ICONSIZE, MYWHITE);
        jlblCustomerIcon.setIcon(icon);
        icon = IconFontSwing.buildIcon(FontAwesome.FILE_TEXT, ICONSIZE, MYWHITE);
        jlblInvoiceIcon.setIcon(icon);
        icon = IconFontSwing.buildIcon(FontAwesome.HOME, 58, MYWHITE);
        jlblHomeIcon.setIcon(icon);
        icon = IconFontSwing.buildIcon(FontAwesome.ANGLE_RIGHT, ICONSIZE, MYBLUE);
        lblArrow.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        toolPanel = new javax.swing.JPanel();
        jStockPanel = new javax.swing.JPanel();
        jlblStockIcon = new javax.swing.JLabel();
        jlblStock = new javax.swing.JLabel();
        lblArrow = new javax.swing.JLabel();
        jCustomerPanel = new javax.swing.JPanel();
        jlblCustomerIcon = new javax.swing.JLabel();
        jlblCustomer = new javax.swing.JLabel();
        jInvoicePanel = new javax.swing.JPanel();
        jlblInvoiceIcon = new javax.swing.JLabel();
        jlbInvoice = new javax.swing.JLabel();
        jlblHomeIcon = new javax.swing.JLabel();
        frontPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incoive Creator");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1980, 1000));

        mainPanel.setBackground(new java.awt.Color(255, 250, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toolPanel.setBackground(new java.awt.Color(30, 27, 24));

        jStockPanel.setBackground(new java.awt.Color(30, 27, 24));
        jStockPanel.setToolTipText("Manage Your Stock");
        jStockPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jStockPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStockPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jStockPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jStockPanelMouseExited(evt);
            }
        });

        jlblStockIcon.setBackground(new java.awt.Color(30, 27, 24));
        jlblStockIcon.setForeground(new java.awt.Color(255, 250, 255));
        jlblStockIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblStockIcon.setOpaque(true);

        jlblStock.setFont(new java.awt.Font("Copse", 0, 30)); // NOI18N
        jlblStock.setForeground(new java.awt.Color(15, 163, 177));
        jlblStock.setText("Stock");

        lblArrow.setBackground(new java.awt.Color(30, 27, 24));
        lblArrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jStockPanelLayout = new javax.swing.GroupLayout(jStockPanel);
        jStockPanel.setLayout(jStockPanelLayout);
        jStockPanelLayout.setHorizontalGroup(
            jStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jStockPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlblStockIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jStockPanelLayout.setVerticalGroup(
            jStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblStockIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblArrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jStockPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jCustomerPanel.setBackground(new java.awt.Color(30, 27, 24));
        jCustomerPanel.setToolTipText("Add a new Customer");
        jCustomerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCustomerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCustomerPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCustomerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCustomerPanelMouseExited(evt);
            }
        });

        jlblCustomerIcon.setBackground(new java.awt.Color(30, 27, 24));
        jlblCustomerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCustomerIcon.setOpaque(true);

        jlblCustomer.setFont(new java.awt.Font("Copse", 0, 30)); // NOI18N
        jlblCustomer.setForeground(new java.awt.Color(15, 163, 177));
        jlblCustomer.setText("Customer");

        javax.swing.GroupLayout jCustomerPanelLayout = new javax.swing.GroupLayout(jCustomerPanel);
        jCustomerPanel.setLayout(jCustomerPanelLayout);
        jCustomerPanelLayout.setHorizontalGroup(
            jCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlblCustomerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jCustomerPanelLayout.setVerticalGroup(
            jCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblCustomerIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInvoicePanel.setBackground(new java.awt.Color(30, 27, 24));
        jInvoicePanel.setToolTipText("Create Invoice");
        jInvoicePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jInvoicePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInvoicePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInvoicePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jInvoicePanelMouseExited(evt);
            }
        });

        jlblInvoiceIcon.setBackground(new java.awt.Color(30, 27, 24));
        jlblInvoiceIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblInvoiceIcon.setOpaque(true);

        jlbInvoice.setFont(new java.awt.Font("Copse", 0, 30)); // NOI18N
        jlbInvoice.setForeground(new java.awt.Color(15, 163, 177));
        jlbInvoice.setText("Invoice");

        javax.swing.GroupLayout jInvoicePanelLayout = new javax.swing.GroupLayout(jInvoicePanel);
        jInvoicePanel.setLayout(jInvoicePanelLayout);
        jInvoicePanelLayout.setHorizontalGroup(
            jInvoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInvoicePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlblInvoiceIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jlbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInvoicePanelLayout.setVerticalGroup(
            jInvoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblInvoiceIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jInvoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlblHomeIcon.setBackground(new java.awt.Color(30, 27, 24));
        jlblHomeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHomeIcon.setToolTipText("Home");
        jlblHomeIcon.setOpaque(true);
        jlblHomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblHomeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblHomeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblHomeIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout toolPanelLayout = new javax.swing.GroupLayout(toolPanel);
        toolPanel.setLayout(toolPanelLayout);
        toolPanelLayout.setHorizontalGroup(
            toolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jStockPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jInvoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(toolPanelLayout.createSequentialGroup()
                .addComponent(jlblHomeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        toolPanelLayout.setVerticalGroup(
            toolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolPanelLayout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(jStockPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jInvoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jlblHomeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(toolPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 963));

        frontPanel.setBackground(new java.awt.Color(255, 250, 255));
        frontPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.add(frontPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 0, 1620, 963));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jInvoicePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInvoicePanelMouseExited
        if (activeItem != INVOICE) {
            itemMouseExited(jInvoicePanel, jlbInvoice, FontAwesome.FILE_TEXT, jlblInvoiceIcon, ICONSIZE);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jInvoicePanelMouseExited

    private void jInvoicePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInvoicePanelMouseEntered
        if (activeItem != INVOICE) {
            itemMouseOver(jInvoicePanel, jlbInvoice, FontAwesome.FILE_TEXT, jlblInvoiceIcon, ICONSIZE);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jInvoicePanelMouseEntered

    private void jCustomerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerPanelMouseExited
        if (activeItem != CUSTOMER) {
            itemMouseExited(jCustomerPanel, jlblCustomer, FontAwesome.USER, jlblCustomerIcon, ICONSIZE);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jCustomerPanelMouseExited

    private void jCustomerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerPanelMouseEntered
        if (activeItem != CUSTOMER) {
            itemMouseOver(jCustomerPanel, jlblCustomer, FontAwesome.USER, jlblCustomerIcon, ICONSIZE);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jCustomerPanelMouseEntered

    private void jStockPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStockPanelMouseExited
        if (activeItem != STOCK) {
            itemMouseExited(jStockPanel, jlblStock, FontAwesome.CUBES, jlblStockIcon, ICONSIZE);
            lblArrow.setIcon(IconFontSwing.buildIcon(FontAwesome.ANGLE_RIGHT, ICONSIZE, MYBLUE));
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jStockPanelMouseExited

    private void jStockPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStockPanelMouseEntered
        if (activeItem != STOCK) {
            itemMouseOver(jStockPanel, jlblStock, FontAwesome.CUBES, jlblStockIcon, ICONSIZE);
            lblArrow.setIcon(IconFontSwing.buildIcon(FontAwesome.ANGLE_RIGHT, ICONSIZE, MYWHITE));
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jStockPanelMouseEntered

    private void jStockPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStockPanelMouseClicked
        if (!isActive) {
            addSubPanel();
        } else {
            removeSubPanel();
        }

    }//GEN-LAST:event_jStockPanelMouseClicked

    private void jCustomerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerPanelMouseClicked
        if (activeItem != CUSTOMER) {
            itemMouseClicked(jCustomerPanel, jlblCustomer, FontAwesome.USER, jlblCustomerIcon, ICONSIZE);
            displayPanel(customerPanel);
            activeItem = CUSTOMER;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jCustomerPanelMouseClicked
    /**
     * Takes the user back to the home screen.
     */
    public void showHome() {
        displayPanel(dashPanel);
        dashPanel.updateChanges();
        reset(activeItem);
        activeItem = HOME;
    }

    /**
     *
     * @param jPanel sets the jPanel to the front panel which is visible and
     * removes the other panels from the front
     */
    public void displayPanel(JPanel jPanel) {
        if (isActive) {
            removeSubPanel();
        }
        if (curPanel != null) {
            frontPanel.remove(curPanel);
        }
        frontPanel.add(jPanel, new AbsoluteConstraints(0, 0));
        repaint();
        pack();
        curPanel = jPanel;
    }
    private void jInvoicePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInvoicePanelMouseClicked
        if (activeItem != INVOICE) {
            itemMouseClicked(jInvoicePanel, jlbInvoice, FontAwesome.FILE_TEXT, jlblInvoiceIcon, ICONSIZE);
            ip = new InvoicePanel(this);
            displayPanel(ip);
            ip.updateChanges();
            activeItem = INVOICE;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jInvoicePanelMouseClicked

    private void jlblHomeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblHomeIconMouseEntered
        itemMouseOver(null, null, FontAwesome.HOME, jlblHomeIcon, 58);
    }//GEN-LAST:event_jlblHomeIconMouseEntered

    private void jlblHomeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblHomeIconMouseExited
        itemMouseExited(null, null, FontAwesome.HOME, jlblHomeIcon, 58);
    }//GEN-LAST:event_jlblHomeIconMouseExited

    private void jlblHomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblHomeIconMouseClicked

        if (activeItem != HOME) {
            dashPanel.updateChanges();
            displayPanel(dashPanel);
            reset(activeItem);
            activeItem = HOME;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jlblHomeIconMouseClicked

    /**
     * removes the subPanel i.e a small panel which appears when the product
     * menu is clicked. It is removed with an animation effect.
     */
    void removeSubPanel() {
        if (t != null) {
            if (t.isRunning()) {
                t.stop();
            }
        }
        Dimension d = new Dimension((int) ssp.getPreferredSize().getWidth(), (int) ssp.getPreferredSize().getHeight());
        ssp.setPreferredSize(d);
        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (d.width >= 100) {
                    d.width -= 3;
                } else {
                    d.width -= 5;
                }
                if (d.width >= -10) {
                    ssp.setSize(d.width, d.height);
                    ssp.validate();
                } else {
                    t.stop();
                    frontPanel.remove(ssp);
                }
            }
        });
        t.start();
        isActive = !isActive;
    }

    /**
     * resets all the User Interface back to normal, with all the effects to
     * none.
     *
     * @param activeItem to reset or to show no menu is selected. activeItem
     * represents the current panel onto the front.
     */
    private void reset(int activeItem) {
        if (activeItem == CUSTOMER) {
            itemMouseExited(jCustomerPanel, jlblCustomer, FontAwesome.USER, jlblCustomerIcon, ICONSIZE);
            customerPanel.reset();
        } else if (activeItem == INVOICE) {
            itemMouseExited(jInvoicePanel, jlbInvoice, FontAwesome.FILE_TEXT, jlblInvoiceIcon, ICONSIZE);
        } else if (activeItem == CATEGORY || activeItem == PRODUCT) {
            ssp.reset();
        }
    }

    /**
     * It gives an animation effect and adds the sub-menu for product menu.
     */
    void addSubPanel() {
        if (t != null) {
            if (t.isRunning()) {
                t.stop();
            }
        }
        Dimension d = new Dimension(1, (int) ssp.getPreferredSize().getHeight());
        ssp.setPreferredSize(d);

        frontPanel.add(ssp, new AbsoluteConstraints(0, 0), 0);

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (d.width <= 100) {
                    d.width += 3;
                } else {
                    d.width += 5;
                }
                if (d.width <= 214) {
                    ssp.setSize(d.width, d.height);
                    ssp.validate();
                } else {
                    t.stop();
                }
            }
        });
        t.start();
        isActive = !isActive;
    }

    /**
     *
     * @param jPanel
     * @param itemName
     * @param iconCode
     * @param lblIcon
     * @param iconSize to show(representation User Interface) the current menu
     * clicked or selected.
     */
    void itemMouseClicked(JPanel jPanel, JLabel itemName, IconCode iconCode, JLabel lblIcon, int iconSize) {
        Icon icon = IconFontSwing.buildIcon(iconCode, iconSize, MYWHITE);
        jPanel.setBackground(MYWHITE);
        itemName.setForeground(MYBLUE);
        lblIcon.setBackground(MYBLUE);
        lblIcon.setIcon(icon);
        reset(activeItem);
    }

    /**
     *
     * @param jPanel
     * @param itemName
     * @param iconCode
     * @param lblIcon
     * @param iconSize the mouse over effect for a menu.
     */
    void itemMouseOver(JPanel jPanel, JLabel itemName, IconCode iconCode, JLabel lblIcon, int iconSize) {
        Icon icon = IconFontSwing.buildIcon(iconCode, iconSize, MYBLUE);
        if (jPanel != null) {
            jPanel.setBackground(MYBLUE);
        }
        if (itemName != null) {
            itemName.setForeground(MYWHITE);
        }
        if (lblIcon != null) {
            lblIcon.setBackground(MYWHITE);
            lblIcon.setIcon(icon);
        }
    }

    /**
     *
     * @param jPanel
     * @param itemName
     * @param iconCode
     * @param lblIcon
     * @param iconSize mouse exit effect for any menu.
     */
    void itemMouseExited(JPanel jPanel, JLabel itemName, IconCode iconCode, JLabel lblIcon, int iconSize) {
        Icon icon = IconFontSwing.buildIcon(iconCode, iconSize, MYWHITE);
        if (jPanel != null) {
            jPanel.setBackground(MYBLACK);
        }
        if (itemName != null) {
            itemName.setForeground(MYBLUE);
        }
        if (lblIcon != null) {
            lblIcon.setBackground(MYBLACK);
            lblIcon.setIcon(icon);
        }
    }

    private void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel frontPanel;
    private javax.swing.JPanel jCustomerPanel;
    private javax.swing.JPanel jInvoicePanel;
    private javax.swing.JPanel jStockPanel;
    private javax.swing.JLabel jlbInvoice;
    private javax.swing.JLabel jlblCustomer;
    private javax.swing.JLabel jlblCustomerIcon;
    private javax.swing.JLabel jlblHomeIcon;
    private javax.swing.JLabel jlblInvoiceIcon;
    private javax.swing.JLabel jlblStock;
    private javax.swing.JLabel jlblStockIcon;
    private javax.swing.JLabel lblArrow;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel toolPanel;
    // End of variables declaration//GEN-END:variables

    int activeItem = 0;
    private Timer t = null;
    private final static int ICONSIZE = 38;
    private boolean isActive = false;
}
