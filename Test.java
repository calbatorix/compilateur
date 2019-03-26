import java.io.*;

public class Test {
  public static void main(String [] args) {
    String filetest = "mustbe.txt";
    String line1 = new String();

    String fileout = "sorti.txt";
    String line2 = new String();
    try {
      FileReader fileReader1 = new FileReader(filetest);
      BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

      FileReader fileReader2 = new FileReader(fileout);
      BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

      int ligne = 0;
      while((line1 = bufferedReader1.readLine()) != null) {
        ligne++;
        line2 = bufferedReader2.readLine();
        if(line1.equals(line2)==false)
          System.out.println("\033[31m !!!!!!erreur ligne"+ligne+" "+line1+" au lieu de "+line2+"!!!!!!");
      }
      bufferedReader1.close();
      bufferedReader2.close();
    }
    catch(FileNotFoundException ex) {
      System.out.println("Unable to open file '" + filetest + "'");
    }
    catch(IOException ex) {
      System.out.println("Error reading file '"+ filetest + "'");
    }
  }
}
