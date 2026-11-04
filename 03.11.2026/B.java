class B extends A{
	int y;
	B(){
		this.y=70;
	}
	void gety(){
		System.out.println("By:"+this.y);
	}
	void getx(){
		//int x=500;
		super.getx();
		System.out.println("Bx:"+x);
		System.out.println("Bx:"+x);
		System.out.println("Local:"+x);
	}
}