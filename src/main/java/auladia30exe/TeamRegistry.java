package auladia30exe;

import java.util.ArrayList;

public class TeamRegistry {

    private static TeamRegistry instance;
    private TeamRegistry(){}

    public static TeamRegistry getInstance() {
        if(instance == null) {
            instance = new TeamRegistry();
        }
        return instance;
    }

    private ArrayList<Time> time = new ArrayList<>();

    public void addTime(Time t){
        System.out.printf("Add time " + t);
        time.add(t);
    }

    public void listarTimes(){
        System.out.println("listar: ");
        for (Time t: time){
            System.out.println(t);
        }
    }
}
