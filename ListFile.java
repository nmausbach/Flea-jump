
package mausbach_final;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Nathan Mausbach 
 */
public class ListFile {
    Scanner get = new Scanner(System.in);
 
    public static void CreateFile(Scanner get) throws IOException, FileNotFoundException{
        try {
            File myObj = new File("list.txt");
            if (myObj.createNewFile()) {
             System.out.println("File created: " + myObj.getName());
            } 
        else 
            {
            System.out.println("File already exists.\n");
            }
            }   
        catch (IOException e) 
            {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }
    
    public static void ViewFile(){
        try {
      File myObj = new File("list.txt");
      Scanner readFile = new Scanner(myObj);
      while (readFile.hasNextLine()) {
        String data = readFile.nextLine();
        System.out.println(data);
      }
      readFile.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    public static void SortFile() throws FileNotFoundException, IOException{
        BufferedReader reader = new BufferedReader(new FileReader("list.txt"));
        ArrayList<String> lines = new ArrayList<String>();
        String currentLine = reader.readLine();
        while (currentLine != null){
            lines.add(currentLine);
            currentLine = reader.readLine();
        }
        Collections.sort(lines);
        BufferedWriter write = new BufferedWriter(new FileWriter("list.txt"));
        for(String line : lines){
            write.write(line);
            write.newLine();
        }
        reader.close();
        write.close();
        System.out.println("Shopping list has been sorted in alphabetical order\n");
    }
    public static void AddFile(){
        Scanner get = new Scanner(System.in);
        try{
             FileWriter shoppingList = new FileWriter("list.txt", true);
             String prompt = "How many items do you want to add to the shopping list? ";
             int size = Validator.getInt(get, prompt);
             String p = "Enter item for shopping list: ";
             for (int i = 0; i < size; i++) {
		shoppingList.write(Validator.getString(get, p)+ "\n");
                }
            shoppingList.close();
            System.out.println("write to file successful.");
            }
        catch (IOException e)
            {
            System.out.println("FAILED to write to file.");
            e.printStackTrace();
            }
    }
    public static void DeleteLine() throws FileNotFoundException, IOException{
            Scanner get = new Scanner(System.in);
    try {
      File file = new File("list.txt");

     
      File tempFile = new File(file.getAbsolutePath() + ".tmp");
      BufferedReader br = new BufferedReader(new FileReader("list.txt"));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
      String line = null;

      while ((line = br.readLine()) != null) {
        String p = "Enter item to delete: ";
        if (!line.trim().equals(Validator.getString(get, p))) {
          pw.println(line);
          pw.flush();
        }
      }
      pw.close();
      br.close();

      if (!file.delete()) {
        System.out.println("Could not delete file");
        return;
      }
    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    }
    public static void DeleteFile(){
     File dFile = new File("list.txt"); 
    if (dFile.delete()) { 
      System.out.println("Deleted the file: " + dFile.getName());
    } else {
      System.out.println("Failed to delete the file. File doesn't exist.");
    } 
  } 
}

