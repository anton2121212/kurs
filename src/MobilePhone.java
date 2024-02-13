public class MobilePhone extends Phone {
    double screenSize;
    boolean isFoldable;
    public double getScreenSize (){return this.screenSize=screenSize;}
    public double setScreenSize(double screenSize){this.screenSize=screenSize;return screenSize;}
    public boolean getIsFoldable(){return  this.isFoldable=isFoldable;}
    public boolean setisFoldable(boolean isFoldable){this.isFoldable=isFoldable;return isFoldable;}
    public MobilePhone(){}
    public MobilePhone(double screenSize,boolean isFoldable){
        this.screenSize=screenSize;
        this.isFoldable=isFoldable;
    }
    public void ring(){
        System.out.println("Телефон вибрирует");
    }
    public void sendMessage(String message,int number){

    }




}
