class MainPen{
	public static void main(String args[]){
		
		Pen P;
		P=new Pen();
		System.out.println(P.height);
		
		P.color = "Red";
		P.height = 10.5;
		P.weight =  5.3;
		P.price = 20.00;
		P.madeIn = "chaina";
		P.brand = "ten";
		
				
		System.out.println("height :"+P.height);
		System.out.println("price :"+P.price);
		System.out.println("brand :"+P.brand);
		System.out.println("madeIn :"+P.madeIn);
		System.out.println("weight :"+P.weight);
		System.out.println("color :"+P.color);	

		P.write();
		
	}
}