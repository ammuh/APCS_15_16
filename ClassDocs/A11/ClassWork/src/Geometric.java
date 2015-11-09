
public class Geometric implements Series {
	int start;
	int val;
	int increment;
	public Geometric(int s, int i){
		start = s;
		val = s;
		increment = i;
	}
	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		val *= increment;
		return val;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		val = 0;
		start = 0;
	}

	@Override
	public void setStart(int x) {
		// TODO Auto-generated method stub
		start = x;
	}

	public void setIncrement(int i) {
		// TODO Auto-generated method stub
		increment = i;
	}

}
