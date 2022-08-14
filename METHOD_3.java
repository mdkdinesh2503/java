public class METHOD_3 {
	String name;String email;String g;String b_n;double b_p;int b_q;
	void book(String b_name,double b_prize,int b_qis) {
		b_n=b_name;
		b_p=b_prize;
		b_q=b_qis;
	}
	void author(String a_n,String a_e,String a_g){
		name=a_n;
		email=a_e;
		g=a_g;
	}
	void getAuthor() {
		System.out.println("AUTHOR DETAILS:-");
		System.out.println("the author name is: "+name);
		System.out.println("the author email is: "+email);
		System.out.println("the author gender is: "+g);
	}
	void getName() {
		System.out.println("the book name is: "+b_n);
	}
	void getPrice() {
		System.out.println("the book price is: "+b_p);
	}
	void getQtyInStock() {
		System.out.println("the book Quantity In Stock is: "+b_q);
	}
	public static void main(String[] args) {
		METHOD_3 a=new METHOD_3();
		a.book("Engineering", 350.45, 20);
		a.author("dinesh","dinesh@gmail.com","M");
		a.getAuthor();
		System.out.println("BOOK DETAILS:-");
		a.getName();
		a.getPrice();
		a.getQtyInStock();
	}
}