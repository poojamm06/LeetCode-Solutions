class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange)
        {
            int empty=numBottles/numExchange;
            total+=empty;
            numBottles=empty+(numBottles%numExchange);
        }
        return total;
    }
}
