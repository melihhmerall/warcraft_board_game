public class Troll implements Fighter{
    public int trollHp = 150;
    public int getfight  ;
    public void lastHp(){
        trollHp = trollHp-getfight;
    }
    public int Hp(){
        return  trollHp;
    }
    public int Ap(){
        return Constants.trollAP;
    }
    public int maxMove() {
        return Constants.trollMaxMove;
    }
}
