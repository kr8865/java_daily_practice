package array;

import java.util.LinkedList;

public class hashmapp {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.N = 4;
            this.n = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashF(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        public int searchinLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;

                }
                di++;

            }
            return -1;
        }

        public void rehash() {
            LinkedList<Node>[] oldbuck = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldbuck.length; i++) {
                LinkedList<Node> ll = oldbuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashF(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2) {
                rehash();
            }
        }

        public boolean contains(K key) {
            int bi = hashF(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                return false;
            }
            return true;

        }

        public V get(K key) {
            int bi = hashF(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public V remove(K key) {
            int bi = hashF(key);
            int di = searchinLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }
    }

    public static void main(String[] args) {

    }

}
