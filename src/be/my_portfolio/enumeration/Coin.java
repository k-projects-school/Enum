package be.my_portfolio.enumeration;

public enum Coin {
	ONE_CENT {
		@Override
		public int getValue() {
			return 1;
		}
	},
	TWO_CENT {
		@Override
		public int getValue() {
			return 2;
		}
	},
	FIVE_CENT {
		@Override
		public int getValue() {
			return 5;
		}
	},
	TEN_CENT {
		@Override
		public int getValue() {
			return 10;
		}
	},
	TWENTY_CENT {
		@Override
		public int getValue() {
			return 20;
		}
	},
	FIFTY_CENT {
		@Override
		public int getValue() {
			return 50;
		}
	},
	ONE_EURO {
		@Override
		public int getValue() {
			return 100;
		}
	},
	TWO_EURO {
		@Override
		public int getValue() {
			return 200;
		}
	};
	
	public abstract int getValue();
}
