class MyHashMap {
    int[] data ;

    public MyHashMap() {
    // 0 <= key, value <= 10^6  -> (int)(Math.pow(10.0 , 6.0)+1)->1000001
        data = new int[1000001];   
        Arrays.fill(data , -1);
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */