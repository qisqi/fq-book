package com.pet.dc.queue;

import com.pet.Pet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lorem
 */
public class CatDogQueue {
    private Queue<Pet> catQ;
    private Queue<Pet> dogQ;

    String cat = "cat";
    String dog = "dog";

    public CatDogQueue() {
    // linkedList 本质上和queue 是一样的，先进先出
        this.catQ = new LinkedList<Pet>();
        this.dogQ = new LinkedList<Pet>();
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals(cat)) {
            this.catQ.add(pet);
        }else if(pet.getPetType().equals(dog)) {
            this.dogQ.add(pet);
        } else {
            throw new RuntimeException("err,not cat not dog");
        }
    }

    public void pollAll() {
        if (this.catQ.isEmpty() && this.dogQ.isEmpty()) {
            throw new RuntimeException("empty");
        }
        if (this.catQ.size() > this.dogQ.size()) {
            this.dogQ.poll();
        } else {
            this.catQ.poll();
        }
    }

    public void pollDog() {
        if (!this.dogQ.isEmpty()) {
            this.dogQ.poll();
        } else {
            throw new RuntimeException("dog is empty");
        }
    }

    public void pollCat() {
        if (!this.catQ.isEmpty()) {
            this.catQ.poll();
        } else {
            throw new RuntimeException("cat is empty");
        }
    }

    public boolean isEmpty() {
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isDogEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return this.catQ.isEmpty();
//       if (this.catQ.isEmpty()){
//           return true;
//       }else{
//           return false;
//       }
    }
}
