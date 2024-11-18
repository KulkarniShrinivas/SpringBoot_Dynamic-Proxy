package SpringBoot.Proxys;

//we need to create proxy on above the Person interface so we need to implement the Person interface
//because we need to create proxy on the Person interface because dyanmic proxy can only be created on the interface

public class Man implements Person {

    private String name;

    private int age;

    private String city;

    private String country;

    public Man(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }


    public void introduce(String name) {
        System.out.println("Hello, my name is " + name);
    }


    public void sayAge(int age) {
        System.out.println("I am " + age + " years old");
    }

    public void sayNationality(String city , String country) {
        System.out.println("I am from " + city + ", " + country);
    }
}
