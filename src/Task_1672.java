/**
 * Created by Assylbek on 14.08.2022.
 */
public class Task_1672 {
    public static void main(String[] args) {
        int[][] bankCustomer = {{1,4,5},{10,6,2}};

        System.out.println(maximumWealth(bankCustomer));
    }

    public static int maximumWealth(int[][] accounts) {

        int maxWealthSoFar = 0;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }

        return maxWealthSoFar;
    }

}
