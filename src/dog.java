public class dog {
    protected String name;
    protected int age;
    public dog( String name, int age){
        this.age=age;
        this.name=name;
    }

    public void speak() {
        System.out.println("i am " + this.name +" and i am " + this.age + " years old");
    }
    public int getAge() {
        return this.age;
    }


}
