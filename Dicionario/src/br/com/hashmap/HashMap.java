package br.com.hashmap;

import br.com.hashmap.interfaces.HashMapInteface;

import java.util.Scanner;

public class HashMap implements HashMapInteface {
    /*
    * Class responsible for manager the buckets into hashmap these buckets are a data structure
    * that represent my linked list of data.
    *
    * key_space is the length of my linked list of data,
    *
    * @author : Pedro Henrique
    *  */

    protected int key_space;
    protected Bucket[] buckets;

    public HashMap(int key_space) {
        
        do {
            this.key_space = check_space_key(key_space);
        }while(this.key_space <= 0);

        for(int i = 0 ; i < key_space; ++i){
            this.buckets[i] = null;
        }
    }


    public void put_data(int key, int value){
        int index = hash_func(key);
        Bucket first_element = this.buckets[index];

        if( first_element == null ){
            this.buckets[index] = new Bucket(key,value);
            return;
        }

        this.buckets[index].put_data(key,value);
    }

    public void get_data(int key){
        int index = hash_func(key);
        Bucket bucket = this.buckets[index];

        int data = bucket.get_data(key);
        System.out.println("O valor da key : " + key +" e o value é : " + data);
    }

    public void get_line(int key){

        int index = hash_func(key);
        Bucket buckets = this.buckets[index];
        System.out.println("------------Printing Line-------------");
        while(buckets != null)
        {
            print_data(buckets.key, buckets.value);
            buckets = buckets.next_object;
        }
    }
    @Override
    public void delete_data(int key){
        int index = hash_func(key);
        this.buckets[index] = this.buckets[index].delete_data(key);
    }

    private void print_data( int key, int value ){
        System.out.println("Key : { " + key + " } e o valor { "+ value +" }");
        System.out.println("--------------------------------------");
    }

    private int hash_func(int key){
        return key % this.key_space;
    }
    private int check_space_key(int key_space){
        try {
            this.key_space = key_space;
            this.buckets = new Bucket[key_space];
            return key_space;
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.print("\n-------------------------------------------------------------");
            System.out.print("\nInsira um valor inteiro, positivo e de preferencia um primo");
            System.out.print("\n--------------------------------------------------------------");
            Scanner newKeySpace = new Scanner(System.in);
            this.key_space = newKeySpace.nextInt();
            return this.key_space;
        }
    }
}
