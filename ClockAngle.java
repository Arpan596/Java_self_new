import java.util.*;

public class ClockAngle {
    
    static class HandMovement {
        int degrees;
        int direction; // 1 for clockwise, -1 for counterclockwise

        public HandMovement(int degrees, int direction) {
            this.degrees = degrees;
            this.direction = direction;
        }
    }

    static int calculateCost(int degrees, int direction, int costA, int costB, int costX, int costY) {
        int costPerDegree = (degrees <= 90) ? (direction == 1 ? costA : costB) : (direction == 1 ? costX : costY);
        return degrees * costPerDegree;
    }

    static int findOptimalCost(int currentHour, int currentMinute, int targetAngle, int costA, int costB, int costP, int costQ, int costX, int costY) {
        int minCost = Integer.MAX_VALUE;

        // Convert current time into angles
        int hourAngle = (currentHour % 12) * 30;
        int minuteAngle = currentMinute * 6;

        // Try moving hands to achieve targetAngle
        for (int hourMoveDirection : new int[]{1, -1}) {
            for (int minuteMoveDirection : new int[]{1, -1}) {
                for (int targetHourAngle = 0; targetHourAngle < 360; targetHourAngle += 30) {
                    for (int targetMinuteAngle = 0; targetMinuteAngle < 360; targetMinuteAngle += 6) {
                        int formedAngle = Math.abs(targetHourAngle - targetMinuteAngle);
                        formedAngle = Math.min(formedAngle, 360 - formedAngle); // Min of internal and external angle

                        if (formedAngle == targetAngle) {
                            int hourMove = Math.abs(hourAngle - targetHourAngle);
                            int minuteMove = Math.abs(minuteAngle - targetMinuteAngle);

                            // Calculate costs
                            int hourCost = calculateCost(hourMove, hourMoveDirection, costA, costB, costP, costQ);
                            int minuteCost = calculateCost(minuteMove, minuteMoveDirection, costA, costB, costX, costY);
                            int totalCost = hourCost + minuteCost;

                            minCost = Math.min(minCost, totalCost);
                        }
                    }
                }
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial time
        String[] time = sc.nextLine().split(":");
        int currentHour = Integer.parseInt(time[0]);
        int currentMinute = Integer.parseInt(time[1]);

        // Read number of queries
        int queries = sc.nextInt();

        // Read costs
        int costA = sc.nextInt();
        int costB = sc.nextInt();
        int costP = sc.nextInt();
        int costQ = sc.nextInt();
        int costX = sc.nextInt();
        int costY = sc.nextInt();

        // Process each query
        int totalCost = 0;
        for (int i = 0; i < queries; i++) {
            int targetAngle = sc.nextInt();
            int queryCost = findOptimalCost(currentHour, currentMinute, targetAngle, costA, costB, costP, costQ, costX, costY);
            totalCost += queryCost;
        }

        // Output the total cost
        System.out.println(totalCost);
    }
}
