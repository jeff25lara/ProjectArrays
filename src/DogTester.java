public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="Husky";
        dog1.name="Wester";
        dog1.color="Brown";
        dog1.age=5;
        dog1.weight="40 Lbs";
        dog1.gender="Male";

        dog1.eat();
        dog1.behavior();
        dog1.logic();

        System.out.println();

        Dog dog2=new Dog();
        dog2.breed="Bulldog";
        dog2.name="Paco";
        dog2.color="White";
        dog2.age=3;
        dog2.weight="35 Lbs";
        dog2.gender="Male";

        dog2.eat();
        dog2.play();

        System.out.println();

        Dog dog3=new Dog();
        dog3.breed="Labrador";
        dog3.name="Elli";
        dog3.color="Brown";
        dog3.age=4;
        dog3.weight="45 Lbs";
        dog3.gender="Female";

        dog3.eat();
        dog3.behavior();

    }


        }