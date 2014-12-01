package farm;

import farm.animals.Animal;
import farm.animals.Chicken;
import farm.animals.Cow;
import farm.animals.Pig;
import farm.credentials.Doo;
import farm.credentials.Opg;
import farm.utility.land.Land;
import farm.utility.machinery.Attachment;
import farm.utility.machinery.Combine;
import farm.utility.machinery.Tractor;
import farm.utility.objects.Stable;
import farm.utility.objects.Storage;



/*
 * @authors: Boris Muminovic, Andrej Toth, Ivan Azenic
 * Version: 1.0
 */

public class Farm {

	public Animal mAnimal;
	public Chicken mCicken;
	public Cow mCow;
	public Pig mPig;
	public Doo mDoo;
	public Opg mOpg;
	public Land mLand;
	public Attachment mAttachment;
	public Combine mCombine;
	public Tractor mTractor;

	public Stable mFarmBuilding;
	public Storage mStorage;

	public Animal getmAnimal() {
		return mAnimal;
	}

	public Chicken getmCicken() {
		return mCicken;
	}

	public Cow getmCow() {
		return mCow;
	}

	public Pig getmPig() {
		return mPig;
	}

	public Doo getmDoo() {
		return mDoo;
	}

	public Opg getmOpg() {
		return mOpg;
	}

	public Land getmLand() {
		return mLand;
	}

	public Attachment getmAttachment() {
		return mAttachment;
	}

	public Combine getmCombine() {
		return mCombine;
	}

	public Tractor getmTractor() {
		return mTractor;
	}

	public Stable getmFarmBuilding() {
		return mFarmBuilding;
	}

	public Storage getmStorage() {
		return mStorage;
	}

}