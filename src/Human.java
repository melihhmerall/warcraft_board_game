public class Human implements  Fighter{
    public int humanHp = 100;
    public int getfight  ;
    public void lastHp(){
        humanHp = humanHp-getfight;
    }
    public int Hp(){
        return  humanHp;
    }
    public int Ap(){
        return  Constants.humanAP;
    }
    public int maxMove() {
        return Constants.humanMaxMove;
    }
}
