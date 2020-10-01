package HW18;

public class HW18 {
    public static void main(String[] args) {

        calculateTilingCosts(2, 3, 3);
    }

    private static void calculateTilingCosts(int length, int width, double singleTileCost) {
        //1.find cost of work hours (27e per hour)
        //2.find cost of materials, cost per tile is my
        //3.find amount of tile vertically depends on floor/wall (full and cut) meters to cm
        //4.find amount of tile horizontally depends on floor/wall (full and cut) meters to cm
        //5.Final cost
        long fullTiles = findAmountOfTiles(length * 100, width * 100); // change from m to cm
        double costFullAmountOfHours = findServiceCostForFullAmountOfHours(length, width);
        double costForMaterials = findCostOfMaterials(singleTileCost, fullTiles);
        double finalCost = costFullAmountOfHours + costForMaterials;

        System.out.println("Amount of tiles: " + fullTiles);
        System.out.println("Service cost: " + costFullAmountOfHours);
        System.out.println("Material cost: " + costForMaterials);
        System.out.println("Total: " + finalCost);
    }

    private static double findServiceCostForFullAmountOfHours(long length, long width) {
        long costPerHour = 27;
        return costPerHour * Math.ceil(length * width);
    }

    private static double findCostOfMaterials(double pricePerTile, long fullTiles) {
        return pricePerTile * fullTiles;
    }

    private static long findAmountOfTiles(long length, long width) {
        long tileLength = 30;
        long tileWidth = 20;
        long lengthResult = length / tileLength;
        long widthResult = width / tileWidth;
        long fullTiles = lengthResult * widthResult;
        System.out.println("Amount of full tiles: " + fullTiles);

        long lengthResultCut = length % tileLength;
        long widthResultCut = width % tileWidth;
        long cutTiles = lengthResultCut + widthResultCut;

        System.out.println("Amount of cut tiles: " + cutTiles);

        return fullTiles + cutTiles;
    }
}
