/**
* Benjamin Gensler
* 11/04/2025
* 1396. Design Underground System
*/
class UndergroundSystem {
    class CheckIn {
        String stationName;
        int t;
    

        CheckIn(String stationName, int t) {
            this.stationName = stationName;
            this.t = t;
        }

    }

    private Map<Integer, CheckIn> checkIns;
    private Map<String, int[]> travelTimes;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelTimes = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        CheckIn checkInInfo = checkIns.get(id);
        
        String route = checkInInfo.stationName + "-" + stationName;
        int tripTime = t - checkInInfo.t;

        if (travelTimes.containsKey(route)) {
            int[] data = travelTimes.get(route);
            data[0] += tripTime; // Add to total time
            data[1] += 1;        // Increment trip count
        } else {
            travelTimes.put(route, new int[]{tripTime, 1});
        }

        checkIns.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        return (double) travelTimes.get(startStation + "-" + endStation)[0] / travelTimes.get(startStation + "-" + endStation)[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
