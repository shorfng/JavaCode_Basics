package com.loto.exception.b.customexception.a.exception;

/**
 * Author：蓝田_Loto
 * <p>PageName：Test_Avg_CustomException.java</p>
 * <p>Function：测试-自定义异常
 */

public class Test_Avg_CustomException {
	public static void main(String[] args) throws CustomException {
		int avg = getAvg(50, 60, -70, 80);
		System.out.println(avg);  // 报异常
	}

	// 传递成绩，计算成绩的平均数（成绩没有负数，需要抛出异常，停止运算）
	// ...表示可变参数（参数个数不确定，至少一个）
	private static int getAvg(int... source) throws CustomException {
		int sum = 0;
		for (int s : source) {
			if (s < 0) {
				throw new CustomException("成绩错误 " + s);
			}
			sum = sum + s;
		}
		return sum / source.length;
	}
}
