import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.List;
import java.io.FileWriter;
import java.awt.CardLayout;

public class myProject implements ActionListener {

    static JButton close1, close2, close3, close4, close5;
    static JButton submit, newUser, deleteAccount, message, tools, refresh;
    static JButton logout2, logout3, logout4, logout5;
    static JButton arrowEast2, arrowEast3, arrowWest3, arrowWest4, arrowWest5;

    static JPanel panel;
    static CardLayout layout;

    public void start(){
        JFrame frame = new JFrame("");
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);

        layout = new CardLayout();
        panel = new JPanel();
        panel.setLayout(layout);

        JPanel panel1 = new JPanel();
        placeComponents1(panel1);
        panel.add(panel1);

        JPanel panel2 = new JPanel();
        placeComponents2(panel2);
        panel.add(panel2);

        JPanel panel3 = new JPanel();
        placeComponents3(panel3);
        panel.add(panel3);

        JPanel panel4 = new JPanel();
        placeComponents4(panel4);
        panel.add(panel4);

        JPanel panel5 = new JPanel();
        placeComponents5(panel5);
        panel.add(panel5);


        frame.add(panel);
        frame.setVisible(true);
    }

    private void placeComponents1(JPanel panel){

        panel.setLayout(null);

        close1 = new JButton("Close");
        close1.setBounds(380,20,100,25);
        close1.addActionListener(this);
        panel.add(close1);

        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(10,60,80,25);
        panel.add(userNameLabel);

        JTextField userNameText = new JTextField(20);
        userNameText.setBounds(100,60,165,25);
        panel.add(userNameText);

        JLabel passWordLabel = new JLabel("Password");
        passWordLabel.setBounds(10,90,80,25);
        panel.add(passWordLabel);

        JPasswordField passWordText = new JPasswordField(20);
        passWordText.setBounds(100,90,165,25);
        panel.add(passWordText);

        submit = new JButton("Submit");
        submit.setBounds(10,150,100,25);
        submit.addActionListener(this);
        panel.add(submit);

        newUser = new JButton("New User");
        newUser.setBounds(380,150,100,25);
        newUser.addActionListener(this);
        panel.add(newUser);
    }

    private void placeComponents2(JPanel panel){

        panel.setLayout(null);

        logout2 = new JButton("Logout");
        logout2.setBounds(10,20,100,25);
        logout2.addActionListener(this);
        panel.add(logout2);

        close2 = new JButton("Close");
        close2.setBounds(380,20,100,25);
        close2.addActionListener(this);
        panel.add(close2);

        JLabel newPassWordLabel = new JLabel("New password");
        newPassWordLabel.setBounds(10,60,130,25);
        panel.add(newPassWordLabel);

        JPasswordField newPassWordText = new JPasswordField(20);
        newPassWordText.setBounds(150,60,165,25);
        panel.add(newPassWordText);


        deleteAccount = new JButton("Delete account");
        deleteAccount.setBounds(10,100,130,25);
        deleteAccount.addActionListener(this);
        panel.add(deleteAccount);

        message = new JButton("Message");
        message.setBounds(200,100,100,25);
        message.addActionListener(this);
        panel.add(message);

        arrowEast2 = new BasicArrowButton(BasicArrowButton.EAST);
        arrowEast2.setBounds(380,100,100,25);
        arrowEast2.addActionListener(this);
        panel.add(arrowEast2);

    }

    private void placeComponents3(JPanel panel){
        panel.setLayout(null);

        logout3 = new JButton("Logout");
        logout3.setBounds(10,20,100,25);
        logout3.addActionListener(this);
        panel.add(logout3);

        close3 = new JButton("Close");
        close3.setBounds(380,20,100,25);
        close3.addActionListener(this);
        panel.add(close3);

        JLabel contactInfoLabel = new JLabel("Contact Information");
        contactInfoLabel.setBounds(10,50,150,25);
        panel.add(contactInfoLabel);

        JTextField contactInfoField = new JTextField(20);
        contactInfoField.setBounds(160,50,300,25);
        panel.add(contactInfoField);

        JLabel schoolLabel = new JLabel("Schools (Choose one)");
        schoolLabel.setBounds(10,80,200,25);
        panel.add(schoolLabel);

        ButtonGroup schoolButtonGroup = new ButtonGroup();
        JRadioButton schoolButton1 = new JRadioButton("Engineering");
        schoolButton1.setBounds(10,110,150,25);
        schoolButtonGroup.add(schoolButton1);
        panel.add(schoolButton1);
        JRadioButton schoolButton2 = new JRadioButton("Art and Sciences");
        schoolButton2.setBounds(160,110,150,25);
        schoolButtonGroup.add(schoolButton2);
        panel.add(schoolButton2);
        JRadioButton schoolButton3 = new JRadioButton("Nursing");
        schoolButton3.setBounds(310,110,150,25);
        schoolButtonGroup.add(schoolButton3);
        panel.add(schoolButton3);
        JRadioButton schoolButton4 = new JRadioButton("Applied Social Sciences");
        schoolButton4.setBounds(10,140,150,25);
        schoolButtonGroup.add(schoolButton4);
        panel.add(schoolButton4);
        JRadioButton schoolButton5 = new JRadioButton("Medicine");
        schoolButton5.setBounds(160,140,150,25);
        schoolButtonGroup.add(schoolButton5);
        panel.add(schoolButton5);
        JRadioButton schoolButton6 = new JRadioButton("Law");
        schoolButton6.setBounds(310,140,150,25);
        schoolButtonGroup.add(schoolButton6);
        panel.add(schoolButton6);

        JLabel studyAreaLabel = new JLabel("Study area (Choose one)");
        studyAreaLabel.setBounds(10,170,200,25);
        panel.add(studyAreaLabel);

        ButtonGroup studyAreaButtonGroup = new ButtonGroup();
        JRadioButton studyAreaButton1 = new JRadioButton("Dorm");
        studyAreaButton1.setBounds(10,200,150,25);
        studyAreaButtonGroup.add(studyAreaButton1);
        panel.add(studyAreaButton1);
        JRadioButton studyAreaButton2 = new JRadioButton("Library");
        studyAreaButton2.setBounds(160,200,150,25);
        studyAreaButtonGroup.add(studyAreaButton2);
        panel.add(studyAreaButton2);
        JRadioButton studyAreaButton3 = new JRadioButton("Both");
        studyAreaButton3.setBounds(310,200,150,25);
        studyAreaButtonGroup.add(studyAreaButton3);
        panel.add(studyAreaButton3);

        JLabel studyTimeLabel = new JLabel("Study time (Choose all apply)");
        studyTimeLabel.setBounds(10,230,200,25);
        panel.add(studyTimeLabel);

//        ButtonGroup studyTimeButtonGroup = new ButtonGroup();
        JCheckBox studyTimeButton1 = new JCheckBox("6am-12am");
        studyTimeButton1.setBounds(10,260,120,25);
//        studyTimeButtonGroup.add(studyTimeButton1);
        panel.add(studyTimeButton1);
        JCheckBox studyTimeButton2 = new JCheckBox("12am-6pm");
        studyTimeButton2.setBounds(130,260,120,25);
//        studyTimeButtonGroup.add(studyTimeButton2);
        panel.add(studyTimeButton2);
        JCheckBox studyTimeButton3 = new JCheckBox("6pm-12pm");
        studyTimeButton3.setBounds(250,260,120,25);
//        studyTimeButtonGroup.add(studyTimeButton3);
        panel.add(studyTimeButton3);
        JCheckBox studyTimeButton4 = new JCheckBox("12pm-6am");
        studyTimeButton4.setBounds(370,260,120,25);
//        studyTimeButtonGroup.add(studyTimeButton4);
        panel.add(studyTimeButton4);

        JLabel livingAreaLabel = new JLabel("Living area (Choose one)");
        livingAreaLabel.setBounds(10,290,200,25);
        panel.add(livingAreaLabel);

        ButtonGroup livingAreaButtonGroup = new ButtonGroup();
        JRadioButton livingAreaButton1 = new JRadioButton("North");
        livingAreaButton1.setBounds(10,320,150,25);
        livingAreaButtonGroup.add(livingAreaButton1);
        panel.add(livingAreaButton1);
        JRadioButton livingAreaButton2 = new JRadioButton("South");
        livingAreaButton2.setBounds(160,320,150,25);
        livingAreaButtonGroup.add(livingAreaButton2);
        panel.add(livingAreaButton2);
        JRadioButton livingAreaButton3 = new JRadioButton("Middle");
        livingAreaButton3.setBounds(310,320,150,25);
        livingAreaButtonGroup.add(livingAreaButton3);
        panel.add(livingAreaButton3);

        JLabel entertainingTimeLabel = new JLabel("Entertaining time (Choose all apply)");
        entertainingTimeLabel.setBounds(10,350,300,25);
        panel.add(entertainingTimeLabel);

        //ButtonGroup entertainingTimeButtonGroup = new ButtonGroup();
        JCheckBox entertainingTimeButton1 = new JCheckBox("Fri evening");
        entertainingTimeButton1.setBounds(10,380,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton1);
        panel.add(entertainingTimeButton1);
        JCheckBox entertainingTimeButton2 = new JCheckBox("Sat morning");
        entertainingTimeButton2.setBounds(130,380,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton2);
        panel.add(entertainingTimeButton2);
        JCheckBox entertainingTimeButton3 = new JCheckBox("Sat afternoon");
        entertainingTimeButton3.setBounds(250,380,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton3);
        panel.add(entertainingTimeButton3);
        JCheckBox entertainingTimeButton4 = new JCheckBox("Sat evening");
        entertainingTimeButton4.setBounds(370,380,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton4);
        panel.add(entertainingTimeButton4);
        JCheckBox entertainingTimeButton5 = new JCheckBox("Sun morning");
        entertainingTimeButton5.setBounds(10,410,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton5);
        panel.add(entertainingTimeButton5);
        JCheckBox entertainingTimeButton6 = new JCheckBox("Sun afternoon");
        entertainingTimeButton6.setBounds(130,410,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton6);
        panel.add(entertainingTimeButton6);
        JCheckBox entertainingTimeButton7 = new JCheckBox("Sun evening");
        entertainingTimeButton7.setBounds(250,410,120,25);
        //entertainingTimeButtonGroup.add(entertainingTimeButton7);
        panel.add(entertainingTimeButton7);

        JLabel eatingPattonLabel = new JLabel("Living area (Choose one)");
        eatingPattonLabel.setBounds(10,440,300,25);
        panel.add(eatingPattonLabel);

        ButtonGroup eatingPattonButtonGroup = new ButtonGroup();
        JRadioButton eatingPattonButton1 = new JRadioButton("Fribley");
        eatingPattonButton1.setBounds(10,470,150,25);
        eatingPattonButtonGroup.add(eatingPattonButton1);
        panel.add(eatingPattonButton1);
        JRadioButton eatingPattonButton2 = new JRadioButton("Leutner");
        eatingPattonButton2.setBounds(160,470,150,25);
        eatingPattonButtonGroup.add(eatingPattonButton2);
        panel.add(eatingPattonButton2);
        JRadioButton eatingPattonButton3 = new JRadioButton("outside");
        eatingPattonButton3.setBounds(310,470,150,25);
        eatingPattonButtonGroup.add(eatingPattonButton3);
        panel.add(eatingPattonButton3);

        JLabel fyiLabel = new JLabel("*You can do no choice if nothing");
        fyiLabel.setBounds(270,500,250,25);
        panel.add(fyiLabel);

        arrowWest3 = new BasicArrowButton(BasicArrowButton.WEST);
        arrowWest3.setBounds(10,530,100,25);
        arrowWest3.addActionListener(this);
        panel.add(arrowWest3);

        arrowEast3 = new BasicArrowButton(BasicArrowButton.EAST);
        arrowEast3.setBounds(380,530,100,25);
        arrowEast3.addActionListener(this);
        panel.add(arrowEast3);
    }

    private void placeComponents4(JPanel panel){
        panel.setLayout(null);

        logout4 = new JButton("Logout");
        logout4.setBounds(10,20,100,25);
        logout4.addActionListener(this);
        panel.add(logout4);

        close4 = new JButton("Close");
        close4.setBounds(380,20,100,25);
        close4.addActionListener(this);
        panel.add(close4);

        Object[] columnTitle = {"Overall similarity" , "Study similarity" , "Living similarity"};
        Object[][] tableData =
                {
                        new Object[]{"Username" , "Username" , "Username"},
                        new Object[]{"Username" , "Username" , "Username"},
                        new Object[]{"...", "..." , "..."},
                        new Object[]{"...", "..." , "..."},
                        new Object[]{"...", "..." , "..."}
                };
        JTable outputTable = new JTable(tableData , columnTitle);
        outputTable.setEnabled(false);
        JScrollPane jscrollPane = new JScrollPane(outputTable);
        jscrollPane.setBounds(10, 60, 480, 400);
        panel.add(jscrollPane);

        arrowWest4 = new BasicArrowButton(BasicArrowButton.WEST);
        arrowWest4.setBounds(10,480,100,25);
        arrowWest4.addActionListener(this);
        panel.add(arrowWest4);

        tools = new JButton("Tools");
        tools.setBounds(380,480,100,25);
        tools.addActionListener(this);
        panel.add(tools);
    }

    private void placeComponents5(JPanel panel){
        panel.setLayout(null);

        logout5 = new JButton("Logout");
        logout5.setBounds(10,20,100,25);
        logout5.addActionListener(this);
        panel.add(logout5);

        close5 = new JButton("Close");
        close5.setBounds(380,20,100,25);
        close5.addActionListener(this);
        panel.add(close5);

        Object[] columnTitle1 = {"" , "" ,"" , ""};
        Object[][] tableData1 =
                {
                        new Object[]{"Username1" , "Approve", "Deny" , "Contact Information1"},
                        new Object[]{"Username2" , "Approve", "Deny" , "Contact Information2"},
                        new Object[]{"...", "..." , "..." , "..."},
                };
        JTable outputTable1 = new JTable(tableData1 , columnTitle1);
        outputTable1.setEnabled(false);
        JScrollPane jscrollPane1 = new JScrollPane(outputTable1);
        jscrollPane1.setBounds(10, 60, 480, 200);
        panel.add(jscrollPane1);

        Object[] columnTitle2 = {"Request your sent" , "status" ,"Contact Information"};
        Object[][] tableData2 =
                {
                        new Object[]{"Username1" , "Approved", "..." },
                        new Object[]{"Username2" , "Not approved yet", "Concealed"},
                        new Object[]{"...", "..." , "..."},
                };
        JTable outputTable2 = new JTable(tableData2 , columnTitle2);
        outputTable2.setEnabled(false);
        JScrollPane jscrollPane2 = new JScrollPane(outputTable2);
        jscrollPane2.setBounds(10, 270, 480, 200);
        panel.add(jscrollPane2);

        arrowWest5 = new BasicArrowButton(BasicArrowButton.WEST);
        arrowWest5.setBounds(10,480,100,25);
        arrowWest5.addActionListener(this);
        panel.add(arrowWest5);

        refresh = new JButton("Refresh");
        refresh.setBounds(380,480,100,25);
        refresh.addActionListener(this);
        panel.add(refresh);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == close1 || e.getSource() == close2 ||
                e.getSource() == close3 || e.getSource() == close4 || e.getSource() == close5 ) {
            System.exit(0);
        } else if (e.getSource() == submit) {
            layout.next(panel);
        } else if (e.getSource() == newUser) {
            layout.next(panel);
        } else if (e.getSource() == logout2){
            layout.previous(panel);
        } else if (e.getSource() == logout3){
            layout.previous(panel);
            layout.previous(panel);
        } else if (e.getSource() == logout4) {
            layout.previous(panel);
            layout.previous(panel);
            layout.previous(panel);
        } else if (e.getSource() == logout5) {
            layout.previous(panel);
            layout.previous(panel);
            layout.previous(panel);
            layout.previous(panel);
        } else if (e.getSource() == deleteAccount) {
            layout.previous(panel);
        } else if (e.getSource() == message) {
            layout.next(panel);
            layout.next(panel);
            layout.next(panel);
        } else if (e.getSource() == arrowEast2 || e.getSource() == arrowEast3) {
            layout.next(panel);
        } else if (e.getSource() == arrowWest3 || e.getSource() == arrowWest4) {
            layout.previous(panel);
        } else if (e.getSource() == arrowWest5){
            layout.previous(panel);
            layout.previous(panel);
            layout.previous(panel);
        } else if (e.getSource() == tools){
            layout.previous(panel);
            layout.previous(panel);
        } else {

        }
    }
}
