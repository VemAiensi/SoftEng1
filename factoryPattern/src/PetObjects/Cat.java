package PetObjects;

public class Cat implements Pet {
    private Integer noOfLives;

    public Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    }
}