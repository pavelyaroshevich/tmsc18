import java.util.Random;

public class PetrovScoreboard {
    public static void main(String[] args) {
        int[] nums = new int[28801];
        int num = 28801;
        for (int index = 0; index < nums.length; index++) {
            nums[index] = num;
            num--;
        }
        int random = new Random().nextInt(nums.length);
        System.out.println("До конца рабочего дня осталось " + random + " секунд!");
        if (random > 25200) {
            System.out.println("До конца рабочего дня осталось 8 часов!");
        } else if (random > 21600) {
            System.out.println("До конца рабочего дня осталось 7 часов!");
        } else if (random > 18000) {
            System.out.println("До конца рабочего дня осталось 6 часов!");
        } else if (random > 14400) {
            System.out.println("До конца рабочего дня осталось 5 часов!");
        } else if (random > 10800) {
            System.out.println("До конца рабочего дня осталось 4 часа!");
        } else if (random > 7200) {
            System.out.println("До конца рабочего дня осталось 3 часа!");
        } else if (random > 3600) {
            System.out.println("До конца рабочего дня осталось 2 часа!");
        } else {
            System.out.println("До конца рабочего дня осталось менее часа!");
        }

    }
}

