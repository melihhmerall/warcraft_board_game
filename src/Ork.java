public class Ork implements  Fighter{
    public int orkHp = 200;
    public int getfight  ;
    public void lastHp(){
        orkHp = orkHp-getfight;
    }
    public int Hp(){
        return orkHp;
    }
    public int Ap(){
        return Constants.orkAP;
    }
    public int maxMove() {
        return Constants.orkMaxMove;
    }
    public int Healpoints(){
        return Constants.orkHealPoints;
    }

}
