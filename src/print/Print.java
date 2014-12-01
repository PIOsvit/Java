/* 
 * @author: Zerina Salitrežiæ, Andrej Naðvegi, Domagoj Samardžiæ
 * @date: 31.10.2014.
 * @version: 1.0
 */

package print;

import farm.Farm;
import farm.buildings.Buildings;
import farm.buildings.barn.BullsBarn;
import farm.buildings.barn.CalfsBarn;
import farm.buildings.barn.CowsBarn;
import farm.buildings.dairyMilkingFacility.DairyMilkingFacility;
import farm.buildings.foodStore.HayStore;
import farm.buildings.foodStore.SilageStore;
import farm.buildings.foodStore.Silos;
import farm.cattle.Bull;
import farm.cattle.Calf;
import farm.cattle.Cow;
import farm.equipment.Equipment;
import farm.equipment.cattleFence.CattleFence;
import farm.equipment.cattleGate.BullGate;
import farm.equipment.cattleGate.CalfGate;
import farm.equipment.cattleGate.CowGate;
import farm.equipment.cleaningEquipment.Cleaner;
import farm.equipment.cleaningEquipment.Detergent;
import farm.equipment.cleaningEquipment.Disinfectant;
import farm.equipment.dairyMilkingMachine.DairyMilkingMachine;
import farm.equipment.foodEquipment.NursingBottle;
import farm.equipment.foodEquipment.UniversalBucketForFood;
import farm.equipment.wateringEquipment.WaterBowl;
import farm.equipment.wateringEquipment.WaterTank;
import farm.grassLand.GrassLand;
import farm.soldCattle.SoldBulls;
import farm.soldCattle.SoldCalfs;
import farm.soldCattle.SoldCows;
import farm.staff.Manager;
import farm.staff.Veterinarian;
import farm.staff.Worker;
import farm.statistics.Statistics;
import farm.statistics.expenses.Expenses;
import farm.statistics.incomes.Incomes;

public class Print {

