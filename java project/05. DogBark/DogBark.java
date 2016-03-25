public class DogBark
{
	String name;
	int hungry;

	public void eat(){
		if(hungry <= 70){
			System.out.println(name+" say ³È³È~~");
			hungry += 30;
		}else{
			System.out.println(name+" say ¹è°íÇÁÁö ¾Ê¾Æ¿ä~~");
		}
	}

	public void bark(){
		if(hungry <= 30){
			System.out.println(name+" say ³©³©~~ : hungry - "+ hungry);
		}else if(hungry <= 70){
			System.out.println(name+" say ¸Û¸Û~~ : hungry - "+ hungry);
		}else{
			System.out.println(name+" say ¿Õ¿Õ~~ : hungry - "+ hungry);
		}
		hungry -= 10;
	}
}
