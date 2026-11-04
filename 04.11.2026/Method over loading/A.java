class A{
	int id;
	String name; 
	
	void setStudent(){
		this.id=1000;
		this.name="Kithi";
	}
	void setStudent(int id){
		this.id=id;
		this.name ="Yoha";
	}
	void setStudent(String Name){
		this.id=3000;
		this.name=name;
	}
	void setStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setStudent(String name,int id){
		this.name=name;
		this.id=id;
		
	}

	void getStudent(){
		System.out.println("ID:"+this.id);
		System.out.println("NAME:"+this.name);
	}
}