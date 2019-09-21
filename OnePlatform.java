import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;




public class OnePlatform {
	String Filename;

	private JFrame frmLoadrunnerUtility;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField textField_1;
private JLabel label;
private JButton btnTransactionNaming;
private JFrame mainFrame;
private JLabel headerLabel;
private JLabel statusLabel;
private JPanel controlPanel;

static Object result=new Object();
static Object result1=new Object();
private JButton btnTextchecks;
private int x=1;
private JButton btnNewButton_2;


	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date1 = new Date();  
	  
	    
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Date date2 = formatter.parse("7/05/2019");
					if (date1.after(date2)) {
						JOptionPane.showMessageDialog(null, "You Don't Have Permission to use this");
						 java.lang.System.exit(0);
			        }
				
					OnePlatform window = new OnePlatform();
					window.frmLoadrunnerUtility.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OnePlatform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
public void initialize() {
		
		frmLoadrunnerUtility = new JFrame();
		frmLoadrunnerUtility.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmLoadrunnerUtility.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmLoadrunnerUtility.setFont(new Font("Calibri", Font.BOLD, 15));
		frmLoadrunnerUtility.setTitle("Loadrunner Utility");
		frmLoadrunnerUtility.setBounds(100, 100, 450, 300);
		frmLoadrunnerUtility.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoadrunnerUtility.getContentPane().setLayout(null);
		frmLoadrunnerUtility.setResizable(false);
		
		
		//frmLoadrunnerUtility.pack();
	/*	try {
			frmLoadrunnerUtility.setIconImage(ImageIO.read(getClass().getResource("D:\\AdjusterIdischanging.PNG")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
		
		textField = new JTextField();
		textField.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		textField.setBounds(10, 114, 315, 20);
	frmLoadrunnerUtility.getContentPane().add(textField);
		
		textField.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBackground(new Color(192, 192, 192));
		btnBrowse.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		textField_1.setBounds(10, 172, 256, 20);
		frmLoadrunnerUtility.getContentPane().add(textField_1);
		textField_1.setColumns(10);
			 
			btnBrowse.setBounds(335, 113, 89, 23);
			frmLoadrunnerUtility.getContentPane().add(btnBrowse);
			
			btnNewButton = new JButton("Remove Extra Requests");
			btnNewButton.setEnabled(false);
			btnNewButton.setBackground(new Color(192, 192, 192));
			btnNewButton.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		

			JTextPane txtpnEnterTheRequest = new JTextPane();
			txtpnEnterTheRequest.setBackground(UIManager.getColor("Button.shadow"));
			txtpnEnterTheRequest.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
			txtpnEnterTheRequest.setText("Enter the request to be removed :");
			txtpnEnterTheRequest.setBounds(10, 145, 222, 22);
		
			frmLoadrunnerUtility.getContentPane().add(txtpnEnterTheRequest);
			
			JButton btnNewButton_1 = new JButton("?");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					JOptionPane.showMessageDialog(null, "Example:web_custom_request(\"dynatrace");
				}
				
			
			});
			
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
			btnNewButton_1.setBackground(new Color(34, 139, 34));
			
			
			
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
			btnNewButton_1.setBounds(276, 173, 37, 20);
			frmLoadrunnerUtility.getContentPane().add(btnNewButton_1);
			
			btnTransactionNaming = new JButton("Transaction Naming");
			btnTransactionNaming.setEnabled(false);
			btnTransactionNaming.setBackground(new Color(192, 192, 192));
			btnTransactionNaming.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
			
			
			JButton btnPostioningStartTransaction = new JButton("Positioning Start Transaction");
			btnPostioningStartTransaction.setEnabled(false);
			btnPostioningStartTransaction.setBackground(new Color(192, 192, 192));
			btnPostioningStartTransaction.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
			
			
			btnTextchecks = new JButton("TextChecks");
			btnTextchecks.setEnabled(false);
			btnTextchecks.setBackground(new Color(192, 192, 192));
			btnTextchecks.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
			
			
			
			btnNewButton_2 = new JButton("Make a copy of Action file");
			btnNewButton_2.setEnabled(false);
			btnNewButton_2.setBackground(new Color(192, 192, 192));
			btnNewButton_2.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		
		
	//	btnBrowse.setIcon(new ImageIcon("AdjusterIdischanging.PNG"));
		//validate();
		
		
	btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == btnBrowse)
				    {
					 JFileChooser   chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads")); //Downloads Directory as default
				        chooser.setDialogTitle("Select Location");
				        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				        chooser.setAcceptAllFileFilterUsed(false);

				        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
				        { 
				        	String  fileID = chooser.getSelectedFile().getPath();
				            textField.setText(fileID);
				            Filename = fileID;
				            btnNewButton.setBackground(new Color(34, 139, 34));
				        	btnNewButton_2.setBackground(new Color(34, 139, 34));
				        	btnTextchecks.setBackground(new Color(34, 139, 34));
				        	btnPostioningStartTransaction.setBackground(new Color(34, 139, 34));
				        	btnTransactionNaming.setBackground(new Color(34, 139, 34));
				        	btnNewButton.setEnabled(true);
				        	btnNewButton_2.setEnabled(true);
				        	btnTextchecks.setEnabled(true);
				        	btnPostioningStartTransaction.setEnabled(true);
				        	btnTransactionNaming.setEnabled(true);
				        	
				            
				       //     System.out.println("FileID"+fileID);
				           // System.out.println("Filename"+Filename);
				        }
				    }
			}
	});
	
	
	
		
	
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				
				String s= textField_1.getText();
	
				
				if(s.contains("web"))
				{
					
				}
				else
				{
					s="abcdefgh";
				}
			
	
				
				File file = new File(Filename);
		//		 String Filepath=  Filename.substring(0,Filename.length()-8);
				String Filepath=  Filename.substring(0,Filename.lastIndexOf("\\"));
				 Filepath=Filepath.concat("Action1.c");
				  
					
					File file1 = new File(Filepath);
					FileWriter fw = null;
					
						try {
							fw = new FileWriter(file1.getAbsoluteFile());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
					BufferedWriter bw = new BufferedWriter(fw);
				 
					  if (file1.exists()) {
							
								try {
									file1.createNewFile();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							
								// TODO Auto-generated catch block
								
						}
				        if (!file1.exists()) {
							
								try {
									file1.createNewFile();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							
								// TODO Auto-generated catch block
						
						}
				        String line;
				        try {
						    Scanner scanner = new Scanner(file);
						   
						 while (scanner.hasNextLine()) {
						       line = scanner.nextLine();
						    
								if(line.contains(s))
										{
									
									do
									{
										line = scanner.nextLine();
									}while(line.contains("LAST);")==false);
									
									 
									line = scanner.nextLine();

									
										}
								
								
								if(line.contains("EXTRARES,"))
								{
							do
							{
								line = scanner.nextLine();
							}while(line.contains("LAST);")==false);
							
			
							
							
								}
								
								
								
								  try {
									bw.write(line);
								} catch (IOException eq) {
									// TODO Auto-generated catch block
									eq.printStackTrace();
								}
							        try {
										bw.write(System.getProperty("line.separator"));
									} catch (IOException eqw) {
										// TODO Auto-generated catch block
										eqw.printStackTrace();
									}
								}
						 scanner.close();
						  
							
							bw.close();
						fw.close();
				        }
				        catch(IOException eq) { 
						    //handle this
						}
				        boolean success1 = file.delete();
						
				    	file1.renameTo(file);
				
				    
				    	
				    	JOptionPane.showMessageDialog(null, "Extrarres are removed.");
			}
		});
		btnNewButton.setBounds(265, 11, 159, 23);
		frmLoadrunnerUtility.getContentPane().add(btnNewButton);
		
		
		
		btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
			//	JOptionPane.showMessageDialog(null, "Example:web_custom_request(\"dynatrace");
				
			}
		});
		
		
	
		btnTransactionNaming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				
				
				int startflag=0;
				
				
				
				
				  JFrame frame = new JFrame();
				    JFrame frame1 = new JFrame();
				    result = JOptionPane.showInputDialog(frame, "Enter ScriptNumber and Application Name:Example: SC01_NIS ");
				    result1 = JOptionPane.showInputDialog(frame1, "Environment: Example Pre-Prod/Prod or put a _");
				    result=result.toString();
				   result1=result1.toString();

				   
				   
				
				
		
			    //  SwingControlDemo1  swingControlDemo = new SwingControlDemo1();      
			   //   swingControlDemo.showFileChooserDemo();
			   

	/*	   private void prepareGUI(){
			      mainFrame = new JFrame("Java Swing Examples");
			      mainFrame.setSize(400,400);
			      mainFrame.setLayout(new GridLayout(3, 1));
			      mainFrame.addWindowListener(new WindowAdapter() {
			         public void windowClosing(WindowEvent windowEvent){
			            System.exit(0);
			         }        
			      });    
			      headerLabel = new JLabel("", JLabel.CENTER);        
			      statusLabel = new JLabel("",JLabel.CENTER);    

			      statusLabel.setSize(350,100);

			      controlPanel = new JPanel();
			      controlPanel.setLayout(new FlowLayout());

			      mainFrame.add(headerLabel);
			      mainFrame.add(controlPanel);
			      mainFrame.add(statusLabel);
			      mainFrame.setVisible(true);  
			   }
			   

		/*	  private void showFileChooserDemo() throws IOException{
			      headerLabel.setText("Control in action: JFileChooser"); 

			      final JFileChooser  fileDialog = new JFileChooser();
			      fileDialog.addChoosableFileFilter(new FileFilter() {
			    	  
			    	    public String getDescription() {
			    	        return "C documents (*.c)";
			    	    }
			    	 
			    	    public boolean accept(File f) {
			    	        if (f.isDirectory()) {
			    	            return true;
			    	        } else {
			    	            return f.getName().toLowerCase().endsWith(".c");
			    	        }
			    	    }
			    	});
			
			  /*    JButton showFileDialogButton = new JButton("Open File");
			      showFileDialogButton.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			            int returnVal = fileDialog.showOpenDialog(mainFrame);
			            if (returnVal == JFileChooser.APPROVE_OPTION) {
			               java.io.File file = fileDialog.getSelectedFile();
			               statusLabel.setText("File Selected :" 
			               + file.getName());
			               
			               System.out.println(fileDialog.getCurrentDirectory()+"\\"+file.getName());
			             //  Filedeletion f=new Filedeletion();
			               Test2 t=new Test2();
			          
			               
			          
			   
				     	try {
				     		
				             
							t.testing(fileDialog.getCurrentDirectory()+"\\"+file.getName(),fileDialog.getCurrentDirectory(),result,result1);
							
							System.exit(0);
							
						
						       
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			          
			            }
			        
			            else{
			               statusLabel.setText("Open command cancelled by user." );           
			            }
			            
			         }
			      }); 
			      
			      controlPanel.add(showFileDialogButton);
			      mainFrame.setVisible(true);
			      
			      
			      
			      
			      
			      
			  */
		
			
			
			
			
			//	public void testing(String filenamewithpath,File filepath,Object scriptname,Object env) throws IOException {
						
						
						
						int n=00;
						int flag=0;
						// String filepath1=  Filename.substring(0,Filename.length()-8);
						 String filepath1=  Filename.substring(0,Filename.lastIndexOf("\\"));
						


								  
								File file = new File(Filename);
								
								File file1 = new File(filepath1+"\\"+"Action1.c");
								
								
						File file2 = new File(filepath1+"\\"+"vuser_init.c");
								
								File file3 = new File(filepath1+"\\"+"vuser_init1.c");
								
								FileWriter fw1 = null;
								
								FileWriter fw = null;
								try {
									fw = new FileWriter(file1.getAbsoluteFile());
								} catch (IOException e4) {
									// TODO Auto-generated catch block
									e4.printStackTrace();
								}
								BufferedWriter bw = new BufferedWriter(fw);
								
								try {
									fw1 = new FileWriter(file3.getAbsoluteFile());
								} catch (IOException e3) {
									// TODO Auto-generated catch block
									e3.printStackTrace();
								}
								BufferedWriter bw1 = new BufferedWriter(fw1);
							
							      
						        if (file1.exists()) {
									try {
										file1.createNewFile();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						        if (!file1.exists()) {
									try {
										file1.createNewFile();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						        
						        if (file3.exists()) {
									try {
										file3.createNewFile();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						        if (!file3.exists()) {
									try {
										file3.createNewFile();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						        
						        
						        
						        //---------------Boiler Plate-----------------------
						        
						        try {
								    Scanner scanner = new Scanner(file2);
								    
								    String repln="/*-------------------------Boiler Plate--------------------------";
								  
								 
								    try {
										bw1.write(repln);
									} catch (IOException e2) {
										// TODO Auto-generated catch block
										e2.printStackTrace();
									}
								    try {
										bw1.write(System.getProperty("line.separator"));
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								  
								
								    
									   try {
										   bw1.write(System.getProperty("line.separator"));
											bw1.write(" Name: ");
											bw1.write(System.getProperty("line.separator"));
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										 
									   
									   try {
										   bw1.write(System.getProperty("line.separator"));
											bw1.write(" Author: ");
											bw1.write(System.getProperty("line.separator"));
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										   
									   
									   try {
										   bw1.write(System.getProperty("line.separator"));
											bw1.write(" LastCheckedDate: ");
											bw1.write(System.getProperty("line.separator"));
											bw1.write("--------------------------------------------------------------*/");
											bw1.write(System.getProperty("line.separator"));
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								   
								   try {
										bw1.write(System.getProperty("line.separator"));
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									   
								   
								   int lineNum = 0;
								   while (scanner.hasNextLine()) {
								        String line = scanner.nextLine();
								        lineNum++;
							
								        repln=line;
								        try {
											bw1.write(repln);
										} catch (IOException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
								        try {
											bw1.write(System.getProperty("line.separator"));
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								    
								    }
								    
								   
								    scanner.close();
								  
									
									try {
										bw1.close();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								try {
									fw1.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								 
								    
						        } catch(FileNotFoundException e2) { 
								    //handle this
								}
						        boolean success = file2.delete();
								
						    	file3.renameTo(file2);
						    	


								try {
								    Scanner scanner = new Scanner(file);

								  //  now read the file line by line...
								    int lineNum = 0;
								    while (scanner.hasNextLine()) {
								        String line = scanner.nextLine();
								        lineNum++;
							
								        
								        
								  

								      String repln=line;
								      
								      
								      
								 	 //--------------lr_think_time--------------------
								        if(line.contains("lr_think")) { 
								        	
								        	 repln="";
								        	 line=repln;
								        }
								        
								        String temp=""; 
								        String temp1=""; 
								        
								    	if(line.contains("lr_start_transaction("))
										{
									
									
								 temp="";
									
									
									 String pattern2="lr_start_transaction(\"";
									String pattern3="\")";
									java.util.regex.Matcher m1 = Pattern.compile(Pattern.quote(pattern2) + "(.*?)" + Pattern.quote(pattern3)).matcher(line);
									while (m1.find()) {
										 //System.out.println(m1.group(1));
										// String s=m1.toString();
										temp=m1.group(1).toString();
										
									}
										}
								    	
								    	if(line.contains("lr_end_transaction("))
										{
									
									
								 temp1="";
									
									
									 String pattern2="lr_end_transaction(\"";
									String pattern3="\"";
									java.util.regex.Matcher m2 = Pattern.compile(Pattern.quote(pattern2) + "(.*?)" + Pattern.quote(pattern3)).matcher(line);
									while (m2.find()) {
										 //System.out.println(m1.group(1));
										// String s=m1.toString();
										temp1=m2.group(1).toString();
										System.out.println(temp1);
										
									}
										}
								        
								        
								        
								        
								        
								        
								        
								        
								        //----------------------------------------
								        
								      
						//-------------------lr_start_transaction------------------
								        
								        if(line.contains("start_transaction")) { 
								        	
								        	if(n<=9)
								        	{
								        		
								        		
								        	
						 repln=line.replace("_transaction(\"", "_transaction(\""+result+"_"+result1+"_0"+n+"_");
							bw.write(System.getProperty("line.separator"));
						 
						 bw.write("//-------------------------------------------------------- Starting "+temp+" Transaction ---------------------------------------------------------");
							bw.write(System.getProperty("line.separator"));
							bw.write(System.getProperty("line.separator"));
							
							startflag=1;
							 //System.out.println(repln);
								        	}
								        	else
								        	{
								        		bw.write(System.getProperty("line.separator"));
								        		repln=line.replace("_transaction(\"", "_transaction(\""+result+"_"+result1+"_"+n+"_");
								        		 bw.write("//-------------------------------------------------------- Starting "+temp+" Transaction ---------------------------------------------------------");
								        			bw.write(System.getProperty("line.separator"));
								        			bw.write(System.getProperty("line.separator"));
								       	 //System.out.println(repln);
							 
								         
								        }
								        }
								        
							
						//-----------------------------------------------------	
						//-------------------lr_end_transaction------------------
								        
								        if(line.contains("end_transaction")) { 
								        	
								        	if(n<=9)
								        	{
								        	
						 repln=line.replace("_transaction(\"", "_transaction(\""+result+"_"+result1+"_0"+n+"_");
							bw.write(System.getProperty("line.separator"));
						bw.write(repln);
						bw.write(System.getProperty("line.separator"));
						bw.write(System.getProperty("line.separator"));
						 
						 bw.write("//-------------------------------------------------------- Ending "+temp1+" Transaction ---------------------------------------------------------");
							bw.write(System.getProperty("line.separator"));
					
						repln="lr_think_time(thinktime);";
						 bw.write(System.getProperty("line.separator"));

						n++;
							 //System.out.println(repln);
								        	}
								        	else
								        	{
								        		System.out.println(temp);
								        		repln=line.replace("_transaction(\"", "_transaction(\""+result+"_"+result1+"_"+n+"_");
								        		bw.write(System.getProperty("line.separator"));
								        		 bw.write(repln);
								        		 
								 		        bw.write(System.getProperty("line.separator"));
								 		       bw.write(System.getProperty("line.separator"));
												 
												 bw.write("//-------------------------------------------------------- Ending "+temp1+" Transaction ---------------------------------------------------------");
													bw.write(System.getProperty("line.separator"));
								        		 repln="lr_think_time(thinktime);";
								        		 bw.write(System.getProperty("line.separator"));
								        		
								        				
								        n++;
								       	 //System.out.println(repln);;
							 
								         
								        }
								        }
								  
								        
						//-----------------------------------------------------		        
								 
								      //---------------------LR_PASS criteria-------------------------------
									      
									      
										if(flag==1){
											 if(line.contains("LR_AUTO")) { 
												 
									
												 
												 repln=repln.replace("LR_AUTO", "LR_PASS");
												 flag=0;
											 }
										        	
											
											
										}
										      
										      
										      
										      
										      
										      
										      
										      
										      
										      
										      
								//------------------------------------------------
										
										
										//----------------lr_continue_on_error-----
								        
								        
								        if(line.contains("lr_continue_on_error(1)")) { 
								        				flag=1;
								        		}

								//------------------------------------------        
								        try {
											bw.write(repln);
											if(startflag==1)
											{
												bw.write(System.getProperty("line.separator"));	
												startflag=0;
											}
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								        try {
											bw.write(System.getProperty("line.separator"));
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								    
								    }
								    
								   
								    scanner.close();
								  
									
									try {
										bw.close();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								try {
									fw.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								    
								    
								} catch(IOException e) { 
								    //handle this
								}

								boolean success1 = file.delete();
								
							file1.renameTo(file);
			
			
			
			
			
							JOptionPane.showMessageDialog(null, "Transaction Naming Done...");
			
			
			
			
			
			
			
			}
			
			
			
			
		 }); 
		btnTransactionNaming.setBounds(10, 11, 142, 23);
		frmLoadrunnerUtility.getContentPane().add(btnTransactionNaming);
		
	
		btnPostioningStartTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				File file = new File(Filename);
				
			//	 String Filepath=  Filename.substring(0,Filename.length()-8);
				
				String Filepath=  Filename.substring(0,Filename.lastIndexOf("\\"));
				System.out.println(Filepath);
			
				 Filepath=Filepath.concat("Action1.c");
				  
				  int c=0;
				 
					File file1 = new File(Filepath);
					FileWriter fw = null;
					try {
						fw = new FileWriter(file1.getAbsoluteFile());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					BufferedWriter bw = new BufferedWriter(fw);
					  if (file1.exists()) {
							try {
								file1.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				        if (!file1.exists()) {
							try {
								file1.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				        String line,line1,transaction="";
				        try {
						    Scanner scanner = new Scanner(file);
						    Scanner scanner1 = new Scanner(file);
						    line1=scanner1.nextLine();
						      
						    int flag=0;
						   
						 while (scanner.hasNextLine()) {
							 
							 
						       line = scanner.nextLine();
						     
							    line1=scanner1.nextLine();
						      
						      
						       if(line1.contains("return 0"))
						       {
						    	   bw.write("return 0 ; ");
							        bw.write(System.getProperty("line.separator"));
							        bw.write("}");
							        bw.write(System.getProperty("line.separator"));
						    	   break;
						       }
						      
								
								if(line.contains("lr_start_transaction(")== true)
										{
									transaction=line;
								
								flag=1;
									
									 line = scanner.nextLine();
									 
										}
								
								
								if(flag==1)
								{
									
									
									
								
								if((line1.contains("web_custom_request("))||(line1.contains("web_submit_data("))||((line1.contains("web_url("))&&(line1.contains("gif")==false)&&(line1.contains("js")==false)&&(line1.contains("css")==false)))
								{
									bw.write(transaction);
							        bw.write(System.getProperty("line.separator"));
							        line1=scanner1.nextLine();
							        flag=0;
							       
								}
								}
										
								
								
								
									
								       
								        
								     
								        
										
								        
								        
								        
								        
									
							
								
								  bw.write(line);
							        bw.write(System.getProperty("line.separator"));
							       
							        
								}
						 
						 scanner1.close();
						 scanner.close();
						 
						  
							
							bw.close();
						fw.close();
				        }
				        catch(FileNotFoundException e) { 
						    //handle this
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        boolean success1 = file.delete();
						
				    	file1.renameTo(file);
				    	JOptionPane.showMessageDialog(null, "All Start Transaction place before web_submit request...");
				
			}
		});
		btnPostioningStartTransaction.setBounds(10, 45, 199, 29);
		frmLoadrunnerUtility.getContentPane().add(btnPostioningStartTransaction);
		
		
		btnTextchecks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				File file = new File(Filename);
			//	 String Filepath=  Filename.substring(0,Filename.length()-8);
				String Filepath=  Filename.substring(0,Filename.lastIndexOf("\\"));
			
				 Filepath=Filepath.concat("Action1.c");
				  
				  int c=0;
					
					File file1 = new File(Filepath);
					FileWriter fw = null;
					try {
						fw = new FileWriter(file1.getAbsoluteFile());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					BufferedWriter bw = new BufferedWriter(fw);
					  if (file1.exists()) {
							try {
								file1.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				        if (!file1.exists()) {
							try {
								file1.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				        String line,line1,line2;
				        int end=6,x=-1;
				        try {
						    Scanner scanner = new Scanner(file);
						  
						 while (scanner.hasNextLine()) {
							 
							 int flag=0;
						       line = scanner.nextLine();
						       if(end!=6 || x==0)
						       {
						       line2 = scanner.nextLine();
						       
						       }
						     x++;
								if(line.contains("lr_start_transaction("))
										{
									
									
									String temp="";
									
									
									 String pattern2="lr_start_transaction(\"";
									String pattern3="\")";
									java.util.regex.Matcher m1 = Pattern.compile(Pattern.quote(pattern2) + "(.*?)" + Pattern.quote(pattern3)).matcher(line);
									while (m1.find()) {
										 //System.out.println(m1.group(1));
										// String s=m1.toString();
										temp=m1.group(1).toString();
									
									}
									
									c++;
									line1="web_reg_find(\"Text=\",\"SaveCount=Text_Count"+c+"\", LAST );";
									  bw.write(System.getProperty("line.separator"));
									  bw.write(System.getProperty("line.separator"));
									 bw.write(line1);
									 bw.write(System.getProperty("line.separator"));
								        bw.write(System.getProperty("line.separator"));
								        bw.write(line);
								       
								      
								        line = scanner.nextLine();
								        
								     
								        
										
								        
								        
								        
								        
									while(line.contains("LAST);")==false)
									{
										flag=1;
										 bw.write(System.getProperty("line.separator"));
										bw.write(line);
										 
										line = scanner.nextLine();
										
								       
										
									}
									
									if(line.contains("LAST);"))
									{
										bw.write(System.getProperty("line.separator"));
										bw.write(line);
										 bw.write(System.getProperty("line.separator"));
									}
									
									 //bw.write(line);
								     //   bw.write(System.getProperty("line.separator"));
									
									
									 bw.write(System.getProperty("line.separator"));
									 bw.write(System.getProperty("line.separator"));
									
								bw.write("if (atoi(lr_eval_string(\"{Text_Count"+c+"}\")) > 0) { }  else {");
								 bw.write(System.getProperty("line.separator"));
								 bw.write("lr_error_message(\"Transaction %s failed for UserId %s, IterationNumber %s, at Time %s\", \""+temp+"\", lr_eval_string(\"{SUser}\"), lr_eval_string(\"{Iteration}\"), lr_eval_string(\"{Time}\"));");
								 bw.write(System.getProperty("line.separator"));
								 bw.write("lr_end_transaction(\""+temp+"\",LR_FAIL);");
								 bw.write(System.getProperty("line.separator"));
								 bw.write("return(0);}");
								  bw.write(System.getProperty("line.separator"));
							
									
										}
								
							
						   
						       
						       
						       
								
							if(flag!=1)
								{
								
								  bw.write(line);
							        bw.write(System.getProperty("line.separator"));
								}}
						 scanner.close();
						  
							
							bw.close();
						fw.close();
				        }
				        catch(FileNotFoundException e) { 
						    //handle this
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        boolean success1 = file.delete();
						
				    	file1.renameTo(file);
				
				
				    	JOptionPane.showMessageDialog(null, "All TextChecks are placed before Start Transaction...");
				
			}
		});
		btnTextchecks.setBounds(162, 11, 95, 23);
		frmLoadrunnerUtility.getContentPane().add(btnTextchecks);
		
	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				File file = new File(Filename);
			//	 String Filepath=  Filename.substring(0,Filename.length()-8);
				 String Filepath=  Filename.substring(0,Filename.lastIndexOf("\\"));
				 Filepath=Filepath.concat("CopyAction.c");
				  
				  int c=0;
				 
					File file1 = new File(Filepath);
					FileWriter fw = null;
					try {
						fw = new FileWriter(file1.getAbsoluteFile());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					BufferedWriter bw = new BufferedWriter(fw);
					  if (file1.exists()) {
							try {
								file1.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				        if (!file1.exists()) {
							try {
								file1.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				        String line,line1,transaction="";
				        try {
						    Scanner scanner = new Scanner(file);
						    Scanner scanner1 = new Scanner(file);
						    line1=scanner1.nextLine();
						      
						    int flag=0;
						   
						 while (scanner.hasNextLine()) {
							 
							 
						       line = scanner.nextLine();
						     
							 
						      
						      
						    
								
							
								
								
								
									
								       
								        
								     
								        
										
								        
								        
								        
								        
									
							
								
								  bw.write(line);
							        bw.write(System.getProperty("line.separator"));
							       
							        
								}
						 
						
						 scanner.close();
						 
						  
							
							bw.close();
						fw.close();
				        }
				        catch(FileNotFoundException e) { 
						    //handle this
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        
						
				    	
				    	JOptionPane.showMessageDialog(null, "Action File Copied...");
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(219, 45, 205, 28);
		frmLoadrunnerUtility.getContentPane().add(btnNewButton_2);
			   }
	}

