
package lucky7;

public class Dice {
    private int num;
    private int high;
    private int rolls;
    private int money;

    public Dice() {
        
        num = (int) (Math.random() * 6 + 1);
        

    }

    public int getNumber() {
        return num;
    }
   
    

    public void roll() {
        num = (int) (Math.random() * 6 + 1);

    }

    
}
