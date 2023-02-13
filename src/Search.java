import java.util.ArrayList;

public class Search {

    public static int linearSearchFirst(int[] intList, int target) {
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLast(int[] intList, int target) {
        for (int i = intList.length - 1; i >= 0; i--) {
            if (intList[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchFound(int[] intList, int target) {
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(int[] intList, int target) {
        int counter = 0;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] == target) {
                counter++;
            }
        }
        return counter;
    }

    public static int linearSearchFirst(ArrayList<Integer> intList, int target) {
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchLast(ArrayList<Integer> intList, int target) {
        for (int i = intList.size() - 1; i >= 0; i--) {
            if (intList.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearchFound(ArrayList<Integer> intList, int target) {
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(ArrayList<Integer> intList, int target) {
        int counter = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == target) {
                counter++;
            }
        }
        return counter;
    }



}