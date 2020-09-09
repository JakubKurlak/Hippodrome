package CodeGymTasks.Level_21.G_2113_HippodromeGame;

public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move (){
        setDistance(getDistance() + getSpeed() * Math.random());
    }
    public void print (){
        int integerPartOfTheDistance = (int) getDistance();
        for (int i = 0; i < integerPartOfTheDistance; i++) {
            System.out.print(".");
        }
        System.out.println(getName());
    }
}

