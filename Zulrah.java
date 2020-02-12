package com.rs;

import com.rs.ZulrahPhase.Phase;

/**
 * @author -Andreas 11 feb. 2020 17:38:35
 * @project 1. Avalon
 * 
 */

public class Zulrah {

	public enum SpawnLocation {

		CENTER,

		WEST,

		SOUTH,

		EAST;
	}

	public enum Rotation {

		ALPHA(new Phase[] { Phase.ALPHA1, Phase.ALPHA2, Phase.ALPHA3, Phase.ALPHA4, Phase.ALPHA5, Phase.ALPHA6,
				Phase.ALPHA7, Phase.ALPHA_8, Phase.ALPHA_9, Phase.ALPHA_10 }),

		BRAVO(null),

		CHARLIE(null),

		DELTA(null);

		Phase[] phase;

		private Rotation(Phase[] phase) {
			this.phase = phase;
		}
	}

}
