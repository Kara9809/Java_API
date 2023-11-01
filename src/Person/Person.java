package Person;

public class Person {
    private String name;
    private int age;
    private String favColor;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setFavColor(String favColor){
        this.favColor=favColor;
    }
    public String getFavColor(){
        return favColor;
    }

    public Person(){

    }

    public Person(String name, int age, String favColor) {
        setName(name);
        setAge(age);
        setFavColor(favColor);
    }
}
