/**
* Benjamin Gensler
* 11/282/2025
* Q3. Exclusive Time of Functions
*/
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> idStack = new Stack<Integer>();
        int[] ids = new int[n];
        int curID = 0;
        int curTime = 0;
        for(String log: logs){
            String[] set = log.split(":");
            int idSet = Integer.parseInt(set[0]);
            int idTime = Integer.parseInt(set[2]);

            if(set[1].equals("start")){
                if(!idStack.isEmpty()) {
                    // Add time to currently running function
                    ids[idStack.peek()] += idTime - curTime;
                }
                idStack.push(idSet);
                curTime = idTime;
            }
            else{
                int x = idStack.pop();
                ids[x] += idTime - curTime + 1; // + 1 to include full timestamp selection
                curTime = idTime + 1;
            }

        }
        
        return ids;
    }
}
