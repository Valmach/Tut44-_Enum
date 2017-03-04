/**
 * Created by valmach on 04/03/2017.
 */
public class App {


    /* These are constants */

    public static void main(String[] args) {

        Animal animal = Animal.DOG;

        switch (animal){

            case CAT:
                System.out.println("Cat ");
                break;
            case DOG:
                System.out.println("Dog ");
                break;
            case MOuSE:
                break;
                default:
                    break;
        }
        System.out.println(Animal.DOG);
        System.out.println("Enum anme as a string  " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.MOuSE.getName());;

        Animal animal2 = Animal.valueOf("Cat");
        System.out.println(animal2);
    }
}
