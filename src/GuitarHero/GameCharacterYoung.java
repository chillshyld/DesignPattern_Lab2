package GuitarHero;

public class GameCharacterYoung extends GameCharacter{
    public GameCharacterYoung() {
        this.guitarBehavior = new Guitar_GibsonSG();
        this.soloBehavior = new Solo_JumpOffStage();
    }
}
