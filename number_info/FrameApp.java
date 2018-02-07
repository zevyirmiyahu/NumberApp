package number_info;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameApp extends ControllerApp {
	public static JFrame mainFrame, infoFrame;
	private static JPanel resultPanel, aboutPanel;
	protected static JTextArea info;
	protected static JTextField field;
	private static JButton okButton, infoButton;
	protected static JLabel infoTitle, titleLabel, instruction, resultLabel, Even, Odd, isPrime, isMer, happy, fibb;
	private static Color orange = new Color(244,  140, 66);
	private static Color grey = new Color(109, 109, 109);
	private static Color lightOrange = new Color(247, 155, 89);
	private static Font mainFont = new Font("Dialog", Font.BOLD, 15);
	private static Font titleFont = new Font("Comic sans MS", Font.BOLD, 45);
	private static Font infoFont = new Font("Comic sans MS", Font.PLAIN, 20);
	private static int WIDTH = 400, HEIGHT = 600;
	
	FrameApp() {	

		//JTextField
		field = new JTextField(null, 10);
		field.setFont(mainFont);
		field.setForeground(Color.GRAY);
		field.addFocusListener(this);
		
		//TextArea
		info = new JTextArea();
		info.setWrapStyleWord(true);
		info.setLineWrap(true);
		info.setOpaque(false);
		info.setEditable(false);
		info.setForeground(orange);
		info.setFont(infoFont);
		info.setPreferredSize(new Dimension(300, 400));
	
		//JButtons
		okButton = new JButton("Ok");
		okButton.setBackground(orange);
		okButton.setFont(mainFont);
		okButton.addActionListener(this);
		
		infoButton = new JButton("About");
		infoButton.setBackground(orange);
		infoButton.setFont(mainFont);
		infoButton.addActionListener(this);
			
		//JLabels
		infoTitle = new JLabel("About Project: ");
		infoTitle.setForeground(orange);
		infoTitle.setFont(infoFont);
		
		titleLabel = new JLabel("Number");
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(orange);
		
		instruction = new JLabel("Input number to be investigated.");
		instruction.setFont(mainFont);
		instruction.setForeground(orange);
		
		resultLabel = new JLabel("The number has the following properties:");
		resultLabel.setFont(mainFont);
		resultLabel.setForeground(Color.WHITE);
		
		Even = new JLabel("Even: ");
		Even.setFont(mainFont);
		Odd = new JLabel("Odd: ");
		Odd.setFont(mainFont);
		isPrime = new JLabel("Prime: ");
		isPrime.setFont(mainFont);
		isMer = new JLabel("Mersenne Prime: ");
		isMer.setFont(mainFont);
		happy = new JLabel("Happy Number: ");
		happy.setFont(mainFont);
		fibb = new JLabel("Fibbonacci Number: ");
		fibb.setFont(mainFont);
		
		
		//JPanel
		resultPanel = new JPanel();
		resultPanel.setLayout(new GridLayout(6, 1));
		resultPanel.setPreferredSize(new Dimension(300, 300));
		resultPanel.setBackground(lightOrange);
		resultPanel.setBorder(BorderFactory.createLineBorder(grey, 10));
		
		aboutPanel = new JPanel();
		aboutPanel.setLayout(new FlowLayout());
		aboutPanel.setPreferredSize(new Dimension(300, 300));
		aboutPanel.setBackground(Color.BLACK);
		
		
		//JFrames
		mainFrame = new JFrame("Number");
		mainFrame.setSize(WIDTH, HEIGHT);
		mainFrame.getContentPane().setBackground(Color.BLACK);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		mainFrame.setVisible(true);
	
		infoFrame = new JFrame("About");
		infoFrame.setSize(WIDTH - 100,  HEIGHT - 100);
		infoFrame.getContentPane().setBackground(grey);
		infoFrame.setResizable(false);
		infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		infoFrame.setLocationRelativeTo(mainFrame);
		infoFrame.setLayout(new FlowLayout());
		infoFrame.setVisible(false);
		
		//Add to JPanel
		resultPanel.add(Even);
		resultPanel.add(Odd);
		resultPanel.add(isPrime);
		resultPanel.add(isMer);
		resultPanel.add(happy);
		resultPanel.add(fibb);
		
		aboutPanel.add(infoButton);
		
		//Add to frame
		mainFrame.add(titleLabel);
		mainFrame.add(instruction);
		mainFrame.add(field);
		mainFrame.add(okButton);
		mainFrame.add(resultPanel);
		mainFrame.add(aboutPanel);
		
		infoFrame.add(infoTitle);
		infoFrame.add(info);
	}
}
