package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Point> pointList) {
        double sum = 0;
        for (int i = 1; i < pointList.size(); i++) {
            sum += Math.max((pointList.get(i).getAltitude() - pointList.get(i - 1).getAltitude()), 0);
//            double elevation = pointList.get(i).getAltitude() - pointList.get(i - 1).getAltitude();
//            if (elevation > 0) {
//                sum += elevation;
//            }
        }
        return sum;
    }
}
