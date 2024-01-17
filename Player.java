
package game;

public class Player {
    String nama ;
    int Speed ;
    int HealthPoin ;
    int Damage;
    int Shield;
    
    void run(){
        System.out.println(nama+ "is running");
        System.out.println("Speed "+ Speed);
    }
    
    void attack(){
        System.out.println(nama+ "is attacking");
        System.out.println("Damage "+ Damage);
    }
    
    void defense(){
        System.out.println(nama+"is defending");
        System.out.println("Shield "+ Shield);
    }
    boolean isDead(){
        if(HealthPoin <= 0) return true;
        return false;
        
        
    } 
    
}
