package assignment3;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.ImageIcon;

/**
 * 
 * GUI design and attached methods.
 * @author Hypnocode
 * 
 */
public class GameDisplay extends javax.swing.JFrame 
{

    private int rounds;
    private CalculatorType calcType;
    private boolean selectionMade;
    private Command selection;
    private BufferedImage rockImage;
    private BufferedImage paperImage;
    private BufferedImage scissorsImage;
    
    /**
     * Creates new form GameDisplay
     */
    public GameDisplay() 
    {
        initComponents();
        btn_startgame.setEnabled(false);
        con_gamelayers.setVisible(false);
        rounds = (Integer) roundSelector.getValue();
        computerThrow.setVisible(false);
        
        try
        {
            rockImage = ImageIO.read(new File("img\\rockImage.jpg"));
            paperImage = ImageIO.read(new File("img\\paperImage.jpg"));
            scissorsImage = ImageIO.read(new File("img\\scissorsImage.jpg"));
        }
        catch (IOException ex)
        {
            System.out.println("File not Found!");
        }
    }
    
/* DO NOT ADD CUSTOM COMMENTS BEYOND THIS LINE OR GUI EDITOR WILL CORRUPT
 * -----------------------------------------------------------------------------
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dia_help = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        dia_outcome = new javax.swing.JDialog();
        winningText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        humScore = new javax.swing.JLabel();
        comScore = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        con_startlayers = new javax.swing.JLayeredPane();
        pan_startscreen = new javax.swing.JPanel();
        pnl_methods = new javax.swing.JPanel();
        scp_throwtypescroller = new javax.swing.JScrollPane();
        lis_throwtype = new javax.swing.JList();
        btn_startgame = new javax.swing.JButton();
        pnl_rounds = new javax.swing.JPanel();
        roundSelector = new javax.swing.JSpinner();
        lbl_gametitle = new javax.swing.JLabel();
        con_gamelayers = new javax.swing.JLayeredPane();
        pan_gamescreen = new javax.swing.JPanel();
        paperButton = new javax.swing.JButton();
        rockButton = new javax.swing.JButton();
        scissorsButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        humanScore = new javax.swing.JLabel();
        computerScore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        round = new javax.swing.JLabel();
        showComputerThrow = new javax.swing.JToggleButton();
        computerThrow = new javax.swing.JLabel();
        humanLabel = new javax.swing.JLabel();
        computerLabel = new javax.swing.JLabel();
        tiesLabel = new javax.swing.JLabel();
        tiesCount = new javax.swing.JLabel();

        dia_help.setTitle("Help");
        dia_help.setMinimumSize(new java.awt.Dimension(384, 300));
        dia_help.setResizable(false);

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("To make your selection click Stone, Parchment, or Blades.\n\nRock Beats Scissors\nScissors beats Paper\nPaper beats Rock\n\nTo see the next choice the computer will make click Show Computer Throw.\n\nTo quit the game click the X in the top right corner.\n\nRounds displays the current round.");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dia_helpLayout = new javax.swing.GroupLayout(dia_help.getContentPane());
        dia_help.getContentPane().setLayout(dia_helpLayout);
        dia_helpLayout.setHorizontalGroup(
            dia_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dia_helpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dia_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dia_helpLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dia_helpLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(161, 161, 161))))
        );
        dia_helpLayout.setVerticalGroup(
            dia_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dia_helpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        dia_outcome.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dia_outcome.setTitle("Match Complete!");
        dia_outcome.setBounds(getBounds());
        dia_outcome.setMinimumSize(new java.awt.Dimension(300, 150));
        dia_outcome.setPreferredSize(new java.awt.Dimension(300, 150));
        dia_outcome.setResizable(false);
        dia_outcome.getContentPane().setLayout(new java.awt.GridBagLayout());

        winningText.setText("The winner is the Person");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 80, 0, 0);
        dia_outcome.getContentPane().add(winningText, gridBagConstraints);

        jLabel7.setText("Human Score:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 0);
        dia_outcome.getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Computer Score:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 24, 0, 0);
        dia_outcome.getContentPane().add(jLabel8, gridBagConstraints);

        humScore.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 3, 0, 0);
        dia_outcome.getContentPane().add(humScore, gridBagConstraints);

        comScore.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 9, 0, 46);
        dia_outcome.getContentPane().add(comScore, gridBagConstraints);

        jButton2.setText("End Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 100, 37, 0);
        dia_outcome.getContentPane().add(jButton2, gridBagConstraints);

        dia_outcome.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stone, Parchment, Blades Game");
        setBounds(new java.awt.Rectangle(100, 100, 300, 335));
        setMinimumSize(new java.awt.Dimension(300, 335));

        con_startlayers.setEnabled(false);
        con_startlayers.setMinimumSize(new java.awt.Dimension(300, 300));

        pan_startscreen.setEnabled(false);
        pan_startscreen.setMinimumSize(new java.awt.Dimension(300, 300));
        pan_startscreen.setPreferredSize(new java.awt.Dimension(300, 300));

        pnl_methods.setBorder(javax.swing.BorderFactory.createTitledBorder("AI Throw Method"));

        lis_throwtype.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Random", "Smart" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lis_throwtype.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lis_throwtype.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lis_throwtypeValueChanged(evt);
            }
        });
        scp_throwtypescroller.setViewportView(lis_throwtype);

        javax.swing.GroupLayout pnl_methodsLayout = new javax.swing.GroupLayout(pnl_methods);
        pnl_methods.setLayout(pnl_methodsLayout);
        pnl_methodsLayout.setHorizontalGroup(
            pnl_methodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_methodsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scp_throwtypescroller, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_methodsLayout.setVerticalGroup(
            pnl_methodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_methodsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scp_throwtypescroller, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_startgame.setText("Start Match");
        btn_startgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startgameActionPerformed(evt);
            }
        });

        pnl_rounds.setBorder(javax.swing.BorderFactory.createTitledBorder("# of Rounds"));

        roundSelector.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(3), Integer.valueOf(1), null, Integer.valueOf(1)));
        roundSelector.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roundSelectorStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnl_roundsLayout = new javax.swing.GroupLayout(pnl_rounds);
        pnl_rounds.setLayout(pnl_roundsLayout);
        pnl_roundsLayout.setHorizontalGroup(
            pnl_roundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_roundsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundSelector, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_roundsLayout.setVerticalGroup(
            pnl_roundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_roundsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundSelector)
                .addGap(69, 69, 69))
        );

        lbl_gametitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_gametitle.setText("Stone, Parchment, Blades Game");

        javax.swing.GroupLayout pan_startscreenLayout = new javax.swing.GroupLayout(pan_startscreen);
        pan_startscreen.setLayout(pan_startscreenLayout);
        pan_startscreenLayout.setHorizontalGroup(
            pan_startscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_startscreenLayout.createSequentialGroup()
                .addGroup(pan_startscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_startscreenLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnl_methods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(pnl_rounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan_startscreenLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btn_startgame))
                    .addGroup(pan_startscreenLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_gametitle)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pan_startscreenLayout.setVerticalGroup(
            pan_startscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_startscreenLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_gametitle)
                .addGap(35, 35, 35)
                .addGroup(pan_startscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_rounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_methods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_startgame)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pan_startscreen.setBounds(0, 0, 300, 300);
        con_startlayers.add(pan_startscreen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        con_gamelayers.setMinimumSize(new java.awt.Dimension(300, 300));

        pan_gamescreen.setMinimumSize(new java.awt.Dimension(300, 300));
        pan_gamescreen.setPreferredSize(new java.awt.Dimension(300, 300));

        paperButton.setText("Parchment");
        paperButton.setMaximumSize(new java.awt.Dimension(1000, 1000));
        paperButton.setMinimumSize(new java.awt.Dimension(85, 25));
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });

        rockButton.setText("Stone");
        rockButton.setMaximumSize(new java.awt.Dimension(1000, 1000));
        rockButton.setMinimumSize(new java.awt.Dimension(82, 25));
        rockButton.setPreferredSize(new java.awt.Dimension(82, 25));
        rockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtonActionPerformed(evt);
            }
        });

        scissorsButton.setText("Blades");
        scissorsButton.setMaximumSize(new java.awt.Dimension(1000, 1000));
        scissorsButton.setMinimumSize(new java.awt.Dimension(82, 25));
        scissorsButton.setPreferredSize(new java.awt.Dimension(82, 25));
        scissorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtonActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Human Score:");

        jLabel4.setText("Computer Score:");

        humanScore.setText("0");

        computerScore.setText("0");

        jLabel5.setText("Round:");

        round.setText("0");

        showComputerThrow.setText("Show Computer Throw");
        showComputerThrow.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                showComputerThrowStateChanged(evt);
            }
        });

        computerThrow.setText("Throw");

        humanLabel.setMinimumSize(new java.awt.Dimension(120, 230));
        humanLabel.setPreferredSize(new java.awt.Dimension(120, 230));

        computerLabel.setMinimumSize(new java.awt.Dimension(120, 230));
        computerLabel.setPreferredSize(new java.awt.Dimension(120, 230));

        tiesLabel.setText("Ties:");

        tiesCount.setText("0");

        javax.swing.GroupLayout pan_gamescreenLayout = new javax.swing.GroupLayout(pan_gamescreen);
        pan_gamescreen.setLayout(pan_gamescreenLayout);
        pan_gamescreenLayout.setHorizontalGroup(
            pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_gamescreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                        .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(humanScore, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(humanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(computerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(computerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                        .addComponent(rockButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(paperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scissorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                                        .addComponent(showComputerThrow)
                                        .addGap(18, 18, 18)
                                        .addComponent(computerThrow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(pan_gamescreenLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(round, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpButton)
                        .addGap(40, 40, 40))))
            .addGroup(pan_gamescreenLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(tiesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pan_gamescreenLayout.setVerticalGroup(
            pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_gamescreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(round)
                    .addComponent(helpButton))
                .addGap(15, 15, 15)
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiesLabel)
                    .addComponent(tiesCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(computerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(humanScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showComputerThrow)
                    .addComponent(computerThrow))
                .addGap(18, 18, 18)
                .addGroup(pan_gamescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paperButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scissorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pan_gamescreen.setBounds(0, 0, 320, 300);
        con_gamelayers.add(pan_gamescreen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 299, Short.MAX_VALUE)
                .addComponent(con_gamelayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 299, Short.MAX_VALUE)
                    .addComponent(con_startlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 299, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 299, Short.MAX_VALUE)
                .addComponent(con_gamelayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 299, Short.MAX_VALUE)
                    .addComponent(con_startlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 299, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling;
        con_startlayers.setVisible(false);
        con_gamelayers.setVisible(true);
        selectionMade = true;
    }//GEN-LAST:event_startButtonActionPerformed

    private void lis_throwtypeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_throwTypeValueChanged
        // TODO add your handling code here:
        if (lis_throwtype.getSelectedIndex() == -1) 
            btn_startgame.setEnabled(false);
        else
            btn_startgame.setEnabled(true);

        switch (lis_throwtype.getSelectedIndex()) 
        {
            case 0:
                calcType = CalculatorType.RANDOM;
                break;
            case 1:
                calcType = CalculatorType.SMART;
                break;
        }

    }//GEN-LAST:event_throwTypeValueChanged

    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        // TODO add your handling code here:
        selection = Command.THROWPAPER;
        selectionMade = true;
    }//GEN-LAST:event_paperButtonActionPerformed

    private void rockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtonActionPerformed
        // TODO add your handling code here:
        selection = Command.THROWROCK;
        selectionMade = true;
    }//GEN-LAST:event_rockButtonActionPerformed

    private void scissorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtonActionPerformed
        // TODO add your handling code here:
        selection = Command.THROWSCISSORS;
        selectionMade = true;
    }//GEN-LAST:event_scissorsButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
        selection = Command.HELP;
        selectionMade = true;
        
        dia_help.setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void roundSelectorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roundSelectorStateChanged
        // TODO add your handling code here:
        rounds = (Integer) roundSelector.getValue();
    }//GEN-LAST:event_roundSelectorStateChanged

    private void showComputerThrowStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_showComputerThrowStateChanged
        // TODO add your handling code here:
        if (showComputerThrow.isSelected())
            computerThrow.setVisible(true);
        else
            computerThrow.setVisible(false);
    }//GEN-LAST:event_showComputerThrowStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dia_help.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

/* -----------------------------------------------------------------------------
 * SAFE TO ADD COMMENTS BELOW THIS LINE
*/
    
