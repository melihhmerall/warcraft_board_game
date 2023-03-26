import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Main {
    static void printBoard(int line,List board,PrintWriter output){
        int k =0;
        while(k<(line+1)*2){
            output.print("*");
            k++;
        }
        output.println("");
        for (int m =0;m<board.size();m++){
            if (board.get(m).equals("*")&&board.get(m+1).equals("*")){
                output.println(board.get(m));
            }
            else {
                output.print(board.get(m));
            }
        }
        output.println("");
        k =0;
        while(k<(line+1)*2){
            output.print("*");
            k++;
        }
        output.println("\n");

    }
    static int count = 0;
    static int returner(){
        return count++;
    }
    static int cleaner(){
        return count = 0;
    }
    static int count2 = 0;
    static int returner2(){
        return count2++;
    }
    static int cleaner2(){
        return count2 = 0;
    }
    static void addBoard(List<String> lister,int int_line,List<String> board){
        for (int o =0;o<lister.size();o++){
            int index = 0;
            List<String> lister_line = new ArrayList<>(Arrays.asList(lister.get(o).split(" ")));
            int horizontal = Integer.parseInt(lister_line.get(3));
            int vertical = Integer.parseInt(lister_line.get(2));
            index = horizontal*int_line + vertical+ horizontal*2+1;
            board.set(index,lister_line.get(1));
        }
    }
    static void one_moveboard(List<String> movementt,List<String> boardd,int int_linee,PrintWriter output,String fighter_man,List<String > ally,int count,List<String > human_attack
    ,List<String> board,List<String> movement,List<String> dost,List<String > enemy,List<String> ally_list,int xx
            ,Dwarf D0,Ork O0,Elf E0,Human H0,Troll T0,Goblin G0,Dwarf D1,Ork O1,Elf E1,Human H1,Troll T1,Goblin G1){
        int new_linee = 0;
        int indexx = 0;
        int indexx2 = 0;
        int new_linee2 = 0;
        int attackhp = 0;
        int attackap =0;
        String attacker = null ;
        String defender = null;
        int defenderhp =0;
        if (movementt.size()==2){//onelinemove
                int mv0 = Integer.parseInt(movementt.get(0));
                int mv1 = Integer.parseInt(movementt.get(1));
                new_linee =mv0 ;new_linee2 = mv1 ;indexx2 = boardd.indexOf(fighter_man);indexx = new_linee2*int_linee + new_linee + new_linee2*2;indexx = indexx +indexx2;
                if (indexx< 0){
                    human_attack.clear();
                    output.println("Error : Game board boundaries are exceeded. Input line ignored.");
                    output.println("");
                    returner2();

                }
                else if (boardd.get(indexx).equals("*") ){

                    output.println("Error : Game board boundaries are exceeded. Input line ignored.");
                    output.println("");
                    returner2();

                }
                else if (ally.contains(boardd.get(indexx))){
                    returner();
                }
                else if (enemy.contains(boardd.get(indexx))){
                    returner();

                    if (fighter_man.equals("H0")){
                        attackhp = H0.Hp();
                        attackap = H0.Ap();
                        attacker = "H0";
                    }if (fighter_man.equals("D0")){
                        attackhp = D0.Hp();
                        attackap = D0.Ap();
                        attacker = "D0";
                    }if (fighter_man.equals("E0")){
                        attackhp = E0.Hp();
                        attackap = E0.Ap();
                        attacker = "E0";
                    }if (fighter_man.equals("G0")){
                        attackhp = G0.Hp();
                        attackap = G0.Ap();
                        attacker = "G0";
                    }if (fighter_man.equals("O0")){
                        attackhp = O0.Hp();
                        attackap = O0.Ap();
                        attacker = "O0";
                    }if (fighter_man.equals("T0")){
                        attackhp = T0.Hp();
                        attackap = T0.Ap();
                        attacker = "T0";
                    }
                    if (boardd.get(indexx).equals("T0")){
                        defenderhp = T0.Hp();
                        defender = "T0";
                    }if (boardd.get(indexx).equals("D0")){
                        defenderhp = D0.Hp();
                        defender = "D0";
                    }if (boardd.get(indexx).equals("O0")){
                        defenderhp = O0.Hp();
                        defender = "O0";
                    }if (boardd.get(indexx).equals("E0")){
                        defenderhp = E0.Hp();
                        defender = "E0";
                    }if (boardd.get(indexx).equals("G0")){
                        defenderhp = G0.Hp();
                        defender = "G0";
                    }if (boardd.get(indexx).equals("H0")){
                        defenderhp = H0.Hp();
                        defender = "H0";
                    }
                    if (fighter_man.equals("H1")){
                        attackhp = H1.Hp();
                        attackap = H1.Ap();
                        attacker = "H1";
                    }if (fighter_man.equals("D1")){
                        attackhp = D1.Hp();
                        attackap = D1.Ap();
                        attacker = "D1";
                    }if (fighter_man.equals("E1")){
                        attackhp = E1.Hp();
                        attackap = E1.Ap();
                        attacker = "E1";
                    }if (fighter_man.equals("G1")){
                        attackhp = G1.Hp();
                        attackap = G1.Ap();
                        attacker = "G1";
                    }if (fighter_man.equals("O1")){
                        attackhp = O1.Hp();
                        attackap = O1.Ap();
                        attacker = "O1";
                    }if (fighter_man.equals("T1")){
                        attackhp = T1.Hp();
                        attackap = T1.Ap();
                        attacker = "T1";
                    }
                    if (boardd.get(indexx).equals("T1")){
                        defenderhp = T1.Hp();
                        defender = "T1";
                    }if (boardd.get(indexx).equals("D1")){
                        defenderhp = D1.Hp();
                        defender = "D1";
                    }if (boardd.get(indexx).equals("O1")){
                        defenderhp = O1.Hp();
                        defender = "O1";
                    }if (boardd.get(indexx).equals("E1")){
                        defenderhp = E1.Hp();
                        defender = "E1";
                    }if (boardd.get(indexx).equals("G1")){
                        defenderhp = G1.Hp();
                        defender = "G1";
                    }if (boardd.get(indexx).equals("H1")){
                        defenderhp = H1.Hp();
                        defender = "H1";
                    }


                    fightto_death( D0, O0, E0, H0, T0, G0,D1, O1, E1, H1, T1, G1,attackhp,defenderhp,attackap,boardd,indexx,indexx2,fighter_man,defender,attacker);
                }
                else {
                    boardd.set(indexx2,"  ");
                    boardd.set(indexx,fighter_man);
                    attack_list_edit(human_attack,board,movement,int_linee,dost,enemy,ally_list);
                }

            }
            movementt.clear();


    }
    static void figtherHp(List<String> human_attackk, int meral,Dwarf D0,Ork O0,Elf E0,Human H0,Troll T0,Goblin G0,Dwarf D1,Ork O1,Elf E1,Human H1,Troll T1,Goblin G1,List<String > boardd){
          for (int t =0;t<human_attackk.size();t++){
            if (human_attackk.get(t).substring(0,1).equals("O")){
                if (human_attackk.get(t).substring(1).equals("0")){
                    O0.getfight = meral;
                    O0.lastHp();
                }
                else if (human_attackk.get(t).substring(1).equals("1")){
                    O1.getfight = meral;
                    O1.lastHp();
                }
            }
            if (human_attackk.get(t).substring(0,1).equals("T")){
                if (human_attackk.get(t).substring(1).equals("0")){
                    T0.getfight = meral;
                    T0.lastHp();
                }
                else if (human_attackk.get(t).substring(1).equals("1")){
                    T1.getfight = meral;
                    T1.lastHp();
                }
            }
            if (human_attackk.get(t).substring(0,1).equals("G")){
                if (human_attackk.get(t).substring(1).equals("0")){
                    G0.getfight = meral;
                    G0.lastHp();
                }
                else if (human_attackk.get(t).substring(1).equals("1")){
                    G1.getfight = meral;
                    G1.lastHp();
                }
            }
            if (human_attackk.get(t).substring(0,1).equals("E")){
                if (human_attackk.get(t).substring(1).equals("0")){
                    E0.getfight = meral;
                    E0.lastHp();

                }
                else if (human_attackk.get(t).substring(1).equals("1")){
                    E1.getfight = meral;
                    E1.lastHp();
                }
            }
            if (human_attackk.get(t).substring(0,1).equals("D")){
                if (human_attackk.get(t).substring(1).equals("0")){
                    D0.getfight = meral;

                    D0.lastHp();
                }
                else if (human_attackk.get(t).substring(1).equals("1")){
                    D1.getfight = meral;
                    D1.lastHp();
                }
            }
            if (human_attackk.get(t).substring(0,1).equals("H")){
                if (human_attackk.get(t).substring(1).equals("0")){
                    H0.getfight = meral;
                    H0.lastHp();
                }
                else if (human_attackk.get(t).substring(1).equals("1")){
                    H1.getfight = meral;
                    H1.lastHp();
                }
            }
        }
        if (O0.Hp()<=0){
           int x = boardd.indexOf("O0");
           if (x>0){
            boardd.set(x,"  ");}
        }
        if (T0.Hp()<=0){
            int x = boardd.indexOf("T0");
            if (x>0){
            boardd.set(x,"  ");}
        }
        if (E0.Hp()<=0){
            int x = boardd.indexOf("E0");
            if (x>0){
            boardd.set(x,"  ");}
        }
        if (G0.Hp()<=0){
            int x = boardd.indexOf("G0");
            if (x>0){
            boardd.set(x,"  ");}
        }
        if (H0.Hp()<=0){
            int x = boardd.indexOf("H0");
            if (x>0){
            boardd.set(x,"  ");}
        }
        if (D0.Hp()<=0){
            int x = boardd.indexOf("D0");
            if (x>0){
            boardd.set(x,"  ");}
        }
        if (O1.Hp()<=0){
            int x = boardd.indexOf("O1");
            if (x>0){
                boardd.set(x,"  ");}
        }
        if (T1.Hp()<=0){
            int x = boardd.indexOf("T1");
            if (x>0){
                boardd.set(x,"  ");}
        }
        if (E1.Hp()<=0){
            int x = boardd.indexOf("E1");
            if (x>0){
                boardd.set(x,"  ");}
        }
        if (G1.Hp()<=0){
            int x = boardd.indexOf("G1");
            if (x>0){
                boardd.set(x,"  ");}
        }
        if (H1.Hp()<=0){
            int x = boardd.indexOf("H1");
            if (x>0){
                boardd.set(x,"  ");}
        }
        if (D1.Hp()<=0){
            int x = boardd.indexOf("D1");
            if (x>0){
                boardd.set(x,"  ");}
        }

    }
    static void fightto_death(Dwarf D0,Ork O0,Elf E0,Human H0,Troll T0,Goblin G0,Dwarf D1,Ork O1,Elf E1,Human H1,Troll T1,Goblin G1,int attackerHp,int defenserHp,int attackerAp,List<String> board,int index ,int index2,String fighter_man,String defender,String attacker){
        int melih = defenserHp;

        defenserHp = defenserHp-attackerHp;
        attackerHp = attackerHp-melih;


        if (attacker.equals("H0")){
            H0.humanHp = attackerHp;
        }
        if (attacker.equals("E0")){
            E0.elfHp = attackerHp;
        }
        if (attacker.equals("D0")){
            D0.dwarfHp = attackerHp;
        }
        if (attacker.equals("O0")){
            O0.orkHp = attackerHp;
        }
        if (attacker.equals("G0")){
            G0.goblinHp = attackerHp;
        }
        if (attacker.equals("T0")){
            T0.trollHp = attackerHp;
        }

        if (defender.equals("H0")){
            H0.humanHp = defenserHp;
        }
        if (defender.equals("E0")){
            E0.elfHp = defenserHp;
        }
        if (defender.equals("D0")){
            D0.dwarfHp = defenserHp;
        }
        if (defender.equals("O0")){
            O0.orkHp = defenserHp;
        }
        if (defender.equals("G0")){
            G0.goblinHp = defenserHp;
        }
        if (defender.equals("T0")){
            T0.trollHp = defenserHp;

        }

        if (attacker.equals("H1")){
            H1.humanHp = attackerHp;
        }
        if (attacker.equals("E1")){
            E1.elfHp = attackerHp;
        }
        if (attacker.equals("D1")){
            D1.dwarfHp = attackerHp;
        }
        if (attacker.equals("O1")){
            O1.orkHp = attackerHp;
        }
        if (attacker.equals("G1")){
            G1.goblinHp = attackerHp;
        }
        if (attacker.equals("T1")){
            T1.trollHp = attackerHp;
        }

        if (defender.equals("H1")){
            H1.humanHp = defenserHp;
        }
        if (defender.equals("E1")){
            E1.elfHp = defenserHp;
        }
        if (defender.equals("D1")){
            D1.dwarfHp = defenserHp;
        }
        if (defender.equals("O1")){
            O1.orkHp = defenserHp;
        }
        if (defender.equals("G1")){
            G1.goblinHp = defenserHp;
        }
        if (defender.equals("T1")){
            T1.trollHp = defenserHp;
        }
        if (defenserHp< attackerHp){
            board.set(index2,"  ");
            board.set(index,fighter_man);

        }
    }
    static void fighterHpprinter(List<String > fighter,PrintWriter output,Dwarf D0,Ork O0,Elf E0,Human H0,Troll T0,Goblin G0,Dwarf D1,Ork O1,Elf E1,Human H1,Troll T1,Goblin G1){
        Dwarf dwarf = new Dwarf();
        Elf elf = new Elf();
        Goblin goblin = new Goblin();
        Human human = new Human();
        Ork ork = new Ork();
        Troll troll = new Troll();

        for (int m =0;m<fighter.size();m++) {
            List<String> fighter_line = new ArrayList<>(Arrays.asList(fighter.get(m).split(" ")));
            if (fighter_line.get(1).equals("D0")&& D0.Hp()>0) {
                output.println("D0\t" + D0.Hp() + "\t(120)");
            } else if (fighter_line.get(1).equals("E0")&& E0.Hp()>0) {
                output.println("E0\t" + E0.Hp() + "\t(70)");
            } else if (fighter_line.get(1).equals("G0")&& G0.Hp()>0) {
                output.println("G0\t" + G0.Hp() + "\t(80)");
            } else if (fighter_line.get(1).equals("H0")&& H0.Hp()>0) {
                output.println("H0\t" + H0.Hp() + "\t(100)");
            } else if (fighter_line.get(1).equals("O0")&& O0.Hp()>0) {
                output.println("O0\t" + O0.Hp() + "\t(200)");
            } else if (fighter_line.get(1).equals("T0")&& T0.Hp()>0) {
                output.println("T0\t" + T0.Hp() + "\t(150)");
            }
            else if (fighter_line.get(1).equals("D1")&& D1.Hp()>0) {
                output.println("D1\t" + D1.Hp() + "\t(120)");
            } else if (fighter_line.get(1).equals("E1")&& E0.Hp()>0) {
                output.println("E1\t" + E1.Hp() + "\t(70)");
            } else if (fighter_line.get(1).equals("G1")&& G0.Hp()>0) {
                output.println("G1\t" + G1.Hp() + "\t(80)");
            } else if (fighter_line.get(1).equals("H1")&& H0.Hp()>0) {
                output.println("H1\t" + H1.Hp() + "\t(100)");
            } else if (fighter_line.get(1).equals("O1")&& O0.Hp()>0) {
                output.println("O1\t" + O1.Hp() + "\t(200)");
            } else if (fighter_line.get(1).equals("T1")&& T0.Hp()>0) {
                output.println("T1\t" + T1.Hp() + "\t(150)");
            }
        }
        output.println("");
    }
    static void attack_list_edit(List<String> human_attack,List<String > board,List<String > movement,int int_line,List<String> ally,List<String > enemy,List<String> ally_list) {
        int index =0;

        int meral = board.indexOf(movement.get(0));

        human_attack.clear();
        ally_list.clear();
        if (meral-int_line<0){
            human_attack.add(board.get(meral + int_line + 1));
            human_attack.add(board.get(meral + int_line + 3));
            human_attack.add(board.get(meral + int_line + 2));

            human_attack.add(board.get(meral + 1));

        }
        else if (meral+int_line >board.size()){
            human_attack.add(board.get(meral - 1));
            human_attack.add(board.get(meral + 1));
            human_attack.add(board.get(meral - int_line - 2));
            human_attack.add(board.get(meral - int_line - 3));
            human_attack.add(board.get(meral - int_line - 1));
        }
        else {

            human_attack.add(board.get(meral - 1));
            human_attack.add(board.get(meral + 1));
            human_attack.add(board.get(meral - int_line - 2));
            human_attack.add(board.get(meral - int_line - 3));
            human_attack.add(board.get(meral - int_line - 1));
            human_attack.add(board.get(meral + int_line + 1));
            human_attack.add(board.get(meral + int_line + 3));
            human_attack.add(board.get(meral + int_line + 2));
            for (int k = 0; k < human_attack.size(); k++) {
                if (ally.contains(human_attack.get(k))) {
                    ally_list.add(human_attack.get(k));
                    human_attack.remove(human_attack.get(k));

                    k--;
                } else if (enemy.contains(human_attack.get(k))) {
                }
            }
        }

    }
  public static void main(String[] args) {

        try {
            int count = 0;
            File initials_txt = new File(args[0]);
            File commands_txt = new File(args[1]);
            PrintWriter output_file = new PrintWriter("output.txt");
            Scanner initials_use = new Scanner(initials_txt);
            Scanner commands_use = new Scanner(commands_txt);
            List<String> list_initials = new ArrayList<>();
            List<String> list_commands = new ArrayList<>();
            List<String> board = new ArrayList<>();
            List<String> Calliance = new ArrayList<>();
            List<String> xxx = new ArrayList<>();
            List<String> Calliance_attack = new ArrayList<>();
            List<String> Zorde_attack = new ArrayList<>();
            List<String> fighter = new ArrayList<>();

            List<String> ally_list = new ArrayList<>();
            Dwarf D0 = new Dwarf();
            int D0hp =D0.Hp();Elf E0 = new Elf();int E0hp =E0.Hp();Human H0 = new Human();int H0hp =H0.Hp();Goblin G0 = new Goblin();int G0hp =G0.Hp();Ork O0 = new Ork();int O0hp =O0.Hp();Troll T0 = new Troll();int T0hp =T0.Hp();Dwarf D1 = new Dwarf();int D1hp =D1.Hp();Elf E1 = new Elf();int E1hp =E1.Hp();Goblin G1 = new Goblin();int G1hp =G1.Hp();Human H1 = new Human();int H1hp =H1.Hp();Ork O1 = new Ork();int O1hp =O1.Hp();Troll T1 = new Troll();int T1hp =T1.Hp();
            int int_line = 0;
            int melih =0;

            List<String> Zorde = new ArrayList<>();
            while(initials_use.hasNextLine()){
                String for_initials = initials_use.nextLine();
                list_initials.addAll(Arrays.asList(for_initials.split("\n")));
            }
            while(commands_use.hasNextLine()){
                String for_commands = commands_use.nextLine();
                list_commands.addAll(Arrays.asList(for_commands.split("\n")));
            }

            for (int i=0;i<list_initials.size();i++){
                if (list_initials.get(i).equals("BOARD")){
                    if (list_initials.get(i+1).length() ==5){
                        int_line =int_line + Integer.parseInt(list_initials.get(i+1).substring(0,2));}
                    else if (list_initials.get(i+1).length() ==3){
                        int_line =int_line + Integer.parseInt(list_initials.get(i+1).substring(0,1));
                    }
                    int a =0;
                    while (a<int_line) {
                        a++;
                        int t =0;
                        board.add("*");
                        while (t < int_line ) {
                            board.add("  ");
                            t++;
                        }
                        board.add("*");
                    }
                    board.add("");

                }
                if (list_initials.get(i).equals("CALLIANCE")){
                    i++;
                    while (!list_initials.get(i).equals("ZORDE")){
                        Calliance.add(list_initials.get(i));
                        i++;
                    }
                    Calliance.remove(Calliance.size()-1);
                    addBoard(Calliance,int_line,board);
                }

                if (list_initials.get(i).equals("ZORDE")){
                    i++;
                    while (i<list_initials.size()){
                        Zorde.add(list_initials.get(i));
                        i++;
                    }
                    addBoard(Zorde,int_line,board);
                }
                for (int x = 0;x<Calliance.size();x++){
                    fighter.add(Calliance.get(x));
                }
                for (int x = 0;x<Zorde.size();x++){
                    fighter.add(Zorde.get(x));
                }
            }
            Collections.sort(fighter);
            int Zorde_int = 0;
            int Calliance_int =0;
            while(Zorde_int<Zorde.size()){
                Zorde_int++;
                Zorde_attack.addAll(Arrays.asList(Zorde.get(Zorde_int-1).split(" ")));
            }
            while(Calliance_int<Calliance.size()){
                Calliance_int++;
                Calliance_attack.addAll(Arrays.asList(Calliance.get(Calliance_int-1).split(" ")));
            }
            printBoard(int_line,board,output_file);
            fighterHpprinter( fighter, output_file,D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);

            for (int m = 0;m<list_commands.size();m++) {
                List<String> one_linemove = new ArrayList<>();
                List<String> human_attack = new ArrayList<>();



                List<String> movement = new ArrayList<>(Arrays.asList(list_commands.get(m).split(" ")));

                if (movement.get(0).substring(0,1).equals("D")) {
                    cleaner();
                    cleaner2();
                    for (int me = 0; me < movement.size(); me++) {
                        List<String> movement_line = new ArrayList<>(Arrays.asList(movement.get(me).split(";")));
                        if (movement_line.size() == 4) {
                            for (int x = 0; x <= (movement_line.size() + 1) / 2; x = x + 2) {
                                one_linemove.add(movement_line.get(x));
                                one_linemove.add(movement_line.get(x + 1));
                                if (returner() ==0&&returner2() ==0) {
                                    cleaner();
                                    cleaner2();
                                    one_moveboard(one_linemove, board, int_line, output_file, movement.get(0), Calliance_attack, count,human_attack, board, movement,  Calliance_attack, Zorde_attack, ally_list,x, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);
                                   // attack_list_edit(human_attack, board, movement, int_line, Calliance_attack, Zorde_attack, ally_list);
                                    figtherHp( human_attack, D0.Ap(),  D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1,board);
                                }

                            }
                            if (returner2()==0){
                                cleaner2();
                                printBoard(int_line, board, output_file);
                                fighterHpprinter(fighter, output_file, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);}

                            }
                        else if (movement_line.size() < 4 && movement_line.size() != 1 || movement_line.size() > 4 && movement_line.size() != 1) {
                            output_file.println("Error : Move sequence contains wrong number of move steps. Input line ignored.");
                            output_file.println("");
                            break;
                        }
                    }

                }
                if (movement.get(0).substring(0,1).equals("E")) {
                    cleaner();
                    cleaner2();
                    for (int me = 0; me < movement.size(); me++) {
                        List<String> movement_line = new ArrayList<>(Arrays.asList(movement.get(me).split(";")));
                        if (movement_line.size() == 8) {
                            for (int x = 0; x <= (movement_line.size() + 4) / 2; x = x + 2) {
                                one_linemove.add(movement_line.get(x));
                                one_linemove.add(movement_line.get(x + 1));
                                if (returner() ==0&&returner2() ==0) {
                                    cleaner();
                                    cleaner2();
                                    one_moveboard(one_linemove, board, int_line, output_file, movement.get(0),Calliance_attack,count,human_attack,board,movement,Calliance_attack,Zorde_attack,ally_list,x ,D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);
                                }

                                figtherHp( human_attack, E0.Ap(),D0,O0,E0,H0,T0,G0, D1, O1, E1, H1, T1, G1, board);
                            }

                            if (returner2()==0){
                                cleaner2();
                                printBoard(int_line, board, output_file);
                                fighterHpprinter(fighter, output_file, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);}


                        } else if (movement_line.size() < 8 && movement_line.size() != 1 || movement_line.size() > 8 && movement_line.size() != 1) {
                            output_file.println("Error : Move sequence contains wrong number of move steps. Input line ignored.");
                            output_file.println("");
                            break;
                        }
                    }

                }
                if (movement.get(0).substring(0,1).equals("G")) {
                    cleaner();
                    cleaner2();
                    for (int me = 0; me < movement.size(); me++) {
                        List<String> movement_line = new ArrayList<>(Arrays.asList(movement.get(me).split(";")));
                        if (movement_line.size() == 8) {
                            for (int x = 0; x <= (movement_line.size() + 4) / 2; x = x + 2) {
                                one_linemove.add(movement_line.get(x));
                                one_linemove.add(movement_line.get(x + 1));
                                if (returner() ==0&&returner2() ==0) {
                                    cleaner();
                                    cleaner2();
                                    one_moveboard(one_linemove, board, int_line, output_file, movement.get(0),Zorde_attack,count,human_attack,board,movement,Zorde_attack,Calliance_attack,ally_list,x ,D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);
                                  //  attack_list_edit(human_attack,board,movement,int_line,Zorde_attack,Calliance_attack,ally_list);
                                }

                                figtherHp(  human_attack, G0.Ap(),D0,O0,E0,H0,T0,G0, D1, O1, E1, H1, T1, G1, board);
                            }

                            if (returner2()==0){
                                cleaner2();
                                printBoard(int_line, board, output_file);
                                fighterHpprinter(fighter, output_file, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);}


                        } else if (movement_line.size() < 8 && movement_line.size() != 1 || movement_line.size() > 8 && movement_line.size() != 1) {
                            output_file.println("Error : Move sequence contains wrong number of move steps. Input line ignored.");
                            output_file.println("");
                            break;
                        }
                    }

                }
                if (movement.get(0).substring(0,1).equals("H")) {
                    cleaner();
                    cleaner2();
                    for (int me = 0; me < movement.size(); me++) {
                        List<String> movement_line = new ArrayList<>(Arrays.asList(movement.get(me).split(";")));
                        if (movement_line.size() == 6) {
                            for (int x = 0; x <= (movement_line.size() + 2) / 2; x = x + 2) {
                                one_linemove.add(movement_line.get(x));
                                one_linemove.add(movement_line.get(x + 1));
                                if (returner() ==0&&returner2() ==0) {
                                    cleaner();
                                    cleaner2();
                                    one_moveboard(one_linemove, board, int_line, output_file, movement.get(0),Calliance_attack,count,human_attack,board,movement,Calliance_attack,Zorde_attack,ally_list,x, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);
                                }

                            }
                            figtherHp(  human_attack, H0.Ap(),D0,O0,E0,H0,T0,G0, D1, O1, E1, H1, T1, G1, board);
                            if (returner2()==0){
                                cleaner2();
                                printBoard(int_line, board, output_file);
                                fighterHpprinter(fighter, output_file, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);}
                        }

                        else if (movement_line.size() < 6 && movement_line.size() != 1 || movement_line.size() > 6 && movement_line.size() != 1) {
                            output_file.println("Error : Move sequence contains wrong number of move steps. Input line ignored.");
                            output_file.println("");
                            break;
                        }
                    }
                }
                if (movement.get(0).substring(0,1).equals("O")) {
                    cleaner();
                    cleaner2();
                    attack_list_edit(human_attack,board,movement,int_line,Zorde_attack,Calliance_attack,ally_list);

                    ally_list.add("O0");
                    for (int t =0;t<ally_list.size();t++){
                        if (ally_list.get(t).substring(0, 1).equals("O")) {
                            if (ally_list.get(t).substring(1).equals("0")&& O0.Hp()<200) {
                                O0.getfight = -O0.Healpoints();
                                O0.lastHp();
                            } else if (ally_list.get(t).substring(1).equals("1")&& O0.Hp()<200) {
                                O1.getfight = -O0.Healpoints();
                                O1.lastHp();
                            }
                        }
                        if (ally_list.get(t).substring(0, 1).equals("T")) {
                            if (ally_list.get(t).substring(1).equals("0")&& T0.Hp()<150) {
                                T0.getfight =-O0.Healpoints();
                                T0.lastHp();
                            } else if (ally_list.get(t).substring(1).equals("1")&& T1.Hp()<150) {
                                T1.getfight =-O0.Healpoints();
                                T1.lastHp();
                            }
                        }
                        if (ally_list.get(t).substring(0, 1).equals("G")) {
                            if (ally_list.get(t).substring(1).equals("0")&& G0.Hp()<80) {
                                G0.getfight = -O0.Healpoints();
                                G0.lastHp();
                            } else if (ally_list.get(t).substring(1).equals("1")&& G1.Hp()<80) {
                                G1.getfight = -O0.Healpoints();
                                G1.lastHp();
                            }
                        }
                    }
                    for (int me = 0; me < movement.size(); me++) {
                        List<String> movement_line = new ArrayList<>(Arrays.asList(movement.get(me).split(";")));

                        if (movement_line.size() == 2) {
                            for (int x = 0; x <= movement_line.size() / 2; x = x + 2) {
                                one_linemove.add(movement_line.get(x));
                                one_linemove.add(movement_line.get(x + 1));

                                if (returner() ==0&&returner2() ==0) {
                                    cleaner();
                                    cleaner2();
                                    one_moveboard(one_linemove, board, int_line, output_file, movement.get(0),Zorde_attack,count,human_attack,board,movement,Zorde_attack,Calliance_attack,ally_list,x, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);
                                   // attack_list_edit(human_attack,board,movement,int_line,Zorde_attack,Calliance_attack,ally_list);
                                }
                            }
                            figtherHp(  human_attack,O0.Ap(),D0,O0,E0,H0,T0,G0, D1, O1, E1, H1, T1, G1, board);
                            if (returner2()==0){
                                cleaner2();


                            printBoard(int_line, board, output_file);
                            fighterHpprinter( fighter, output_file,D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);}

                        }
                        else if (movement_line.size() < 2 && movement_line.size() != 1 || movement_line.size() > 2 && movement_line.size() != 1) {
                            output_file.println("Error : Move sequence contains wrong number of move steps. Input line ignored.");
                            output_file.println("");
                            break;
                        }
                    }

                }
                if (movement.get(0).substring(0,1).equals("T")) {
                    cleaner();
                    cleaner2();
                    for (int me = 0; me < movement.size(); me++) {
                        List<String> movement_line = new ArrayList<>(Arrays.asList(movement.get(me).split(";")));
                        if (movement_line.size() == 2) {
                            for (int x = 0; x <= movement_line.size() / 2; x = x + 2) {
                                one_linemove.add(movement_line.get(x));
                                one_linemove.add(movement_line.get(x + 1));

                                if (returner() ==0&&returner2() ==0) {
                                    cleaner();
                                    cleaner2();
                                    one_moveboard(one_linemove, board, int_line, output_file, movement.get(0),Zorde_attack,count,human_attack,board,movement,Zorde_attack,Calliance_attack,ally_list,x, D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);
                                   // attack_list_edit(human_attack,board,movement,int_line,Zorde_attack,Calliance_attack,ally_list);
                                }

                            }
                            figtherHp(human_attack,T0.Ap(),D0,O0,E0,H0,T0,G0, D1, O1, E1, H1, T1, G1,board);
                            if (returner2()==0){
                                cleaner2();
                            printBoard(int_line, board, output_file);
                            fighterHpprinter( fighter, output_file,D0, O0, E0, H0, T0, G0, D1, O1, E1, H1, T1, G1);}

                        }
                        else if (movement_line.size() < 2 && movement_line.size() != 1 || movement_line.size() > 2 && movement_line.size() != 1) {
                            output_file.println("Error : Move sequence contains wrong number of move steps. Input line ignored.");
                            output_file.println("");
                            break;
                        }
                    }
                }

            }
            for (int k =0;k<board.size();k++){
                if (!board.get(k).equals("  ")&& !board.get(k).equals("*")){
                    if (Calliance_attack.contains(board.get(k))){
                        output_file.println("");
                        output_file.println("Game Finished");
                        output_file.println("Calliance Wins");
                    }
                    else if (Zorde_attack.contains(board.get(k))){
                        output_file.println("Game Finished");
                        output_file.println("Zorde Wins");
                    }
                }
            }

            output_file.close();

        }
        catch(IOException finish) {
            finish.printStackTrace();
        }
    }
}


