
package mausbach_final;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * @author Nathan Mausbach 
 */
public class Menu {

    public static int menu(int num){
        Scanner get = new Scanner(System.in);
        int menu;
int idiotCounter = 0;
        while(idiotCounter < 3){
           try{ System.out.println("\n\tMenu\n");
                System.out.println("Option 1. Create shopping list file: ");
                System.out.println("Option 2. Add items to shopping list: ");
                System.out.println("Option 3. Sort shopping list file: ");
                System.out.println("Option 4. View shopping list file: ");
                System.out.println("Option 5. Delete item from shopping list: ");
                System.out.println("Option 6. Delete shopping list file: ");

            if (num == 2)
                System.out.println("Option 7. Exit: ");
                System.out.print("\nEnter your choice: ");
                menu = get.nextInt();
                }
                catch (InputMismatchException e){
                    
                    System.out.println(" \n\tError! Invalid number. Try again. \n\t" + e);
                    get.nextLine();
                   System.out.println("idiot counter is " +idiotCounter);
                   idiotCounter++;
                    continue;
                }
            switch(menu){
                case 1:
                    return menu;
                case 2:
                    return menu;
                case 3:
                    return menu;
                case 4:
                    return menu;
                case 5:
                    return menu;
                case 6:
                    return menu;
                case 7:
                    return menu;
                default:
                    idiotCounter++;
            }
        }
        menu = 7;
        return menu;
    }
}