package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Calc extends JFrame {
	private static double n1=0 ,n2=0;
	private static Double res=null;
	static StringBuilder sb = new StringBuilder();
	static String s1="",s2="";
	static int count=0;
	static char temp='e';
	private JPanel contentPane;
	private static JTextField output;
	private JButton num0;
	private JButton numDecimal;
	private JButton equalsTobtn;
	private JButton plusbtn;
	private JButton num3;
	private JButton num2;
	private JButton num1;
	private JButton minusbtn;
	private JButton num6;
	private JButton num5;
	private JButton num4;
	private JButton multiplybtn;
	private JButton num9;
	private JButton num8;
	private JButton num7;
	private JButton dividebtn;
	private JButton Del;
	private JButton clearscrn;
	private JButton clearall;
	private JButton numbelow;
	private JButton btnAlt;
	private JButton sqrtbtn;
	private JButton percentbtn;
	private JButton num00;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void clr(String tx)
	{
		if(tx=="ce")
		{
			output.setText("");
			n1=0;
			n2=0;
			res=0.0;
			temp='e';
		}
		else if(tx=="c")
		{
			output.setText("");
		}
	}
	
	public static void operator(char c)
	{
		
		 if(c=='+')
		    {
			 s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
			 temp=c;
		      //  res= Double.valueOf(n1+n2);

	            output.setText(output.getText()+'+');
		    }
		    else if(c=='-')
		    {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	
		   	 temp=c;
		    //    res= Double.valueOf(n1-n2);

	            output.setText(output.getText()+'-');
		    }
		    else if(c=='*')
		    {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	 temp=c;
		     //   res= Double.valueOf(n1*n2);

	            output.setText(output.getText()+'x');
		    }
		    else  if(c=='/')
		   {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	 temp=c;
		     //   res= Double.valueOf(n1/n2);

	            output.setText(output.getText()+'/');
		    }
		    else if(c=='%')
		    {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	 temp=c;
		    	res = Double.valueOf(n1/100);
		    	output.setText(String.valueOf(res));
		    }
		    else if(c=='s')
		    {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	 temp=c;
		    res = Math.sqrt(n1);
		    output.setText(String.valueOf(res));
		    }
		    else if(c=='p')
		    {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	 temp=c;
		    res =Math.pow(n1, 2);
		    output.setText(String.valueOf(res));
		    }
		    else if(c=='.')
		    {		    	
		    		sb.append(".");
		    		output.setText(output.getText()+".");
		    }
		    else if(c=='x')
		    {
		    	s1=sb.toString();
		    	n1 = Double.parseDouble(s1);
		    	sb.delete(0, count+1);
		    	res = Double.valueOf(1/n1);
		    	output.setText(String.valueOf(res));
		    }
		    else if(c=='=')
		    {
		    	s2= sb.toString();
		    	n2 = Double.parseDouble(s2);
		    	
		    	if(temp=='+')
			    {
			        res= n1+n2;
			    }
			    else if(temp=='-')
			    {
			     res= n1 - n2;
			    }
			    else if(temp=='*')
			    {
			        res= Double.valueOf(n1*n2);
			    }
			    else  if(temp=='/')
			   {
			      res= Double.valueOf(n1/n2);
			    }
		    	
		    	 output.setText(String.valueOf(res)); 
		    	//output.setText(s1);
		    	//output.setText(s2);
		    }
	}
	public void insertNumber(int i)
    {
        if(temp=='e')
        {
        	
        	sb.append(i);
        	count++;
            output.setText(output.getText()+Math.round(i));
        }
        else
        {
        	
        	sb.append(i);
            output.setText(output.getText()+Math.round(i));
            
        }
    }
	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		output = new JTextField();
		output.setFont(new Font("Tahoma", Font.PLAIN, 20));
		output.setHorizontalAlignment(SwingConstants.RIGHT);
		output.setBounds(12, 13, 354, 40);
		contentPane.add(output);
		output.setColumns(10);
		
		num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(0);
			}
		});
		num0.setBounds(102, 393, 80, 50);
		contentPane.add(num0);
		
		numDecimal = new JButton(".");
		numDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('.');
			}
		});
		numDecimal.setBounds(194, 393, 80, 50);
		contentPane.add(numDecimal);
		
		equalsTobtn = new JButton("=");
		equalsTobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('=');
			}
		});
		equalsTobtn.setBounds(286, 393, 80, 50);
		contentPane.add(equalsTobtn);
		
		plusbtn = new JButton("+");
		plusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('+');
			}
		});
		plusbtn.setBounds(286, 332, 80, 50);
		contentPane.add(plusbtn);
		
		num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(3);
			}
		});
		num3.setBounds(194, 332, 80, 50);
		contentPane.add(num3);
		
		num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(2);
			}
		});
		num2.setBounds(102, 332, 80, 50);
		contentPane.add(num2);
		
		num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertNumber(1);
			}
		});
		num1.setBounds(12, 332, 80, 50);
		contentPane.add(num1);
		
		minusbtn = new JButton("-");
		minusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('-');
			}
		});
		minusbtn.setBounds(286, 269, 80, 50);
		contentPane.add(minusbtn);
		
		num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(6);
			}
		});
		num6.setBounds(194, 269, 80, 50);
		contentPane.add(num6);
		
		num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(5);
			}
		});
		num5.setBounds(102, 269, 80, 50);
		contentPane.add(num5);
		
		num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(4);
			}
		});
		num4.setBounds(12, 269, 80, 50);
		contentPane.add(num4);
		
		multiplybtn = new JButton("X");
		multiplybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('*');
			}
		});
		multiplybtn.setBounds(286, 206, 80, 50);
		contentPane.add(multiplybtn);
		
		num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(9);
			}
		});
		num9.setBounds(194, 206, 80, 50);
		contentPane.add(num9);
		
		num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(8);
			}
			
		});
		num8.setBounds(102, 206, 80, 50);
		contentPane.add(num8);
		
		num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(7);
			}
		});
		num7.setBounds(12, 206, 80, 50);
		contentPane.add(num7);
		
		dividebtn = new JButton("/");
		dividebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('/');
			}
		});
		dividebtn.setBounds(286, 143, 80, 50);
		contentPane.add(dividebtn);
		
		Del = new JButton("Del");
		Del.setBounds(194, 143, 80, 50);
		contentPane.add(Del);
		
		clearscrn = new JButton("C");
		clearscrn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr("c");
			}
		});
		clearscrn.setBounds(102, 143, 80, 50);
		contentPane.add(clearscrn);
		
		clearall = new JButton("CE");
		clearall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clr("ce");
			}
		});
		clearall.setBounds(12, 143, 80, 50);
		contentPane.add(clearall);
		
		numbelow = new JButton("1/a");
		numbelow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('x');
			}
		});
		numbelow.setBounds(286, 80, 80, 50);
		contentPane.add(numbelow);
		
		btnAlt = new JButton("a\u00B2 ");
		btnAlt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('p');
			}
		});
		btnAlt.setBounds(194, 80, 80, 50);
		contentPane.add(btnAlt);
		
		sqrtbtn = new JButton("\u221A");
		sqrtbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('s');
			}
		});
		sqrtbtn.setBounds(102, 80, 80, 50);
		contentPane.add(sqrtbtn);
		
		percentbtn = new JButton("%");
		percentbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator('%');
			}
		});
		percentbtn.setBounds(12, 80, 80, 50);
		contentPane.add(percentbtn);
		
		num00 = new JButton("00");
		num00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNumber(00);
			}
		});
		num00.setBounds(12, 393, 80, 50);
		contentPane.add(num00);
	}
}
