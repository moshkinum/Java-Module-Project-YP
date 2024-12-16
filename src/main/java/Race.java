import java.util.ArrayList;

public class Race {
    String leader = "";
    int distance = 0;

    String getLeader(ArrayList<Car> cars) {
        for (Car car : cars) {
            int carDistance = 24 * car.speed;

            if (carDistance > this.distance) {
                this.leader = car.name;
                this.distance = carDistance;
            }
        }

        return this.leader;
    }
}
