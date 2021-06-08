import java.util.Scanner;

public class owner {
    private String playGround;
    private  String time;
    private  double price;

    public void addPlayGround() {
        System.out.println("Enter playground : ");
        Scanner input =new Scanner(System.in);
        playGround = input.nextLine();
    }
    public String displayPlayGround()
    {
        return playGround;
    }
    public void setTime() {
        System.out.println("Enter time:");
        Scanner input =new Scanner(System.in);
        time = input.nextLine();

    }
    public String displayTime()
    {
        return time;
    }
    public void setPrice() {
        System.out.println("Enter price :");
        Scanner input =new Scanner(System.in);
        price = input.nextDouble();

    }
    public double getPrice()
    {
        return price;
    }
    public owner ()
    {
        playGround = "not found";
        time = "00:00";
        price = 0;

    }



}
