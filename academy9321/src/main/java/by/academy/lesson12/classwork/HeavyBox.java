package by.academy.lesson12.classwork;

class HeavyBox implements Comparable<HeavyBox> {

	int weight;
	int width;
	int height;
	int depth;

	HeavyBox(int w, int h, int d, int m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	@Override
	public int compareTo(HeavyBox hb) {
		return -(weight - hb.weight);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}

}