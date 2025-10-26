import java.util.*;
interface Engine{
	void speedUp(int s);
	void gearUp(int g);
}
class Vehicle implements Engine{
	int speed=0;
	int gear=0;
	Vehicle(int speed, int gear){
		this.speed=speed;
		this.gear=gear;
	}
	public void speedUp(int s){
		speed+=s;
	}
	public void gearUp(int g){
		gear+=g;
	}
	int diplays(){
		return speed;
	}
	int displayg(){
		return gear;
	}
}
public class Interface{
	public static void main(String[]args){
		Vehicle obj=new Vehicle(30,4);
		obj.speedUp(70);
		obj.gearUp(15);
		System.out.println(obj.diplays());
		System.out.println(obj.displayg());
	}
}