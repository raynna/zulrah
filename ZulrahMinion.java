package com.rs;


/**
 * @author -Andreas 11 feb. 2020 18:32:37
 * @project 1. Avalon
 * 
 */

public class ZulrahMinion extends Zulrah {
	
	//JAD or MELEE = instant spawn minion, no spawn animation

	public enum MinionData {

		ALPHA_SPAWN(SpawnLocation.WEST, true),
		
		ALPHA_SPAWN_2(SpawnLocation.EAST),
		
		ALPHA_SPAWN_3(SpawnLocation.EAST, 4),
		
		ALPHA_SPAWN_4(SpawnLocation.WEST, 3),
		
		ALPHA_SPAWN_5(SpawnLocation.WEST, 1);

		private int amount;
		private boolean afterAttack;
		private SpawnLocation location;
		
		private MinionData(SpawnLocation location) {
			this(location, false, 2);
		}
		
		private MinionData(SpawnLocation location, boolean afterAttack) {
			this(location, afterAttack, 2);
		}
		
		private MinionData(SpawnLocation location, int amount) {
			this(location, false, amount);
		}

		private MinionData(SpawnLocation location, boolean afterAttack, int amount) {
			this.location = location;
			this.afterAttack = afterAttack;
			this.amount = amount;
		}
	}

}
