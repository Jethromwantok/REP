package New_21st_may;

public class Physics {
    float calculateVelocity(float distance, int time){
        return distance/time;
    }
    float calculateVelocity(float initialVelocity, float acceleration, int time){
        return initialVelocity + (acceleration * time);
    }

    public static void main(String[] args) {
        Physics calculate = new Physics();
        System.out.println(calculate.calculateVelocity(200, 25));
        System.out.println(calculate.calculateVelocity(150, 15, 25));
    }
}
