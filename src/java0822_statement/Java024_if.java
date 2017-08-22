package java0822_statement;

/*
 * [출력결과]
 * station = "KBS" , channel = 7 => 닥터포스터
 * station = "KBS" , channel = 9 => 국수의 신
 * station = "MBC" => 몬스터
 * station = "EBS" => 한국기행
 */

public class Java024_if {

	public static void main(String[] args) {
		String station = "KBS";
		int channel = 9;

		if (station == "KBS") {
			if (channel == 7) {
				System.out.println("닥터포스터");
			} else if (channel == 9) {
				System.out.println("국수의 신");
			}
		} else if (station == "MBC") {
			System.out.println("몬스터");
		} else if (station == "EBS") {
			System.out.println("한국 기행");
		}

	}

}
