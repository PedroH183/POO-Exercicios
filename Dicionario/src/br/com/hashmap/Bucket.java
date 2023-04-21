package br.com.hashmap;

import br.com.hashmap.interfaces.BucketInterface;

public class Bucket implements BucketInterface {
    protected Bucket next_object;
    protected Integer value;
    protected Integer key;

    Bucket(){
        this.key = null;
        this.value = null;
        this.next_object = null;
    }

    Bucket(int key, int value){
        this.key = key;
        this.value = value;
        this.next_object = null;
    }
    Bucket(int key, int value, Bucket next_object){
        this.key = key;
        this.value = value;
        this.next_object = next_object;
    }
    @Override
    public void put_data( int key, int value ) {
        Bucket aux_pointer = this;
        Bucket pair_key_value = new Bucket(key, value);

        if( this.key == null && this.value == null ){
            this.key = key;
            this.value = value;
            return;
        }

        while( aux_pointer.next_object != null ){
            aux_pointer = aux_pointer.next_object;
        }
        aux_pointer.next_object = pair_key_value;
    }
    @Override
    public int get_data(int key) {
        Bucket aux_pointer = this;

        while( aux_pointer.key != key ){
            aux_pointer = aux_pointer.next_object;
        }

        return aux_pointer.value == null ? -1 : aux_pointer.value;
    }
    @Override
    public Bucket delete_data(int key) {
        int counter = 0;
        Bucket prev_pointer = this;
        Bucket new_bucket = new Bucket();

        while( prev_pointer != null ){

            if( prev_pointer.key != key ){
                new_bucket.put_data(prev_pointer.key, prev_pointer.value);
            }
            prev_pointer = prev_pointer.next_object;
        }

        return new_bucket;
    }
}
