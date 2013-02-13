/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Logger;
import javax.swing.*;
import controller.*;
import model.*;



/**
 *
 * @author Morgan
 */
public class Twitter4JGUI extends javax.swing.JFrame {

    /**
     * Creates new form Twitter4JGUI
     */
    public Twitter4JGUI() {
        engine = new TwitterEngine();
        initComponents();
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
        mainTabPane = new javax.swing.JTabbedPane();
        createTweetPanel = new javax.swing.JPanel();
        enterTweetLabel = new javax.swing.JLabel();
        tweetTextArea = new javax.swing.JScrollPane();
        enterTweetTextArea = new javax.swing.JTextArea();
        updateButton = new javax.swing.JButton();
        searchTopicsPanel = new javax.swing.JPanel();
        searchTopicLabel = new javax.swing.JLabel();
        searchTopicTextField = new javax.swing.JTextField();
        searchTopicsButton = new javax.swing.JButton();
        searchPeoplePanel = new javax.swing.JPanel();
        searchPeopleLabel = new javax.swing.JLabel();
        searchPeopleTextField = new javax.swing.JTextField();
        searchPeopleButton = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        profileLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        followingLabel = new javax.swing.JLabel();
        followersLabel = new javax.swing.JLabel();
        twitterPic = new javax.swing.JLabel();
        currentUserLabel = new javax.swing.JLabel();
        switchAccountButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweetTable = new JTable(engine.getTable());
        displayTweetText = new javax.swing.JTextArea();
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Twitter Desktop Application");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.selectionBackground"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 204, 204));

        mainTabPane.setBackground(new java.awt.Color(0, 204, 204));

        enterTweetLabel.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        enterTweetLabel.setText("Enter your Tweet:");

        enterTweetTextArea.setColumns(20);
        enterTweetTextArea.setRows(5);
        tweetTextArea.setViewportView(enterTweetTextArea);

        updateButton.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createTweetPanelLayout = new javax.swing.GroupLayout(createTweetPanel);
        createTweetPanel.setLayout(createTweetPanelLayout);
        createTweetPanelLayout.setHorizontalGroup(
            createTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addGroup(createTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createTweetPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tweetTextArea))
                    .addGroup(createTweetPanelLayout.createSequentialGroup()
                        .addGroup(createTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createTweetPanelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(enterTweetLabel))
                            .addGroup(createTweetPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        createTweetPanelLayout.setVerticalGroup(
            createTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTweetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterTweetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tweetTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Compose a Tweet", createTweetPanel);

        searchTopicLabel.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchTopicLabel.setText("Search for:");

        searchTopicTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTopicTextFieldActionPerformed(evt);
            }
        });

        searchTopicsButton.setText("Search Topics");

        javax.swing.GroupLayout searchTopicsPanelLayout = new javax.swing.GroupLayout(searchTopicsPanel);
        searchTopicsPanel.setLayout(searchTopicsPanelLayout);
        searchTopicsPanelLayout.setHorizontalGroup(
            searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTopicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTopicTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(searchTopicsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchTopicsPanelLayout.setVerticalGroup(
            searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTopicsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(searchTopicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTopicLabel)
                    .addComponent(searchTopicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchTopicsButton)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Search Topics", searchTopicsPanel);

        searchPeopleLabel.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        searchPeopleLabel.setText("Search for:");

        searchPeopleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPeopleTextFieldActionPerformed(evt);
            }
        });

        searchPeopleButton.setText("Search People");

        javax.swing.GroupLayout searchPeoplePanelLayout = new javax.swing.GroupLayout(searchPeoplePanel);
        searchPeoplePanel.setLayout(searchPeoplePanelLayout);
        searchPeoplePanelLayout.setHorizontalGroup(
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPeoplePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPeopleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchPeopleTextField)
                .addContainerGap())
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(searchPeopleButton)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        searchPeoplePanelLayout.setVerticalGroup(
            searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPeoplePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(searchPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPeopleLabel)
                    .addComponent(searchPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchPeopleButton)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        mainTabPane.addTab("Search People", searchPeoplePanel);

        profilePanel.setBackground(new java.awt.Color(0, 204, 204));

        profileLabel.setFont(new java.awt.Font("Aharoni", 3, 24)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileLabel.setText("PROFILE:");

        usernameLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");

        followingLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        followingLabel.setForeground(new java.awt.Color(255, 255, 255));
        followingLabel.setText("Following:");

        followersLabel.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        followersLabel.setForeground(new java.awt.Color(255, 255, 255));
        followersLabel.setText("Followers:");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileLabel)
                    .addComponent(nameLabel)
                    .addComponent(usernameLabel)
                    .addComponent(followingLabel)
                    .addComponent(followersLabel))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addGap(18, 18, 18)
                .addComponent(followingLabel)
                .addGap(18, 18, 18)
                .addComponent(followersLabel)
                .addGap(39, 39, 39))
        );

        twitterPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/twitterimage.jpg"))); // NOI18N

        currentUserLabel.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        currentUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentUserLabel.setText("Current User:");

        switchAccountButton.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        switchAccountButton.setText("Switch Account");
        switchAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchAccountButtonActionPerformed(evt);
            }
        });

        tweetTable.setModel(engine.getTable());
        tweetTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tweetTable);

        displayTweetText.setColumns(20);
        displayTweetText.setRows(5);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainTabPane)
                    .addComponent(displayTweetText)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(switchAccountButton)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(twitterPic)
                        .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(currentUserLabel))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(switchAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(currentUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twitterPic, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(mainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayTweetText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        fileMenu.setText("File");
        menubar.add(fileMenu);

        helpMenu.setText("Help");
        menubar.add(helpMenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final Logger LOG = Logger.getLogger(Twitter4JGUI.class.getName());

    private void switchAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchAccountButtonActionPerformed
        // feature not available yet
    }//GEN-LAST:event_switchAccountButtonActionPerformed

    private void searchPeopleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPeopleTextFieldActionPerformed
        engine.searchPeople(searchPeopleTextField.getText());
    }//GEN-LAST:event_searchPeopleTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        engine.updateStatus(enterTweetTextArea.getText());
    }//GEN-LAST:event_updateButtonActionPerformed

    private void searchTopicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTopicTextFieldActionPerformed
        engine.searchTweets(searchTopicTextField.getText());
    }//GEN-LAST:event_searchTopicTextFieldActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Twitter4JGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Twitter4JGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel createTweetPanel;
    private javax.swing.JLabel currentUserLabel;
    private javax.swing.JTextArea displayTweetText;
    private javax.swing.JLabel enterTweetLabel;
    private javax.swing.JTextArea enterTweetTextArea;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel followersLabel;
    private javax.swing.JLabel followingLabel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabPane;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton searchPeopleButton;
    private javax.swing.JLabel searchPeopleLabel;
    private javax.swing.JPanel searchPeoplePanel;
    private javax.swing.JTextField searchPeopleTextField;
    private javax.swing.JLabel searchTopicLabel;
    private javax.swing.JTextField searchTopicTextField;
    private javax.swing.JButton searchTopicsButton;
    private javax.swing.JPanel searchTopicsPanel;
    private javax.swing.JButton switchAccountButton;
    private javax.swing.JTable tweetTable;
    private javax.swing.JScrollPane tweetTextArea;
    private javax.swing.JLabel twitterPic;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
    private TwitterEngine engine;
}
