import java.util.Scanner;

public class HouseConstruction {
    Scanner sc = new Scanner(System.in);

    double cost_estimate() {
        System.out.format("Enter the material type:\n");
        System.out.format("Standard Material: 1\n");
        System.out.format("Above Standard Material: 2\n");
        System.out.format("High Standard Material: 3\n");
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;
        double material_cost = 0.0;
        int material = sc.nextInt();
        System.out.format("Enter the area:\n");
        double area = sc.nextDouble();
        System.out.format("enter the fully attributed or not\n");
        System.out.format("1.Yes\n");
        System.out.format("2.No\n");
        int fully = sc.nextInt();

        if (fully == 2) {
            if (material == 1) {
                material_cost = 1200 * area;

            } else if (material == 2) {
                material_cost = 1500 * area;
            }
            else
                {
                material_cost = 1800 * area;
               }
        }
        else if (material == 3) {
            material_cost = 2500 * area;
        }

    return material_cost;
}
}
