import java.util.Random;
public class Enemy{
  private String name;
  private int hp;
  private int maxHp;
  private int power;

private Random rand = new Random();
  public Enemy(String name){
    this.name = name;
    maxHp = 15;
    hp = 15;
    power = 4;
  }
  public int attackDamage(){
     return power + rand.nextInt(3);}

public void takeDamage(int amount){
  hp -= amount;
  if( hp < 0) hp =0; }
  public boolean isAlive(){
    return hp >  0; }
public int getHp(){
  return hp; }
  public int getMaxHp() {
    return maxHp;
  }
  public String getName() {
    return name ; }
}




  
  
    
