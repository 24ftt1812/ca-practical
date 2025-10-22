public class p9_1 {
    public static void main(String[] args) {
        int[][] ratings = {
            {4, 5, 4},   
            {4, 3, 5},   
            {3, 4, 5},   
            {3, 1, 2}    
        };

        System.out.println("Rating");
        System.out.println("\tProduct\tPackaging\tDelivery");

        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Customer " + (i + 1) + "\t");
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.print(ratings[i][j] + "\t\t");
            }
            System.out.println();
        }

        double[] averageCriteria = new double[3];
        for (int col = 0; col < ratings[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < ratings.length; row++) {
                sum += ratings[row][col];
            }
            averageCriteria[col] = (double) sum / ratings.length;
        }

        System.out.printf("%nAverage\t");
        for (int i = 0; i < averageCriteria.length; i++) {
            System.out.printf("%.2f\t\t", averageCriteria[i]);
        }
        System.out.println();

        for (int i = 0; i < ratings.length; i++) {
            int sum = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                sum += ratings[i][j];
            }
            double average = (double) sum / ratings[i].length;
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), average);
        }
    }
}
