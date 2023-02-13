import java.util.ArrayList;

public class RepairSchedule {
    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object as described in part (a).
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        this.numberOfMechanics = n;
        this.schedule = new ArrayList<CarRepair>();
    }

    public ArrayList<CarRepair> getSchedule() {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay as described in part (b).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getMechanicNum() == m || schedule.get(i).getBayNum() == b) {
                return false;
            }
        }
        CarRepair newRepair = new CarRepair(m, b);
        schedule.add(newRepair);
        return true;
    }

    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics,
     * as described in part (c).
     */
    public ArrayList<Integer> availableMechanics() {
        boolean temps;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            temps = false;
            for (int z = 0; z < schedule.size(); z++) {
                if (schedule.get(z).getMechanicNum() == i) {
                    temps = true;
                }
            }
            if (!temps) {
                temp.add(i);
            }
        }
        return temp;
    }

    /** Removes an element from schedule when a repair is complete.
     THIS METHOD HAS BEEN ADDED FOR ILLUSTRATIVE PURPOSES ONLY,
     AS DESCRIBED IN PART B; you do NOT need to call this
     method as part of your solution to part B
     */
    public void carOut(int b) {
        for (int i = 0; i < schedule.size(); i++) {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
}