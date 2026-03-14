import java.util.*;
public class RpgApp{
  static Scanner sc = new Scanner(System.in);
  static RpgCharacter player;
  static boolean showMenu = true;
  public static void main(String[] args) {
    while(true) {
      System.out.println("\n=== RPG Character Creator ===");
      if(showMenu){
        System.out.println(" 1) Create Character ");
        System.out.println(" 2) View Stats");
        System.out.println(" 3) Train (Allocate Points ");
        System.out.println(" 4) Quick Battle");
        System.out.println(" 5) Reset (Heal to Full) ");
        System.out.println(" 0) Exit ");
      }
      System.out.println("Choice: ");
      int choice = sc.nextInt();
       sc.nextLine();

      switch(choice){
        case 1:
          createCharacter();
          pause();
          showMenu = true;
          break;
        case 2:
          if (player != null)
            player.showStats();
          else
            System.out.println(" Create character first.");
            pause();
          showMenu = false;
          break;
        case 3:
          if( player != null)
            player.train(sc);
          else
            System.out.println(" Create character first.");
            pause();
          showMenu = false;
          break;
        case 4:
          if (player != null)
            quickBattle();
          else
            System.out.println(" Create character first.");
            pause();
          showMenu = false;
          break;
        case 5:
          if ( player != null)
            player.rest();
          else
            System.out.println(" Create character first.");
            pause();
          showMenu = false;
          break;
        case 0:
          System.out.println(" Exiting... thanks for playing!");
          return;
      }
    }
  }
        static void createCharacter(){
          System.out.println(" -- Create Character --");
          System.out.println(" Enter Character name: ");
          String name = sc.nextLine();

          player = new RpgCharacter(name);
          System.out.println(" Created " + name + "(Lv 1) with 20/20 Hp, STR=5, AGI=5, INT=5, Gold=10, Points=5.");
        }
      static void quickBattle() {
        Random r = new Random();
          int goblinHP = 15;
          System.out.println(" -- Quick Battle --");
          System.out.println(" A Wild Goblin appears! (HP 15)");

        int round =1;
        while( goblinHP > 0 && player.hp > 0){

          int playerDmg = player.str + r.nextInt(3);
           goblinHP -= playerDmg;

          if (goblinHP < 0)
            goblinHP = 0;
 System.out.println("[Round " + round + "] " + player.name +  " hits for " + playerDmg +   " damage. Goblin HP: " + goblinHP + "/15");

          if(goblinHP <=0)
            break;
          int goblinDmg = 2 + r.nextInt(3);
           player.hp -= goblinDmg;
          
          if (player.hp < 0)
            player.hp = 0;
          
          System.out.println( "[Round " + round + "] Goblin hits for " + goblinDmg + " damage. " + player.name + "HP: " + player.hp + "/" + player.maxHp);
             round++;
        }
             if(player.hp > 0){
               player.gold += 7;
               player.points += 1;
               System.out.println(" You win! +7 gold. you feel stronger: +1 unspent point.");
             }
        else{
           player.hp = 1;
          System.out.println(" You lost the battle but survived with 1 HP.");
        }
      }
        static void pause(){
          System.out.println("\n (Press Enter to continue...)");
          sc.nextLine();
        }
}

  
          
               
        
        
        
          
          
          
            
          
      
        
  
