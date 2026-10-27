class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (delayedTime + arrivalTime)%24;
        
    }
}