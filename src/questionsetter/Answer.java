/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionsetter;

import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static questionsetter.Examlogin.blockWindowsKey;

/**
 *
 * @author AS
 */
public class Answer extends javax.swing.JFrame {

    /** Creates new form Answer */
    public Answer() {
        initComponents();
        blockWindowsKey();
         Image icon = Toolkit.getDefaultToolkit().getImage("lib/images/logo.png");  
        this.setIconImage(icon);        
        this.setTitle("East Central Railway | Question Setter Software |");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);        
        this.setExtendedState(this.getExtendedState() | Answer.MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
             if(netIsAvailable()==true){
                       JOptionPane.showMessageDialog(this,"Please Disconnect the Internet Connection and Re-Open the Software");  
                      exit(0);
                }
              else{  
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to East Central Railway Examination");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Answer Submission Portal");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please Select the Correct Answer Against Each Question");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Enter Password \n (16 DIGITS)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Re-Enter Password \n(16 DIGITS)");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Click to Encrypt Answer");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(this::encanswerActionPerformed);
        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Answer");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                addanswerActionPerformed(evt);
            } catch (IOException ex) {
                Logger.getLogger(Answer.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Load Questions");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(this::loadquestionActionPerformed);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(248, 248, 248))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(313, 313, 313))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1)
                .addGap(81, 81, 81)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(156, 156, 156))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPasswordField1.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) { 
        if (jPasswordField1.getText().length() >= 16 ) // limit textfield to 3 characters
            e.consume(); 
        }  
        });
        jTextField1.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) { 
        if (jTextField1.getText().length() >= 16 ) // limit textfield to 3 characters
            e.consume(); 
        }  
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        Runnable runnable = () -> {
            if(netIsAvailable()==true){
                JOptionPane.showMessageDialog(this,"Please Disconnect the Internet Connection and Re-Open the Software");
                exit(0);
            }
        };
                  ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
                  service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS); 
    }
    }// </editor-fold>                        
     private void loadquestionActionPerformed(ActionEvent evt) {
           
         Connection connection = null;
        Statement statement = null;
        ResultSet rs = null,rs2=null;
 
        // Step 1: Loading or 
        // registering Oracle JDBC driver class
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            ClassNotFoundException err = cnfex;
            JOptionPane.showMessageDialog(rootPane,"Problem in loading or registering MS Access JDBC driver\n"+err);                   
        }
 
        // Step 2: Opening database connection
        try {
 
           
            String dbURL = "jdbc:ucanaccess://"+ msAccDB;             
            
            //connection.setAutoCommit(false);
            
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
            
            rs2=statement.executeQuery("select count(*) AS rowcount from Question");
            rs2.next();
            int count=rs2.getInt("rowcount");
            rs2.close();
            
            JOptionPane.showMessageDialog(this, "Total Questions - "+count);
            rs=statement.executeQuery("select * from Question");
            String columnNames[]={"Ques. Id","Question","Option A","Option B","Option C","Option D","Pos Marks","Neg Marks","Select Answer"};
            DefaultTableModel model = new DefaultTableModel();
	    model.setColumnIdentifiers(columnNames);
            
            jTable1.setModel(model);
            
                String quesid="";
                String ques="";
                String option_a="";
                String option_b="";
                String option_c="";
                String option_d="";
                String pos_mark="";
                String neg_mark="";
           
            if(rs.next()==false){
            JOptionPane.showMessageDialog(this, "Question Table is Empty, Please insert some questions First!\n"
                    + "Click Ok to Insert Qustion");  
            }else{
            int in =0;
           
            for (int i = 0; i < count; i++) 
            {  
                quesid=rs.getString("Question_ID");
                ques=rs.getString("Eng_Que");
                option_a=rs.getString("Eng_A");
                option_b=rs.getString("Eng_B");
                option_c=rs.getString("Eng_C");
                option_d=rs.getString("Eng_D");
                pos_mark=rs.getString("Pos_Mark");
                neg_mark=rs.getString("Neg_Mark");
                model.addRow(new Object[]{quesid, ques, option_a, option_b,option_c,option_d,pos_mark,neg_mark});
                String ans2[]={"A","B","C","D"};
                c=new JComboBox(ans2);
                jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(c));
             rs.next();
             in++;
            }
            if(in <1)
			{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",
						JOptionPane.ERROR_MESSAGE);
			}
			if(in ==1)
			{
			System.out.println(in+" Record Found");
			}
			else
			{
				System.out.println(in+" Records Found");
			}
            //JOptionPane.showMessageDialog(this, "Value of I "+i);
            quescount=1;
            }
        }
        
        catch(SQLException sqlex){
            SQLException err = sqlex;
            JOptionPane.showMessageDialog(rootPane,"Problem in Fetching Data!\n"+err);
        }
         
         
            }
     //Add Answers
     private void addanswerActionPerformed(ActionEvent evt) throws IOException {
          
         if(quescount==0){
         JOptionPane.showMessageDialog(rootPane,"Please add Question & add Answer for them first!");
         }
         else{
        Connection connection2 = null;
        Statement statement2;
        ResultSet resultSet = null;
        PreparedStatement pst2;       
        
            try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            ClassNotFoundException err = cnfex;
            JOptionPane.showMessageDialog(this,"Problem in loading or registering MS Access JDBC driver\n"+err);                   
        }
            try{
                
                 String dbURL = "jdbc:ucanaccess://"+ msAccDB2;
                int rows=jTable1.getRowCount();
                JOptionPane.showMessageDialog(this,"Total Answers="+rows); 
                System.out.println("No of Rows"+rows);
               connection2 = DriverManager.getConnection(dbURL);
                String queryco="insert into Answer(Question_ID, Question,Pos_Mark,Neg_Mark, Answer) values (?,?,?,?,?)";
                statement2 = connection2.createStatement();
                pst2 = connection2.prepareStatement(queryco);              
              
                for(int row = 0; row<rows; row++)
                {                     
                    String queid = (String)jTable1.getValueAt(row, 0);
                    String question = (String)jTable1.getValueAt(row, 1);
                    String posmark=(String) jTable1.getValueAt(row, 6);
                    String negmark=(String) jTable1.getValueAt(row, 7);
                    String answer = (String)jTable1.getValueAt(row, 8);
                   if(answer==null){
                   JOptionPane.showMessageDialog(this, "Please Add Answer for Question "+queid);
                   }
                   else{
                pst2.setString(1,queid);
                pst2.setString(2,question);
                pst2.setString(3,posmark);
                pst2.setString(4,negmark);
                pst2.setString(5,answer);
                pst2.addBatch();                
                   }
                }
                 pst2.executeBatch();
//                pst2.executeBatch();
                //connection2.commit();           
           
            JOptionPane.showMessageDialog(this, "Answer Added Successfully!");
            
               ans=1;
               
                }   
               
            catch(SQLException sqlex){
            SQLException err = sqlex;
            JOptionPane.showMessageDialog(this,"Problem in Inserting Data!\n"+err);
            
        }
         }    
            }
     //Encryt Answers
      private void encanswerActionPerformed(ActionEvent evt) {
          if(ans==0){
         JOptionPane.showMessageDialog(rootPane,"Please add Answer first!");
         }
          else{
        String useridno=null,encfile=null;
          Connection connection2 = null;
        Statement statement2 = null;
        ResultSet rs2 = null;
 
        // Step 1: Loading or 
        // registering Oracle JDBC driver class
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            ClassNotFoundException err = cnfex;
            JOptionPane.showMessageDialog(rootPane,"Problem in loading or registering MS Access JDBC driver\n"+err);                   
        }
 
        // Step 2: Opening database connection
        try {
 
            
            String dbURL = "jdbc:ucanaccess://"+ msAccDB3;             
            
            //connection.setAutoCommit(false);
            
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection2 = DriverManager.getConnection(dbURL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement2 = connection2.createStatement();
 
            rs2=statement2.executeQuery("select * from Login");         
            
            int i =0;
            while(rs2.next()){    
                useridno=rs2.getString("Setter_ID");               
            }
            
        }
        catch(SQLException sqlex){
            SQLException err = sqlex;
            JOptionPane.showMessageDialog(rootPane,"Problem in Searching Data!\n"+err);
        }
             String rekey=jPasswordField1.getText();
                String key=jTextField1.getText();
                if(key.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Input a Password!");
                }      
//                 Calendar cal = Calendar.getInstance();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_YYYY");
//        String date=dateFormat.format(cal.getTime());  
                String desk=System.getProperty("user.home") + "/Desktop/";
                File outputFile = new File(desk+"Encrypted_"+useridno+"_rrbanswer.enc");
                if(rekey.equals(key)){
                   if(outputFile.exists()){
                       JOptionPane.showMessageDialog(this, "Please Delete the previous Encrypted Answer File!\n And then proceed for the Action!");
                   }
                   else{
                encfile=desk+"Encrypted_"+useridno+"_rrbanswer.enc";
                try {
            Key secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
             
            FileOutputStream outputStream;
                    try (FileInputStream inputStream = new FileInputStream(inputFile)) {
                        byte[] inputBytes = new byte[(int) inputFile.length()];
                        inputStream.read(inputBytes);
                        byte[] outputBytes = cipher.doFinal(inputBytes);
                        outputStream = new FileOutputStream(outputFile);
                        outputStream.write(outputBytes);
                    }
            outputStream.close();
             JOptionPane.showMessageDialog(rootPane, "File Encrypted! Stored at:  "+outputFile);
             JOptionPane.showMessageDialog(rootPane, "All the data will be deleted after final submit of the Answer!\n"
                     + "Following Details will be Deleted:\n1. User Details\n2.Question Data\n3.Answer Data\n PROGRAM WILL EXIT AFTER THIS ACTION!"
                     + "\n All the Examination Process Will Start from Initial State!");
             deletealldata();
             exit(0);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                | InvalidKeyException | BadPaddingException
                | IllegalBlockSizeException | IOException ex) {
            System.out.println("Error Encrypting file"+ex);
            JOptionPane.showMessageDialog(rootPane, "Error Encrypting file "+ex);
        }
                }     
            }
                else{
                JOptionPane.showMessageDialog(this,"Password Didn't Matched!\n Please Enter Same Password in both Field!");
                }  
          
         
          }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Answer().setVisible(true);
        });
    }
    private static boolean netIsAvailable() {
    try {
        final URL url = new URL("http://www.google.com");
        final URLConnection conn = url.openConnection();
        conn.connect();
        conn.getInputStream().close();
//        return true;
        return false;
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        return false;
    }
}
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";
    File inputFile = new File("lib/DB/answer.accdb"); 
    String msAccDB = "lib/DB/question_setter.accdb";
    String msAccDB2 = "lib/DB/answer.accdb";
    String msAccDB3 = "lib/DB/login.accdb";
    String msAccDB4 = "lib/DB/enc.accdb";
     JComboBox c;
     int quescount=0,ans=0;
    // End of variables declaration                   

    private void deletealldata() throws IOException {
        //ANSWER TABLE DELETION
        Connection connection2 = null;
        Statement statement2;
        ResultSet resultSet = null;
        PreparedStatement pst2;       
        
            try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            ClassNotFoundException err = cnfex;
            JOptionPane.showMessageDialog(this,"Problem in loading or registering MS Access JDBC driver\n"+err);                   
        }
            try{
                
                 String dbURL = "jdbc:ucanaccess://"+ msAccDB2;
                
               connection2 = DriverManager.getConnection(dbURL);
                String queryco="delete * from Answer";
                statement2 = connection2.createStatement();
               statement2.executeUpdate(queryco);
               String desk=System.getProperty("user.home") + "/Desktop/";
               String filepath=desk+"QuestionSetter/"+msAccDB2;
           Runtime.getRuntime().exec("cmd /c msaccess.exe "+filepath+" /compact");

            
            
                               }   
               
            catch(SQLException sqlex){
            SQLException err = sqlex;
            JOptionPane.showMessageDialog(this,"Problem in Deleting Data!Answer Table\n"+err);
            
        }
     //QUESTION TABLE DELETION
      Connection connection = null;
        Statement statement;
        ResultSet resultSet2 = null;
        PreparedStatement pst;     
        
            
            try{
                
                 String dbURL2 = "jdbc:ucanaccess://"+ msAccDB;
                
               connection = DriverManager.getConnection(dbURL2);
                String queryco2="delete * from Question";
                statement = connection.createStatement();
               statement.executeUpdate(queryco2);
               String desk2=System.getProperty("user.home") + "/Desktop/";
               String filepath2=desk2+"QuestionSetter/"+msAccDB;
           Runtime.getRuntime().exec("cmd /c msaccess.exe "+filepath2+" /compact");

            
            
                               }   
               
            catch(SQLException sqlex2){
            SQLException err2 = sqlex2;
            JOptionPane.showMessageDialog(this,"Problem in Deleting Data!Question Table\n"+err2);
            
        }
    //ENC TABLE
    
     Connection connection3 = null;
        Statement statement3;
        ResultSet resultSet3 = null;
        PreparedStatement pst3;     
        
            
            try{
                
                 String dbURL3 = "jdbc:ucanaccess://"+ msAccDB4;
                
               connection3 = DriverManager.getConnection(dbURL3);
                String queryco3="delete * from EncTable";
                statement3 = connection3.createStatement();
               statement3.executeUpdate(queryco3);
               String desk3=System.getProperty("user.home") + "/Desktop/";
               String filepath3=desk3+"QuestionSetter/"+msAccDB4;
           Runtime.getRuntime().exec("cmd /c msaccess.exe "+filepath3+" /compact");

            
            
                               }   
               
            catch(SQLException sqlex3){
            SQLException err3 = sqlex3;
            JOptionPane.showMessageDialog(this,"Problem in Deleting Data!ENC Table\n"+err3);
            
        }
    //USER TABLE
    Connection connection4 = null;
        Statement statement4;
        ResultSet resultSet4 = null;
        PreparedStatement pst4;     
        
            
            try{
                
                 String dbURL4 = "jdbc:ucanaccess://"+ msAccDB3;
                
               connection4 = DriverManager.getConnection(dbURL4);
                String queryco4="delete * from Login";
                statement4 = connection4.createStatement();
               statement4.executeUpdate(queryco4);
               String desk4=System.getProperty("user.home") + "/Desktop/";
               String filepath4=desk4+"QuestionSetter/"+msAccDB3;
           Runtime.getRuntime().exec("cmd /c msaccess.exe "+filepath4+" /compact");

            
            
                               }   
               
            catch(SQLException sqlex4){
            SQLException err4 = sqlex4;
            JOptionPane.showMessageDialog(this,"Problem in Deleting Data!Login Table\n"+err4);
            
        }
    
    }
     private static WinUser.HHOOK hhk;
        private static WinUser.LowLevelKeyboardProc keyboardHook;
        private static User32 lib;
        public static void blockWindowsKey() {
            if (isWindows()) {
                new Thread(() -> {
                    lib = User32.INSTANCE;
                    WinDef.HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle(null);
                    keyboardHook = (int nCode, WinDef.WPARAM wParam, WinUser.KBDLLHOOKSTRUCT info) -> {
                        if (nCode >= 0) {
                            switch (info.vkCode){
                                case 0x5B:
                                case 0x5C:
                                    return new WinDef.LRESULT(1);
                                default: //do nothing
                            }
                        }
                        return lib.CallNextHookEx(hhk, nCode, wParam, info.getPointer());
                    };
                    hhk = lib.SetWindowsHookEx(13, keyboardHook, hMod, 0);
                    
                    // This bit never returns from GetMessage
                    int result;
                    WinUser.MSG msg = new WinUser.MSG();
                    while ((result = lib.GetMessage(msg, null, 0, 0)) != 0) {
                        if (result == -1) {
                            break;
                        } else {
                            lib.TranslateMessage(msg);
                            lib.DispatchMessage(msg);
                        }
                    }
                    lib.UnhookWindowsHookEx(hhk);
                }).start();
            }
        }

        public static void unblockWindowsKey() {
            if (isWindows() && lib != null) {
                lib.UnhookWindowsHookEx(hhk);
            }
        }

        public static boolean isWindows(){
            String os = System.getProperty("os.name").toLowerCase();
            return (os.contains("win"));
        }
}