    /**
     * Main method generated code for GUI setup.
     */
    public static void main(String args[]) 
    {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GameDisplay().setVisible(true);
            }
        });
    }
    
    // Get methods
    public int getRounds()
    {
        return rounds;
    }
    
    public CalculatorType getcalcType()
    {
        return calcType;
    }
    
    public boolean selectionMade()
    {
        return selectionMade;
    }
    
    public Command getSelection()
    {
        return selection;
    }
    
    public void resetSelection() 
    {
        selectionMade = false;
        selection = null;
    }
    
    /**
     * Updates the score.
     */
    public void updateScores(int humanScore, int computerScore)
    {
        this.humanScore.setText(Integer.toString(humanScore));
        this.computerScore.setText(Integer.toString(computerScore));
    }
    
    /**
     * Updates the round number.
     */
    public void updateRound(int round)
    {
        this.round.setText(Integer.toString(round));
    }
    
    /**
     * Updates the computer's throw choice.
     */
    void updateThrow(Throw computerThrow)
    {
        this.computerThrow.setText(computerThrow.toString());
    }
    
    /**
     * Loads throw image based on computer's choice.
     */
    void updateImages(Throw humanThrow, Throw computerThrow)
    {
        if (computerThrow == Throw.ROCK)
            computerLabel.setIcon(new ImageIcon(rockImage));
        else if (computerThrow == Throw.PAPER)
            computerLabel.setIcon(new ImageIcon(paperImage));
        else if (computerThrow == Throw.SCISSORS)
            computerLabel.setIcon(new ImageIcon(scissorsImage));
        
        if (humanThrow == Throw.ROCK)
            humanLabel.setIcon(new ImageIcon(rockImage));
        else if (humanThrow == Throw.PAPER)
            humanLabel.setIcon(new ImageIcon(paperImage));
        else if (humanThrow == Throw.SCISSORS)
            humanLabel.setIcon(new ImageIcon(scissorsImage));
    }
    /**
     * Compares scores and declares winner.
     */
    void declareWinner()
    {
        int humFinalScore = Integer.parseInt(humanScore.getText());
        int comFinalScore = Integer.parseInt(computerScore.getText());
     
        humScore.setText(humanScore.getText());
        comScore.setText(computerScore.getText());
        dia_outcome.setVisible(true);
        
        if(humFinalScore > comFinalScore)
        {
            winningText.setText("The winner is the Human!");
        }
        else if (humFinalScore < comFinalScore)
        {
            winningText.setText("The winner is the Computer!");
        }
        else
        {
            winningText.setText("This game is a Tie!");
        }
    }
    void updateTies(int ties)
    {
        tiesCount.setText(Integer.toString(ties));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_startgame;
    private javax.swing.JLabel comScore;
    private javax.swing.JLabel computerLabel;
    private javax.swing.JLabel computerScore;
    private javax.swing.JLabel computerThrow;
    private javax.swing.JLayeredPane con_gamelayers;
    private javax.swing.JLayeredPane con_startlayers;
    private javax.swing.JDialog dia_help;
    private javax.swing.JDialog dia_outcome;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel humScore;
    private javax.swing.JLabel humanLabel;
    private javax.swing.JLabel humanScore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_gametitle;
    private javax.swing.JList lis_throwtype;
    private javax.swing.JPanel pan_gamescreen;
    private javax.swing.JPanel pan_startscreen;
    private javax.swing.JButton paperButton;
    private javax.swing.JPanel pnl_methods;
    private javax.swing.JPanel pnl_rounds;
    private javax.swing.JButton rockButton;
    private javax.swing.JLabel round;
    private javax.swing.JSpinner roundSelector;
    private javax.swing.JButton scissorsButton;
    private javax.swing.JScrollPane scp_throwtypescroller;
    private javax.swing.JToggleButton showComputerThrow;
    private javax.swing.JLabel tiesCount;
    private javax.swing.JLabel tiesLabel;
    private javax.swing.JLabel winningText;
    // End of variables declaration//GEN-END:variables

}