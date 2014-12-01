package print;

import farm.animals.Chicken;
import farm.animals.Cow;
import farm.animals.Pig;
import farm.credentials.Doo;
import farm.credentials.Opg;
import farm.credentials.Trade;
import farm.utility.land.Land;
import farm.utility.machinery.Attachment;
import farm.utility.machinery.Combine;
import farm.utility.machinery.Tractor;
import farm.utility.objects.Stable;
import farm.utility.objects.Storage;

public class Print {
	public static void main(String[] args) {

		System.out.println("CREDENTIALS");
		System.out.println();

		Doo doo = new Doo(1, "Randomix", "Pero Peric", 326897546,
				"A. Starcevica 1", "091/366-1111", "pero.peric@gmail.com", 3,
				1, true, 6987);
		System.out.println(doo.toString());
		System.out.println();

		Opg opg = new Opg(2, "OPG Antic", "Ante Antic", 54654789,
				"A. Starcevica 2", "098/366-2222", "ante.antic@gmail.com", 4,
				456, "Knjigovodstveni obrt Azenic", true);
		System.out.println(opg.toString());
		System.out.println();

		Trade trade = new Trade(3, "Dorobis", "Hrvoje Horvat", 45456898,
				"A. Starcevica 3", "095/366-3333", "hrvoje.horvat@gmail.com",
				1, true, true, true);
		System.out.println(trade.toString());
	
		System.out.println();
		System.out.println();
		
		System.out.println("UTILITY");
		System.out.println();
		System.out.println("Farm buildings: ");
		System.out.println();

		Stable[] farmBuilding = new Stable[2];
		farmBuilding[0] = new Stable(1, "Main animal farm",
				(float) (899 + Math.random() * 46), 1500000,
				1886 + Math.random() * 100, (int) (15 + Math.random() * 10),
				(int) (20 + Math.random() * 10));

		System.out.println(farmBuilding[0].toString());
		System.out.println();

		farmBuilding[1] = new Stable(2, "Secondary animal farm",
				(float) (899 + Math.random() * 46), 1000000,
				1886 + Math.random() * 100, (int) (15 + Math.random() * 10),
				(int) (20 + Math.random() * 10));

		System.out.println(farmBuilding[1].toString());

		System.out.println();
		System.out.println("Storage Buildings:");
		System.out.println();
		Storage[] storage = new Storage[2];

		storage[0] = new Storage(1, "First storage unit",
				(float) (900 + Math.random() * 50), 350000,
				(int) (65 * Math.random() * 37),
				(int) (63 * Math.random() * 30));
		System.out.println(storage[0].toString());

		System.out.println();
		storage[1] = new Storage(2, "Second storage unit",
				(float) (900 + Math.random() * 50), 450000,
				(int) (65 * Math.random() * 37),
				(int) (63 * Math.random() * 28));

		System.out.println(storage[1].toString());
		System.out.println();
		System.out.println("MACHINERY:");
		System.out.println();
		System.out.println("Attachments");
		System.out.println();

		Attachment[] attachment = new Attachment[2];

		attachment[0] = new Attachment(281, "Plower",
				(float) (665 + Math.random() * 65),
				(byte) (3 * Math.random() * 2), "Plowing", 15000);
		System.out.println(attachment[0].toString());
		System.out.println();

		attachment[1] = new Attachment(56, "Planter",
				(float) (665 + Math.random() * 65),
				(byte) (2 * Math.random() * 2), "Planting", 25000);
		System.out.println(attachment[1].toString());

		System.out.println();
		System.out.println("Combines:");

		Combine[] combine = new Combine[1];
		combine[0] = new Combine(7, "John Deere", 558.621f, 2, "775D", 350,
				750000);
		System.out.println(combine[0].toString());
		System.out.println();

		System.out.println("Tractors: ");
		System.out.println();
		Tractor[] tractor = new Tractor[1];
		tractor[0] = new Tractor(2, "John Deere", 1826.22f, 750000f, (byte) 2,
				"7328F", 350);
		System.out.println(tractor[0].toString());

		System.out.println();
		System.out.println("Farm land: ");
		System.out.println();

		Land[] land = new Land[3];
		land[0] = new Land(2236, "Land One", 1555.366f, 556699, 1000000,
				"Corn", "TP 236");
		System.out.println(land[0].toString());

		System.out.println();

		land[1] = new Land(2836, "Land Two", 1755.325f, 896699, 932000,
				"Wheat", "TP 336");
		System.out.println(land[1].toString());
		System.out.println();

		land[2] = new Land(5836, "Land Three", 8669.122f, 725499, 650000,
				"Soya beans", "TP 556");

		System.out.println(land[2].toString());
		System.out.println();

		System.out.println("ANIMALS");
		System.out.println();
		System.out.println();

		Cow[] cow = new Cow[2];
		cow[0] = new Cow(1, (float) (200 + Math.random() * 100),
				Math.random() >= 0.5, Math.random() >= 0.5,
				(float) (20 + Math.random() * 40));
		System.out.println("Cows: ");
		System.out.println();
		System.out.println();
		System.out.println(cow[0].toString());
		System.out.println();

		cow[1] = new Cow(2, (float) (200 + Math.random() * 100),
				Math.random() >= 0.5, Math.random() >= 0.5,
				(float) (20 + Math.random() * 40));
		System.out.println(cow[1].toString());

		Pig[] pig = new Pig[2];
		pig[0] = new Pig(1, (float) (100 + Math.random() * 100),
				Math.random() >= 0.5, Math.random() >= 0.5,
				(float) (Math.random() * 100));
		System.out.println("Pigs: ");
		System.out.println();
		System.out.println();
		System.out.println(pig[0].toString());
		System.out.println();

		pig[1] = new Pig(2, (float) (100 + Math.random() * 100),
				Math.random() >= 0.5, Math.random() >= 0.5,
				(float) (Math.random() * 100));
		System.out.println(pig[1].toString());
		System.out.println();

		Chicken[] chicken = new Chicken[2];
		chicken[0] = new Chicken(1, (float) (1 + Math.random() * 2),
				Math.random() >= 0.5, Math.random() >= 0.5,
				(int) (Math.random() * 10));
		System.out.println("Chickens: ");
		System.out.println();
		System.out.println();
		System.out.println(chicken[0].toString());

		chicken[1] = new Chicken(2, (float) (1 + Math.random() * 2),
				Math.random() >= 0.5, Math.random() >= 0.5,
				(int) (Math.random() * 10));
		System.out.println(chicken[1].toString());

	}
}
