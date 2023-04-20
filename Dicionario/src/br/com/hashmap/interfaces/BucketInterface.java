package br.com.hashmap.interfaces;

public interface BucketInterface {

    void put_data(int key, int value);
    void delete_data(int key);
    int get_data(int key);
}
