package day14.hackerrankproblems;
import java.io.*;
import java.util.*;

class Sports {
    String getName() {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + this.getName());
    }
}

public class SportsAndSoccerProblem {

    public static void main(String[] args) {
        Sports s = new Sports();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
        Soccer s2 = new Soccer();
        System.out.println(s2.getName());
        s2.getNumberOfTeamMembers();
    }
}