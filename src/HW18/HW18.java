package HW18;

public class HW18 {
    public static void main(String[] args) {

        calculateTilingCosts(2, 3, 3);
    }

    private static void calculateTilingCosts(int width, int length, double singleTileCost) {

        //Нам известно, что в час он кладёт примерно один квадратный метр плитки.
        //Его час стоит 27€ без НДС.
        //Стандартная плитка 30 на 20 сантиметров.
        // method should принимать размеры стены/пола, стоимость плитки и выдавать:
        //
        // Количество требуемых плиток, как целых, так и тех которые надо будет резать.
        // Учтите, что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает,
        // как именно её надо класть.
        // Стоимость материала
       // Стоимость рабочего времени
       //  Итоговую ориентировочную стоимость

        //1.find amount of tile vertically depends on floor/wall (full and cut) meters to cm
        //2.find amount of tile horizontally depends on floor/wall (full and cut) meters to cm
        //3.find cost of materials (horizontally and vertically) , cost per tile my
        //4.find cost of hors work(27e per hur)
        //5.Final cost (with vat or without?)
        long fullTiles = findAmountOfFullTiles(length,width);
        double costFullAmountOfHours = findServiceCostForFullAmountOfHours(length,width);
        double costForMaterials = findCostOfMaterials(singleTileCost,fullTiles);
        double finalCost = costFullAmountOfHours + costForMaterials;

        System.out.println("Amount of tiles: " + fullTiles);
        System.out.println("Service cost: " + costFullAmountOfHours);
        System.out.println("Material cost: " + costForMaterials);
        System.out.println("Total: " + finalCost);
    }

    private static double findServiceCostForFullAmountOfHours(long lengthOfWallOrFloor,long widthOfWallOrFloor) {
        long costPerHour = 27;
        return costPerHour * Math.ceil(lengthOfWallOrFloor * widthOfWallOrFloor);

    }

    private static double findCostOfMaterials(double pricePerTile, long fullTiles ) {
     return  pricePerTile * fullTiles;
    }

    private static long findAmountOfFullTiles(long lengthOfWallOrFloor,long widthOfWallOrFloor) { //in cm
        long OneHorizontalTile = 30 * 20;
        return lengthOfWallOrFloor * widthOfWallOrFloor * 10000 / OneHorizontalTile;
    }
}
