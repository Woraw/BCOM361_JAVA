import java.io.*;
import java.lang.*;
import java.util.regex.*;
class tax10 {
public static void main(String args[]) throws IOException {
	String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } else if (buf.equals("1")) {
        addstu();
        buf = " ";
      }else if (buf.equals("2")) {
        addsubj();
        buf = " ";
      }else if (buf.equals("3")) {
        addreg();
        buf = " ";
      }else if (buf.equals("4")) {
        deletestu();
        buf = " ";
      }else if (buf.equals("5")) {
        deletesubj();
        buf = " ";
      }else if (buf.equals("6")) {
        deletereg();
        buf = " ";
      }else if (buf.equals("7")) {
        editstu();
        buf = " ";
      }else if (buf.equals("8")) {
        editsubj();
        buf = " ";
      } else if (buf.equals("9")) {
        editreg();
        buf = " ";
      }else if (buf.equals("10")) {
        list("student.txt");
        buf = " ";
      } else if (buf.equals("11")) {
        list("subj.txt");
        buf = " ";
      } else if (buf.equals("12")) {
        list("regist.txt");
        buf = " ";
      }  else {
        System.out.print(waitopt);
        buf = stdin.readLine();
        // buf = (char)System.in.read(); // for 1 character
      }
	} 
  }
	// =======================MENU===============================
	static void displaymenu () {
		System.out.println("0 : bye bye");
		System.out.println("1 : Add Student Data");
		System.out.println("2 : Add Subject Data");
		System.out.println("3 : Add Regist Data");
		System.out.println("4 : Delete Student Data");
		System.out.println("5 : Delete Subject Data");
		System.out.println("6 : Delete Regist Data");
		System.out.println("7 : Edit Student Data");
		System.out.println("8 : Edit Subject Data");
		System.out.println("9 : Edit Regist Data");
		System.out.println("10 : List Student Data");
		System.out.println("11 : List Subject Data");
		System.out.println("12 : List Regist Data");
		System.out.println("");  
  }
  // =====================Add Student Data=================================
	public static void addstu () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname;
    System.out.print("Student id : ");
    bufid = stdin.readLine();
    System.out.print("Student name : ");
    bufname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufid + "," + bufname);
    System.out.println("Add Student : completely");
    pout.close();
  }
  
// =====================Add Subject Data=================================
  public static void addsubj () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname;
    System.out.print("Wait subj ID : ");
    bufid = stdin.readLine();
    System.out.print("Wait subj name : ");
    bufname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subj.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subj.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufid + "," + bufname );
    System.out.println("Add Student : completely");
    pout.close();
  }
  // =====================Add Regist Data=================================
  public static void addreg () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname,bufgrade;
    System.out.print("Wait Student ID : ");
    bufid = stdin.readLine();
    System.out.print("Wait Subject ID : ");
    bufname = stdin.readLine();
	System.out.print("Wait Grade: ");
    bufgrade = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regist.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regist.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufid + "," + bufname+","+ bufgrade );
    System.out.println("Add Student : completely");
    pout.close();
  }
  // ======================DELETE STUDENT================================
  public static void deletestu () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait STUDENT id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete STUDENT : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ======================DELETE SUBJECT================================
  public static void deletesubj () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait SUBJECT id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subj.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subj.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete SUBJECT : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ======================DELETE REGIST================================
  public static void deletereg () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait REGIST id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regist.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regist.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete REGIST : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ====================EDIT STUDENT==================================
  public static void editstu () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname;
    System.out.print("Wait STUDENT id : ");
    bufid = stdin.readLine();
    System.out.print("Wait STUDENT name : ");
    bufname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        pout.println(bufid + "," + bufname);
        System.out.println("Edit STUDENT : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ====================EDIT SUBJECT==================================
  public static void editsubj () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname;
    System.out.print("Wait SUBJECT id : ");
    bufid = stdin.readLine();
    System.out.print("Wait SUBJECT name : ");
    bufname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subj.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subj.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        pout.println(bufid + "," + bufname);
        System.out.println("Edit SUBJECT : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ====================EDIT REGIST==================================
  public static void editreg () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname,bufgrade;
    System.out.print("Wait STUDENT ID : ");
    bufid = stdin.readLine();
    System.out.print("Wait SUBJECT ID : ");
    bufname = stdin.readLine();
	System.out.print("Wait Grade : ");
    bufgrade = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regist.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regist.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        pout.println(bufid + "," + bufname+","+bufgrade);
        System.out.println("Edit REGIST : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ======================List DATA================================
  public static void list (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
}