import java.util.*;
public class VehicleSpeed {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double sp=0;
        int n=0;
        System.out.println("---------------------------------------------");
        System.out.println("\tEnter the Details of the car\t");
        System.out.println("---------------------------------------------");
        System.out.println("Enter Speed of Car: ");
        sp=obj.nextDouble();
        System.out.println("Enter number of Passengers: ");
        n=obj.nextInt();
        Car c=new Car(sp,n);
        double cspeed=c.calculateSpeed();
        System.out.println("Calculated Speed of Car: "+cspeed);
        System.out.println("---------------------------------------------\n");
        System.out.println("---------------------------------------------");
        System.out.println("Enter the Details of the Motorcycle");
        System.out.println("---------------------------------------------");
        System.out.println("Enter Speed of Motorcycle: ");
        sp=obj.nextDouble();
        System.out.println("Enter number of Wheels: ");
        n=obj.nextInt();
        Motorcycle m=new Motorcycle(sp,n);
        double mspeed=m.calculateSpeed();
        System.out.println("Calculated Speed of Motorcycle: "+mspeed);
        System.out.println("---------------------------------------------\n");
        if(cspeed>mspeed)
            System.out.println("Vehicle with highest Effective Speed is Car");
        else if(mspeed>cspeed)
            System.out.println("Vehicle with highest Effective Speed is MotorCycle");
        else
            System.out.println("Both the vehicles have same speed");
    }
}

class Vehicle{
    double speed;
    Vehicle(double sp){
        this.speed=sp;
    }
    public double calculateSpeed(){
        return speed;
    }
}

class Car extends Vehicle{
    int n;
    Car(double sp,int n){
        super(sp);
        this.n=n;
    }
    public double calculateSpeed(){
        return super.calculateSpeed()*n;
    }
}

class Motorcycle extends Vehicle{
    int n;
    Motorcycle(double sp,int n){
        super(sp);
        this.n=n;
    }
    public double calculateSpeed(){
        return super.calculateSpeed()*n;
    }
}

/*
---------------------------------------------
	Enter the Details of the car	
---------------------------------------------
Enter Speed of Car: 
90
Enter number of Passengers: 
3
Calculated Speed of Car: 270.0
---------------------------------------------

---------------------------------------------
Enter the Details of the Motorcycle
---------------------------------------------
Enter Speed of Motorcycle: 
100
Enter number of Wheels: 
2
Calculated Speed of Motorcycle: 200.0
---------------------------------------------

Vehicle with highest Effective Speed is Car

*/