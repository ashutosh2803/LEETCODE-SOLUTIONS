class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character, int[]> pathChange = getPathChangeMap();
        Set<Coordinate> visitedCoordinate = new HashSet<>();
        int currentX = 0;
        int currentY = 0;
        visitedCoordinate.add(new Coordinate(0, 0));
        for(int i=0;i<path.length();i++)
        {
            int[] change = pathChange.get(path.charAt(i));
            int newX = currentX + change[0];
            int newY = currentY + change[1];
            Coordinate newCoordinate = new Coordinate(newX, newY);
            
            if(visitedCoordinate.contains(newCoordinate)) return true;
            visitedCoordinate.add(newCoordinate);
            currentX = newX;
            currentY = newY;
        }

        return false;
    }

    private Map<Character, int[]> getPathChangeMap()
    {
        Map<Character, int[]> pathChange = new HashMap<>();
        pathChange.put('N', new int[]{0, 1});
        pathChange.put('S', new int[]{0, -1});
        pathChange.put('E', new int[]{1, 0});
        pathChange.put('W', new int[]{-1, 0});

        return pathChange;
    }
}