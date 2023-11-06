class SeatManager {
    private int i;
    private int unreserved;
    private int maxSeatReserved;
    private boolean[] seats;
    public SeatManager(int n) {
        i = 1;
        unreserved = 0;
        maxSeatReserved = 0;
        seats = new boolean[n + 1];
    }
    
    public int reserve() {
        if (unreserved == 0) {
            seats[++maxSeatReserved] = true;
            return maxSeatReserved;
        }
        while (seats[i])
            i++;
        seats[i] = true;
        unreserved--;
        return i++; 
    }
    
    public void unreserve(int seatNumber) {
        seats[seatNumber] = false;
        unreserved++;
        i = Math.min(i, seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */