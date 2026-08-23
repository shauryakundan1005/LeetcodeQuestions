class Node {
    String value;
    int timeStamp;

    Node(String value, int timeStamp){
        this.value = value;
        this.timeStamp = timeStamp;
    }
}
class TimeMap {

    HashMap<String, List<Node>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Node> list = new ArrayList<>();
        if(map.containsKey(key)){
            list = map.get(key);
            list.add(new Node(value, timestamp));
        } else {
            list.add(new Node(value, timestamp));
            map.put(key, list);
        }
    }
    
    public String get(String key, int timestamp) {
        List<Node> list = new ArrayList<>();
        if(!map.containsKey(key)){
            return "";
        } else {
            list = map.get(key);
        }
        
        int low =0, high = list.size() -1, res = -1;
        while(low<=high){
            int mid =  low + (high-low)/2;
            if(list.get(mid).timeStamp <= timestamp){
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(res == -1){
            return "";
        }
        return list.get(res).value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */