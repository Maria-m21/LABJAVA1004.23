public class fourth {
        public static void main(String[] args) {
            int number = 10;
            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial);
        }


}
