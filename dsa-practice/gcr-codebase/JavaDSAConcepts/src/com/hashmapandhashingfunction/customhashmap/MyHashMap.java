package com.hashmapandhashingfunction.customhashmap;

import java.util.Objects;

public class MyHashMap<K, V> {
    // Make Node STATIC
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16;
    private Node<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        // Safe because we control Node usage
        buckets = (Node<K, V>[]) new Node[capacity];
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // PUT
    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        Node<K, V> current = head;
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // GET
    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    // REMOVE
    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
