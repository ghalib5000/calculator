package main;
public class Workers {

	private static double n1=0 ,n2=0;
	private static int workdone=0;
	String r ="";
	private static Double res=null;
	static StringBuilder sb = new StringBuilder();
	static String s1="",s2="";
	static int count=0;
	static char temp='e';
	
	 public void clr(String tx)

		{
			if(tx=="ce"||tx=="c")
			{
			Calc.getOutput().setText("");
			String r ="";
			    s1="";
			    s2="";
				n1=0;
				n2=0;
 				res=null;
				temp='e';
				sb.delete(0, count);
				workdone=0;
				r="a";
				count=0;
			}
			else if(tx=="del")
			{
				if(r=="")
				{
					
				}
				else
				{
				if(temp!='e')
				{
					res=0.0;
					temp='e';
					 r = Calc.getOutput().getText();
					char[] clist = new char[r.length()-1];
					Calc.getOutput().setText("");
					for(int i=0;i<clist.length;i++)
					{
						clist[i] = r.charAt(i);
						Calc.getOutput().setText(Calc.getOutput().getText()+clist[i]);
					}
					r="";
					for(int i=0;i<clist.length;i++)
					{
						r+= clist[i];
					}
				}
				else
				{
				 r = Calc.getOutput().getText();
					char[] clist = new char[r.length()-1];
					Calc.getOutput().setText("");
					for(int i=0;i<clist.length;i++)
				{
					clist[i] = r.charAt(i);
					Calc.getOutput().setText( Calc.getOutput().getText()+ clist[i] );
				}
					r="";
					for(int i=0;i<clist.length;i++)
					{
						r+= clist[i];
					}
				sb.deleteCharAt(count-1);	
				count--;
				}
				}
			 }
			else if(tx=="ntr")
			{
				n1=0;
				n2=0;
				res=0.0;
				temp='e';
				sb.delete(0, count+1);
			}
		}

		public  void work()
		{
			workdone=1;
			n1=res;
		}
		public void operator(char c)
		{
			
			 if(c=='+')
			    {
				 if(temp!=c) {
				 valueChanger(c);
				 }
			    }
			    else if(c=='-')
			    {if(temp!=c) {
			    	 valueChanger(c);
			    }
			    }
			    else if(c=='*')
			    {if(temp!=c) {
			    	 valueChanger(c);}
			    }
			    else  if(c=='/')
			   {if(temp!=c) {
			    	 valueChanger(c);}
			    }
			    else if(c=='%')
			    {
			    	s1=sb.toString();
					if(res!=null)
					    {
					    }
					 else 
					    {
						n1 = Double.parseDouble(s1);
					 }
						sb.delete(0, count+1);
					 temp=c;
			    	
			    	res = Double.valueOf(n1/100);
			    	wholenum();
			    }
			    else if(c=='s')
			    {
			    	s1=sb.toString();
					if(res!=null)
					    {
					    }
					 else 
					    {
						n1 = Double.parseDouble(s1);
					 }
						sb.delete(0, count+1);
					 temp=c;
			    	
			    res = Math.sqrt(n1);
			    wholenum();
			    }
			    else if(c=='p')
			    {
			    	s1=sb.toString();
					if(res!=null)
					    {
					    }
					 else 
					    {
						n1 = Double.parseDouble(s1);
					 }
						sb.delete(0, count+1);
					 temp=c;
			    	
			    res =Math.pow(n1, 2);
			    wholenum();
			    n1=res;
			    }
			    else if(c=='.')
			    {		
			    	
			    		sb.append(".");
			    		Calc.getOutput().setText(Calc.getOutput().getText()+".");
			    }
			    else if(c=='x')
			    {
			    	s1=sb.toString();
					if(res!=null)
					    {}
					 else 
					    {
						n1 = Double.parseDouble(s1);
					 }
						sb.delete(0, count+1);
					 temp=c;
			    	
			    	res = Double.valueOf(1/n1);
			    	wholenum();
			    }
		}
		public  void valueChanger(char c) {
			s1=sb.toString();
			if(res!=null)
			    {
			    }
			 else 
			    {
				n1 = Double.parseDouble(s1);
			 }
				sb.delete(0, count+1);
			 temp=c;
			    Calc.getOutput().setText(Calc.getOutput().getText()+c);
		}
		public void equal()
		{
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
			    	wholenum();
			    }
			    temp='e';
		}
		public void wholenum()
		{
			if(Math.floor(res)==res) 
			{
				 Calc.getOutput().setText(String.valueOf(Math.round(res))); 
				}
				else
				{
					 Calc.getOutput().setText(String.valueOf(res)); 
				}
			work();
		}
		public void insertNumber(int i)
	    {
			r="a";
	        if(temp=='e'&&workdone==0)
	        {
	        	
	        	sb.append(i);
	        	count++;
	            Calc.getOutput().setText(Calc.getOutput().getText()+Math.round(i));
	        }
	        else
	        {
	        	
	        	sb.append(i);
	            Calc.getOutput().setText(Calc.getOutput().getText()+Math.round(i));
	            
	        }
	    }
		public void insertNumber(String i)
	    {
	        if(temp=='e'&&workdone==0)
	        {
	        	
	        	sb.append(i);
	        	count++;
	            Calc.getOutput().setText(Calc.getOutput().getText()+i);
	        }
	        else
	        {
	        	
	        	sb.append(i);
	            Calc.getOutput().setText(Calc.getOutput().getText()+i);
	            
	        }
	    }	 
	 
}
