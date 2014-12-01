/* 
 * @author: Zerina Salitrežiæ, Andrej Naðvegi, Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.equipment;

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

public class Equipment {

	private CattleFence mCattleFence;
	private BullGate mBullGate;
	private CalfGate mCalfGate;
	private CowGate mCowGate;
	private Cleaner mCleaner;
	private Detergent mDetergent;
	private Disinfectant mDisinfectant;
	private DairyMilkingMachine mDairyMilkingMachine;
	private NursingBottle mNursingBottle;
	private UniversalBucketForFood mUniversalBucketForFood;
	private WaterBowl mWaterBowl;
	private WaterTank mWaterTank;

	public Equipment(CattleFence cattleFence, BullGate bullGate,
			CalfGate calfGate, CowGate cowGate, Cleaner cleaner,
			Detergent detergent, Disinfectant disinfectant,
			DairyMilkingMachine dairyMilkingMachine,
			NursingBottle nursingBottle,
			UniversalBucketForFood universalBucketForFood, WaterBowl waterBowl,
			WaterTank waterTank) {
		this.mCattleFence = cattleFence;
		this.mBullGate = bullGate;
		this.mCalfGate = calfGate;
		this.mCowGate = cowGate;
		this.mCleaner = cleaner;
		this.mDetergent = detergent;
		this.mDisinfectant = disinfectant;
		this.mDairyMilkingMachine = dairyMilkingMachine;
		this.mNursingBottle = nursingBottle;
		this.mUniversalBucketForFood = universalBucketForFood;
		this.mWaterBowl = waterBowl;
		this.mWaterTank = waterTank;
	}

	public CattleFence getmCattleFence() {
		return mCattleFence;
	}

	public BullGate getmBullGate() {
		return mBullGate;
	}

	public CalfGate getmCalfGate() {
		return mCalfGate;
	}

	public CowGate getmCowGate() {
		return mCowGate;
	}

	public Cleaner getmCleaner() {
		return mCleaner;
	}

	public Detergent getmDetergent() {
		return mDetergent;
	}

	public Disinfectant getmDisinfectant() {
		return mDisinfectant;
	}

	public DairyMilkingMachine getmDairyMilkingMachine() {
		return mDairyMilkingMachine;
	}

	public NursingBottle getmNursingBottle() {
		return mNursingBottle;
	}

	public UniversalBucketForFood getmUniversalBucketForFood() {
		return mUniversalBucketForFood;
	}

	public WaterBowl getmWaterBowl() {
		return mWaterBowl;
	}

	public WaterTank getmWaterTank() {
		return mWaterTank;
	}
}