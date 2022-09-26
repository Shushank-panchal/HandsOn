package CoreJava;

 class Tesla extends Car{
	 void drive()
		{
		System.out.println("Drive Safely");
	 }
	 public static void main(String[] args)
		{
			Tesla obj = new Tesla();
			obj.drive();
			obj.gearChange();

		}
	@Override
	void gearChange() {
		// TODO Auto-generated method stub
		
	}


}
