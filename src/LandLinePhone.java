public class LandLinePhone {
    boolean isCallable;
    public boolean getIsCallable(){return this.isCallable;}
    public void setIsCallable(boolean isCallable){this.isCallable=isCallable;}
    public LandLinePhone(){}
    public LandLinePhone(boolean isCallable){this.isCallable=isCallable;}
    public void ring (){System.out.print("\n Стационарный телефон пищит ");}
    public String ToString(){return ""+isCallable;}
}
