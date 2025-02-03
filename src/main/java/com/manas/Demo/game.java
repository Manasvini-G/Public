package com.manas.Demo;
class Sports{
	public void play(){
		
	}
}

class Football extends Sports{
	public void play() {
		System.out.print("This is football");
	}
}
class Basketball extends Sports{
	public void play() {
		System.out.print("\nThis is Basketball");
	}
}
class Rugby extends Sports{
	public void play() {
		System.out.print("\nThis is Rugby");
	}
}
class game{
    public static void main( String[] args) {
        Football r = new Football();
        Basketball c= new Basketball();
        Rugby t= new Rugby();
       r.play();
       c.play();
       t.play();
    }
	
}
  