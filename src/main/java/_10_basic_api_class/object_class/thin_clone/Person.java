package _10_basic_api_class.object_class.thin_clone;

public class Person implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;


    public Person(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }


    public Person getPerson() {
        Person cloned = null;

        try {
            cloned = (Person) clone();
        } catch (CloneNotSupportedException e) {}

        return cloned;
    }

}
