/*
 * CSCE 4444
 * 
 * 
 */
package Panels;
import javafx.scene.control.MenuButton;
import javax.swing.JLabel;

/**
 *
 * @author Buckwheat
 */
public class HomeScreen extends javax.swing.JPanel {

    public HomeScreen() {
        initComponents();
    }
    
    public JLabel getMenuButton(){
        return menuButton;
    }
    
    public JLabel getGamesButton(){
        return gamesButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton = new javax.swing.JLabel();
        gamesButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeScreenButtons/menu.png"))); // NOI18N

        gamesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeScreenButtons/games.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(gamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(gamesButton)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gamesButton;
    private javax.swing.JLabel menuButton;
    // End of variables declaration//GEN-END:variables
}
