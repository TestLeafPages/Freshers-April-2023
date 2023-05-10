package week1.day22;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=12836543453632L;
	boolean isPunctured=true;
	String bikeName="Pulsar";
	double runningKM=653.232;
public static void main(String[] args) {
	TwoWheeler vehicle=new TwoWheeler();
	System.out.println(vehicle.noOfWheels);
	System.out.println(vehicle.noOfMirrors);
	System.out.println(vehicle.chassisNumber);
	System.out.println(vehicle.isPunctured);
	System.out.println(vehicle.bikeName);
	System.out.println(vehicle.runningKM);

}
}
