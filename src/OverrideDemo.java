/*
 * Method's Override의 조건
 * 1. Method's Signature가 같은가?
 * 	- 메소드의 필수 3요소(이름, 괄호, 리턴타입)
 * 2. 접근 제한자(Access Modifer)의 관계
 *  - private	<	package	<	protected(같은 Calss라면 접근가능)		<	public(누구나접근가능)
 * 3. 12장가서 설명
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Jasic jasic = new Jasic();
		jasic.makeMoney();
	}
}
