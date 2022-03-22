public class Car {

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color){

        this.model = model;
        this.speed = speed;
        this.type ="sedan";
        this.color = color;
        this.speedLimit = 180;
    }
    void increaseSpeed(int increment){
        if((this.speed + increment) < speedLimit){
            speed += increment;
        }
    }
    int decreaseSpeed (int decrease){
        if(this.speed > 0){
            this.speed -= decrease;
        }
        return speed;
    }
    void print() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Speed: " + this.speed);
    }
}
