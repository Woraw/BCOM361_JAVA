import java.io.*;
class T07{
	public static void main(String args[])throws IOException{
	System.out.println("1 Java Array Calculate Grade");
	System.out.println("2 Java Array Calculate Commission");
	System.out.println("3 Java Array Calculate Deposit 12 month");
	System.out.println("4 Multiplication");
	System.out.println("5 Choose Calculations");
	System.out.println("0 exit");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	String buf=stdin.readLine();
	do{
		if(buf.equals("1")) {
			T01();}
		else if(buf.equals("2")){
			T02();}
		else if(buf.equals("3")){
			T03();}
		else if(buf.equals("4")){
			T04();}
		else if(buf.equals("5")){
			T05();}
	}while(Integer.parseInt(buf) !=0);
}
	/*-----------T01------------*/
	static void T01() throws IOException {
	  System.out.println("=====================================");
	  System.out.println("=Tax Java Array Calculate Grade =");
	  System.out.println("=====================================");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String a[][] = new String[4][4];
	System.out.println("Student ID");
			a[0][1] = stdin.readLine();
	System.out.println("*******************");
	System.out.println("NAME");
			a[1][1] = stdin.readLine();
	System.out.println("*******************");
	System.out.println("Subject");
			a[2][1] = stdin.readLine();
	System.out.println("*******************");
	System.out.println("Score");
			a[3][1] = stdin.readLine();
				int score=Integer.parseInt(a[3][1]);
				
				String grade;
				if(score>=80){
					grade="A";
				}
				else if(score>=70){
					grade="B";
				}
				else if(score>=60){
					grade="C";
				}
				else if(score>=50){
					grade="D";
				}
				else{
					grade="F";
				}
      for (int x = 0; x < 4; x++) {
        System.out.print(a[x][1]+" ");	
		}
	  System.out.println("Your grade Is = "+grade);
	  System.out.println();
	  System.out.println("=====================================");
	  System.out.println("==========END PROCESS==============");
	  System.out.println("=====================================");
	
	}
	/*-----------T02------------*/
	static void T02() throws IOException {
System.out.println("=====================================");
System.out.println("=Tax Java Array Calculate Commission=");
System.out.println("=====================================");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String a[][] = new String[4][4];
	System.out.println("*******************");
	System.out.println("Employee ID");
		a[0][1] = stdin.readLine();
	System.out.println("*******************");
	System.out.println("Employee Name");
		a[1][1] = stdin.readLine();
	System.out.println("*******************");
	System.out.println("Salary");
		a[2][1] = stdin.readLine();
	System.out.println("*******************");
	System.out.println("Money outside.");
		a[3][1] = stdin.readLine();	
		int salary = Integer.parseInt(a[2][1]);
		int income = Integer.parseInt(a[3][1]);
		double comm,vat,net;
				if(income>15000){
					vat=0.05;
				}
				else if(income<=10000){
					vat=0.03;
				}
				else if(income<=8000){
					vat=0.02;
				}
				else if(income<=7000){
					vat=0.01;
				}
				else {
					vat=0;
				}
				comm=income*vat;
				net=salary+comm;
	
	  for (int y = 0; y < 4; y++) {
		System.out.print(a[y][1]+" ");
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println("Salary = "+salary);
		System.out.println("Commission = "+comm);
		System.out.println("Net Income = "+net);
		System.out.println("=====================================");
		System.out.println("==========END PROCESS==============");
		System.out.println("=====================================");
		
		
	}
	/*-----------T03------------*/
	static void T03() throws IOException {
		System.out.println("=====================================");
		System.out.println("=Tax Java Array Calculate Deposit 12 month=");
		System.out.println("=====================================");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String a[][] = new String[4][4];
		System.out.println("*******************");
		System.out.println("Member ID");
			a[0][1] = stdin.readLine();
		
		System.out.println("*******************");
		System.out.println("Member Name");
			a[1][1] = stdin.readLine();
		
		System.out.println("*******************");
		System.out.println("Deposit $");
			a[2][1] = stdin.readLine();
			int depos = Integer.parseInt(a[2][1]);
			double net,rate,fv;
			rate=0.02;
			fv=rate*12*depos;
			net=depos+fv;
		  for (int y = 0; y < 3; y++) {
			System.out.print(a[y][1]+" ");
			}
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Deposit = "+depos);
			System.out.println("Interest earned in the future = "+fv);
			System.out.println("Money to be in the future = "+net);
			System.out.println("=====================================");
			System.out.println("==========END PROCESS==============");
			System.out.println("=====================================");
			
			
		}
	/*-----------T04------------*/
	static void T04()throws IOException{
		System.out.println("=====================================");
		System.out.println("=Tax Java Multiplication=");
		System.out.println("=====================================");
		BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter multiplication table : ");
		String buf=stdin.readLine();
		int i = Integer.parseInt(buf);
		int a=1;
		while(a<=12){
			System.out.println(i+"*"+a+"= "+i*a);
			a++;
		}
	}
	/*-----------T05------------*/
	static void T05()throws IOException{
		System.out.println("=====================================");
		System.out.println("=Tax Java Choose Calculations=");
		System.out.println("=====================================");
		BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
		String a[][] = new String[1][3];
			System.out.print("Number1 : ");
				a[0][0] = stdin.readLine();
			System.out.print("Symbol : ");
				a[0][1] = stdin.readLine();
			System.out.print("Number2 : ");
				a[0][2] = stdin.readLine();
		double x=0;
			if(a[0][1].equals("+")){
				x = Double.parseDouble(a[0][0])+Double.parseDouble(a[0][2]);
			}
			else if(a[0][1].equals("-")){
				x = Double.parseDouble(a[0][0])-Double.parseDouble(a[0][2]);
			}
			else if(a[0][1].equals("*")){
				x = Double.parseDouble(a[0][0])*Double.parseDouble(a[0][2]);
			}
			else if(a[0][1].equals("/")){
				x = Double.parseDouble(a[0][0])/Double.parseDouble(a[0][2]);
			}
			System.out.println("Answer Is : "+x);
		}
}
