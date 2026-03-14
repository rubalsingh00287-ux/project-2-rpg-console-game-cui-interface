import java.util.*;
public class RpgCharacter{
  String name;
  int level;
  int hp;
  int maxHp;
  int str;
  int agi;
  int intel;
  int gold;
  int points;
  public RpgCharacter(String name) {
    this.name = name;
    level = 1;
    maxHp = 20;
    hp = 20;
    str = 5;
    agi =5;
    intel = 5;
    gold = 10;
    points = 5;
  }
  public void showStats() {
    System.out.println("-- Stats --");
    System.out.println(" Name: " + name + "    Level: " + level );
    System.out.println(" HP: " + hp + "/" + maxHp + "    Gold: " + gold);
    System.out.println(" STR: " + str + "    AGI: " + agi + "    INT: " + intel);
    System.out.println(" Unspent Points: " + points);
  }
       public void train(Scanner sc){
         System.out.println(" -- Training --");
         System.out.println(" Allocate to: ");
         System.out.println(" 1) Strength ( +1 STR, +2 Max HP)");
         System.out.println(" 2) Agility");
         System.out.println(" 3) Intelligence");
         System.out.println(" 0) Back ");
         System.out.print("Choice: ");
         int choice = sc.nextInt();
         sc.nextLine();
             if ( points <= 0){
               System.out.println(" No points available. ");
               return;
             }
           if (choice == 1){
             str++;
             maxHp +=2;
             points--;
             System.out.println(" Allocated 1 point to Strength. STR ="+ str + ", MaxHp=" + maxHp + ",Points remaining=" +  points);
           }
         else if(choice == 2){
           agi++;
           points--;
           System.out.println(" Allocated 1 point to Agility. AGI =" + agi + ", Points remaining=" + points);
         }
         else if(choice == 3){
           intel++;
           points--;
            System.out.println(" Allocated 1 point to Intelligence. INT ="+ intel +  ", Points remaining=" +  points);
           }
       }
       public void rest() {
         hp = maxHp;
         System.out.println("You take a rest. HP restored to full.");
       }}

         
     
         
         
    
    
    
  
