public class METHOD_1 {  
	int roomNo;  
	String roomType;  
	double roomArea;  
	String acMachine;  
	void setdata(int rno,String type,double area,String yesorno) {   
		roomNo=rno;   
		roomType=type;   
		roomArea=area;   
		acMachine=yesorno; 

	}  
	void displaydata() {   
		System.out.println("The room no is: "+roomNo);   
		System.out.println("The room type is: "+roomType);   
		System.out.println("The room area is: "+roomArea);   
		System.out.println("Does the room has AC Machine: "+acMachine);
	} 
	public static void main(String[] args) {   
		METHOD_1 room1=new METHOD_1();   
		room1.setdata(25,"VIP",255,"Yes");   
		room1.displaydata(); 
	} 
} 