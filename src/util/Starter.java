package util;

//import Cake.Christmas.Pepparkaka;

import Cake.Christmas.Pepparkaka;

public class Starter {

    public static String myMethod(){
        return "hej";
    }

    public static void main (String[] args){
        Pepparkaka p = new Pepparkaka();
        p.setForm("hjärna");
        p.setGräddad(true);
        Pepparkaka p2 = new Pepparkaka("gran", true);
        System.out.println(p.allAboutMe());
        System.out.println(p2.allAboutMe());
    }

}

