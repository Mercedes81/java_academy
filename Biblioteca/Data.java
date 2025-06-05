package Biblioteca;

public class Data {
	private int giorno;
	private int mese;
	private int anno;

	public Data(int giorno, int mese, int anno) {
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}

	public int getDay() {
		return giorno;
	}

	public int getMonth() {
		return mese;
	}

	public int getYear() {
		return anno;
	}

	public void setDay(int aDay) {
		this.giorno = aDay;
	}

	public void setMonth(int aMonth) {
		this.mese = aMonth;
	}

	public void setYear(int aYear) {
		this.anno = aYear;
	}

	public void nextDay() {
		giorno++;
		if (giorno > giorniNelMese(mese, anno)) {
			giorno = 1;
			mese++;
			if (mese > 12) {
				mese = 1;
				anno++;
			}
		}
	}

	public boolean isEqual(Data date) {
		return giorno == date.giorno && mese == date.mese && anno == date.anno;
	}

	private int giorniNelMese(int mese, int anno) {
		switch (mese) {
		case 2:
			return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	@Override
	public String toString() {
		return giorno + "/" + mese + "/" + anno;
	}
}