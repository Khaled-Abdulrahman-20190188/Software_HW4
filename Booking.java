import java.util.Scanner;
import java .util.ArrayList;
public class Booking {
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	public void ShowData() {
		System.out.println("The booking Id Is " + bookingid);
		System.out.println("The booking Time Is " + bookingTime);
		
	}

	public static void Showbookings(ArrayList<Booking> booking) {
		for(int i=0;i<booking.size();i++)
		{
			System.out.println("The booking number" +(i+1) );
			booking.get(i).ShowData();
		}
		
	}
	public static void setBookings(ArrayList<Booking> booking ) {
		Bookings = booking;
	}
	public Booking() {}
	
	public Booking(int bookingid, String bookingTime) {
		this.bookingid = bookingid;
		this.bookingTime = bookingTime;
	}
	
	public void Update(int postion ,Booking B)
	{
		Bookings.set(postion,B);
	}

	private int bookingid;
	private String bookingTime;
	static ArrayList<Booking>Bookings=new ArrayList<Booking>();

}
