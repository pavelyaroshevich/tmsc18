package by.tms.tasks.task3;

public class Task3 {
    public static void chooseNum(int num) {
        if (num == 1) {
            String name = "Степан";
            InterfaceAware<String> interfaceAware = name1 -> {
                StringBuilder stringBuilder = new StringBuilder(name1);
                System.out.println(stringBuilder.reverse());
            };
            interfaceAware.chooseOption(name);

        } else if (num == 2) {
            InterfaceAware<Integer> integerInterfaceAware = integer -> {
                int result = 4;
                for (int i = 1; i <= integer; i++) {
                    result = result * i;
                }
                System.out.println(result);
            };
            integerInterfaceAware.chooseOption(3);
        }
    }

    public static void main(String[] args) {
        chooseNum(1);
        chooseNum(2);
    }
}