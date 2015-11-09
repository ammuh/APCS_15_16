
public class Arithmetic implements Series {
	int start;
	int val;
	int increment;
	public Arithmetic(int s, int i){
		start = s;
		val = s;
		increment = i;
	}
	@Override
	public int getNext() {
		val += increment;
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

	@Override
	public void setIncrement(int i) {
		// TODO Auto-generated method stub
		increment = i;
	}

}
