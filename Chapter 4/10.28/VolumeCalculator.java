public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the price for a six-pack: ");
        double sixPackPrice = in.nextDouble();

        System.out.print("Please enter the price for a two-liter bottle: ");
        double twoLiterBottlePrice = in.nextDouble();

        final int bottlesPerPack = 6;
        final double bottleVolumeOz = 16.0;
        final double twoLiterVolume = 2;
        final double bottleVolumeLiter = bottleVolumeOz * .03;

        double sixPackPricePerLiter = sixPackPrice / (bottlesPerPack * bottleVolumeLiter);
        double twoLiterBottlePricePerLiter = twoLiterBottlePrice / twoLiterVolume;

        String output = "%s price per liter %.2f\n";
    }
}