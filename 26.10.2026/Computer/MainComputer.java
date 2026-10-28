class MainComputer{
	public static void main(String[] args){
		
		Computer C;
		C=new Computer();
		System.out.println(C.Height);
		
		C.Color = "Black";
		C.Brand = "HP";
		C.Ram = 8;
		C.Storage = 256;
		C.MadeIn = "Srilanka";	
		
		
		C.StudyCoding();
		C.Edit();
		C.WatchMovies();
		
	}
}