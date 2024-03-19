package spring;

import org.springframework.stereotype.Component;

@Component
public class VersionPrinter {

	private int majorVersion = 5;
	private int minorVersion = 0;
//	이거 @Component를 쓰고 싶으면 일단 초기값을 주고 나중에는 외부에서 setter

	public void print() {
		System.out.printf("이 프로그램의 버전은 %d.%d입니다.\n\n",
				majorVersion, minorVersion);
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
    }

}
