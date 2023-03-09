class Exam{
  static final public void main(final String [] z)
  	throws Exception{
	System.out.println("Success");
	var value=Float.valueOf(1_0.0F);
	print(value);
	
	value=Float.valueOf(1_0.0f);
	print(value);

	var value2=Byte.valueOf((byte)300F);
	System.out.println(value2);

 }
 static void  print(double number){
	System.out.println(number);
 }
}
