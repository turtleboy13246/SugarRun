import java.util.Scanner;
public class SugarRun
{
  public static void main (String []args)
  {
    String name;
    int choice;
    Scanner scan = new Scanner (System.in);
    
    System.out.print("Before you wake up, we must confirm if you want to play as \nJohnny, Chia, or a custom character. Enter your character's name (CaSe SeSnSiTiVe)");
    name = scan.next();
    
    if (name.equals("Johnny")) {
      System.out.println("Wake up, little Johnny! It is time for your daily sugar. ");
      System.out.println("{1} Wake up {2} Stay in bed (input \"1\" or \"2\" to make your decision. Remember this for the rest of the story)");
      choice = scan.nextInt();
      
      if (choice == 1) {
        System.out.println("Yay! Papa is asleep; there's no way he will find us");
        System.out.println("Let's go to the {1} kitchen, Johnny. I don't think there will be sugar in the {2} bathroom, {3} playroom, {4} or anywhere else");
        choice = scan.nextInt();
        
        if (choice == 1) {
          System.out.println("Yipee! The sugar is either in the {1} cupboard or {2} under the table. What do you think?");
          choice = scan.nextInt();
          
          if (choice == 1) {
            System.out.println("My god, Johnny. You are just too smart! Now eat the sugar, before Papa catches you- oh no...\nDo you hear that Johnny? I'm outta here!");
            System.out.println("\n\"Johnny Johnny?\"");
            scan.nextLine();
            scan.nextLine();
            System.out.println("y-yes Papa?");
            System.out.println("\n\"Eating sugar?\"");
            scan.nextLine();
            System.out.println("no P-Papa...");
            System.out.println("\n\"Telling Lies?\"");
            scan.nextLine();
            System.out.println("no Papa...");
            System.out.println("\n\"Open your mouth... HA HA HA \"");
            System.out.println("Papa then starts spanking you. Game Over.");
          }
          else if (choice == 2) {
            System.out.println("You go under the table, but there is no sugar. Suddenly, the kitchen door blasts open and in comes Papa.\nYou are safe from Papa's rampage, for today. You Win.");
          }
          else {
            System.out.println("Bye Bye Johnny. Game Over");
          }
        }
        else if (choice == 2) {
          System.out.println("You check the bathroom but find no sugar. What you do find is Mommy waiting to give you a shower. Game Over.");
          
        }
        else if (choice == 3) {
          System.out.println("The playroom is empty, and you are suddenly filled with sadness. Game Over.");
        }
        else {
          System.out.println("Game Over. What did you think would happen?");
        }
      }
      else {
        System.out.println("That was your last chance to wake up. Game Over");   
      }
      
    }
    else if (name.equals("Chia")) {
      String color;
        
      System.out.println("Chia, wake up for your ice cream, little one!");
      System.out.println("{1} Wake up {2} Stay in bed (input \"1\" or \"2\" to make your decision. Remember this for the rest of the story)");
      choice = scan.nextInt();
      
      if (choice == 1) {
        System.out.println("Let's Go! I don't want you to wake up Papa and get in trouble, so I just brought the ice-cream here.\n Do you want {1} mango, {2} vanilla, or {3} chocolate?");
        choice = scan.nextInt();
        
        if (choice == 1) {
          System.out.println("Good Choice! But first, what color is mango?");
          color = scan.next();
          
          if (color.equalsIgnoreCase("yellow")) {
            System.out.println("CORRECT!, here's your yellow mango ice-cream. You Win.");
          }
          else if (color.equalsIgnoreCase("orange")) {
            System.out.println("That works, I guess. Here's your orange mango ice-cream :) You Win.");
          }
          else {
            System.out.println("WRONG, NO ICE-CREAM FOR YOU. Game Over.");
          }
        }
        else if (choice == 2) {
          System.out.println("Yummy! What color is vanilla ice-cream?");
          color = scan.next();
          
          if (color.equalsIgnoreCase("vanilla")) {
            System.out.println("Naturaly. Here's your vanilla ice-cream. You Win.");
          }
          else if (color.equalsIgnoreCase("White")) {
            System.out.println("Yes, vanilla ice-cream is white. Here's your white vanilla ice-cream. You Win.");
          }
          else {
            System.out.println("WRONG, NO ICE-CREAM FOR YOU. Game Over.");
          }
        }
        else if (choice == 3) {
          System.out.println("Classic Chocolate. What color is chocolate ice-cream?");
          color = scan.next();
          
          if (color.equalsIgnoreCase("brown")) {
            System.out.println("Right. Here's your brown chocolate ice-cream. You Win.");
          }
          else {
            System.out.println("You might as well get in trouble with Papa for not knowing this color. Game Over.");
          }
        }
      }
      else if (choice == 2) {
        System.out.println("Oh well, I'll just go help Johnny then. Game Over.");
      }
      else {
        System.out.println("God, do you not know your numbers? Game Over!");
      }
    }  
    else {
      System.out.println(name + "! Wake up and get food for yourself, lazy bum! I only help Johnny and Chia");
    }
    
    
    System.out.println("\n\n\n\n\nStory Written by Jeeva Venkat"); 
    scan.close(); 
  }
}
    
    
    