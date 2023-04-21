package br.com.hashmap.interfaces;

import br.com.hashmap.Bucket;

public interface BucketInterface {

    void put_data(int key, int value);
    Bucket delete_data(int key);
    int get_data(int key);
}
