package dayTwo;

public class CarModal {

public class CarModal1 {
	private String modal;
	private int year;
	
	public void setModal(String modal, int year) {
		this.modal = modal;
		this.year = year;
	}
	
	public String getModal() {
		return modal;
	}
	
	public int getYear() {
		return year;
	}
}
    
    public static void main(String[] args) {
		CarModal c1 = new CarModal();
		CarModal1 c = c1.new CarModal1();
		c.setModal("Range Rover", 2000);
		System.out.println("Modal Namme:" +c.getModal());
		System.out.println("Modal Year:" +c.getYear());
	}

}
