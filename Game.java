
package game;


public class Game {

  
    public static void main(String[] args) {
        //HERO AND ENEMY
         Player Hero = new Player();
         Enemy Enemy = new Enemy();
         
         Hero.nama = "Nathan ";
         Hero.Speed = 75;
         Hero.HealthPoin = 200;
         Hero.Damage = 25;
         Hero.Shield = 50;
         
         Hero.run();
         Hero.attack();
         Hero.defense();
      
         if(Hero.isDead()){
             
             System.out.println("Meninggal");
                  
         Enemy.nama = "Felix ";
         Enemy.Speed = 75;
         Enemy.HealthPoin = 200;
         Enemy.Damage = 50;
         Enemy.Shield = 25;
         
         Enemy.run();
         Enemy.attack();
         Enemy.defense();
         
         if(Enemy.isDead()){
             System.out.println("Tewas");
             
         }
    }
         //DRONE//
         Drone Hitler = new Drone();
         Hitler.energi = 250;
         Hitler.kecepatan = 100;
         Hitler.ketinggian = 50;
         Hitler.merek = "Huawei";
         
         Hitler.terbang();
         Hitler.belok();
         Hitler.maju();
         Hitler.mundur();
         Hitler.turun();
         Hitler.matikanMesin();
         
         //ASTRONOT//
         Astronot X5625 = new Astronot();
         X5625.nama = "X5625 ";
         X5625.Berlari = 5;
         X5625.Lompat = 15;
         X5625.Jalan = 10; 
        
         X5625.Berlari();
         X5625.Melompat();
         X5625.Berjalan();
    }
}
