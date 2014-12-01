/* 
 * @author: Zerina Salitrežiæ, Andrej Naðvegi, Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm;

import farm.buildings.Buildings;
import farm.cattle.Bull;
import farm.cattle.Calf;
import farm.cattle.Cow;
import farm.equipment.Equipment;
import farm.grassLand.GrassLand;
import farm.soldCattle.SoldBulls;
import farm.soldCattle.SoldCalfs;
import farm.soldCattle.SoldCows;
import farm.staff.Manager;
import farm.staff.Veterinarian;
import farm.staff.Worker;
import farm.statistics.Statistics;

public class Farm {

	private Buildings mBuildings;
	private Bull[] mBull;
	private Calf[] mCalf;
	private Cow[] mCow;
	private Equipment mEquipment;
	private GrassLand mGrassLand;
	private SoldBulls[] mSoldBulls;
	private SoldCalfs[] mSoldCalfs;
	private SoldCows[] mSoldCows;
	private Manager mManager;
	private Veterinarian mVeterinarian;
	private Worker mWorker;
	private Statistics mStatistics;

	public Farm(Buildings buildings, Bull[] bull, Calf[] calf, Cow[] cow,
			Equipment equipment, GrassLand grassLand, SoldBulls[] soldBulls,
			SoldCalfs[] soldCalfs, SoldCows[] soldCows, Manager manager,
			Veterinarian veterinarian, Worker worker, Statistics statistics) {
		this.mBuildings = buildings;
		this.mBull = bull;
		this.mCalf = calf;
		this.mCow = cow;
		this.mEquipment = equipment;
		this.mGrassLand = grassLand;
		this.mSoldBulls = soldBulls;
		this.mSoldCalfs = soldCalfs;
		this.mSoldCows = soldCows;
		this.mManager = manager;
		this.mVeterinarian = veterinarian;
		this.mWorker = worker;
		this.mStatistics = statistics;
	}

	public Buildings getmBuildings() {
		return mBuildings;
	}

	public Bull[] getmBull() {
		return mBull;
	}

	public Calf[] getmCalf() {
		return mCalf;
	}

	public Cow[] getmCow() {
		return mCow;
	}

	public Equipment getmEquipment() {
		return mEquipment;
	}

	public GrassLand getmGrassLand() {
		return mGrassLand;
	}

	public SoldBulls[] getmSoldBulls() {
		return mSoldBulls;
	}

	public SoldCalfs[] getmSoldCalfs() {
		return mSoldCalfs;
	}

	public SoldCows[] getmSoldCows() {
		return mSoldCows;
	}

	public Manager getmManager() {
		return mManager;
	}

	public Veterinarian getmVeterinarian() {
		return mVeterinarian;
	}

	public Worker getmWorker() {
		return mWorker;
	}

	public Statistics getmStatistics() {
		return mStatistics;
	}
}
