public class Elf implements  Fighter{
    public int elfHp = 70;
    public int getfight  ;
    public void lastHp(){
        elfHp = elfHp-getfight;
    }
    public int Hp(){
        return  elfHp;
    }
    public int Ap(){
        return Constants.elfAP;
    }
    public int maxMove() {
        return Constants.elfMaxMove;
    }
    public int rangedAp(){
        return Constants.elfRangedAP;
    }
}
