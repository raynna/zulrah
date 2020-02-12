package com.rs;

import com.rs.ZulrahFog.FogData;
import com.rs.ZulrahMinion.MinionData;
import com.rs.ZulrahTypes.ZulrahType;

/**
* @author -Andreas 11 feb. 2020 19:08:03
* @project 1. Avalon
* 
*/

public class ZulrahPhase extends Zulrah {
	
	public enum Phase {

		ALPHA1(ZulrahType.RANGE, SpawnLocation.CENTER, FogData.FULL_MAP),

		ALPHA2(ZulrahType.MAGIC, SpawnLocation.CENTER, 4),

		ALPHA3(ZulrahType.MELEE, SpawnLocation.CENTER),

		ALPHA4(ZulrahType.RANGE, SpawnLocation.SOUTH, FogData.SOUTHWEST_AND_EAST, true, MinionData.ALPHA_SPAWN, 5),

		ALPHA5(ZulrahType.MELEE, SpawnLocation.CENTER, MinionData.ALPHA_SPAWN_2),

		ALPHA6(ZulrahType.MAGIC, SpawnLocation.WEST, 5),

		ALPHA7(ZulrahType.RANGE, SpawnLocation.SOUTH, FogData.NORTH_AND_EAST, MinionData.ALPHA_SPAWN_3),

		ALPHA_8(ZulrahType.MAGIC, SpawnLocation.SOUTH, FogData.SOUTH_AND_SOUTHEAST, MinionData.ALPHA_SPAWN_4, 5),

		ALPHA_9(ZulrahType.JAD, SpawnLocation.WEST, FogData.FULL_MAP, true, MinionData.ALPHA_SPAWN_5, 10),

		ALPHA_10(ZulrahType.MELEE, SpawnLocation.CENTER, 2),;

		;

		private ZulrahType type;
		private FogData fog;
		private MinionData minion;
		private SpawnLocation location;
		private int attacks;
		private boolean spawnFogAfter;

		private Phase(ZulrahType type, SpawnLocation location) {
			this(type, location, null, false, null, 0);
		}

		private Phase(ZulrahType type, SpawnLocation location, FogData fog) {
			this(type, location, fog, false, null, 0);
		}

		private Phase(ZulrahType type, SpawnLocation location, FogData fog, MinionData minion) {
			this(type, location, fog, false, minion, 0);
		}

		private Phase(ZulrahType type, SpawnLocation location, FogData fog, MinionData minion, int attacks) {
			this(type, location, fog, false, minion, attacks);
		}

		private Phase(ZulrahType type, SpawnLocation location, MinionData minion) {
			this(type, location, null, false, minion, 0);
		}

		private Phase(ZulrahType type, SpawnLocation location, FogData fog, int attacks) {
			this(type, location, fog, false, null, attacks);
		}

		private Phase(ZulrahType type, SpawnLocation location, FogData fog, boolean spawnFogAfter, int attacks) {
			this(type, location, fog, spawnFogAfter, null, attacks);
		}

		private Phase(ZulrahType type, SpawnLocation location, int attacks) {
			this(type, location, null, false, null, attacks);
		}

		private Phase(ZulrahType type, SpawnLocation location, MinionData minion, int attacks) {
			this(type, location, null, false, minion, attacks);
		}

		private Phase(ZulrahType type, SpawnLocation location, FogData fog, boolean spawnFogAfter, MinionData minion,
				int attacks) {
			this.type = type;
			this.location = location;
			this.fog = fog;
			this.spawnFogAfter = spawnFogAfter;
			this.minion = minion;
			this.attacks = attacks;
		}
	}

}
