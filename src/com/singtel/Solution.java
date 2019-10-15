package com.singtel;

import com.singtel.behaviors.IFly;
import com.singtel.behaviors.ISing;
import com.singtel.behaviors.ISwim;
import com.singtel.behaviors.IWalk;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
		List<Object> animals = new ArrayList<>();
		animals.add(new Duck());
		animals.add(new Chicken());
		animals.add(new Parrot());
		animals.add(new Shark());
		animals.add(new ClownFish());
		animals.add(new Dolphin());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Butterfly());
		animals.add(new Caterpillar());
		animals.add(Rooster.create());

		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;

		for (Object animal : animals)
		{
			if (animal instanceof IFly) {
				flyCount += 1;
			}
			if (animal instanceof IWalk) {
				walkCount += 1;
			}
			if (animal instanceof ISing) {
				singCount += 1;
			}
			if (animal instanceof ISwim) {
				swimCount += 1;
			}
		}

		System.out.println("Fly Count: " + flyCount);
		System.out.println("Walk Count: " + walkCount);
		System.out.println("Sing Count: " + singCount);
		System.out.println("Swim Count: " + swimCount);
    }
}
