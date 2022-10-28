public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age
    public int getAge(){
        return age;
    }



    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak() {
        int rand = (int) (Math.random() * 5) +1;
        if (rand ==1){
            return "meow";
        } else if (rand ==2 ){
            return "zzzz";
        } else if (rand ==3 ) {
            return "mouse";
        }else if(rand == 4 ) {
            return "...";
        } else {
            return "argh";
        }
    }

    public void introduce() {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}
