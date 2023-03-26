public class Goblin implements  Fighter{
    public int goblinHp = 80;
    public int getfight  ;
    public void lastHp(){
        goblinHp = goblinHp-getfight;
    }
    public int Hp(){
        return goblinHp;
    }
    public int Ap(){
        return  Constants.goblinAP;
    }
    public int maxMove() {
        return Constants.goblinMaxMove;
    }
}
