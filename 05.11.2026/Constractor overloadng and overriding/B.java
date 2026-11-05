class B extends A{
	int y;
	B(){
		this.y=70;
	}
	void getx(int y){
		System.out.println("By"+this.y);
		System.out.println("ByLocal"+y);
	}
	void getx(){
		System.out.println("Bx"+this.x);
	}
}