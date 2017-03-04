/**
 * Created by valmach on 04/03/2017.
 */
public enum Animal {
    CAT("Leeloo"), DOG("Simon"), MOuSE("Jerry");

    private String name;

            Animal(String name){
                this.name =  name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This animal is called: " + name;

    }
}

