package com.human.service.constant;

public enum ActivityConstant {
	
	STEP_ZERO(0, 1.2),
	STEP_ONE(1, 1.375),
	STEP_TWO(2, 1.55),
	STEP_THREE(3, 1.725),
	STEP_FOUR(4, 1.9);
	
	private int step;
	private double activity;
	
	ActivityConstant(final int step, final double activity) {
		this.step = step;
		this.activity = activity;
	}
	
	public int getStep() {
		return step;
	}
	
	public double getActivity() {
		return activity;
	}
	
	public static double toActivity(int step) {
		for(ActivityConstant constant : ActivityConstant.values()) {
			if(step == constant.getStep()) {
				return constant.getActivity();
			}
		}
		throw new IllegalArgumentException("[ERROR] 존재할수 없는 단계입니다."); // TODO: 예외는 별도로 처리
	}

}
