public class Person {

    private int age;

    public Person(){
        this.age = (int)Math.floor(Math.random()*(80-5+1)+5);
        System.out.println("Object created: " + this.age);
    }

    /*
    *  <=12 is a Child
        13-19 is a Teen
        20-59 is an Adult
        +60 is a Senior Adult
    * */

    public void getLifeStage(){
        if(this.age <= 12){
            System.out.println("The person is in the child stage of life");
        }else if(this.age >= 13 && this.age <= 19){
            System.out.println("The person is in the teen stage of life");
        }else if(this.age >= 20 && this.age <= 59){
            System.out.println("The person is in the adult stage of life");
        }else{
            System.out.println("The person is in the Senior Adult stage of life");
        }
    }
}
