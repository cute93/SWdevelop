public class DogBark
{
	String name;
	int hungry;

	public void eat(){
		if(hungry <= 70){
			System.out.println(name+" say �ȳ�~~");
			hungry += 30;
		}else{
			System.out.println(name+" say ������� �ʾƿ�~~");
		}
	}

	public void bark(){
		if(hungry <= 30){
			System.out.println(name+" say ����~~ : hungry - "+ hungry);
		}else if(hungry <= 70){
			System.out.println(name+" say �۸�~~ : hungry - "+ hungry);
		}else{
			System.out.println(name+" say �տ�~~ : hungry - "+ hungry);
		}
		hungry -= 10;
	}
}