	public static void main(String[] args) {

		System.out.println("--FARM--");
		System.out.println();
		System.out.println("1. BUILDINGS");
		System.out.println();
		System.out.println("a) BARNS:");
		System.out.println();

		BullsBarn bullsBarn = new BullsBarn("barn for bulls", 4352, 535.5f,
				"15.75m(W) x 24m(L) x 3m(H)", 30, 6);
		CalfsBarn calfsBarn = new CalfsBarn("barn for calfs", 5629, 378,
				"15.75m(W) x 18m(L) x 3m(H)", 20, 4);
		CowsBarn cowsBarn = new CowsBarn("barn for cows", 7521, 535.5f,
				"15.75m(W) x 24m(L) x 3m(H)", 30, 8);

		System.out.println("Bulls barn:");
		System.out.println("- type: " + bullsBarn.getType());
		System.out.println("- cadastral plot: " + bullsBarn.getCadastralPlot());
		System.out.println("- surface: " + bullsBarn.getSurface() + " m^2");
		System.out.println("- dimensions: " + bullsBarn.getDimensions());
		System.out.println("- capacity: " + bullsBarn.getCapacity() + " bulls");
		System.out.println("- number of bulls: "
				+ bullsBarn.getNumberOfCattle());
		System.out.println("- percentage of used capacity: "
				+ bullsBarn.usedCapacityPercentage() + "%");

		System.out.println();

		System.out.println("Calfs barn:");
		System.out.println("- type: " + calfsBarn.getType());
		System.out.println("- cadastral plot: " + calfsBarn.getCadastralPlot());
		System.out.println("- surface: " + calfsBarn.getSurface() + " m^2");
		System.out.println("- dimensions: " + calfsBarn.getDimensions());
		System.out.println("- capacity: " + calfsBarn.getCapacity() + " calfs");
		System.out.println("- number of calfs: "
				+ calfsBarn.getNumberOfCattle());
		System.out.println("- percentage of used capacity: "
				+ calfsBarn.usedCapacityPercentage() + "%");

		System.out.println();

		System.out.println("Cows barn:");
		System.out.println("- type: " + cowsBarn.getType());
		System.out.println("- cadastral plot: " + cowsBarn.getCadastralPlot());
		System.out.println("- surface: " + cowsBarn.getSurface() + " m^2");
		System.out.println("- dimensions: " + cowsBarn.getDimensions());
		System.out.println("- capacity: " + cowsBarn.getCapacity() + " cows");
		System.out.println("- number of cows: " + cowsBarn.getNumberOfCattle());
		System.out.println("- percentage of used capacity: "
				+ cowsBarn.usedCapacityPercentage() + "%");

		System.out.println();
		System.out.println("b) FOOD STORES");
		System.out.println();

		HayStore hayStore = new HayStore("store for hay", 5907, 800,
				"20m(W) x 40m(L) x 5m(H)", 2000, "clover");
		SilageStore silageStore = new SilageStore("store for silage", 6931,
				200, "10m(W) x 20m(L) x 2.5m(H)", 500, "corn");
		Silos silos = new Silos("store for grains", 2294, 200,
				"5m(radius) x 10m(H)", 500, "corn, whey, soya, barley");

		System.out.println("Hay store:");
		System.out.println("- type: " + hayStore.getType());
		System.out.println("- cadastral plot: " + hayStore.getCadastralPlot());
		System.out.println("- surface: " + hayStore.getSurface() + " m^2");
		System.out.println("- dimensions: " + hayStore.getDimensions());
		System.out.println("- capacity: " + hayStore.getCapacity()
				+ " round bales");
		System.out.println("- type of hay: " + hayStore.getTypeOfHay());

		System.out.println();

		System.out.println("Silage store:");
		System.out.println("- type: " + silageStore.getType());
		System.out.println("- cadastral plot: "
				+ silageStore.getCadastralPlot());
		System.out.println("- surface: " + silageStore.getSurface() + " m^2");
		System.out.println("- dimensions: " + silageStore.getDimensions());
		System.out.println("- capacity: " + silageStore.getCapacity() + " m^3");
		System.out
				.println("- type of silage: " + silageStore.getTypeOfSilage());

		System.out.println();

		System.out.println("Silos:");
		System.out.println("- type: " + silos.getType());
		System.out.println("- cadastral plot: " + silos.getCadastralPlot());
		System.out.println("- surface: " + silos.getSurface() + " m^2");
		System.out.println("- dimensions: " + silos.getDimensions());
		System.out.println("- capacity: " + silos.getCapacity() + " tons");
		System.out.println("- type of grain: " + silos.getTypeOfGrain());

		System.out.println();
		System.out.println("c) DAIRY MILIKING FACILITY");
		System.out.println();

		DairyMilkingFacility dairyMilkingFacility = new DairyMilkingFacility(
				3688, 200f, "10m(W) x 20m(L) x 3m(H)", 30);
		System.out.println("- cadastral plot: "
				+ dairyMilkingFacility.getCadastralPlot());
		System.out.println("- surface: " + dairyMilkingFacility.getSurface()
				+ " m^2");
		System.out.println("- dimensions: "
				+ dairyMilkingFacility.getDimensions());
		System.out.println("- capacity: " + dairyMilkingFacility.getCapacity()
				+ " cows");

		System.out.println();
		System.out.println("2. CATTLE");
		System.out.println();
		System.out.println("a) BULLS:");

		Bull firstBull = new Bull(5671235L, "Romania", 567.32f, "male", true,
				40, true);
		Bull secondBull = new Bull(7326514L, "Germany", 534.66f, "male", true,
				45, true);
		Bull thirdBull = new Bull(4479803L, "Germany", 547.45f, "male", true,
				41, true);
		Bull fourthBull = new Bull(5532145L, "England", 574.6f, "male", true,
				47, true);
		Bull fifthBull = new Bull(4990852L, "Romania", 587.72f, "male", true,
				43, true);
		Bull sixthBull = new Bull(3212345L, "England", 514.63f, "male", true,
				42, true);

		System.out.println();
		System.out.println("First bull:");
		System.out.println("- ID: " + firstBull.getId());
		System.out.println("- country of origin: "
				+ firstBull.getCountryOfOrigin());
		System.out.println("- weight: " + firstBull.getWeight() + " kg");
		System.out.println("- sex: " + firstBull.getSex());
		System.out.println("- bull in breeding: " + firstBull.isInBreeding());
		System.out.println("- inseminated cows per year: "
				+ firstBull.getFertilityPerBullPerYear());
		System.out.println("- bull is fed: " + firstBull.isBullFed());

		System.out.println();
		System.out.println("Second bull:");
		System.out.println("- ID: " + secondBull.getId());
		System.out.println("- country of origin: "
				+ secondBull.getCountryOfOrigin());
		System.out.println("- weight: " + secondBull.getWeight() + " kg");
		System.out.println("- sex: " + secondBull.getSex());
		System.out.println("- bull in breeding: " + secondBull.isInBreeding());
		System.out.println("- inseminated cows per year: "
				+ secondBull.getFertilityPerBullPerYear());
		System.out.println("- bull is fed: " + secondBull.isBullFed());

		Bull[] bulls = new Bull[6];
		bulls[0] = firstBull;
		bulls[1] = secondBull;
		bulls[2] = thirdBull;
		bulls[3] = fourthBull;
		bulls[4] = fifthBull;
		bulls[5] = sixthBull;

		System.out.println();
		System.out.println("b) CALFS:");
		System.out.println();
		Calf firstCalf = new Calf(8753268L, "Spain", 167.8f, "female", false,
				true);
		Calf secondCalf = new Calf(2553985L, "Spain", 172.3f, "male", false,
				true);
		Calf thirdCalf = new Calf(8753268L, "England", 168.4f, "female", false,
				true);
		Calf fourthCalf = new Calf(2553985L, "Turkey", 183.7f, "male", false,
				true);

		System.out.println("First calf:");
		System.out.println("- ID: " + firstCalf.getId());
		System.out.println("- country of origin: "
				+ firstCalf.getCountryOfOrigin());
		System.out.println("- weight: " + firstCalf.getWeight() + " kg");
		System.out.println("- sex: " + firstCalf.getSex());
		System.out.println("- calf in breast feeding: "
				+ firstCalf.isInBreastFeeding());
		System.out.println("- calf is fed: " + firstCalf.isCalfFed());

		System.out.println();
		System.out.println("Second calf:");
		System.out.println("- ID: " + secondCalf.getId());
		System.out.println("- country of origin: "
				+ secondCalf.getCountryOfOrigin());
		System.out.println("- weight: " + secondCalf.getWeight() + " kg");
		System.out.println("- sex: " + secondCalf.getSex());
		System.out.println("- calf in breast feeding: "
				+ secondCalf.isInBreastFeeding());
		System.out.println("- calf is fed: " + secondCalf.isCalfFed());

		Calf[] calfs = new Calf[4];
		calfs[0] = firstCalf;
		calfs[1] = secondCalf;
		calfs[2] = thirdCalf;
		calfs[3] = fourthCalf;

		System.out.println();
		System.out.println("c) COWS:");
		System.out.println();
		Cow firstCow = new Cow(4312779L, "Romania", 602.34f, "female", true,
				32.8f, true);
		Cow secondCow = new Cow(5683216L, "Romania", 652.84f, "female", true,
				35.5f, true);
		Cow thirdCow = new Cow(6678002L, "England", 613.66f, "female", true,
				34.6f, true);
		Cow fourthCow = new Cow(2267894L, "German", 672.7f, "female", true,
				37.5f, true);
		Cow fifthCow = new Cow(5896021L, "Romania", 622.94f, "female", true,
				33.6f, true);
		Cow sixthCow = new Cow(8796985L, "Turkey", 671.1f, "female", true,
				35.8f, true);
		Cow seventhCow = new Cow(1478523L, "England", 633.96f, "female", true,
				38.4f, true);
		Cow eighthCow = new Cow(7896302L, "Turkey", 612.87f, "female", true,
				32.5f, true);

		System.out.println("First cow:");
		System.out.println("- ID: " + firstCow.getId());
		System.out.println("- country of origin: "
				+ firstCow.getCountryOfOrigin());
		System.out.println("- weight: " + firstCow.getWeight() + " kg");
		System.out.println("- sex: " + firstCow.getSex());
		System.out.println("- cow in milking: " + firstCow.isInMilking());
		System.out.println("- milk per cow per day: "
				+ firstCow.getMilkPerCowPerDay() + " L");
		System.out.println("- cow is fed: " + firstCow.isCowFed());

		System.out.println();
		System.out.println("Second cow:");
		System.out.println("- ID: " + secondCow.getId());
		System.out.println("- country of origin: "
				+ secondCow.getCountryOfOrigin());
		System.out.println("- weight: " + secondCow.getWeight() + " kg");
		System.out.println("- sex: " + secondCow.getSex());
		System.out.println("- cow in milking: " + secondCow.isInMilking());
		System.out.println("- milk per cow per day: "
				+ secondCow.getMilkPerCowPerDay() + " L");
		System.out.println("- cow is fed: " + secondCow.isCowFed());

		Cow[] cows = new Cow[8];
		cows[0] = firstCow;
		cows[1] = secondCow;
		cows[2] = thirdCow;
		cows[3] = fourthCow;
		cows[4] = fifthCow;
		cows[5] = sixthCow;
		cows[6] = seventhCow;
		cows[7] = eighthCow;

		System.out.println();
		System.out.println("3. STAFF");
		System.out.println();

		Manager manager = new Manager("Ivan", "Ivanisic", 45690642157L,
				"manager", 5500);
		Veterinarian veterinarian = new Veterinarian("Marko", "Maric",
				56890557831L, "veterinarian", 4000);
		Worker worker = new Worker("Josip", "Josipovic", 43211460987L,
				"worker", 2500);

		System.out.println("Manager:");
		System.out.println("- name: " + manager.getName());
		System.out.println("- surname: " + manager.getSurname());
		System.out.println("- OIB: " + manager.getOib());
		System.out.println("- job: " + manager.getJob());
		System.out.println("- salary: " + manager.getSalary() + " kn");

		System.out.println();
		System.out.println("Veterinarian:");
		System.out.println("- name: " + veterinarian.getName());
		System.out.println("- surname: " + veterinarian.getSurname());
		System.out.println("- OIB: " + veterinarian.getOib());
		System.out.println("- job: " + veterinarian.getJob());
		System.out.println("- salary: " + veterinarian.getSalary() + " kn");

		System.out.println();
		System.out.println("Worker:");
		System.out.println("- name: " + worker.getName());
		System.out.println("- surname: " + worker.getSurname());
		System.out.println("- OIB: " + worker.getOib());
		System.out.println("- job: " + worker.getJob());
		System.out.println("- salary: " + worker.getSalary() + " kn");

		System.out.println();
		System.out.println("4. EQUIPMENT");
		System.out.println();
		System.out.println("a) FENCES FOR CATTLE:");
		System.out.println();

		CattleFence cattleFence = new CattleFence("German", "iron", "grey",
				"5m(W) x 1m(H)", 260);
		System.out.println("- country of origin: "
				+ cattleFence.getCountryOfOrigin());
		System.out.println("- material: " + cattleFence.getMaterial());
		System.out.println("- color: " + cattleFence.getColor());
		System.out.println("- dimensions: " + cattleFence.getDimensions());
		System.out.println("- number of pieces: "
				+ cattleFence.getNumberOfPieces());

		System.out.println();
		System.out.println("b) GATES FOR CATTLE:");
		System.out.println();

		BullGate bullGate = new BullGate("England", "gate for bulls", "iron",
				"grey", "3m(W) x 1.5m(H)", true, true, true, 30);
		CalfGate calfGate = new CalfGate("England", "gate for calfs", "iron",
				"white", "2m(W) x 1.5m(H)", true, true, true, 20);
		CowGate cowGate = new CowGate("England", "gate for cows", "iron",
				"grey", "3m(W) x 1.5m(H)", true, true, true, 30);

		System.out.println("Bull gate:");
		System.out.println("- country of origin: "
				+ bullGate.getCountryOfOrigin());
		System.out.println("- type: " + bullGate.getType());
		System.out.println("- material: " + bullGate.getMaterial());
		System.out.println("- color: " + bullGate.getColor());
		System.out.println("- dimensions: " + bullGate.getDimensions());
		System.out.println("- has headlock for tagging: "
				+ bullGate.isHasHeadlockForTagging());
		System.out.println("- has headlock for vaccinating: "
				+ bullGate.isHasHeadlockForVaccinating());
		System.out.println("- has headlock for dehorning: "
				+ bullGate.isHasHeadlockForDehorning());
		System.out.println("- number of pieces: "
				+ bullGate.getNumberOfPieces());

		System.out.println();
		System.out.println("Calf gate:");
		System.out.println("- country of origin: "
				+ calfGate.getCountryOfOrigin());
		System.out.println("- type: " + calfGate.getType());
		System.out.println("- material: " + calfGate.getMaterial());
		System.out.println("- color: " + calfGate.getColor());
		System.out.println("- dimensions: " + calfGate.getDimensions());
		System.out.println("- has headlock for tagging: "
				+ calfGate.isHasHeadlockForTagging());
		System.out.println("- has headlock for vaccinating: "
				+ calfGate.isHasHeadlockForVaccinating());
		System.out.println("- has headlock for dehorning: "
				+ calfGate.isHasHeadlockForDehorning());
		System.out.println("- number of pieces: "
				+ calfGate.getNumberOfPieces());

		System.out.println();
		System.out.println("Cow gate:");
		System.out.println("- country of origin: "
				+ cowGate.getCountryOfOrigin());
		System.out.println("- type: " + cowGate.getType());
		System.out.println("- material: " + cowGate.getMaterial());
		System.out.println("- color: " + cowGate.getColor());
		System.out.println("- dimensions: " + cowGate.getDimensions());
		System.out.println("- has headlock for tagging: "
				+ cowGate.isHasHeadlockForTagging());
		System.out.println("- has headlock for vaccinating: "
				+ cowGate.isHasHeadlockForVaccinating());
		System.out.println("- has headlock for dehorning: "
				+ cowGate.isHasHeadlockForDehorning());
		System.out
				.println("- number of pieces: " + cowGate.getNumberOfPieces());

		System.out.println();
		System.out.println("c) CLEANING EQUIPMENT:");
		System.out.println();

		Cleaner cleaner = new Cleaner("Saponia", 15, "Saponia Cleaner",
				"for cleaning");
		Detergent detergent = new Detergent("Saponia", 15, "Saponia Detergent",
				"for washing");
		Disinfectant disinfectant = new Disinfectant("Saponia", 20,
				"Saponia Disinfectant", "for disinfection");

		System.out.println("Cleaner:");
		System.out.println("- producer: " + cleaner.getProducer());
		System.out.println("- packing in kilograms: "
				+ cleaner.getPackingInKg());
		System.out.println("- name: " + cleaner.getName());
		System.out.println("- purpose: " + cleaner.getPurpose());

		System.out.println();
		System.out.println("Detergent:");
		System.out.println("- producer: " + detergent.getProducer());
		System.out.println("- packing in kilograms: "
				+ detergent.getPackingInKg());
		System.out.println("- name: " + detergent.getName());
		System.out.println("- purpose: " + detergent.getPurpose());

		System.out.println();
		System.out.println("Disinfectant:");
		System.out.println("- producer: " + disinfectant.getProducer());
		System.out.println("- packing in kilograms: "
				+ disinfectant.getPackingInKg());
		System.out.println("- name: " + disinfectant.getName());
		System.out.println("- purpose: " + disinfectant.getPurpose());

		System.out.println();
		System.out.println("d) FOOD EQUIPMENT:");
		System.out.println();

		NursingBottle nursingBottle = new NursingBottle("German", "plastic",
				"white", 0.5f);
		UniversalBucketForFood universalBucketForFood = new UniversalBucketForFood(
				"German", "plastic", "green", 10);

		System.out.println("Nursing bottle:");
		System.out.println("- country of origin: "
				+ nursingBottle.getCountryOfOrigin());
		System.out.println("- material: " + nursingBottle.getMaterial());
		System.out.println("- color: " + nursingBottle.getColor());
		System.out.println("- capacity: " + nursingBottle.getCapacity() + " L");

		System.out.println();
		System.out.println("Universal bucket for food:");
		System.out.println("- country of origin: "
				+ universalBucketForFood.getCountryOfOrigin());
		System.out.println("- material: "
				+ universalBucketForFood.getMaterial());
		System.out.println("- color: " + universalBucketForFood.getColor());
		System.out.println("- capacity: "
				+ universalBucketForFood.getCapacity() + " L");

		System.out.println();
		System.out.println("e) WATERING EQUIPMENT:");
		System.out.println();

		WaterBowl waterBowl = new WaterBowl("England", "plastic", "grey", 10);
		WaterTank waterTank = new WaterTank("England", "plastic", "green", 500);

		System.out.println("Water bowl:");
		System.out.println("- country of origin: "
				+ waterBowl.getCountryOfOrigin());
		System.out.println("- material: " + waterBowl.getMaterial());
		System.out.println("- color: " + waterBowl.getColor());
		System.out.println("- volume: " + waterBowl.getVolume() + " L");

		System.out.println();
		System.out.println("Water tank:");
		System.out.println("- country of origin: "
				+ waterTank.getCountryOfOrigin());
		System.out.println("- material: " + waterTank.getMaterial());
		System.out.println("- color: " + waterTank.getColor());
		System.out.println("- volume: " + waterTank.getVolume() + " L");

		System.out.println();
		System.out.println("f) DAIRY MILKING MACHINE:");

		DairyMilkingMachine dairyMilkingMachine = new DairyMilkingMachine(
				"Fullwood", "England", "fullwoodHerringboneParlourhb50", 30);
		System.out.println("- manufacturer: "
				+ dairyMilkingMachine.getManufacturer());
		System.out.println("- country of origin: "
				+ dairyMilkingMachine.getCountryOfOrigin());
		System.out.println("- type: " + dairyMilkingMachine.getType());
		System.out.println("- capacity: " + dairyMilkingMachine.getCapacity()
				+ " cows");

		System.out.println();
		System.out.println("5. GRASSLAND");
		System.out.println();

		GrassLand grassLand = new GrassLand(7327, 20);
		System.out.println("- cadastral plot: " + grassLand.getCadastralPlot());
		System.out
				.println("- dimensions: " + grassLand.getDimensions() + " Ha");

		System.out.println();
		System.out.println("6. STATISTICS");
		System.out.println();
		System.out.println("a) INCOMES:");

		SoldBulls firstSoldBull = new SoldBulls(5678344L, "German", 567.84f,
				"male");
		SoldBulls secondSoldBull = new SoldBulls(7789407L, "England", 523.6f,
				"male");
		SoldBulls thirdSoldBull = new SoldBulls(1133574L, "Turkey", 534.9f,
				"male");
		SoldBulls fourthSoldBull = new SoldBulls(9923156L, "German", 545.54f,
				"male");

		SoldBulls[] soldBulls = new SoldBulls[4];
		soldBulls[0] = firstSoldBull;
		soldBulls[1] = secondSoldBull;
		soldBulls[2] = thirdSoldBull;
		soldBulls[3] = fourthSoldBull;

		SoldCalfs firstSoldCalf = new SoldCalfs(7733543L, "Romania", 157.78f,
				"male");
		SoldCalfs secondSoldCalf = new SoldCalfs(1183329L, "England", 183.6f,
				"female");
		SoldCalfs thirdSoldCalf = new SoldCalfs(9763225L, "England", 154.62f,
				"male");

		SoldCalfs[] soldCalfs = new SoldCalfs[3];
		soldCalfs[0] = firstSoldCalf;
		soldCalfs[1] = secondSoldCalf;
		soldCalfs[2] = thirdSoldCalf;

		SoldCows firstSoldCow = new SoldCows(1236678L, "German", 677.92f,
				"female");
		SoldCows secondSoldCow = new SoldCows(6653265L, "German", 624.3f,
				"female");
		SoldCows thirdSoldCow = new SoldCows(2357332L, "Romania", 647.12f,
				"female");

		SoldCows[] soldCows = new SoldCows[3];
		soldCows[0] = firstSoldCow;
		soldCows[1] = secondSoldCow;
		soldCows[2] = thirdSoldCow;

		Expenses expenses = new Expenses();
		Incomes incomes = new Incomes();

		System.out.println("- income of sold bulls: "
				+ Incomes.incomeOfSoldBulls(soldBulls) + " kn");
		System.out.println("- income of sold calfs: "
				+ Incomes.incomeOfSoldCalfs(soldCalfs) + " kn");
		System.out.println("- income of sold cows: "
				+ Incomes.incomeOfSoldCows(soldCows) + " kn");
		System.out.println("- total income of sold cattle: "
				+ Incomes.totalIncomeOfSoldCattle(
						Incomes.incomeOfSoldBulls(soldBulls),
						Incomes.incomeOfSoldCalfs(soldCalfs),
						Incomes.incomeOfSoldCows(soldCows)) + " kn");
		System.out.println("- income of milk per month in kn: "
				+ Incomes.incomeOfMilkPerMonthInKn(cows) + " kn");
		System.out.println("-> total income per year: "
				+ Incomes.totalIncomePerYear(
						Incomes.totalIncomeOfSoldCattle(
								Incomes.incomeOfSoldBulls(soldBulls),
								Incomes.incomeOfSoldCalfs(soldCalfs),
								Incomes.incomeOfSoldCows(soldCows)),
						Incomes.incomeOfMilkPerMonthInKn(cows)) + " kn");

		System.out.println();
		System.out.println("b) EXPENSES:");
		System.out.println("- average expense of electricity per month: "
				+ Expenses.averageExpenseOfElectricityPerMonth(50) + " kn");
		System.out.println("- average expense of water per month: "
				+ Expenses.averageExpenseOfWaterPerMonth(500) + " kn");
		System.out.println("- average expense of food for cows per month: "
				+ Expenses.averageExpenseOfFoodForCowsPerMonth(
						cowsBarn.getNumberOfCattle(), 4, 5, 20) + " kn");
		System.out.println("- average expense of food for bulls per month: "
				+ Expenses.averageExpenseOfFoodForBullsPerMonth(
						bullsBarn.getNumberOfCattle(), 7, 25, 12) + " kn");
		System.out.println("- average expense of food for calfs per month: "
				+ Expenses.averageExpenseOfFoodForCalfsPerMonth(
						calfsBarn.getNumberOfCattle(), 2, 6, 2) + " kn");
		System.out
				.println("- total average expense of food for cattle per month: "
						+ Expenses.totalAverageExpenseOfFoodForCattlePerMonth(
								Expenses.averageExpenseOfFoodForCowsPerMonth(
										cowsBarn.getNumberOfCattle(), 4, 5, 20),
								Expenses.averageExpenseOfFoodForBullsPerMonth(
										bullsBarn.getNumberOfCattle(), 7, 25,
										12), Expenses
										.averageExpenseOfFoodForCalfsPerMonth(
												calfsBarn.getNumberOfCattle(),
												2, 6, 2)) + " kn");
		System.out.println("- expense for salaries of staff per month: "
				+ Expenses.expenseForSalariesOfStaffPerMonth(
						manager.getSalary(), veterinarian.getSalary(),
						worker.getSalary()) + " kn");
		System.out
				.println("-> total expense per year: "
						+ Expenses.totalExpensePerYear(
								Expenses.averageExpenseOfElectricityPerMonth(50),
								Expenses.averageExpenseOfWaterPerMonth(500),
								Expenses.totalAverageExpenseOfFoodForCattlePerMonth(
										Expenses.averageExpenseOfFoodForCowsPerMonth(
												cowsBarn.getNumberOfCattle(),
												4, 5, 20),
										Expenses.averageExpenseOfFoodForBullsPerMonth(
												bullsBarn.getNumberOfCattle(),
												7, 25, 12),
										Expenses.averageExpenseOfFoodForCalfsPerMonth(
												calfsBarn.getNumberOfCattle(),
												2, 6, 2)), Expenses
										.expenseForSalariesOfStaffPerMonth(
												manager.getSalary(),
												veterinarian.getSalary(),
												worker.getSalary())) + " kn");

		// glavna klasa paketa buildings i njezin konstruktor
		Buildings buildings = new Buildings(bullsBarn, calfsBarn, cowsBarn,
				dairyMilkingFacility, hayStore, silageStore, silos);

		// primjer pristupa nekom elementu
		buildings.getmCalfsBarn().getCapacity();

		// glavna klasa paketa equipment i njezin konstruktor
		Equipment equipment = new Equipment(cattleFence, bullGate, calfGate,
				cowGate, cleaner, detergent, disinfectant, dairyMilkingMachine,
				nursingBottle, universalBucketForFood, waterBowl, waterTank);

		// primjer pristupa nekom elementu
		equipment.getmCowGate().getMaterial();

		// glavna klasa paketa statistics i njezin konstruktor
		Statistics statistics = new Statistics(incomes, expenses);

		// primjer pristupa nekom elementu
		Expenses.averageExpenseOfElectricityPerMonth(100);

		// glavna klasa projekta i njezin konstruktor
		Farm farm = new Farm(buildings, bulls, calfs, cows, equipment,
				grassLand, soldBulls, soldCalfs, soldCows, manager,
				veterinarian, worker, statistics);

		// primjer pristupa nekom elementu
		farm.getmBuildings().getmBullsBarn().getNumberOfCattle();

	}
}