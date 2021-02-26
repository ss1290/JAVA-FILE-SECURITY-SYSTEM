import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


@SuppressWarnings("serial")
public class EncryptTXT extends javax.swing.JFrame {
	private JFrame frame;
	String psdwrd;
	
	public static void write(String s, File f) throws IOException{
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
		
	}

    String key="toshal12";    //This is the Key for Encryption
    
    
    public String getPass() {
        return this.psdwrd;
     }

    public EncryptTXT() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Original File:");

        jScrollPane1.setViewportView(jLabel2);

        jLabel3.setText("Encrypted File:");

        jScrollPane2.setViewportView(jLabel4);

        jButton2.setText("Open Encrypted file folder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Encrypt..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Decrypt..");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton3ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        JButton btnNewButton = new JButton("Send Password");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MailApp mail= new MailApp();
				mail.setVisible(true);
        	}
        	
        	
        });
        
        passwordField = new JPasswordField();
		passwordField.setBounds(167, 111, 177, 19);
	
		
        
        JButton btnNewButton_1 = new JButton("Get Password");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		psdwrd=passwordField.getText();
        		/* 
        		//appending password to file
                File f = new File("C:\\Users\\tosha\\OneDrive\\Desktop\\project\\encrypted.txt");
                try {
        			write(" "+psdwrd,f);
        		} catch (IOException e1) {
        			// TODO Auto-generated catch block
        			e1.printStackTrace();
        			
        		}
        		*/
        	}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        				.addComponent(jLabel3, Alignment.TRAILING)
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addComponent(jButton2)
        					.addGap(127))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jButton1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        					.addGap(55)
        					.addComponent(btnNewButton)
        					.addGap(15))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNewButton_1)
        					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
        					.addComponent(jLabel1)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(12)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(btnNewButton))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton3)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jLabel1))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnNewButton_1))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton2)
        			.addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{   
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        String path=fc.getSelectedFile().getAbsolutePath();
        jLabel2.setText(path);
        File f=fc.getSelectedFile();
        FileInputStream fis=new FileInputStream(f);
        FileOutputStream fos=new FileOutputStream("C:\\Users\\tosha\\OneDrive\\Desktop\\project\\encrypted.txt");
        Thread.sleep(2000);
        
        DESEncrypt.encrypt(key, fis, fos);
        
        jLabel4.setText("C:\\User\\tosha\\OneDrive\\Desktop\\project\\encrypted.txt");  
        }catch(Exception e)
        {
            System.out.print("Exception in EncryptTXT");
        }
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Runtime runtime=Runtime.getRuntime();
        try {
            runtime.exec("explorer.exe C:\\Users\\tosha\\OneDrive\\Desktop\\project");       
        } catch (IOException ex) {
            Logger.getLogger(EncryptTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton3ActionPerformed
        String input;
    	input = JOptionPane.showInputDialog("Enter Password to Decrypt");
    	
    	
    	if (input.equals(psdwrd))
    	{
    	
    	
    	
    	
		               
				
					
		    try{ 
		    JFileChooser fc=new JFileChooser();
		    fc.setCurrentDirectory(new File("C:\\Users\\tosha\\OneDrive\\Desktop\\project"));    
		    fc.showOpenDialog(null);
		    String path=fc.getSelectedFile().getAbsolutePath();
		    jLabel2.setText(path);
		    File f=fc.getSelectedFile();
		    FileInputStream fis=new FileInputStream(f);
		    FileOutputStream fos=new FileOutputStream("C:\\Users\\tosha\\OneDrive\\Desktop\\project\\decrypted.txt");
		    DESEncrypt.decrypt(key, fis, fos);
		    Thread.sleep(2000);
		    jLabel4.setText("C:\\Users\\tosha\\OneDrive\\Desktop\\project\\decrypted.txt");      
		    }catch(Exception e)
		    {
		        System.out.print("Exception in EncryptTXT");
		    }
					}
					
			  
    }       
		    
	
    	
    //GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EncryptTXT().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private JPasswordField passwordField;
}
