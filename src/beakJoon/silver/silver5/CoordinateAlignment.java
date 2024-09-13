//24.09.04 - 11650번
package beakJoon.silver.silver5;

import java.util.*;

import static java.util.Comparator.comparing;

public class CoordinateAlignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<XAndY> list = new ArrayList<>();

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();
            list.add(new XAndY(x, y));
        }

        list.sort(comparing(XAndY::getX)
                .thenComparing(XAndY::getY));

        for (XAndY xAndY : list) {
            System.out.println(xAndY.getX() + " " + xAndY.getY());
        }

    }

    public static class XAndY{
        private Integer x;
        private Integer y;

        public XAndY(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public Integer getY() {
            return y;
        }
    }

}
