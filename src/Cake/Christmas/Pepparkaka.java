package Cake.Christmas;

public class Pepparkaka {

    private boolean gräddad;
    private String form;

    public Pepparkaka(){}

    public Pepparkaka(String form, boolean gr){
        this.form=form;
        this.gräddad=gr;
    }

    public void setForm(String form){
        this.form=form;
    }

    public void setGräddad(boolean gräddad){
        this.gräddad=gräddad;
    }

    public String allAboutMe(){
        return "jag är en pepparkaka "+gräddad + " "+form;
    }

}
