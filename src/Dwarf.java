public class Dwarf implements  Fighter{

    public int dwarfHp = 120;
    public int getfight  ;
    public void lastHp(){
        dwarfHp = dwarfHp-getfight;
    }
    public int Hp(){
        return dwarfHp;
    }
    public int Ap(){
        return  Constants.dwarfAP;
    }
    public int maxMove() {
        return Constants.dwarfMaxMove;
    }

    public void setDwarfHp(int dwarfHp) {
        this.dwarfHp = dwarfHp;
    }
}
