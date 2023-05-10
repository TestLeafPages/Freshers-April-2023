package week1.day3;

public class Mobile {

	public void switchOnMobile() {
		System.out.println("switchOnMobile");
	}
	private void sharePicture() {
		System.out.println("sharePicture");
	}
	protected void makeCall() {
		System.out.println("make Call");
	}
	  void switchOffMobile() {
		System.out.println("switch OffMobile");
	}
	 public static void main(String[] args) {
		 Mobile mobile=new  Mobile();
			mobile.switchOffMobile();
			mobile.sharePicture();
			mobile.makeCall();
			mobile.switchOnMobile();
	}
	
	
}
