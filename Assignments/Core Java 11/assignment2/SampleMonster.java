public class SampleMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Monster a1=new Monster(1,2);
watermonster a2=new watermonster(null);
stonemonster a3=new stonemonster(null);
System.out.println(a1.attack());
System.out.println(a2.attack());
System.out.println(a3.attack());
Firemonster a4=new Firemonster();
System.out.println(a4.attack());
}
}
