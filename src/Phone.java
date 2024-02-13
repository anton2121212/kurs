public class Phone {

    //приватное поле number
    private int number;


    //приватное поле modelName
    private String modelName;


    //приватное поле weight
    private  double weight;



    //геттеры и сеттеры для поля Number
    public int getNumber(){
        return number;
    }
    public void setNumber(int a){
        number=a;
    }

    //геттеры и сеттеры для поля ModelName
    public String getModelName(){
        return modelName;
    }
    public void setModelName(String s){
        modelName=s;
    }

    //геттеры и сеттеры для поля Weight
    public double getWeight(){
        return weight;
    }
    public void setWeight(double d){
        weight=d;
    }

    public Phone(){}
    public Phone(int number,String modelName,double weight){
        this.number=number;
        this.modelName=modelName;
        this.weight=weight;
    }



    //Метод выводит имя звонящего
    public void ReceiveCall(String name){
        System.out.println("Звонит"+name);
    }


    public void toString(int number, String modelName, double weight) {
        System.out.println("Номер:" + number);
        System.out.println("Модель:" + modelName);
        System.out.println("Масса:" + weight);
    }
    public void ring(){System.out.print("\n звoнит телефон");}

    public void aboutPhone(){

    }

}
