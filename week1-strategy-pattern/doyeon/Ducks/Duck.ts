import FlyBehavior from "../FlyBehaviors/FlyBehavior";
export default abstract class Duck {
  /* 초기선언 에러나서 ! (Definite Assignment Assertions(확정 할당 어선셜))붙임. 
  참고 :https://velog.io/@gingaminga/%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-has-no-initializer-and-is-not-definitely-assigned-in-the-constructor
   */
  public flyBehavior!: FlyBehavior;
  constructor() {}
  public abstract display(): string;
  /*공통 행동 메소드 swim*/
  public swim() {
    console.log("모든 오리는 물에 뜹니다. 가짜 오리도요.");
  }
  /* 나는 행동을 FlyBehavior 인터페이스를 행동 클래스에 위임 */
  public performFly() {
    return this.flyBehavior.fly();
  }
  /* 동적 행동 지정*/
  /**
   * @param fd
   */
  public setFlyBehavior(fd: FlyBehavior) {
    this.flyBehavior = fd;
  }
}
