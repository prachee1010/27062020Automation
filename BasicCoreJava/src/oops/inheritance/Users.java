package oops.inheritance;

public class Users {

	public static void main(String[] args) {
		Smartphone sm = new Smartphone();
		sm.calling();
		sm.texting();
		sm.videoCall();
		
		Mobile mb = new Mobile();
		mb.calling();
		mb.texting();
		
		Telephone tl = new Telephone();
		tl.calling();
	}
}
