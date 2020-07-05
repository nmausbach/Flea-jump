/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mausbach_final;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author Nathan Mausbach 
 */
public class Mausbach_Final {

    public static void main(String[] args) throws FileNotFoundException, IOException{
       MausbachHeading.getHeader("Final Project");
       Scanner get = new Scanner(System.in);
    
        
        int menu;
        menu = Menu.menu(1);
        while (menu != 7)
        {
            System.out.println("\n"); 
        if (menu == 1){
            ListFile.CreateFile(get);
        }
        if (menu == 2){
            ListFile.AddFile();
        }
        if (menu == 3){
            ListFile.SortFile();
        }
        if (menu == 4){
            ListFile.ViewFile();
        }
        if (menu == 5){
            ListFile.DeleteLine();
        }
        if (menu == 6){
            ListFile.DeleteFile();
        }
        menu = Menu.menu(2);
        }

    }
    
}
