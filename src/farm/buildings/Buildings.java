/* 
 * @author: Zerina Salitrežiæ, Andrej Naðvegi, Domagoj Samardžiæ
 * @date: 24.10.2014.
 * @version: 1.0
 */

package farm.buildings;

import farm.buildings.barn.BullsBarn;
import farm.buildings.barn.CalfsBarn;
import farm.buildings.barn.CowsBarn;
import farm.buildings.dairyMilkingFacility.DairyMilkingFacility;
import farm.buildings.foodStore.HayStore;
import farm.buildings.foodStore.SilageStore;
import farm.buildings.foodStore.Silos;

public class Buildings {

	private BullsBarn mBullsBarn;
	private CalfsBarn mCalfsBarn;
	private CowsBarn mCowsBarn;
	private DairyMilkingFacility mDairyMilkingFacility;
	private HayStore mHayStore;
	private SilageStore mSilageStore;
	private Silos mSilos;

	public Buildings(BullsBarn bullsBarn, CalfsBarn calfsBarn,
			CowsBarn cowsBarn, DairyMilkingFacility dairyMilkingFacility,
			HayStore hayStore, SilageStore silageStore, Silos silos) {
		this.mBullsBarn = bullsBarn;
		this.mCalfsBarn = calfsBarn;
		this.mCowsBarn = cowsBarn;
		this.mDairyMilkingFacility = dairyMilkingFacility;
		this.mHayStore = hayStore;
		this.mSilageStore = silageStore;
		this.mSilos = silos;
	}

	public BullsBarn getmBullsBarn() {
		return mBullsBarn;
	}

	public CalfsBarn getmCalfsBarn() {
		return mCalfsBarn;
	}

	public CowsBarn getmCowsBarn() {
		return mCowsBarn;
	}

	public DairyMilkingFacility getmDairyMilkingFacility() {
		return mDairyMilkingFacility;
	}

	public HayStore getmHayStore() {
		return mHayStore;
	}

	public SilageStore getmSilageStore() {
		return mSilageStore;
	}

	public Silos getmSilos() {
		return mSilos;
	}
}
