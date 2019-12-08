package eg.edu.alexu.csd.oop.calculator.cs28;
import java.io.*;
public class CalculatorCore implements Calculator {
	private String myEquation = new String ();
	
	public void input(String s) {
		 this.myEquation = s ;
		return ;
	}
	private char opperation ;
	private String [] Memory = new String[5];
	private StringBuilder term  = new StringBuilder();
	private double[] nums = new double[2];
	private boolean flag;
	private int j=0,cur=-1;
	private String ans;
	
	private short whatType (char c) {
		if ((c == '+') || (c == '*') || (c == '/') )
			return 0 ;
		else if (c == '-')
			return 2;
		else return 3;
	}
	
	
	
	public String getResult() {
		flag = false ;
		opperation = '$';
		if (cur == 4) {
			cur = 0;
		}
		else {
		cur ++;
		}
		j= cur+1;
		for (int i = 0 ; i < myEquation.length() ; i++) {
			if (whatType(myEquation.charAt(i)) == 0) {
				if (flag == false) {
				try {
				nums[0] = Double.parseDouble(term.toString());
				term.delete(0,term.length());
				opperation = myEquation.charAt(i);
				flag = true ;
			}catch(Exception e) {
				cur--;
				return "Error" ;
			}
				}
				else {
					cur--;
					return "Error";
				}
			}else if (whatType(myEquation.charAt(i)) == 2) {
				if ((i == 0) || whatType(myEquation.charAt(i-1)) == 0 || whatType(myEquation.charAt(i-1)) == 2){
					term.append(myEquation.charAt(i));
				}
				else {
					if(flag == false) {
					try {
						nums[0] = Double.parseDouble(term.toString());
						term.delete(0,term.length());
						opperation = myEquation.charAt(i);
					}catch(Exception e) {
						cur--;
						return "Error" ;
					}
					}
					else {
						cur--;
						return "Error";
					}
				}

			}
			else {
				term.append(myEquation.charAt(i));
			}
		}try {
			nums[1] = Double.parseDouble(term.toString());
			term.delete(0,term.length());
			
		}catch(Exception e) {
			cur--;
			return "Error" ;
		}
		
		switch (opperation) {
		case '+':
			ans = Double.toString(nums[0] + nums[1]);
			Memory[cur] = ans;
			j++;
			return ans;
		case '-':
			ans = Double.toString(nums[0] - nums[1]);
			Memory[cur] = ans;
			j++;
			return ans;
		case '*':
			ans = Double.toString(nums[0] * nums[1]);
			Memory[cur] = ans;
			j++;
			return ans;
		case '/':
			try {
				ans = Double.toString(nums[0] / nums[1]);
				Memory[cur] = ans;
				j++;
			}catch(Exception e) {
				cur--;
				return "Error";
			}
			return ans ;
		}
		return null;
	}

	public String current() {
		j=cur+1;
		return Memory[cur];
	}

	@Override
	public String prev() {
		if ( (j > 1) && (j<=5) ) {
			j--;
			return Memory[j-1];
		}
		else {
			j=1;
			return Memory[0];
		}
		
			}
	@Override
	public String next() {
		if ((j>=1) && (j<5) && Memory[j] != null ) {
			j++;
			return Memory[j-1];
		}
		else if (j==5){
			return Memory[4];
		}
		else {
			return Memory[j-1];
		}
	}
	@Override
	public void save() {
		try {
			File myFile = new File("Lab1GUIcalc.txt");
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			FileWriter f = new FileWriter("Lab1GUIcalc.txt");
			f.flush();
			f.write(Integer.toString(cur));
			for (int i=0 ; i<5 ; i++) {
				if (Memory[i] != null) {
					f.write("/");
					f.write(Memory[i]);
				}
				else break;
			}
			f.write("/");
			f.close();
		}catch(Exception e) {
			System.out.println("Error,please retry");
		}
	}

	@Override
	public void load() {
		BufferedReader read = null ;
		try {
			read = new BufferedReader(new FileReader ("Lab1GUIcalc.txt"));
			String line = read.readLine() ;
			if (line.length() == 0) {
				read.close();
				return;
			}
			cur = Character.getNumericValue(line.charAt(0));
			if (cur != 4) {
			j=cur+1;
			}
			else j=0;
			int k = 2;
			int i=0;
			StringBuilder loadedNum = new StringBuilder();
			while (k<line.length()) {
				if (line.charAt(k) != '/') {
					loadedNum.append(line.charAt(k));
					k++;
				}
				else {
					Memory[i] = loadedNum.toString();
					i++;
					k++;
					loadedNum.delete(0, loadedNum.length());
				}
			}
			
			read.close();

		}catch(Exception e) {
			System.out.println("Error");
		}
	  
	}

}
