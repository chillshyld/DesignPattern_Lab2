package GuitarHero;

public class GameCharacterHendrix extends GameCharacter {
	
	
	public GameCharacterHendrix() {
		 guitarBehavior=new Guitar_Telecaster();
		 soloBehavior=new Solo_PutGuitarOnFire();
	}
}
