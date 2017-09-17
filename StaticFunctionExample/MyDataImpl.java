
public class MyDataImpl implements MyData {

	static boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
                obj.print("Work Hard!!");
	
  	        obj.isNull("abc");
	}
}
