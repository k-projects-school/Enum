package be.my_portfolio.enumeration;

public enum Day {
	MONDAY {
		@Override
		public String dutch() {
			return "maandag";
		}
	},
	THUESDAY {
		@Override
		public String dutch() {
			return "dinsdag";
		}
	},
	WEDNESDAY {
		@Override
		public String dutch() {
			return "woensdag";
		}
	},
	THURSDAY {
		@Override
		public String dutch() {
			return "donderdag";
		}
	},
	FRIDAY {
		@Override
		public String dutch() {
			return "vrijdag";
		}
	},
	SATURDAY {
		@Override
		public String dutch() {
			return "zaterdag";
		}
	}, 
	SUNDAY {
		@Override
		public String dutch() {
			return "zondag";
		}
	};
	
	private boolean isWeekDay = ((int) ordinal() < 5);

	/**
	 * @return the isWeekDay
	 */
	public boolean isWeekDay() {
		return isWeekDay;
	}
	
	public String toString() {
		return dutch() + " is " + (isWeekDay ? "een" : "geen") + " weekdag";
	}
	
	public abstract String dutch();
}
