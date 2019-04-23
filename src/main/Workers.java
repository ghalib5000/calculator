package main;
public class Workers {

	private static double n1=0 ,n2=0;
	private static int workdone=0;
	private static Double res=null;
	static StringBuilder sb = new StringBuilder();
	static String s1="",s2="";
	static int count=0;
	static char temp='e';
	
	 public void clr(String tx)

		{
			if(tx=="ce")
			{
			Calc.getOutput().setText("");
				n1=0;
				n2=0;
				res=0.0;
				temp='e';
				sb.delete(0, count+1);
			}
			else if(tx=="c")
			{
				Calc.getOutput().setText("");
				n1=0;
				n2=0;
				res=0.0;
				temp='e';
				sb.delete(0, count+1);
			}
			else if(tx=="del")
			{
				if(temp!='e')
				{
					res=0.0;
					temp='e';
					String r = Calc.getOutput().getText();
					char[] clist = new char[r.length()];
					Calc.getOutput().setText("");
					for(int i=0;i<r.length()-1;i++)
					{
						clist[i] = r.charAt(i);
						Calc.getOutput().setText(Calc.getOutput().getText()+clist[i]);
					}
				}
				else
				{
				
				String r = Calc.getOutput().getText();
				char[] clist = new char[r.length()];
				Calc.getOutput().setText("");
				for(int i=0;i<r.length()-1;i++)
				{
					clist[i] = r.charAt(i);
					Calc.getOutput().setText(Calc.getOutput().getText()+clist[i]);
				}
				sb.deleteCharAt(count-1);
				count--;
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
				 	 valueChanger(c);
			    }
			    else if(c=='-')
			    {
			    	 valueChanger(c);
			    }
			    else if(c=='*')
			    {
			    	 valueChanger(c);
			    }
			    else  if(c=='/')
			   {
			    	 valueChanger(c);
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
			    	//clr("ntr");
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
			   // clr("ntr");
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
			    	//    clr("ntr");
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
			    //	clr("ntr");
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
