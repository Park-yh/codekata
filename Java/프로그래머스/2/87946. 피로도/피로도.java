class Solution {
    private int maxDungeons = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, 0, visited, dungeons);
        
        return maxDungeons;
    }

    private void dfs(int currentFatigue, int count, boolean[] visited, int[][] dungeons) {
        maxDungeons = Math.max(maxDungeons, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && currentFatigue >= dungeons[i][0]) {
                visited[i] = true;
                
                dfs(currentFatigue - dungeons[i][1], count + 1, visited, dungeons);
                
                visited[i] = false;
            }
        }
    }
}