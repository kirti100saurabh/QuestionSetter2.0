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
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
//import static questionsetter.Examlogin.blockWindowsKey;

import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kumar
 */
public class Register extends javax.swing.JFrame {
	final static Logger logger = Logger.getLogger(Logger.class.getName());
   
    /**
     * Creates new form register
     */
	public Register() {
		initComponents();
		logger.info("Register() visibility= true..!");
		blockWindowsKey();
		Image icon2 = Toolkit.getDefaultToolkit().getImage("lib/images/logo.png");  
		this.setIconImage(icon2);        
		this.setTitle("East Central Railway | Registration Panel |");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}    @SuppressWarnings("unchecked")
                            
	private void initComponents() {
		if(netIsAvailable()==true){
			logger.warn("Please Disconnect the Internet Connection and Re-Open the Software");
			JOptionPane.showMessageDialog(this,"Please Disconnect the Internet Connection and Re-Open the Software");  
			exit(0);
		}
		else{  
			jPanel3 = new javax.swing.JPanel();
			jLabel4 = new javax.swing.JLabel();
			jPanel1 = new javax.swing.JPanel();
			jLabel1 = new javax.swing.JLabel();
			jPanel2 = new javax.swing.JPanel();
			jLabel2 = new javax.swing.JLabel();
			jLabel3 = new javax.swing.JLabel();
			jLabel5 = new javax.swing.JLabel();
			nameTextField = new javax.swing.JTextField();
			userNameTextField = new javax.swing.JTextField();
			PasswordField = new javax.swing.JPasswordField();
			jButton1 = new javax.swing.JButton();
			jButton2 = new javax.swing.JButton();
			jLabel7 = new javax.swing.JLabel();
			jLabel6 = new javax.swing.JLabel();

			this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

			jPanel3.setBackground(new java.awt.Color(153, 153, 255));

			jLabel4.setBackground(new java.awt.Color(0, 0, 0));
			jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
			jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLabel4.setText("Welcome to East Central Railway Examination");

			javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
			jPanel3.setLayout(jPanel3Layout);
			jPanel3Layout.setHorizontalGroup(
					jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					);
			jPanel3Layout.setVerticalGroup(
					jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					);

			jPanel1.setBackground(new java.awt.Color(255, 255, 255));

			jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rail.png"))); // NOI18N

			jPanel2.setBackground(new java.awt.Color(255, 255, 255));
			jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

			jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
			jLabel2.setText("Name");

			jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
			jLabel3.setText("Username");

			jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
			jLabel5.setText("Password");

			nameTextField.setFont(nameTextField.getFont().deriveFont(nameTextField.getFont().getStyle() | java.awt.Font.BOLD, 15));

			userNameTextField.setFont(userNameTextField.getFont().deriveFont(userNameTextField.getFont().getStyle() | java.awt.Font.BOLD, 15));

			PasswordField.setFont(PasswordField.getFont().deriveFont(PasswordField.getFont().getStyle() | java.awt.Font.BOLD, 15));
			PasswordField.addActionListener((java.awt.event.ActionEvent evt) -> {
				jTextField3ActionPerformed(evt);
			});

			jButton1.setBackground(new java.awt.Color(255, 102, 102));
			jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
			jButton1.setText("Reset");
			jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
				resetButton1ActionPerformed(evt);
			});

			jButton2.setBackground(new java.awt.Color(102, 102, 255));
			jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
			jButton2.setText("Register");
			jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
				registerButtonActionPerformed(evt);
			});

			jLabel7.setBackground(new java.awt.Color(153, 153, 255));
			jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, 30));
			jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLabel7.setText("Register New User");

			javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
			jPanel2.setLayout(jPanel2Layout);
			jPanel2Layout.setHorizontalGroup(
					jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(60, 60, 60)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(jPanel2Layout.createSequentialGroup()
											.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
													.addComponent(jLabel5)
													.addComponent(jLabel3)
													.addComponent(jLabel2))
											.addGap(18, 18, 18)
											.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
													.addComponent(nameTextField)
													.addComponent(userNameTextField)
													.addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
									.addGroup(jPanel2Layout.createSequentialGroup()
											.addGap(36, 36, 36)
											.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
											.addGap(54, 54, 54)
											.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
							.addContainerGap(89, Short.MAX_VALUE))
					.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					);
			jPanel2Layout.setVerticalGroup(
					jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(jLabel2)
									.addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGap(36, 36, 36)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(jLabel3)
									.addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGap(43, 43, 43)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(jLabel5)
									.addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGap(33, 33, 33)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(jButton1)
									.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap())
					);

			jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teletech-logo.png"))); // NOI18N

			javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1Layout.setHorizontalGroup(
					jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
							.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
											.addComponent(jLabel6)
											.addContainerGap())
									.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
											.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
											.addGap(128, 128, 128))))
					);
			jPanel1Layout.setVerticalGroup(
					jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addComponent(jLabel6))
					);

			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(
					layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					);
			layout.setVerticalGroup(
					layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
							.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);

			pack();
			Runnable runnable = () -> {
				if(netIsAvailable()==true){
					JOptionPane.showMessageDialog(this,"Please Disconnect the Internet Connection and Re-Open the Software");
					exit(0);
				}
			};
			ScheduledExecutorService service = Executors
					.newSingleThreadScheduledExecutor();
			service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);     
		}
	}// </editor-fold>                        

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    		logger.info("Pressed Register Button");
             String name, userName,password;
             name=nameTextField.getText();
             userName=userNameTextField.getText();
             password=PasswordField.getText();
             
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        // Step 1: Loading or 
        // registering Oracle JDBC driver class
        try {
 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {            
            logger.error("Problem in loading or registering MS Access JDBC driver\n"+cnfex);
            JOptionPane.showMessageDialog(this,"Problem in loading or registering MS Access JDBC driver\n"+cnfex);                   
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
            logger.info("Executing ...insert into Login(Name, Setter_ID, Password) values (?,?,?)");
            PreparedStatement psmt=connection.prepareStatement("insert into Login(Name, Setter_ID, Password) values (?,?,?)");
           
           
            psmt.setString(1,name);
            psmt.setString(2,userName);
            psmt.setString(3,password);
            psmt.executeUpdate();
            connection.commit();
            logger.info("User Registration Successful!\nLogin Credential\nYour User id: "+userName+"\nPassword: "+password);
            JOptionPane.showMessageDialog(this,"User Registration Successful!\nLogin Credential\nYour User id: "+userName+"\nPassword: "+password);
            connection.close();
            logger.info("Calling Examlogin()");
            Examlogin ex=new Examlogin();
            this.setVisible(false);
            ex.setVisible(true);
            
        }
        catch(SQLException sqlex){            
            logger.error("Problem in Inserting Data!\n"+sqlex);
            JOptionPane.showMessageDialog(this,"Problem in Inserting Data!\n"+sqlex);
        }       
    }                                        

    private void resetButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       logger.info("Pressed Reset Button");
       
       nameTextField.setText("");
       userNameTextField.setText("");
       PasswordField.setText("");
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JPasswordField PasswordField;
    String msAccDB = "lib/DB/login.accdb";
    // End of variables declaration  
    
    private static boolean netIsAvailable() {
    try {
        final URL url = new URL("http://www.google.com");
        final URLConnection conn = url.openConnection();
        conn.connect();
        conn.getInputStream().close();
        return false;
 //       return true;
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        return false;
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
