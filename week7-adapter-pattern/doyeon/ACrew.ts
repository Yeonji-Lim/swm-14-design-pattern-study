import CrewChatRoom from "./CrewChatRoom";

export default class ACrew extends CrewChatRoom {
  constructor() {
    super();
  }
  public create(): void {
    console.log("\ncreate : A크루 채팅방 생성");
  }
  public join(user: string): void {
    console.log("join : A크루 채팅방에 " + user + "님이 입장하셨습니다.");
  }
  public sendMessage(user: string, msg: string): void {
    console.log(
      "sendMessage : A크루 채팅방에 " +
        user +
        '님이 "' +
        msg +
        '"라고 말했습니다.'
    );
  }
}
