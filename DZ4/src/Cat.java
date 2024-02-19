public class Cat {

    public String name;
    public String color;
    public int age;
    public static int catCount = 0;
    public  Cat(String name){
        this.name = name;
        this.color = "серый";
        this.age = 0;
        catCount++;
    }
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 0;
        catCount++;
    }
    public Cat (String name,String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        catCount++;
    }
    public static int getAllCatsCount(){return catCount;}

    public static int getCatCount(){return catCount; }
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public String getColor() {
        return color;
    }
    public void setColor(String color){ this.color = color; }

    public int getAge() { return age; }
    public void setAge (int age) { this.age = age; }

}
