
public class Main {

    public static void main(String[] args) {
	// write your code here
        owner o = new owner();
        o.addPlayGround();
        System.out.println(o.displayPlayGround());
       
        o.setTime();
        System.out.println(o.displayTime());
        o.setPrice();
        System.out.println(o.getPrice());


    }
}
