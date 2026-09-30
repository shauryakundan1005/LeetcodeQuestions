class Pair {
    int row;
    int soldier;

    Pair(int r, int sold){
        this.row = r;
        this.soldier = sold;
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int n = mat.length;
        int m = mat[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(i, 0);

            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    map.put(i, map.get(i) + 1);
                }
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a.soldier != b.soldier){
                    return Integer.compare(b.soldier, a.soldier);
                }
                return Integer.compare(b.row, a.row);
            }
        );

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            int row = entry.getKey();
            int soldier = entry.getValue();

            pq.add(new Pair(row, soldier));

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for(int i = k-1; i >= 0; i--){
            ans[i] = pq.poll().row;
        }

        return ans;
    }
}