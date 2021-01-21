import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeCounter {
    /**
     * Counts the max amount of trees visible from the point (0, 0) with the angle of
     * visibility alpha
     * @param trees list of the 2D points(has x and y coordinates)
     * @param alpha the angle of visibility
     */
    public int threeCounter(List<Point2D> trees, double alpha) {
        List<Double> angels = getSortedAngels(trees, alpha);
        return countNumbers(angels, alpha);
    }

    private List<Double> getSortedAngels(List<Point2D> trees, double alpha) {
//        return trees.stream()
//                .flatMap(point2D -> {
//                    double angle = point2D.getAngleRads();
//                    return angle < alpha ? Stream.of(angle, angle + 2 * Math.PI) : Stream.of(angle);
//                })
//                .sorted()
//                .collect(Collectors.toList());
        List<Double> result = new ArrayList<>();
        for (Point2D point2D : trees) {
            double angle = point2D.getAngleRads();
            result.add(angle);

            if (angle < alpha)
                result.add(angle + 2 * Math.PI);
        }
        Collections.sort(result);
        return result;
    }

    /**
     * @return the max amount of numbers covered by an interval
     */

    int countNumbers(List<Double> numbers, double interval) {
        if (numbers.isEmpty() || interval == 0)
            return 0;

        Deque<Double> intervalQueue = new ArrayDeque<>();
        int max = 0;
        for (double number : numbers) {
            intervalQueue.addLast(number);

            while (number - intervalQueue.getFirst() > interval) {
                intervalQueue.removeFirst();
            }

            if (max < intervalQueue.size())
                max = intervalQueue.size();
        }

        return max;
    }
}

